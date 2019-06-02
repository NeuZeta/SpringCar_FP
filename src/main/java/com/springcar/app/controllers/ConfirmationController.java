package com.springcar.app.controllers;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springcar.app.models.entity.Car;
import com.springcar.app.models.entity.Client;
import com.springcar.app.models.entity.Reservation;
import com.springcar.app.models.service.interfaces.IReservationService;

@Controller
public class ConfirmationController {

	@Autowired
	IReservationService rentService;
	
	@GetMapping("/reservation/confirmation")
	public String showConfirmation (Model model, HttpSession session) {
		
		Reservation rent = (Reservation) session.getAttribute("reservation");
		Car car = (Car) session.getAttribute("car");
		model.addAttribute("sumExtras", Utils.calculateExtrasPrice(rent, car));
		model.addAttribute("sumCarBase", Utils.calculateCarBaseTotalPrice (rent, car));
		model.addAttribute("sumRentPrice", Utils.CalculateTotalReservationPrice(rent, car));
		
		return "/reservation/confirmation/index";
	}
	
	@PostMapping("/reservation/confirmation")
	public String processConfirmation(HttpSession session) {
		Reservation rent = (Reservation) session.getAttribute("reservation");
		Client client = (Client) session.getAttribute("client");
		Long rentNumber = Utils.createReservationNumber (client, rent);
		
		rent.setIdReservation(rentNumber);
		rentService.save(rent);
		
		session.setAttribute("reservation", rent);
		
		return "redirect:/reservation/success";
	}
	
}

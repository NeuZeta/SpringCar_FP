package com.springcar.app.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springcar.app.models.entity.Reservation;

@Controller
public class HomeController {

	@GetMapping("/")
	public String showHome (HttpServletRequest request, HttpServletResponse response) {		
		HttpSession session = request.getSession(true);
		Reservation rent = new Reservation();
		session.setAttribute("reservation", rent);
		return "index";
	}
	
	@PostMapping("/")
	public String setDatesToRent(HttpSession session, @ModelAttribute("reservation") Reservation rent) {
		
		if (initDateIsBeforeFinalDate(rent)) {
			session.setAttribute("reservation", rent);
			session.setAttribute("differenceInDays", Utils.calculateDifferenceInDays (rent));
		} else {
			session.setAttribute("errorDates", "Pick up date must be before return date!");
			return "/"; 
		}
		return "redirect:/reservation/vehicleselect/";
	}
	
	public boolean initDateIsBeforeFinalDate(Reservation rent) {
		if (rent.getInitDate().compareTo(rent.getFinalDate()) > 0) {
			return false;
		} else {
			return true;
		}
	}
	
}

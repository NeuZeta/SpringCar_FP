package com.springcar.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcar.app.models.dao.IClientDao;
import com.springcar.app.models.entity.Client;
import com.springcar.app.models.service.interfaces.IClientService;

@Service
public class ClientService implements IClientService {

	@Autowired
	IClientDao clientDao;

	@Override
	public List<Client> findAll() {
		return (List<Client>) clientDao.findAll();
	}

	@Override
	public Client findById(Long id) {
		return clientDao.findById(id).orElse(null);
	}

	@Override
	public void save(Client client) {
		clientDao.save(client);
		
	}

	@Override
	public void delete(Client client) {
		clientDao.delete(client);
		
	}

	@Override
	public Client findByidNumer(String idNumber) {
		return clientDao.findByidNumer(idNumber).orElse(null);
		
	}

	@Override
	public Client findByUser(String user) {
		return clientDao.findByUser(user).orElse(null);
	}
	


}

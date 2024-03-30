package com.tutofox.Aadhar_Card.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutofox.Aadhar_Card.entity.Aadhar;
import com.tutofox.Aadhar_Card.repository.Repo;


@Service
public class Aadhar_service {
	
	@Autowired
	private Repo repo;
	
	public Aadhar saveAadhar(Aadhar aadhar)
	{
		return repo.save(aadhar);
	}
	
	public List<Aadhar> getAadhar(Aadhar aadhar)
	{
		return repo.findAll();
	}
	
	public Aadhar getAadharId(int id)
	{
		Optional<Aadhar> optional=repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	public Aadhar deleteAadhar(int id)
	{
		Optional<Aadhar> optional=repo.findById(id);
		if(optional.isPresent()) {
			repo.deleteById(id);
			return optional.get();
		}
		return null;
	}
	
	public Aadhar updateAadhar(Aadhar aadhar,int id)
	{
		Optional<Aadhar> optional=repo.findById(id);
		Aadhar dbAadhar= new Aadhar();
		if(optional.isPresent())
		{
			dbAadhar=optional.get();
			aadhar.setAadharNo(dbAadhar.getAadharNo());
			return repo.save(aadhar);
		}
		return null;
	}
}

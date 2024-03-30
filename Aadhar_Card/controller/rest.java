package com.tutofox.Aadhar_Card.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutofox.Aadhar_Card.entity.Aadhar;
import com.tutofox.Aadhar_Card.service.Aadhar_service;

@RestController
@RequestMapping("Aadhar")
public class rest {

	@Autowired
	private Aadhar_service aadhar_service;
	
	@PostMapping("save")
	public Aadhar saveAadhar(@RequestBody Aadhar aadhar)
	{
		return aadhar_service.saveAadhar(aadhar);
	}
	
	@GetMapping("All")
	public List<Aadhar> getAadhar(Aadhar aadhar)
	{
		return aadhar_service.getAadhar(aadhar);
	}
	
	@GetMapping("get/{id}")
	public Aadhar getAadhar(@PathVariable int id)
	{
		return aadhar_service.getAadharId(id);
	}
	
	@DeleteMapping("delete/{id}")
	public Aadhar deleteAadhar(@PathVariable int id)
	{
		return aadhar_service.deleteAadhar(id); 
	}
	
	@PutMapping("update/{id}")
	public Aadhar updateAadhar(@RequestBody Aadhar aadhar,@PathVariable int id)
	{
		return aadhar_service.updateAadhar(aadhar,id);
				
	}
}

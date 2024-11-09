package com.sagar.healthcare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.transaction.Transactional;

@Controller
public class DoctorController {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	
	@Transactional
	@PostMapping("/addDoctor")
	public String addDoctor(@ModelAttribute Doctor doctor) {
		doctorRepository.save(doctor);
		return "add";
	}
}

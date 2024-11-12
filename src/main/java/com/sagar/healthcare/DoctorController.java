package com.sagar.healthcare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("/searchDoctor")
	public String searchDoctor(@RequestParam("id") int id, Model model){
		return "search";
	}
}

package com.virtusa.Main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.virtusa.Main.model.Advice;
import com.virtusa.Main.repository.AdviceRepository;

@Controller
public class AdviceController {

	@Autowired
	private AdviceRepository adviceRepo;
	
	// redirect to advice page and insert data
	@GetMapping("/advices")
	public String showAdviceForm(Model model) {
		model.addAttribute("advice", new Advice());
		return "advices";
	} 	
	
	@PostMapping("/process_advice")
	public String processAdvice(@ModelAttribute Advice advice) {
		adviceRepo.save(advice);
	
		return "advice_success";
	}
	
	@GetMapping("/viewAdvice")
	public String getAdviceDetails(Model model) {
		List<Advice> listOfAdvices=adviceRepo.findAll();
		model.addAttribute("listOfAdvices",listOfAdvices);
		return "viewAdvice";
	}
	
}

package com.virtusa.Main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.virtusa.Main.model.Report;
import com.virtusa.Main.repository.*;

@Controller
public class ReportController {
	
	@Autowired
	private ReportRepository reportRepo;
	
	@GetMapping("/reports")
	public String showReportForm(Model model) {
		model.addAttribute("report", new Report());

		return "reports";
	} 	
	
	@PostMapping("/process_report")
	public String processReport(@ModelAttribute Report report) {
		reportRepo.save(report);
	
		return "report_success";
	}
	

	@GetMapping("/viewReport")
	public String getReportDetails(Model model) {
		List<Report> listOfReports=reportRepo.findAll();
		model.addAttribute("listOfReports",listOfReports);
		return "viewReport";
	}

}

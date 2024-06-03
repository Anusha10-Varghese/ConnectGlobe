package com.virtusa.Main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.virtusa.Main.model.Topic;
import com.virtusa.Main.repository.TopicRepository;

@Controller
public class TopicController {
	
	@Autowired
	private TopicRepository topicRepo;
	
	@GetMapping("/topics")
	public String showTopicForm(Model model) {
		model.addAttribute("topic", new Topic());

		return "topics";
	} 
	
	@PostMapping("/process_topic")
	public String processTopic(@ModelAttribute Topic topic) {
		topicRepo.save(topic);
	
		return "topic_success";
	}
	
	@GetMapping("/viewTopic")
	public String getTopicDetails(Model model) {
		List<Topic> listOfTopics=topicRepo.findAll();
		model.addAttribute("listOfTopics",listOfTopics);
		return "viewTopic";
	}
	
}

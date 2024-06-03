package com.virtusa.Main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.virtusa.Main.model.Post;
import com.virtusa.Main.repository.PostRepository;

@Controller
public class PostController {
	
	@Autowired
	private PostRepository postRepo;
	
	@GetMapping("/posts")
	public String showPostForm(Model model) {
		model.addAttribute("post", new Post());

		return "posts";
	} 
	
	@PostMapping("/process_post")
	public String processPost(@ModelAttribute Post post) {
		postRepo.save(post);
	
		return "post_success";
	}
	
	@GetMapping("/viewPost")
	public String getPostDetails(Model model) {
		List<Post> listOfPosts=postRepo.findAll();
		model.addAttribute("listOfPosts",listOfPosts);
		return "viewPost";
	}

}

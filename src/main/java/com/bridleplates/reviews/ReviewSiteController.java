package com.bridleplates.reviews;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewSiteController {

	@Autowired
	ReviewSiteRepository reviewRepository;

	@RequestMapping("/reviews") // localhost:8080/review
	public String getReviews(Model model) 
	{
		model.addAttribute("reviews", reviewRepository.getReviews());
		return "reviews";
	}
	@RequestMapping ("/reviews/{Id}")
	   public String getReview(@PathVariable(name = "Id")Long id, Model model) 
	{
	       model.addAttribute("review", reviewRepository.findById(id));
	       return "review";
	}
}

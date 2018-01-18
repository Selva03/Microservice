package com.reljicd.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.reljicd.model.User;


@Controller
public class TrackOrderController {

	
	@GetMapping("/TrackOrder")
	public ModelAndView registration() {
        ModelAndView modelAndView = new ModelAndView();
        
        modelAndView.setViewName("TrackOrder");
        return modelAndView;
    }
		
	}



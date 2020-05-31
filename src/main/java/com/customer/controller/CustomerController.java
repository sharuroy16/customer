package com.customer.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.customer.entity.Logindetails;
import com.customer.service.CustomerService;

/**
 * The CustomerController class is to handle all requests from the clients. 
 * This is a typical Spring MVC controller class, which is annotated with the @Controller annotation. 
 * An instance of CustomerService is injected into this class using the @Autowired annotation.
 */

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	/**
	 * Initial load - Login page
	 */
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}

	/**
	 * Validate login credentials and if found, redirects to successful page, else, login page.
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView validateUser(@RequestParam String username, @RequestParam String userpassword) {

		ModelAndView modelAndView = null;

		Logindetails result = customerService.validateUser(username, userpassword);

		if (result != null) {
			modelAndView = new ModelAndView("successful");
			return modelAndView;
		} else {
			String message = "<small style=\"color: #cc0000;\">*Invalid user credentials.</small>";
			modelAndView = new ModelAndView("index");
			modelAndView.addObject("message", message);
		}
		return modelAndView;
	}
	
	/**
	 * Redirects to another page to perform Add, Edit and Delete operations.
	 */
	@RequestMapping(value = "/other")
	public ModelAndView performOtherOperations() {
		List<Logindetails> loginDetails = customerService.listAllLoginDetails(); 
		ModelAndView modelAndView = new ModelAndView("operations");
		modelAndView.addObject("loginDetails", loginDetails); 
		return modelAndView;
	}
	
	/**
	 * Redirects to another page to perform Add, Edit and Delete operations.
	 */
	@RequestMapping(value = "/add")
	public ModelAndView addUser() {
		ModelAndView modelAndView  = new ModelAndView("newuser");
		Logindetails logindetails = new Logindetails();
		modelAndView.addObject("logindetails", logindetails);
		return modelAndView;
	}
	
	/**
	 * Save Login Details
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveLoginDetails(@ModelAttribute("logindetails") Logindetails logindetails) {
		customerService.save(logindetails);
		return "redirect:/other";
	}
	
	/**
	 * Edit Login Details
	 */
	@RequestMapping("/edit")
	public ModelAndView editLoginDetails(@RequestParam long id) {
		ModelAndView modelAndView = new ModelAndView("user_edit");
		Logindetails logindetails = customerService.get(id);
		modelAndView.addObject("logindetails", logindetails);
		return modelAndView;
	}
	
	/**
	 * Delete Login Details
	 */
	@RequestMapping("/delete")
	public String deleteLoginDetails(@RequestParam long id) {
		customerService.delete(id);
		return "redirect:/other";		
	}
}
package com.grocery.online;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "index";
	}

	@RequestMapping(value = "/about")
	public String showAbout() {
		return "about";
	}

	@RequestMapping(value = "/checkout")
	public String showcheckout() {
		return "checkout";
	}

	@RequestMapping(value = "/contact")
	public String showcontact() {
		return "contact";
	}

	@RequestMapping(value = "/faq")
	public String showfaq() {
		return "faq";
	}

	@RequestMapping(value = "/help")
	public String showhelp() {
		return "help";
	}

	@RequestMapping(value = "/home")
	public String showhome() {
		return "home";
	}

	@RequestMapping(value = "/icons")
	public String showicons() {
		return "icons";
	}

	@RequestMapping(value = "/index")
	public String showindex() {
		return "index";
	}

	@RequestMapping(value = "/payment")
	public String showpayment() {
		return "payment";
	}

	@RequestMapping(value = "/privacy")
	public String showprivacy() {
		return "privacy";
	}

	@RequestMapping(value = "/product")
	public String showproduct() {
		return "product";
	}

	@RequestMapping(value = "/product2")
	public String showproduct2() {
		return "product2";
	}

	@RequestMapping(value = "/single")
	public String showsingle() {
		return "single";
	}

	@RequestMapping(value = "/single2")
	public String showsingle2() {
		return "single2";
	}

	@RequestMapping(value = "/terms")
	public String showterms() {
		return "terms";
	}

	@RequestMapping(value = "/typography")
	public String showtypography() {
		return "typography";
	}

}

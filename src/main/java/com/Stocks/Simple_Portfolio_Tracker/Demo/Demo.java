package com.Stocks.Simple_Portfolio_Tracker.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo {
	@RequestMapping("/hello")
	@ResponseBody
	public String Hello() {
		return "Hello WOrld!";

	}

}

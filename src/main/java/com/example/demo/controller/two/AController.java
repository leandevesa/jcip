package com.example.demo.controller.two;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value={"/c2"})
public class AController {

	private long count = 0;

	@RequestMapping(value={"/increment"}, method = RequestMethod.GET)
	@ResponseBody
	public String root() throws Exception {
        TimeUnit.MILLISECONDS.sleep(15);
        ++count;
		return "OK!";
	}

	@RequestMapping(value={"/"}, method = RequestMethod.GET)
	@ResponseBody
	public String getCount() {
		return Long.toString(count);
	}

	@RequestMapping(value={"/reset"}, method = RequestMethod.GET)
	public void reset() {
		count = 0;
	}
}
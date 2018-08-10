package com.jcip.controller.chapter.three.ex.one;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/3/1"})
public class NoVisibilityController {

	@RequestMapping(value={"/yield"}, method = RequestMethod.GET)
	public void yield() throws Exception {
		NoVisibility.runYield();
	}

	@RequestMapping(value={"/sum"}, method = RequestMethod.GET)
	public void sum() throws Exception {
		NoVisibility.runSum();
	}
}
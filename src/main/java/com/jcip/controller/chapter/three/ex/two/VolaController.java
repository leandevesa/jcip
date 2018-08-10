package com.jcip.controller.chapter.three.ex.two;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/3/2"})
public class VolaController {

	@RequestMapping(value={"/novola"}, method = RequestMethod.GET)
	public void yield() throws Exception {
        NoVola.run();
	}

	@RequestMapping(value={"/vola"}, method = RequestMethod.GET)
	public void sum() throws Exception {
		Vola.run();
	}
}
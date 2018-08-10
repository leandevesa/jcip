package com.jcip.controller.chapter.three.ex.three;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/3/3"})
public class MutableController {

	@RequestMapping(value={"/mutable"}, method = RequestMethod.GET)
	public void mutable() throws Exception {
        
	}
}
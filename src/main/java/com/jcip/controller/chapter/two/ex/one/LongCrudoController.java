package com.jcip.controller.chapter.two.ex.one;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value={"/2/1/crudo"})
public class LongCrudoController {

	private long count = 0;

	@RequestMapping(value={"/"}, method = RequestMethod.GET)
	@ResponseBody
	public String getCount() {
		return Long.toString(count);
	}

	@RequestMapping(value={"/increment"}, method = RequestMethod.GET)
	@ResponseBody
	public String root() throws Exception {
        TimeUnit.MILLISECONDS.sleep(15);
        ++count;
		return "OK!";
	}

	@RequestMapping(value={"/reset"}, method = RequestMethod.GET)
	public void reset() {
		count = 0;
	}
}
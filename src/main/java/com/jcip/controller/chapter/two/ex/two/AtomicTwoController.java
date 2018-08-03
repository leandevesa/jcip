package com.jcip.controller.chapter.two.ex.two;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value={"/2/2/atomic"})
public class AtomicTwoController {

	private AtomicLong count = new AtomicLong(0);

	@RequestMapping(value={"/"}, method = RequestMethod.GET)
	@ResponseBody
	public String getCount() {
		return Long.toString(count.get());
	}

	@RequestMapping(value={"/increment"}, method = RequestMethod.GET)
	@ResponseBody
	public String root() throws Exception {
        TimeUnit.MILLISECONDS.sleep(15);
        count.incrementAndGet();
		return "OK!";
	}

	@RequestMapping(value={"/reset"}, method = RequestMethod.GET)
	public void reset() {
		count.set(0);
	}
}
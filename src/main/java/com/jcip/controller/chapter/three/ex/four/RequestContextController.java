package com.jcip.controller.chapter.three.ex.four;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/4/1"})
public class RequestContextController {

	@RequestMapping(value={"/"}, method = RequestMethod.GET)
	public void createAndRetrieve() throws Exception {

        Request context = this.randomizeContext();

        this.setContext(context);
        
        System.out.println(Thread.currentThread().getId());
        new HttpHelper().get("url");
    }

	@RequestMapping(value={"/retrieveOnly"}, method = RequestMethod.GET)
	public void retrieveOnly() throws Exception {
        
        System.out.println(Thread.currentThread().getId());
        new HttpHelper().get("url");
    }
    
    private void setContext(Request r) {
        RequestContext.setUOW(r.getParameter("UOW"));
        RequestContext.setRID(r.getParameter("RequestId"));
    }

    private Request randomizeContext() {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("UOW", Integer.toString(new Random().nextInt(1000)));
        parameters.put("RequestId", Integer.toString(new Random().nextInt(1000)));
        return new Request(parameters, null, null, null);
    }
}
package com.jcip.controller.chapter.three.ex.six;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value={"/6/1"})
public class ToBuildController {

	@RequestMapping(value={"/"}, method = RequestMethod.GET)
	public void createAndRetrieve() throws Exception {
        
        ToBuild toBuild = new ToBuild();

        this.build(toBuild);

        System.out.println(toBuild.isProperlyBuilt());
    }

    private void build(ToBuild toBuild) throws Exception {

        Thread t1 = new Thread() {
            public void run() {
                toBuild.one = true;
                System.out.println("1 true");
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                toBuild.two = true;
                System.out.println("2 true");
            }
        };

        Thread t3 = new Thread() {
            public void run() {
                toBuild.three = true;
                System.out.println("3 true");
            }
        };
        
        t1.start();
        t2.start();
        t3.start();

        TimeUnit.MILLISECONDS.sleep(100);
    }
}
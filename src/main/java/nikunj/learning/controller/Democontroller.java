package nikunj.learning.controller;

import nikunj.learning.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Democontroller  {

    private final DemoService demoService;

    @Autowired
    public Democontroller(DemoService demoService){
        this.demoService = demoService;

    }

    @ResponseBody
    @GetMapping("/hello")
    public String hello(){

        return "Hello";

    }

    //prefix + name + suffix

    @GetMapping("welcome")
    public String welcome(@RequestParam String user, Model model){  // request param is use to get the params

        // http://localhost:8080/mytodo-list/welcome?user=Tim

        model.addAttribute("user",demoService.gethellomessage(user)); //can be just in jsp file

        System.out.println(model);
        return  "welcome";


    }

    @ModelAttribute("welcomemessage")   // will run first before any request
    public String welcomemsg(){

        return demoService.getwelcomemessage();

    }





}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView index(){
        ModelAndView model = new ModelAndView("index");
        model.addObject("message", "Hello Yose");

        return model;
    }

    public  String number(int numbe) {
        int soma = 2;
        String x="2";
        while (numbe>= soma) {
            x = x+"x"+2;
            soma=soma+2;
        }
        return x;
    }



    @GetMapping("/primeFactors?numero")
    public ModelAndView  primeFacto(){
        ModelAndView model = new ModelAndView("primeFactors?");
        model.addObject("message",number(208));

        return model;
    }

    @GetMapping("/leame")
    public ModelAndView leame(){

        ModelAndView model = new ModelAndView("leame");
        return model;
    }

    @GetMapping("/contactme")
    public ModelAndView contactMe(){

        ModelAndView model = new ModelAndView("contactme");
        return model;
    }

    @GetMapping("/astroport")
    public ModelAndView astrop(){

        ModelAndView model = new ModelAndView("astroport");
        return model;
    }



    @GetMapping("/ primeFactors?")
    public ModelAndView primeFactors(){

        ModelAndView model = new ModelAndView("primeFactors");
        return model;
    }


}

package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greeting")
public class GreetingController {
    @GetMapping("")
    public ModelAndView greeting(String name) {
        ModelAndView modelAndView = new ModelAndView("greeting");
        modelAndView.addObject("name",name);
        return modelAndView;
    }
}

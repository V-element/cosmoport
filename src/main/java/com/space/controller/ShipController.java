package com.space.controller;

import com.space.model.Ship;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShipController {
    private static Ship ship;

    static {
        ship = new Ship();
        ship.setName("Inception");
    }

    @RequestMapping(value = "/rest/ships", method = RequestMethod.GET)
    public ModelAndView allShips() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("ship", ship);
        return modelAndView;
    }

}

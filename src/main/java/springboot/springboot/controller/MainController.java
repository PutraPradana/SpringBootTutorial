/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springboot.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springboot.springboot.service.CountryService;

/**
 *
 * @author WINDOWS 10
 */
@Controller
public class MainController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/")
    public String index(Model model) {
        String id = "2";
        model.addAttribute("dataCountry", countryService.findAll());
        return "index";
    }
}

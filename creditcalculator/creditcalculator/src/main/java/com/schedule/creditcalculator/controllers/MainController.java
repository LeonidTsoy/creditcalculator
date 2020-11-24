package com.schedule.creditcalculator.controllers;

import com.schedule.creditcalculator.model.CalculatorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.ArrayList;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model) {
        return "/form";
    }

    @PostMapping("/")
    public String index(
            @RequestParam BigDecimal summa,
            @RequestParam BigDecimal period,
            Model model) {

        CalculatorController calculator = new CalculatorController(summa, period);
        ArrayList z = calculator.CalculatorResult();
        model.addAttribute("z", z);
        return "/calculate";
    }
}
package dev.faizali.AllAppsHub.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FreightCostCalculatorController {

    @GetMapping("/")
    public String showHomePage(){
        return "home";
    }

    @GetMapping("alib/cfc")
    public String getFreightCostCalculator2(){
        return "calculatefreightcostv2";
    }
}

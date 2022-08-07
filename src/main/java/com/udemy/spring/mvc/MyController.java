package com.udemy.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){

        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmlpoyeeDetails(){
        return "ask-emp-details-view";
    }


    /*
     *  ПРОСТОЙ ВАРИАНТ
     */
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(){
//        return "show-emp-details-view";
//    }


    /*
     *   ВАРИАНТ С HttpServletRequest
     */
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(HttpServletRequest request, Model model){
//
//        String empName = request.getParameter("employeeName");
//        empName = "Mr. " + empName;
//
//        model.addAttribute("nameAttribute", empName);
//
//        model.addAttribute("description", "stupid student");
//
//        return "show-emp-details-view";
//    }


    /*
     *  ВАРИАНТ С @RequestParam
     */
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model){

        empName = "Mr. " + empName;

        model.addAttribute("nameAttribute", empName);

        model.addAttribute("description", "stupid student");

        return "show-emp-details-view";
    }

}

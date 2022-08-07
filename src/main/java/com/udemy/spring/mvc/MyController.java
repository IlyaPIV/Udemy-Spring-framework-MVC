package com.udemy.spring.mvc;


import com.udemy.spring.mvc.beans.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String askEmployeeDetails(Model model){

        model.addAttribute("employee", new Employee());

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
//    @RequestMapping("/showDetails")
//    public String showEmployeeDetails(@RequestParam("employeeName") String empName, Model model){
//
//        empName = "Mr. " + empName;
//
//        model.addAttribute("nameAttribute", empName);
//
//
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@ModelAttribute("employee") Employee employee){



        return "show-emp-details-view";
    }

}

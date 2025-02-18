package fr.devavance.tp_springboot_mvc_jpa.controllers;

import fr.devavance.tp_springboot_mvc_jpa.beans.Employee;
import fr.devavance.tp_springboot_mvc_jpa.dao.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeControleur {

    @Autowired
    private IEmployeeRepository employeeDAO;

    public EmployeeControleur(IEmployeeRepository employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("employees",employeeDAO.findAll());
        return "home";
    }

    @RequestMapping("/employees")
    public String findAllEmployee(Model model){
        model.addAttribute("employee",new Employee());
        model.addAttribute("employees",employeeDAO.findAll());
        return "view_employees";
    }

    @RequestMapping("/addemployee")
    public String addEmployee(Employee employee){
        employeeDAO.save(employee);
        return "redirect:/";
    }
}

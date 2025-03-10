package fr.devavance.employee.employee_web.controller.implementation;


import fr.devavance.employee.employee_core.core.entity.Employee;
import fr.devavance.employee.employee_core.core.repository.IEmployeeRepository;
import fr.devavance.employee.employee_web.controller.IEmployeeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController implements IEmployeeController {

    @Autowired
    private IEmployeeRepository employeeDAO;

    public EmployeeController(IEmployeeRepository employeeDAO) {
        this.employeeDAO = employeeDAO;
    }


    @GetMapping("/employee")
    public String findAllEmployee(Model model){
        return "/employee/home";
    }

    @Override
    @GetMapping("/home")
    public String displayHome(Model model){
        model.addAttribute("employees",employeeDAO.findAll());
        model.addAttribute("employee",new Employee());
        return "view_home";
    }

    @Override
    @PostMapping("/addemployee")
    public String addEmployee(Employee employee){
        employeeDAO.save(employee);
        return "redirect:/employee/home";
    }

    @RequestMapping(value = "/{id}")
    public String displayEmployee(@PathVariable(name="id") Long id, Model model) {
        Employee employee = employeeDAO.findById(id).orElse(null);
        model.addAttribute("employee", employee);
        return "view_employee";

    }
}

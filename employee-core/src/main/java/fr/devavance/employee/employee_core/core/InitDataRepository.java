package fr.devavance.employee.employee_core.core;

import fr.devavance.employee.employee_core.core.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class InitDataRepository implements CommandLineRunner {


    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public void run(String... strings) throws Exception {
    }
}

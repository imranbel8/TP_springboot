package fr.devavance.employees;

import fr.devavance.employees.repository.IEmployeeRepository;
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

package fr.devavance.employee.employee_core.core.repository;

import fr.devavance.employee.employee_core.core.entity.Employee;
import org.springframework.data.repository.CrudRepository;


public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}

package fr.devavance.employees.repository;

import fr.devavance.employees.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee, Long> {
}

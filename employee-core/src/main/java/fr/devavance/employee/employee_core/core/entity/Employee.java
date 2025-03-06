package fr.devavance.employee.employee_core.core.entity;

import fr.devavance.employee.employee_core.core.enumeration.Fonction;
import jakarta.persistence.*;

@Entity
@Table(
        name="employee"
)
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    
    private String name;
    
    private String address;
    
    private String email;
    
    private String phone;

    private Fonction fonction;

    public Employee() {}
    public Employee(String name, String address, String email, String phone, Fonction fonction) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.fonction = fonction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

    public void setId(Long id) { this.id = id;};

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public long getId() {
        return id;
    }


}

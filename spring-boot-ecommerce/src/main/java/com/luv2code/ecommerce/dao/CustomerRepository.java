package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.Customer;
import lombok.Lombok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //Add method
    Customer findByEmail (String theEmail);
}

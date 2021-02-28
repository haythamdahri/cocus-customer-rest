package com.cocus.microservices.customer.repositories;

import com.cocus.microservices.bo.entities.CustomerBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Haytham DAHRI
 */
@Repository
public interface CustomerRepository extends JpaRepository<CustomerBO, Long> {

    Optional<CustomerBO> findByUsername(@Param("username") String username);

}

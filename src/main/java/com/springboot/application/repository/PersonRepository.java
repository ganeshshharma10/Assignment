/**
 * 
 */
package com.springboot.application.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.application.entity.Person;

/**
 * @author Ganesh
 *
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}


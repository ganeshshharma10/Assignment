/**
 * 
 */
package com.springboot.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
/**
 * @author Ganesh
 *
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.application.entity.Person;
import com.springboot.application.serviceImpl.PersonServiceImpl;

@RestController
public class PersonController {
	
	@Autowired
	PersonServiceImpl personServiceImpl; 
	

    /**
	 * @return the personServiceImpl
	 */
	public PersonServiceImpl getPersonServiceImpl() {
		return personServiceImpl;
	}

	/**
	 * @param personServiceImpl the personServiceImpl to set
	 */
	public void setPersonServiceImpl(PersonServiceImpl personServiceImpl) {
		this.personServiceImpl = personServiceImpl;
	}

	@GetMapping("/Allperson")
    public List getAllPerson() {
        return personServiceImpl.getAllPerson();
    }

    @GetMapping("/person/{id}")
    public Optional getPerson(@PathVariable Long id){
        return personServiceImpl.getPerson(id);
    }

    @PostMapping("/person")
    public void addPerson(@RequestBody Person person) {
        personServiceImpl.addPerson(person);
    }

    @PutMapping("/person/{id}")
    public void updatePerson(@PathVariable Long id, @RequestBody Person person) {
        personServiceImpl.updatePerson(id, person);
    }

    @DeleteMapping("/person/{id}")
    public void deleteBook(@PathVariable Long id) {
        personServiceImpl.deletePerson(id);
    }
}

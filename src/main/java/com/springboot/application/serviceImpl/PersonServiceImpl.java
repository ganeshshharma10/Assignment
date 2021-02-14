/**
 * 
 */
package com.springboot.application.serviceImpl;

/**
 * @author Ganesh
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.application.entity.Person;
import com.springboot.application.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl {

    @Autowired
    private PersonRepository personRepository;
    
    

    public List getAllPerson() {
        List<Person> person = new ArrayList<Person>();
        person = (List<Person>) personRepository.findAll();
        return person;
    }

    public Optional getPerson(Long id) {
        return personRepository.findById(id);
    }

    public void addPerson(Person person) {
        personRepository.save(person);
    }

    public void updatePerson(Long id, Person person) {
        personRepository.save(person);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

}
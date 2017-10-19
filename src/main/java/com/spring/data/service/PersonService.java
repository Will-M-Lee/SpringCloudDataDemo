package com.spring.data.service;

import com.spring.data.dao.PersonRepository;
import com.spring.data.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Will on 2017/10/19.
 */
@Service
public class PersonService
{
    @Autowired
    PersonRepository personRepository;


    public List<Person> findPersonByFirstName(String firstName)
    {
        return personRepository.findPersonByFirstName(firstName);
    }
}

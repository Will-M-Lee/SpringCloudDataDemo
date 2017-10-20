package com.spring.data.controller;

import com.spring.data.pojo.Person;
import com.spring.data.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Will on 2017/10/19.
 */
@RestController
public class PersonController
{

    @Autowired
    private PersonService personService;

    @RequestMapping("/findPersonByFirstName")
    public List<Person> findByUserName(HttpServletRequest request)
    {
        return personService.findPersonByFirstName(request.getParameter("name"));
    }

    @RequestMapping("/findPersonByFirstNameLikeOrderByLastName")
    public List<Person> findPersonByFirstNameLikeOrderByLastName(@RequestParam("name")String userName)
    {
        return personService.findPersonByFirstNameLikeOrderByLastName(userName);
    }

}

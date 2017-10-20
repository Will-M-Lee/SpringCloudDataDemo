package com.spring.data.dao;

import com.spring.data.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by Will on 2017/10/17.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>
{
    List<Person> findPersonByFirstName(String firstName);

    List<Person> findPersonByFirstNameLikeOrderByLastName(String firstName);

    List<Person> findPersonByFirstNameLikeOrderByLastNameDesc(String firstName);

    List<Person> findPersonByFirstNameRegex(String firstName);

}

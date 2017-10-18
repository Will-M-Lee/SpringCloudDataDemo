package com.spring.data.hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by Will on 2017/10/17.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>
{
}

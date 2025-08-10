package com.wipro.lombakdemo.repository;

import com.wipro.lombakdemo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

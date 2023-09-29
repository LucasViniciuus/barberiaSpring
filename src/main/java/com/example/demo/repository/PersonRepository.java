package com.example.demo.repository;

import com.example.demo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query("SELECT c FROM Person c WHERE c.name = :name")
    Person findPersonByNameTeste(String name);
}
package com.hibernate.demo.repository;

import com.hibernate.demo.model.Person;
import java.util.List;
import org.hibernate.annotations.processing.HQL;

/**
 * This interface contains abstract methods annotated with {@link HQL}
 * The Metamodel Generator will then automatically create an implementation of these methods.
 * This is something similar to Spring Jpa Query Methods
 */

interface Queries {
    /**
     * Metamodel Generator automatically produces an implementation of the method annotated {@link HQL}
     * @param lastName
     * @return
     */
    @HQL("WHERE lastName LIKE :lastName")
    List<Person> findByLastNameLike(String lastName);

    /**
     * Metamodel Generator automatically produces an implementation of the method annotated {@link HQL}
     * @param age
     * @return
     */
    @HQL("WHERE age > :age")
    List<Person> findByAgeMoreThan(int age);
}

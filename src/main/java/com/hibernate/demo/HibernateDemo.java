package com.hibernate.demo;

import com.hibernate.demo.repository.Queries_;
import com.hibernate.demo.model.Person;
import com.hibernate.demo.util.SessionFactoryConfig;
import java.util.List;
import org.hibernate.SessionFactory;

public class HibernateDemo {
    private static SessionFactory factory = SessionFactoryConfig.getSessionFactory();
    public static void main(String[] args) {
        List<Person> persons = factory.fromSession(session -> Queries_.findByLastNameLike(session, "%ch%"));
        System.out.println(persons);

        List<Person> byAgeMoreThan = factory.fromSession(s -> Queries_.findByAgeMoreThan(s, 30));
        byAgeMoreThan.forEach(System.out::println);
    }
}

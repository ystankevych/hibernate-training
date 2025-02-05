package com.hibernate.demo.util;

import com.hibernate.demo.model.Person;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

public class SessionFactoryConfig {
    private static final SessionFactory factory = init();

    private static SessionFactory init() {
        return new Configuration()
                .addAnnotatedClass(Person.class)
                .setProperty(AvailableSettings.HBM2DDL_IMPORT_FILES_SQL_EXTRACTOR, "org.hibernate.tool.schema.internal.script.MultiLineSqlScriptExtractor")
                .buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return factory;
    }
}

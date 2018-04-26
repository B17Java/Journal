package com.journal.repository;

import com.journal.model.Person;

public interface PersonRepository {

        boolean create(Person person);
        Person read(int id);
        int size();


}



package com.journal.repository.impl;

import com.journal.model.Person;
import com.journal.repository.PersonRepository;

public class PersonRepositoryMap implements PersonRepository {
    @Override
    public boolean create(Person person) {
        return false;
    }
}

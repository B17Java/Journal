package com.journal.repository.impl;

import com.journal.model.Person;
import com.journal.repository.PersonRepository;

import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryList implements PersonRepository {

    private List<Person> personList = new ArrayList();
    private int id;

    @Override
    public boolean create(Person person) {
        personList.add(id, person);
        person.setId(id++);
        return true;
    }

    @Override
    public Person read(int id) {
        return personList.get(id);
    }

    @Override
    public int size() {
        return personList.size();
    }
}


package com.journal.repository.impl;


import com.journal.model.Person;
import com.journal.repository.interf.PersonRepository;

import java.util.HashMap;
import java.util.Map;

public class PersonRepositoryMap implements PersonRepository {

    private Map<Integer, Person> personMap = new HashMap<>();

    int id = 0;
    @Override
    public boolean create(Person person) {
        personMap.put(id , person);
        person.setId(id++);
        return true;
    }

    @Override
    public Person read(int id) {
        return personMap.get(id);
    }

    @Override
    public int size() {
        return personMap.size();
    }

    @Override
    public boolean update(Person person) {
        personMap.put(person.getId(), person);
        return true;
    }

    @Override
    public boolean delete(int id) {
        personMap.remove(id);
        return true;
    }

    @Override
    public boolean delete(Person person) {
        personMap.remove(person.getId());
        return true;
    }


}

package com.journal;



import com.journal.model.Person;
import com.journal.model.Student;
import com.journal.repository.PersonRepository;
import com.journal.repository.impl.PersonRepositoryList;
import com.journal.repository.impl.PersonRepositoryMap;

public class Main {
    public static void main(String[] args) {
        PersonRepository a = new PersonRepositoryList();

        Person person1 = new Student("Vasiz", "Gamburadze");
        System.out.println(a.create(person1));
        System.out.println(a.read((int) person1.getId()));

        Person person2 = new Student("Vasiz1", "Gamburadze1");
        System.out.println(a.create(person2));
        System.out.println(a.read((int)person2.getId()));

        System.out.println(a.size());

    }
}

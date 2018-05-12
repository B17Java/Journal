package com.journal.repository;


import com.journal.model.Group;

public interface GroupRepository {

    boolean create(Group group);
    Group read(Integer id);
    boolean update(Group group);
    boolean delete(Integer id);
    boolean delete(Group group);
}

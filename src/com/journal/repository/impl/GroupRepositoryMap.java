package com.journal.repository.impl;

import com.journal.model.Group;
import com.journal.repository.GroupRepository;

import java.util.*;

public class GroupRepositoryMap implements GroupRepository {

    Map<Integer, Group> groupMap = new HashMap<>();
    private int id = 0;

    @Override
    public boolean create(Group group) {
        groupMap.put(id,group);
        group.setId(id++);
        return true;
    }

    @Override
    public Group read(Integer id) {
        return groupMap.get(id);
    }

    @Override
    public boolean update(Group group) {
        groupMap.put(group.getId(), group);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        groupMap.remove(id);
        return true;
    }

    @Override
    public boolean delete(Group group) {
            groupMap.remove(group.getId());
            return true;
        }



}

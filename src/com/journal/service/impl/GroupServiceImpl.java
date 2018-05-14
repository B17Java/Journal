package com.journal.service.impl;

import com.journal.model.Group;
import com.journal.repository.GroupRepository;
import com.journal.repository.impl.GroupRepositoryMap;
import com.journal.service.GroupService;
import com.journal.service.TeacherService;
import com.journal.exeption.*;
import com.journal.validator.Validador;

public class GroupServiceImpl implements GroupService {
    private GroupRepository groupRepositoryMap = new GroupRepositoryMap();


    @Override
    public boolean create(Group group) {
        try {
            Validador.groupName(group.getGroupName());
            this.groupRepositoryMap.create(group);
        } catch (IncorrectInputException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public Group read(Integer id) {
        return this.groupRepositoryMap.read(id);
    }

    @Override
    public boolean update(Group group) {
        try {
            Validador.groupName(group.getGroupName());
            this.groupRepositoryMap.update(group);
        } catch (IncorrectInputException e) {
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        if (groupRepositoryMap.read(id).getId() == id) {
            groupRepositoryMap.delete(id);
            return true;
        } else return false;
    }

    @Override
    public boolean delete(Group group) {
        if (groupRepositoryMap.read(group.getId()).getId() == group.getId()) {
            groupRepositoryMap.delete(group);
            return true;
        } else return false;
    }
}

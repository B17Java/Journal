package com.journal.model;

public class Group {
    private long id;
    private String groupName;
    private long[] idStudents;
    private String startData;
    private String endData;

    public Group(long id, String groupName, String startData, String endData) {
        this.id = id;
        this.groupName = groupName;
        this.startData = startData;
        this.endData = endData;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getStartData() {
        return startData;
    }

    public void setStartData(String startData) {
        this.startData = startData;
    }

    public String getEndData() {
        return endData;
    }

    public void setEndData(String endData) {
        this.endData = endData;
    }
}

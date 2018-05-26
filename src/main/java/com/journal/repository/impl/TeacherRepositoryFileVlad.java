package com.journal.repository.impl;

import com.journal.exeption.IncorrectInputException;
import com.journal.model.Teacher;
import com.journal.repository.TeacherRepository;

import java.io.*;

public class TeacherRepositoryFileVlad implements TeacherRepository {

    private String[] siarchLine;

    private String[] getLineByIndex(int id){
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("teacher.txt"));
            String line;
            while ( (line = bufferedReader.readLine()) != null ){
                siarchLine = line.split(" ");
                if (siarchLine[0].equals(Integer.toString(id)))
                    break;
            }
            if (Integer.parseInt(siarchLine[0]) < id)
                siarchLine = null;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return siarchLine;
    }

    @Override
    public boolean create(Teacher teacher) {
        try {
            FileWriter writer = new FileWriter("teacher.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            int index = Integer.parseInt(getLineByIndex(0)[0]) + 1;
            bufferWriter.write("\n" + index + " " + teacher);
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        return true;
    }

    @Override
    public Teacher read(Integer id) {
        Teacher teacher = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("teacher.txt"));
            teacher = new Teacher(Integer.parseInt(getLineByIndex(id)[0]), getLineByIndex(id)[1], getLineByIndex(id)[2]);
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teacher;
    }

    @Override
    public boolean update(Teacher teacher) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        try {
            FileWriter writer = new FileWriter("teacher.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            System.out.println(read(id).getId());
//            int index = Integer.parseInt(getLineByIndex(0)[0]) + 1;
//            bufferWriter.write("\n" + index + " " + teacher);
            bufferWriter.close();

        }
        catch (IOException e) {
            System.out.println(e);
        }
        return true;
    }

    @Override
    public boolean delete(Teacher teacher) {
        return false;
    }
}

package com.journal.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.journal.exeption.IncorrectInputException;
import com.journal.model.Student;
import com.journal.service.StudentService;
import com.journal.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/admin")
public class DefautController {

    StudentService studentService = new StudentServiceImpl();

    public static void main(String[] args) {
        DefautController defautController = new DefautController();
        System.out.println(defautController.hiPeople("Alex"));
    }

    @RequestMapping("/")
    public String home() {
        return "{\n" +
                "    \"id\": 1,\n" +
                "    \"content\": \"Hello, World!\"\n" +
                "}";
    }

    @RequestMapping("/hi/{name}")
    public String hiPeople(@PathVariable String name) {
        return "{\n" +
                "    \"id\": 1,\n" +
                "    \"content\": \"Hello, " + name +"\n" +
                "}";
    }

    @RequestMapping("/student/create/{name}/{secondName}")
    public String createStudent(@PathVariable String name,
                                @PathVariable String secondName) {
        try {
            studentService.create(name, secondName);
            return new ObjectMapper().writeValueAsString(studentService.getAll());
        } catch (JsonProcessingException e) {
            return "{error}";
        } catch (IncorrectInputException e) {
            return "{error: validation error}";
        }
    }
@RequestMapping("/student/create/{name}/{secondName}/{age}")
public String createStudent(@PathVariable String name,
                            @PathVariable String secondName,
                            @PathVariable int age) {
    try {
        studentService.create(Student.builder().firstName(name).lastName(secondName).age(age).build());
        return new ObjectMapper().writeValueAsString(studentService.getAll());
    } catch (JsonProcessingException e) {
        return "{error}";
    } catch (IncorrectInputException e) {
        return "{error: validation error}";
    }
}

    @RequestMapping("/student/all")
    public String getAll(){
        try {
            return new ObjectMapper().writeValueAsString(studentService.getAll());
        } catch (JsonProcessingException e) {
            return  "{error}";
        }
    }

}

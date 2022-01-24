package com.example.swagger_demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloSwagger
{
  /*  @Autowired
private Repository repository;
*/
    @RequestMapping("/test")
    public String swagger()
    {

        return "Hello Swagger";

    }

   /* @RequestMapping(method = RequestMethod.GET, value = "/home_swagger")
    public String swagger2()
    {

        return "Hello Swagger Home";

    }*/
/*
    @RequestMapping(method = RequestMethod.POST, value = "/home_swagger1")
    public String saveStudent(Student student)
    {
    return "Hello Swagger Home";

    }*/
}

package com.example.FirstSpringApplication.controller;

import org.springframework.web.bind.annotation.*;
import com.example.firstspringapplication.model.User;

@RestController
@RequestMapping("/hello")  // Base URL

public class HelloRestController {

    // GET Mapping for simple message
    @RequestMapping(value = {"/", "/home"})
    public String sayHello() {
        return "Hello From BridgeLabz!!!";
    }

    // GET Mapping with Query Parameter
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello " + name + "!";
    }

    // GET Mapping with Path Variable
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    // POST Mapping with RequestBody
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + "!";
    }

    // PUT Mapping with Path Variable + Query Parameter
    @PutMapping("/put/{firstName}")
    public String sayHello(@PathVariable String firstName,
                           @RequestParam(value = "lastName") String lastName) {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
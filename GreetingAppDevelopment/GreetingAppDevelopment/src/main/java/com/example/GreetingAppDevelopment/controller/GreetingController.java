package com.example.GreetingAppDevelopment.controller;


import com.example.GreetingAppDevelopment.model.Greeting;
import com.example.GreetingAppDevelopment.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteGreeting(@PathVariable Long id) {
        try{
            greetingService.deleteGreeting(id);
            return ResponseEntity.ok("Greeting deleted successfully");
        }
        catch(RuntimeException e){
            return ResponseEntity.status(404).body(e.getMessage());
        }
    }
}

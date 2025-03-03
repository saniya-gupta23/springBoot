package com.example.GreetingAppDevelopment.service;

import com.example.GreetingAppDevelopment.model.Greeting;
import com.example.GreetingAppDevelopment.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.Optional;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository greetingRepository;

    public void deleteGreeting(Long id) {
        Optional<Greeting> greeting = greetingRepository.findById(id);
        if (greeting.isPresent()) {
            greetingRepository.deleteById(id);
        }
        else{
            throw new RuntimeException("Greeting not found with ID:" + id);
        }
    }
}
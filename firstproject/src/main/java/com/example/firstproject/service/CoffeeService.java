package com.example.firstproject.service;

import com.example.firstproject.repository.CoffeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CoffeeService {
    @Autowired
    CoffeeRepository coffeeRepository;
}

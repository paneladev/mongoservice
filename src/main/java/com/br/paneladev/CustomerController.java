package com.br.paneladev;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerRepository repository;

    @GetMapping
    private List<Customer> findAll() {
        return repository.findAll();
    }

    @PostMapping
    private void save(@RequestBody Customer customer) {
        repository.save(customer);
    }
}
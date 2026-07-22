package com.example.lab05_bean_scope;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/coffees")
public class CoffeeController {
    // In-memory List สำหรับเก็บข้อมูลกาแฟ
    private final List<Coffee> coffees = new ArrayList<>();

    public CoffeeController() {
        // ข้อมูลตัวอย่างเริ่มต้น
        coffees.add(new Coffee(UUID.randomUUID().toString(), "Espresso", 55.0));
        coffees.add(new Coffee(UUID.randomUUID().toString(), "Latte", 65.0));
    }

    // [GET] 
    @GetMapping
    public List<Coffee> getAllCoffees() {
        return coffees;
    }

    // [POST] 
    @PostMapping
    public Coffee createCoffee(@RequestBody Coffee coffee) {
        coffee.setId(UUID.randomUUID().toString()); 
        coffees.add(coffee);
        return coffee;
    }
}
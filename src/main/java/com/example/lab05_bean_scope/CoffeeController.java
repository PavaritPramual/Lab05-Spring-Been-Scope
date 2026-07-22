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
    @GetMapping("/{id}")
    public Coffee getCoffeeById(@PathVariable String id) {
        for (Coffee coffee : coffees) {
            if (coffee.getId().equals(id)) {
                return coffee;
            }
        }
        return null;
    }

    // [POST] 
    @PostMapping
    public Coffee createCoffee(@RequestBody Coffee coffee) {
        coffee.setId(UUID.randomUUID().toString()); 
        coffees.add(coffee);
        return coffee;
    }
    // [PUT] ตาม ID
    @PutMapping("/{id}")
    public Coffee updateCoffee(@PathVariable String id, @RequestBody Coffee updatedCoffee) {
        for (int i = 0; i < coffees.size(); i++) {
            if (coffees.get(i).getId().equals(id)) {
                updatedCoffee.setId(id);
                coffees.set(i, updatedCoffee);
                return updatedCoffee;
            }
        }
        return null;
    }

    // [DELETE] ตาม ID
    @DeleteMapping("/{id}")
    public String deleteCoffee(@PathVariable String id) {
        boolean removed = coffees.removeIf(coffee -> coffee.getId().equals(id));
        if (removed) {
            return "Deleted coffee with ID: " + id;
        } else {
            return "Coffee not found!";
        }
    }
}
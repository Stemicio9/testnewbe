package com.example.testnewbe.controller;

import com.example.testnewbe.model.TestModel;
import com.example.testnewbe.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin()
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/test/{name}")
    public ResponseEntity<TestModel> getTest(@PathVariable String name){
        return ResponseEntity.ok().body(testService.findByName(name));
    }

    @GetMapping("/test")
    public ResponseEntity<List<TestModel>> findAllTests(){
        return ResponseEntity.ok().body(testService.findAll());
    }

    @PostMapping("/test")
    public ResponseEntity<TestModel> getTest(@RequestBody TestModel model){
        return ResponseEntity.ok().body(testService.save(model));
    }

}

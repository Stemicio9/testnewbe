package com.example.testnewbe.service;

import com.example.testnewbe.model.TestModel;
import com.example.testnewbe.repository.DummyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class TestService {

    @Autowired
    private DummyRepository dummyRepository;


    public TestModel findByName(String name){
        return dummyRepository.findByName(name);
    }


    public List<TestModel> findAll(){
       return dummyRepository.findAll();
    }

    public TestModel save(TestModel testModel){
        return dummyRepository.save(testModel);
    }


}

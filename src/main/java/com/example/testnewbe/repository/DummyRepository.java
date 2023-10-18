package com.example.testnewbe.repository;

import com.example.testnewbe.model.TestModel;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
public class DummyRepository {


    public TestModel findByName(String name){
        return new TestModel(name, "DUMMY VALUE");
    }


    public List<TestModel> findAll(){
        List<TestModel> result = new LinkedList<>();

        for(int i = 0; i<10;i++){
            result.add(new TestModel("NAME " + i, "VALUE " + i));
        }

        return result;
    }

    public TestModel save(TestModel testModel){
        return testModel;
    }



}

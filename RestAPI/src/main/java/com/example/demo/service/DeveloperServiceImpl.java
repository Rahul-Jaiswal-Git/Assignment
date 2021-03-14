package com.example.demo.service;

import com.example.demo.model.Developer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DeveloperServiceImpl implements DeveloperService{

    List<Developer> list = new ArrayList<Developer>();

    public DeveloperServiceImpl() {

        list.add(new Developer(1,"Developer1","Java"));
        list.add(new Developer(2,"Developer2","Java, AWS, Spring"));
    }

    @Override
    public List<Developer> getDeveloper(){
        return list;
    }

    @Override
    public Developer addDeveloper(Developer dev) {

         list.add(dev);
         return dev;
    }


    @Override
    public String deleteDeveloper(int devId) {

         list= list.stream().filter(developer -> developer.getId()!=devId).collect(Collectors.toList());
        return "Developer is deleted successfully";

    }

    @Override
    public void updateDeveloper(Developer dev ,int devId) {

       for(Developer D : list){

           if(D.getId()==devId){
               D.setName(dev.getName());
               D.setSkills(dev.getSkills());
               break;
           }
       }
    }
}

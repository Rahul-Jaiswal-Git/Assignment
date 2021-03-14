package com.example.demo.service;

import com.example.demo.model.Developer;

import java.util.List;

public interface DeveloperService {

    public List<Developer> getDeveloper();

    public Developer addDeveloper(Developer dev);

   public  String deleteDeveloper(int devId);

   public void updateDeveloper(Developer dveloper,int devId);
}

package com.example.hackathon.models;

import lombok.Data;

@Data
public class Project {
    String name;
    String logo;
    Scope projectScope;
    Collabirition ProjectCollabirition;
    Description projectDescription;
}

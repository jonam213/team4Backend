package com.example.hackathon.models;

import lombok.Data;

@Data
public class project {
    String name;
    String logo;
    Scope projectScope;
    Collabirition ProjectCollabirition;
    Description projectDescription;
}

package com.cybertek.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before
    public void setUpScenario(){
        System.out.println("-----> Before annotation: Setting up browser <-----");
    }

    @Before("@db")
    public void setUpDatabaseConnection(){
        System.out.println("-----> BEFORE ANNOTATION: DB CONNECTION CREATED <-----");
    }

    @After
    public void tearDownScenario(){
        System.out.println("-----> After annotation: Closing browser <-----");
    }

    @After("@db")
    public void tearDownDatabaseConnection() {
        System.out.println("-----> AFTER ANNOTATION: DB CONNECTION CLOSED <-----");
    }

    @BeforeStep("@db")
    public void setUpStep(){
        System.out.println("*** BEFORE EACH STEP -- TAKING SCREENSHOT ***");
    }

    @AfterStep("@db")
    public void tearDownStep(){
        System.out.println("*** AFTER EACH STEP -- TAKING SCREENSHOT ***");
    }
}

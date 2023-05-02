package com.in28minutes.database.databasedemo;

import org.junit.jupiter.api.*;

public class LifeTest {

    @Test
    public void Test(){
        System.out.println("Hello");
    }
    //@Before
    @BeforeAll
    public static void before() {
        System.out.println("Before");
    }

    //@After
    @AfterEach
    public void after() {
        System.out.println("After");
    }

    //@BeforeClass
    @BeforeEach
    public void beforeClass() {
        System.out.println("Before Class");
    }

    //	@AfterClass
    @AfterAll
    public static void afterClass() {
        System.out.println("After Class");
    }

}

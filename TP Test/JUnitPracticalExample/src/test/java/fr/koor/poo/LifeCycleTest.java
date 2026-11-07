package fr.koor.poo;

/**
 *
 * @author ahmed
 */

import org.junit.jupiter.api.*;

class LifeCycleTest {

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeAll: Executed once before all tests");
    }

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("@BeforeEach: Executed before each test method");
    }

    @Test
    void test1() {
        System.out.println("Running test1");
    }

    @Test
    void test2() {
        System.out.println("Running test2");
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("@AfterEach: Executed after each test method");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("@AfterAll: Executed once after all tests");
    }
}
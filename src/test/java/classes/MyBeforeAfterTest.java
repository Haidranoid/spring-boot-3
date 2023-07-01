package classes;

import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }

    @Test
    void test1() {
        System.out.println("test 1");
    }

    @Test
    void test2() {
        System.out.println("test 2");
    }

    @Test
    void test3() {
        System.out.println("test 3");
    }
}

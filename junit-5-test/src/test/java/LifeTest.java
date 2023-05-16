import org.junit.jupiter.api.*;

/**
     BeforeAll
     BeforeEach
     ....
     AfterEach
     AfterAll
 */
public class LifeTest {

    @BeforeAll
    public static void before() {
        System.out.println("BeforeAll");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("BeforeEach");
    }

    @Test
    void test1() {
        System.out.println("test1");
    }

    @Test
    void test2() {
        System.out.println("test2");
    }

    @Test
    void test3() {
        System.out.println("test3");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("AfterEach");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll");
    }

}

import org.junit.*;

/**
     BeforeClass
     Before
     ....
     After
     AfterClass
 */
public class LifeTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass");
    }

    @Before
    public void before() {
        System.out.println("Before");
    }

    @Test
    public void Test() {
        System.out.println("Hello World");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass");
    }

}

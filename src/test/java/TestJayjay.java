import org.junit.jupiter.api.*;

public class TestJayjay {

    @BeforeAll
    public static void beforeAll() {
        System.out.println ("Dieksekusi ketika before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println ("Dieksekusi ketika after all");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Dieksekusi ketika before each");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Dieksekusi ketika after each");
    }

    @Test
    public void testPenjumlahan(){
        System.out.println("Dieksekusi didalam test penjumlahan");
        Assertions.assertEquals(4, 2+2);
    }

    @Test
    public void testPengurangan() {
        System.out.println("Dieksekusi didalam test pengurangan");
        Assertions.assertEquals(5, 10-5);
    }
}

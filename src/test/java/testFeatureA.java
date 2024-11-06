import org.testng.Assert;
import org.testng.annotations.*;

public class testFeatureA {

    @BeforeSuite
    public static void beforeSuite(){
        System.out.println("Dieksekusi dari before suite A");
    }

    @AfterSuite
    public static void afterSuite(){
        System.out.println("Dieksekusi dari after suite A");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Dieksekusi dari before class A");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Dieksekusi dari after class A");
    }

    @BeforeMethod
    public static void beforeMethod(){
        System.out.println("Dieksekusi dari before method A");
    }

    @AfterMethod
    public static void aftermethod(){
        System.out.println("Dieksekusi dari after method A");
    }

    @BeforeTest
    public static void beforeTest(){
        System.out.println("Dieksekusi dari before test A");
    }

    @AfterTest
    public static void afterTest(){
        System.out.println("Dieksekusi dari after test A");
    }

    @Test
    public void testPenjumlahan () {
        System.out.println("Dieksekusi dari test Penjumlahan");
        Assert.assertEquals(5+4, 9);
    }

    @Test
    public void testPengurangan () {
        System.out.println("Dieksekusi dari test Pengurangan");
        Assert.assertEquals(5-4, 1);
    }
}

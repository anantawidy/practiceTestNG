import org.testng.Assert;
import org.testng.annotations.*;

public class testFeatureB {
    @BeforeSuite
    public static void beforeSuite(){
        System.out.println("Dieksekusi dari before suite B");
    }

    @AfterSuite
    public static void afterSuite(){
        System.out.println("Dieksekusi dari after suite B");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Dieksekusi dari before class B");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Dieksekusi dari after class B");
    }

    @BeforeMethod
    public static void beforeMethod(){
        System.out.println("X before method B");
    }

    @AfterMethod
    public static void aftermethod(){
        System.out.println("Y after method B");
    }

    @BeforeTest
    public static void beforeTest(){
        System.out.println("Dieksekusi dari before test B");
    }

    @AfterTest
    public static void afterTest(){
        System.out.println("Dieksekusi dari after test B");
    }

    @Test
    public void testPenjumlahan () throws InterruptedException{
        Thread.sleep(5000);
        System.out.println("Dieksekusi dari test Penjumlahan B");
        Assert.assertEquals(5+4, 9);
    }

    @Test
    public void testPengurangan () throws InterruptedException{
        Thread.sleep(3000);
        System.out.println("Dieksekusi dari test Pengurangan B");
        Assert.assertEquals(5-4, 1);
    }
}

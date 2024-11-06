package test.L04_Junit;


import org.testng.annotations.*;

public class L02_BeforeAfter {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Tüm class dan önce tek bir sefer çalışır");
        System.out.println("************************");
    }

    @BeforeMethod
    public void setup(){
        System.out.println("her methoddan önce 1 kez çalışır");
    }

    @Test
    public void test01(){
        System.out.println("test 01 çalıştı");
    }

    @Test
    public void test02(){
        System.out.println("test 02 çalıştı");
    }

    @Test
    public void test03(){
        System.out.println("test 03 çalıştı");
    }

   @AfterMethod
   public void tearDown(){
       System.out.println("her methoddan sonra 1 kez çalışır");
   }

   @AfterClass
    public void afterClass(){
       System.out.println("************************");
       System.out.println("Tüm classdan sonra 1 kez çalışır");
   }
}

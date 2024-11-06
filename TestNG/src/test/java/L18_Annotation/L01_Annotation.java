package L18_Annotation;

import org.testng.annotations.*;

public class L01_Annotation {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("her şeyden önce beforesuit sahip method 1 kere çalışır");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("testlerden önce before teste sahip method 1 kere çalışır");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("her class dan önce 1 kere çalışır");
    }

    @BeforeMethod
    public  void beforeMethod() {
        System.out.println("her methoddan önce 1 kere çalışır");
    }

    @Test
    public void test1(){
        System.out.println("test 1 çalıştı");
    }

    @Test
    public void test2(){
        System.out.println("test 2 çalıştı");
    }

    @Test
    public void test3(){
        System.out.println("test 3 çalıştı");
    }
}

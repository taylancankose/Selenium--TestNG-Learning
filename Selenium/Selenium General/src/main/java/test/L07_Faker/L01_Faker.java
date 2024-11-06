package test.L07_Faker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class L01_Faker {

    @Test
    public void test01() {
        Faker faker = new Faker();

        System.out.println(faker.name().firstName());
        System.out.println(faker.name().lastName());
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.number().digits(15));
    }
}

package in.reqres.testbase;

/* By Jitendra Patel */

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {

    @BeforeClass
    public static void inIt(){
        RestAssured.baseURI = "https://reqres.in/api";
 //       RestAssured.basePath = "";
    }
}
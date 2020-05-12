package in.reqres.testsuite;

/* By Jitendra Patel */

import in.reqres.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class GetRequest extends TestBase {

    @Test
    public void getListUsers() {
        given()
                .log()
                .body()
                .param("page", "2")
                .when()
                .get("/users")
                .then().body("ad.company", equalTo("StatusCode Weekly"))
                .log().body().statusCode(200);
    }

    @Test
    public void getSingleUser(){
        given()
                .when()
                .get("/users/2")
                .then().body("data.first_name", equalTo("Janet"))
                .log().body().statusCode(200);
    }

    @Test
    public void getSingleUserNotFound(){
        given()
                .when()
                .get("users/23")
                .then()
                .body( equalTo("{}"))
                .log().all()
                .log().body().statusCode(404);
    }
}
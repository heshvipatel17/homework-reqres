package in.reqres.testsuite;

/* By Jitendra Patel */


import in.reqres.pojo.Pojo;
import in.reqres.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostRequest extends TestBase {


    @Test
    public void createUser() {

        Pojo pojo = new Pojo();
        pojo.setName("Jitu");
        pojo.setJob("Accountant");
        pojo.setEmail("abc@gmail.com");
        pojo.setPassword("abc123");

        given()
                .log()
                .body()
                .when()
                .body(pojo)
                .post("/users")
                .then()
                .log().body()
                .statusCode(201);
    }

    @Test
    public void registerSuccessful() {

        Pojo pojo = new Pojo();
        pojo.setName("Jitu");
        pojo.setJob("Accountant");
        pojo.setEmail("eve.holt@reqres.in");
        pojo.setUserName("dsjdjk");
        pojo.setPassword("pistol");

        given()
                .log()
                .body()
                .when()
                .body(pojo)
                .post("/api/register")
                .then()
                .log().body()
                .statusCode(201);

    }

    @Test
    public void registerUnsuccessful() {
        Pojo pojo = new Pojo();
        pojo.setName("Jituu");
        pojo.setJob("Accountantt");
        pojo.setEmail("eve.holt@reqres.in");
        pojo.setUserName("jrp");
//        pojo.setPassword("");

        given()
                .log()
                .body()
                .when()
                .body(pojo)
                .post("/api/register")
                .then()
                .log()
                .body()
                .statusCode(201);
    }

    @Test
    public void loginSuccessful() {
        Pojo pojo = new Pojo();
        pojo.setName("Jituu");
        pojo.setJob("Accountantt");
        pojo.setEmail("eve.holt@reqres.in");
        pojo.setUserName("jrp");
        pojo.setPassword("pistol");

        given()
                .log()
                .body()
                .when()
                .body(pojo)
                .post("/login")
                .then()
                .log()
                .body()
                .statusCode(400);
    }
    @Test
    public void loginUnsuccessful() {
        Pojo pojo = new Pojo();
        pojo.setName("Jituu");
        pojo.setJob("Accountantt");
        pojo.setEmail("eve.holt@reqres.in");
        pojo.setUserName("jrp");
        pojo.setPassword("pistol");

        given()
                .log()
                .body()
                .when()
                .body(pojo)
                .post("/login")
                .then()
                .log()
                .body()
                .statusCode(400);
    }
}
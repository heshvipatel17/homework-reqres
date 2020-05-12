package in.reqres.testsuite;

/* By Jitendra Patel */

import in.reqres.pojo.Pojo;
import in.reqres.testbase.TestBase;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteRequest extends TestBase {

    @Test
    public void deleteUser() {
        Pojo pojo = new Pojo();

        pojo.setName("Jitu");
        pojo.setJob("Tester");
        pojo.setEmail("jrp@gmail.com");
        pojo.setPassword("jrp123");

        given()
                .log()
                .body()
                .when()
                .body(pojo)
                .delete("/users/2")
                .then()
                //      .body("name",equalTo("Jitu"))
                .log().body()
                .statusCode(204);

    }
}
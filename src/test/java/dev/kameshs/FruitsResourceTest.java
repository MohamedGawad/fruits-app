package dev.kameshs;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class FruitsResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/api/fruits/")
          .then()
             .statusCode(200)
             .body(is("apple"));
    }

}

import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiTests {

    private static final RequestSpecification requestSpecification = given()
            .baseUri("https://postman-echo.com")
            .log().body();

    private static final ResponseSpecification responseSpecification = expect()
            .body("data", equalTo("This is expected to be sent back as part of response body."))
            .statusCode(200);

    @Test
    public void getRequestTest() {
        given()
                .spec(requestSpecification)
                .param("foo1", "bar1")
                .param("foo2", "bar2")
                .when()
                .get("/get")
                .then().log().body()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }

    @Test
    public void postRawTextTest() {
        String jsonBody = """
                {
                    "test": "value"
                }
                """;
        given()
                .spec(requestSpecification)
                .contentType("application/json").body(jsonBody)
                .when().post("/post")
                .then().log().body()
                .body("json.test", equalTo("value"))
                .statusCode(200);
    }

    @Test
    public void postFormData() {
        given()
                .spec(requestSpecification)
                .contentType("multipart/form-data")
                .multiPart("foo1", "bar1")
                .multiPart("foo2", "bar2")
                .when().post("/post")
                .then().log().body()
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))
                .statusCode(200);
    }

    @Test
    public void putRequestTest() {
        String raw = "This is expected to be sent back as part of response body.";
        given()
                .spec(requestSpecification)
                .contentType("text/plain").body(raw)
                .when().put("/put")
                .then().log().body()
                .spec(responseSpecification);
    }

    @Test
    public void patchRequestTest(){
        String raw = "This is expected to be sent back as part of response body.";
        given()
                .spec(requestSpecification)
                .contentType("text/plain").body(raw)
                .when().patch("/patch")
                .then().log().body()
                .spec(responseSpecification);
    }

    @Test
    public void deleteRequestTest(){
        String raw = "This is expected to be sent back as part of response body.";
        given()
                .spec(requestSpecification)
                .contentType("text/plain").body(raw)
                .when().delete("/delete")
                .then().log().body()
                .spec(responseSpecification);
    }
}


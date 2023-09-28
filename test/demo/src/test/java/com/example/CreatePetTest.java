import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

public class CreatePetTest {

    @Test
    public void createNewPet() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        String requestBody = "{\"id\": 123, \"name\": \"MyPet\", \"status\": \"available\"}";

        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
            .when()
                .post("/pet")
            .then()
                .statusCode(200);
    }
}

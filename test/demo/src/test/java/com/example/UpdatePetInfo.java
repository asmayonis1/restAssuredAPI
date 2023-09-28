import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.Test;

public class UpdatePetTest {

    @Test
    public void updatePetInfo() {
        // Define the base URL
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        // Define the request body with updated data
        String requestBody = "{\"id\": 123, \"name\": \"UpdatedPet\", \"status\": \"sold\"}";

        // Send a PUT request to update pet information by ID (e.g., ID 123)
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
            .when()
                .put("/pet")
            .then()
                .statusCode(200);
    }
}

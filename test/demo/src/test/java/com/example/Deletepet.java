import io.restassured.RestAssured;
import org.junit.Test;

public class DeletePetTest {

    @Test
    public void deletePet() {
        // Define the base URL
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        // Send a DELETE request to delete a pet by ID (e.g., ID 123)
        RestAssured.when()
                .delete("/pet/123")
            .then()
                .statusCode(200);
    }
}

import io.restassured.RestAssured;
import org.junit.Test;

public class GetPetTest {

    @Test
    public void getPetInfo() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        RestAssured.when()
                .get("/pet/123")
            .then()
                .statusCode(200);
    }
}

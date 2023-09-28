import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

public class DemoblazeAPITest {

    @Test
    public void testLogin() {
        // Set the base URL for Demoblaze
        RestAssured.baseURI = "https://www.demoblaze.com";

        // Define the login endpoint and request body
        String loginEndpoint = "/api/login";
        String requestBody = "{\"username\": \"your_username\", \"password\": \"your_password\"}";

        // Send a POST request for login
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
            .when()
                .post(loginEndpoint);

        // Assertions for login response
        response.then()
                .statusCode(200) 
                .contentType(ContentType.JSON); 
    }

    @Test
    public void testSignup() {
        // Set the base URL for Demoblaze
        RestAssured.baseURI = "https://www.demoblaze.com";

        // Define the signup endpoint and request body
        String signupEndpoint = "/api/signup";
        String requestBody = "{\"username\": \"new_username\", \"password\": \"new_password\"}";

        // Send a POST request for signup
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
            .when()
                .post(signupEndpoint);

        // Assertions for signup response
        response.then()
                .statusCode(200) 
                .contentType(ContentType.JSON); 
    }
}
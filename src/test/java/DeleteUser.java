import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteUser {

    @Test
    public void deleteExistingUser(){
        RestAssured.baseURI = "https://fakerestapi.azurewebsites.net";
        RequestSpecification updateUserRequest = RestAssured.given();


        Response response = updateUserRequest.request(Method.DELETE, "api/v1/Users/10");

        response.getBody().prettyPrint();

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);

    }
}



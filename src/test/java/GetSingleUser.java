import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetSingleUser {
    @Test
    public void getUser(){
        RestAssured.baseURI = "https://fakerestapi.azurewebsites.net";

        RequestSpecification getSingleUser = RestAssured.given();

        Response response = getSingleUser.request(Method.GET, "/api/v1/Users/2");

        String responseBody = response.getBody().prettyPrint();

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);

        System.out.println(responseBody);


    }
}

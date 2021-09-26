import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUserList {

    @Test
    public void getUsers() {
        RestAssured.baseURI = "https://fakerestapi.azurewebsites.net/";

        RequestSpecification getUserList = RestAssured.given();

        Response response = getUserList.request(Method.GET,"/api/v1/Users/");

        String responseBody = response.getBody().prettyPrint();

        int statusCode = response.getStatusCode();
        System.out.println("Status code is " + statusCode);

        Assert.assertEquals(statusCode, 200);

        System.out.println(responseBody);


    }
}

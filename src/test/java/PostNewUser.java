import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostNewUser {
    @Test
    public void createNewUser(){
        RestAssured.baseURI = "https://fakerestapi.azurewebsites.net";

        RequestSpecification createNewUserRequest =RestAssured.given();

        JSONObject requestParams = new JSONObject();

        requestParams.put( "id", "0");
        requestParams.put("userName", "Saman");
        requestParams.put("password", "1234");

        createNewUserRequest.header("Content-Type","Application/Json");


        createNewUserRequest.body(requestParams.toJSONString());

        Response response = createNewUserRequest.post("/api/v1/Users");

        response.getBody().prettyPrint();

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);

    }
}


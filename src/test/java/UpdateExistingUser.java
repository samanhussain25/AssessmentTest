import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateExistingUser {

    @Test
    public void PutRequest(){
        RestAssured.baseURI = "https://fakerestapi.azurewebsites.net";
        RequestSpecification updateUserRequest = RestAssured.given();

        JSONObject requestParams = new JSONObject();
        requestParams.put("userName", "SamanHussain");

        updateUserRequest.header("Content-Type", "application/json");
        updateUserRequest.body(requestParams.toJSONString());

        Response response = updateUserRequest.request(Method.PUT, "api/v1/Users/10");

        response.getBody().prettyPrint();

        int statusCode = response.getStatusCode();

        Assert.assertEquals(statusCode, 200);

    }
}

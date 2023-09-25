package RestAssured;

import com.google.gson.JsonObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.json.JSONArray;
import org.json.JSONObject;


//java library used to TEST RESTful APIs
//RESTful = type of deisgn for an API which can handle, get, put, post, delete, and it is "stateless" - any request from client to server must contain all info neccesary to process request - does not rely on previous state, indepent from any request that we create
public class TestRestAssuredAPI {

    private String token = "1af133a62dc949ec9718a491b5b111691d6c92f01f61fa68b944b27059c76b74";
    private String baseURI = "https://gorest.co.in/public/v2";

    private int userID = 5182475;

    @BeforeTest
    public void setUp(){
        RestAssured.baseURI = baseURI;
    }
    @Test(enabled = false) // GET request
    public void testGetRequest(){
        Response response = RestAssured.given()
                .when()
                .get("/users");

        int statusCode = response.getStatusCode();
        System.out.println("status: "+ statusCode);

        Assert.assertEquals(statusCode,200);

        String responseBody = response.getBody().asString();
        System.out.println("response: " + responseBody);

        JSONArray jsonArray = new JSONArray(responseBody); // you can any loop, but loops are or lists will be necessary
        for (int i = 0; i < jsonArray.length();i++){
            JSONObject user = jsonArray.getJSONObject(i);
            Assert.assertTrue(user.has("id"));
            Assert.assertTrue(user.has("name"));
            Assert.assertTrue(user.has("email"));
            Assert.assertTrue(user.has("gender"));
            Assert.assertTrue(user.has("status"));
        }
    }


    @Test(enabled = false)
    public void testPostRequest(){

        RequestSpecification request = RestAssured.given()
                .header("Authorization","Bearer " + token)
                .header("Content-Type","application/json");

        String requestBody = "{"
                + "\"name\": \"ana\","
                + "\"email\": \"apf@example.com\","
                + "\"gender\": \"female\","
                + "\"status\": \"active\""
                + "}";

        Response response = request.body(requestBody).post("/users");

        int statusCode = response.getStatusCode();
        System.out.println("status: " + statusCode);
        Assert.assertEquals(statusCode,201);

        String responseBody = response.getBody().asString();
        System.out.println("Response Body: " + responseBody);

        int newUserId = response.jsonPath().getInt("data.id");
        System.out.println("New User with Id: " + newUserId);

    }



    @Test(enabled = false)
    public void testPutRequest(){

        RequestSpecification request = RestAssured.given()
                .header("Authorization","Bearer " + token)
                .header("Content-Type","application/json");

        String requestBody = "{"
                + "\"name\": \"Some diff Name\","
                + "\"email\": \"updateduser@example.com\","
                + "\"gender\": \"male\","
                + "\"status\": \"active\""
                + "}";

        Response response = request.body(requestBody).put("/users/"+ userID);

        int statusCode = response.getStatusCode();
        System.out.println("status: " + statusCode);
        Assert.assertEquals(statusCode,200);

        String responseBody = response.getBody().asString();
        System.out.println("response: " + responseBody);
    }

    @Test(enabled = true)
    public void testDeleteRequest(){

        Response response = RestAssured.given()
                .header("Authorization","Bearer " + token)
                .when()
                .delete("/users/" + userID);

        int statusCode = response.getStatusCode();
        System.out.println("Response Status: " + statusCode);

    }

}
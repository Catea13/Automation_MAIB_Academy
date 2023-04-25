package API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class RestAssuredAPITest {
    private final String URL = "https://reqres.in/";

    @Test
    public void GetBody() {
        RestAssured.baseURI = "http://saucedemo.com/";
        RequestSpecification httpRequest = given();
        Response response = httpRequest.request(Method.GET, "");
        System.out.println("Response=>" + response.prettyPrint());


    }

    @Test
    public void firstTest() {
        List<UserData> userData = given()
                .when()
                .contentType(ContentType.JSON)
                .get(URL + "api/users?page=2")
                .then().log().all()
                .extract().body().jsonPath().getList("data", UserData.class);
        for (UserData x : userData) {
            Assert.assertTrue(x.getAvatar().contains(x.getId().toString()));
            Assert.assertTrue(x.getEmail().endsWith("@reqres.in"));

        }
    }

    @Test
    public void secondTest() {
        Map<String, String> user = new HashMap<>();
        user.put("email", "eve.holt@reqres.in");
        user.put("password", "pistol");
        Response response = given()
                .body(user)
                .when()
                .post("https://reqres.in/api/register/")
                .then().log().all()
                .extract().response();
        JsonPath jsonPath = response.jsonPath();
        int id = jsonPath.get("id");
        String token = jsonPath.get("token");
        Assertions.assertEquals(4, id);
        Assertions.assertEquals("QpwL5tke4Pnpja7X4", token);
    }
}






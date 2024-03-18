import classwork_29.BookStoreApi;
import classwork_29.BookStoreUser;
import classwork_29.TokenModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class ApiTest {
    BookStoreApi bookStoreApi;
    @BeforeTest
    public void setup() {
        bookStoreApi = new BookStoreApi();
    }
    @Test
    public void getTokenTest() throws IOException, InterruptedException {
       // given (дано)
        BookStoreUser user = generateUser();


        // when (дія)
        TokenModel responseModel = bookStoreApi.getUserToken(user);

        //then
        Assert.assertEquals(responseModel.getStatus(), "Success");
        Assert.assertEquals(responseModel.getResult(), "User authorized successfully.");

    }


    private BookStoreUser generateUser() {
        return new BookStoreUser("testUser5", "testPassw0rd!");
    }

    String getRequestBody (Object o){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void restAssuredGetTokenTest(){
        RestAssured.given()
                .baseUri("https://demoqa.com")
                .contentType(ContentType.JSON)
                .body(getRequestBody(generateUser()))
                .when()
                .post("/Account/v1/GenerateToken")
                .then().statusCode(200)
                .body("status", Matchers.equalTo("Success"))
                .body("result", Matchers.containsString("User authorized"));
    }
}

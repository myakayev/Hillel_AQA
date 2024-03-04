import classwork_29.BookStoreUser;
import classwork_29.TokenModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiTest {
    HttpClient client;
    HttpRequest request;
    ObjectMapper objectMapper;
    @BeforeTest
    public void setup() {
        client = HttpClient.newBuilder().build();
        objectMapper = new ObjectMapper();
    }
    @Test
    public void getTokenTest() throws IOException, InterruptedException {
       // given (дано)
        BookStoreUser user = generateUser();
        TokenModel token;
        request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(getRequestBody(user)))
                //.uri(URI.create("https://demoqa.com/Account/v1/User")) // створюємо користувача
                .uri(URI.create("https://demoqa.com/Account/v1/GenerateToken")) // генеруємо токен
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .build();
        // when (дія)
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        TokenModel responseModel = objectMapper.readValue(response.body(), TokenModel.class);

        //then
        Assert.assertEquals(responseModel.getStatus(), "Success");
        Assert.assertEquals(responseModel.getResult(), "User authorized successfully.");
        Assert.assertEquals(responseModel.getStatusCode(), 200);

    }
    private String getRequestBody (Object o){
        try {
            return objectMapper.writeValueAsString(o);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private BookStoreUser generateUser() {
        return new BookStoreUser("testUser5", "testPassw0rd!");
    }
}

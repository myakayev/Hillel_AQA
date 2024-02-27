package classwork_29;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.val;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String requestBody = "{\n" +
                "  \"userName\": \"testLogin2\",\n" +
                "  \"password\": \"testPassw0rd!\"\n" +
                "}";
        BookStoreUser user = new BookStoreUser("testUser4", "testPassw0rd!");
        ObjectMapper objectMapper = new ObjectMapper();
        String userBody = objectMapper.writeValueAsString(user);
        // System.out.println(userBody);

        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(userBody))
                //.uri(URI.create("https://demoqa.com/Account/v1/User")) // створюємо користувача
                .uri(URI.create("https://demoqa.com/Account/v1/GenerateToken")) // генеруємо токен
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}

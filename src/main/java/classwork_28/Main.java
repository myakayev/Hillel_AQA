package classwork_28;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.CompactStringObjectMap;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        HttpClient  client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://demoqa.com/BookStore/v1/Books"))
                .build();
        HttpResponse <String> response = null;
        try {
            response =  client.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String body = response.body();
        System.out.println(response.body());


        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(body);
        jsonNode.fields().forEachRemaining(System.out::println);
        jsonNode.get("books").get(0).fields().forEachRemaining(System.out::println);
    }
}

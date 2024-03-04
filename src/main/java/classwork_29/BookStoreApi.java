package classwork_29;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

import java.net.http.HttpClient;
@Data
public class BookStoreApi {
    private ObjectMapper objectMapper;
    private HttpClient httpClient;


}

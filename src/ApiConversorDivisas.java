import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiConversorDivisas {
    public Conversor buscarMoneda(String denominacionBase){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/b567e9d7a6af531af245c9c3/latest/"+denominacionBase);
        //**mi key** // URI direccion = URI.create("https://v6.exchangerate-api.com/v6/15cbc2ddb2ddf469d20a777e/latest/"+denominacionBase);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();


        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Conversor.class);
        } catch (Exception e) {
            throw new RuntimeException("Conversion no realizada, revisa la informacion Digitada");
        }

    }
}

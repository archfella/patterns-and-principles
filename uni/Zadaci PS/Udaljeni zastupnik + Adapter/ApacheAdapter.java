import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.net.URIBuilder;
import org.apache.hc.client5.http.classic.methods.HttpPost;

import java.net.URI;

public class ApacheAdapter implements HttpInterface{

    public int get(String address, HashMap<String, String> parameters){
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            URI uri = new URIBuilder(address)

            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                uri.addParameter(key, value);
            }

            uri.build();

            HttpGet httpGet = new HttpGet(uri);

            try (CloseableHttpResponse response = httpClient.execute(httpGet)) {

                int statusCode = response.getCode();
                System.out.println("Status Code: " + statusCode);

                String responseBody = EntityUtils.toString(response.getEntity());
                System.out.println("Response Body: " + responseBody);

                return statusCode;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int post(String address, HashMap<String, String> parameters){
        try (CloseableHttpClient httpClient = HttpClients.createDefault()) {

            HttpPost httpPost = new HttpPost(address);

            String json = "{";

            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();

                json.concat("\""); json.concat(key); json.concat("\":\""); json.concat(value); json.concat("\",");
            }

            json.concat("}");

            StringEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
            httpPost.setEntity(entity);
            httpPost.setHeader("Accept", "application/json");
            httpPost.setHeader("Content-type", "application/json");

            try (CloseableHttpResponse response = httpClient.execute(httpPost)) {
                int statusCode = response.getCode();
                System.out.println("Status Code: " + statusCode);

                String responseBody = EntityUtils.toString(response.getEntity());
                System.out.println("Response Body: " + responseBody);

                return responseBody;
            }

        } catch (Exception e) {
            return "";
            e.printStackTrace();
        }
    }

}
package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.EntityExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient;

class GetsWithParser
{
	private WebTestClient client;
	private String baseURL = "https://jsonplaceholder.typicode.com";

	@BeforeEach
	void setUp()
	{
		client = WebTestClient.bindToServer().baseUrl(baseURL).build();
	}

	@Test
	void get()
	{
		EntityExchangeResult<String> result = client.get().uri("/users")
					.accept(MediaType.APPLICATION_JSON)
					.exchange()
					.expectStatus().isEqualTo(200)  // isOK
//					.expectHeader().contentType(MediaType.APPLICATION_JSON)
					.expectBody(String.class)
					.returnResult();
		String body = result.getResponseBody();
//		System.out.println(body);
		
// using org.json
		JSONArray response = new JSONArray(body);
		JSONObject e1 = response.getJSONObject(0);
		int id = e1.getInt("id");
		System.out.println("id = " + id);
		
		String geoLng = e1.getJSONObject("address").getJSONObject("geo").getString("lng");
		System.out.println("lng = " + geoLng);
	}
}

package rest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.EntityExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient;

class Gets
{
	private WebTestClient client;
	private String baseURL = "http://api.zippopotam.us";

	@BeforeEach
	void setUp()
	{
		client = WebTestClient.bindToServer().baseUrl(baseURL).build();
	}

	@Test
	void get()
	{
		EntityExchangeResult<String> result = client.get().uri("/us/15216")
					.accept(MediaType.APPLICATION_JSON)
					.exchange()
					.expectStatus().isEqualTo(200)  // isOK
					.expectHeader().contentType(MediaType.APPLICATION_JSON)
					.expectBody(String.class)
					.returnResult();
		String body = result.getResponseBody();
		System.out.println(body);
	}
}

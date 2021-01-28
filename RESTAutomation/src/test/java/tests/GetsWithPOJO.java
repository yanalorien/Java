package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.reactive.server.EntityExchangeResult;
import org.springframework.test.web.reactive.server.WebTestClient;

import pages.TimezonePage;

class GetsWithPOJO
{
	private WebTestClient client;
	private String baseURL = "http://worldtimeapi.org/api/timezone";

	@BeforeEach
	void setUp()
	{
		client = WebTestClient.bindToServer().baseUrl(baseURL).build();
	}

	@Test
	void test()
	{
		EntityExchangeResult<TimezonePage> result = client.get().uri("/America/Los_Angeles")
					.exchange()
					.expectStatus().isOk()
					.expectHeader()
					.contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
					.expectBody(TimezonePage.class)
					.returnResult();
		
		TimezonePage response = result.getResponseBody();
		assertEquals(3, response.getDay_of_week());
		assertEquals("PST", response.getAbbreviation());
	}
}

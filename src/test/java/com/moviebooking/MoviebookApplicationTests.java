package com.moviebooking;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

//@SpringBootTest
class MoviebookApplicationTests {

	@Test void appHasAGreeting() {

		MoviebookApplication classUnderTest = new MoviebookApplication();

	       assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");

	   }
}

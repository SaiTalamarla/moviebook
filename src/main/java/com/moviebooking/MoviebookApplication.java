package com.moviebooking;

//@SpringBootApplication
public class MoviebookApplication {

	public String getGreeting() {

	       return "Hello World!";

	   }


	   public static void main(String[] args) {

	       System.out.println(new MoviebookApplication().getGreeting());

	   }

}

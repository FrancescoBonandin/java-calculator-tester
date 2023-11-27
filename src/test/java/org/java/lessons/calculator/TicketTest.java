package org.java.lessons.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketTest {
	
	public Ticket ticket;
	
	@BeforeEach
	public void init() throws Exception {
		
		ticket = new Ticket(10, 35);
	}
	
	@Test
	public void getFinalPriceWithBothParamCorrectNoDiscount() throws Exception {
		
		assertEquals(2.10f, ticket.finalPrice(),"not ok idk why");
	}
	
	@Test
	public void getFinalPriceWithBothParamCorrectOver65Discount() throws Exception {
		
		ticket.setAge(65);
		
		assertEquals(1.26f, ticket.finalPrice(),"not ok calcs in finalPrice");
	}
	
	@Test
	public void getFinalPriceWithBothParamCorrectUnder18Discount() throws Exception {
		
		ticket.setAge(15);
		
		assertEquals(1.68f, ticket.finalPrice(),"not ok calcs in finalPrice");
	}
	
	@Test
	public void setAgeToIncorrectAge() {
		
		
		assertThrows(Exception.class,()->ticket.setAge(-10), "attesa eccezione, age < 0 non consentita");
	}
	
	@Test
	public void setKMToIncorrectKm() {
		
		
		assertThrows(Exception.class,()->ticket.setKm(-10),"attesa eccezione, km < 0 non consentiti");
	}
}



package org.java.lessons.calculator;

import java.util.Scanner;

public class Ticket {

	private Integer km;
	private Integer age;
	final private static Float PRICE_X_KM = 0.21f;
	final private static Float OVER_65_DISCOUNT = 0.4f;
	final private static Float UNDER_18_DISCOUNT = 0.2f;
	
	public Ticket(Integer km, Integer age) throws Exception {
		
		setKm(km);
		setAge(age);
		
	}
	
	
	public Integer getKm() {
		return km;
	}


	public void setKm(Integer km) throws Exception {
		
		if(km > 0) {
					
			this.km = km;
		}
		
		else throw new Exception("Errore, kilometri negativi non consentiti");
	

	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) throws Exception {
		
		if(age > 0) {
			
			this.age = age;
		}
		
		else throw new Exception("Errore, età negativa non consentita");
	
	}


	public static Float getPriceXKm() {
		return PRICE_X_KM;
	}
	
	public Float getTotalPrice () {
		
	
		return getKm()*PRICE_X_KM;
	}
	
	public boolean isOver65() {
		
		return (getAge() >= 65 ? true:false );
		
	}
	
	public boolean isUnder18() {
		
		return (getAge() <= 18 ? true:false );
		
	}
	
	public Float finalPrice() {
		
		Float discount = 1f;
		
		if(isOver65()) {
			
			discount -=OVER_65_DISCOUNT;
			
		}
		
		else if(isUnder18()) {
			
			discount -=UNDER_18_DISCOUNT;
			
		}
		
		return getTotalPrice()*discount;
		
	}
	
}

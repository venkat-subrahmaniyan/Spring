package com.venki.qualify;

import javax.inject.Named;

@Named("sb")
public class ShagouseBiriyani implements Bir{

	public ShagouseBiriyani(){
		System.out.println("cost is 350");
	}
}

package com.venki.qualify;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BiryaniMain {

	public static void main(String[] args) {
		
		try{
		
		ClassPathXmlApplicationContext ap=new ClassPathXmlApplicationContext("qualify.xml");
		
		/*BawarchiBiriryani bb= ap.getBean(BawarchiBiriryani.class);
		
		System.out.println(bb);
		
		ShagouseBiriyani ss=ap.getBean(ShagouseBiriyani.class);
		
		System.out.println(ss);*/
		System.out.println("*********It Is*********");
		Biriyani b=ap.getBean(Biriyani.class);
		System.out.println("*********BIRIYANI*********");
		
		System.out.println(b.bb + "  " +b.sb);
//		System.out.println(b.shagouseBiriyani + "  " +b.bawarchiBiriryani);
		
		
		ap.close();
		}
		
		catch(Exception e){
			System.out.println(e);
		}
	}

}

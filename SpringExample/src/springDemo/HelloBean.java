package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloBean {

	public static void main(String[] args) {

		// load config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope_applicationContext.xml");
			
		// retrieve bean 
		Coach theCoach1 = context.getBean("myCoach", Coach.class);
		
		Coach theCoach2 = context.getBean("myCoach", Coach.class);
		
		boolean result = (theCoach1 == theCoach2);
		
		System.out.println("Pointing it the same object " + result);
		
		System.out.println("Memory location " + theCoach1);
		System.out.println("Memory location " + theCoach2);
		
		// close the context
		context.close();
	}

}

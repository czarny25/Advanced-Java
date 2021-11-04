package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {

	public static void main(String[] args) {

		// load config file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
			
		// retrieve bean 
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		CricketCoach theCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		Athlete theAthlete = context.getBean("myCricketCoach", Athlete.class);
		
		// call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getYourDailyFortune());
		
		System.out.println(theCricketCoach.getDailyWorkout());
		System.out.println(theCricketCoach.getYourDailyFortune());
		
		
		System.out.println(theAthlete.myDiscipline());
		
		System.out.println("My email is " + theCricketCoach.getEmailAddress());
		
		
		// close the context
		context.close();
	}

}

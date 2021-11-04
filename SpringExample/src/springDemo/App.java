package springDemo;

public class App {

	public static void main(String[] args) {

		Coach baseCoach = new BoxCoach();
		
		System.out.println(baseCoach.getDailyWorkout());
	}

}

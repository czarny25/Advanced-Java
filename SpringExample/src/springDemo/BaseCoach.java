package springDemo;


public class BaseCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	public BaseCoach() {
	}

	public BaseCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "run all day";
		 
	}

	@Override
	public String getYourDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}

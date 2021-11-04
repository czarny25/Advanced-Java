package springDemo;

public class BoxCoach implements Coach {

	private FortuneService fortuneService;	
	
	
	public BoxCoach() {
	}

	public BoxCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Get 100 pushups";
	}

	@Override
	public String getYourDailyFortune() {
		return "This is real" + fortuneService.getFortune();
	}

}

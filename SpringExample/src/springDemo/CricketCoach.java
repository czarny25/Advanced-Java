package springDemo;

public class CricketCoach implements Coach, Athlete {

	
	private String emailAddress;
	private String team;
	private FortuneService fortuneService;
	private Athlete athlete;
	
	public CricketCoach() {
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public void setAthlete(Athlete athlete) {
		this.athlete = athlete;
	}

	@Override
	public String getDailyWorkout() {
		return "Catch the ball";
	}

	@Override
	public String getYourDailyFortune() {
		return "Cricket is " + fortuneService.getFortune();
	}	
	
	@Override
	public String myDiscipline() {
		return athlete.myDiscipline();
	}
	
	

}

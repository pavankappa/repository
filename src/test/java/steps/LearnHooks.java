package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LearnHooks  {
	@Before
	private void preScenario(Scenario sc) {
		System.out.println(sc.getName());
		System.out.println(sc.getId());
		System.out.println(sc.getStatus());

	}
	
	@After
	private void postScenario(Scenario sc) {
		System.out.println(sc.getStatus());

	}

}

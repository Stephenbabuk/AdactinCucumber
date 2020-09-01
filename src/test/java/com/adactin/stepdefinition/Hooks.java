package com.adactin.stepdefinition;

import java.io.IOException;

import com.adactin.baseclass.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.*;

public class Hooks extends BaseClass{
	
	@Before
	public static void beforeHooks(Scenario scenario) {
		String name = scenario.getName();
		System.out.println("ScenarioName: " +name);

	}
	
	@After
	public static void afterHooks(Scenario  scenario) throws IOException {
		String status = scenario.getStatus();
		System.out.println("            SecnarioStatus: " +status);
		if (scenario.isFailed()) {
			getScreenshot(scenario.getName());
		}
	}
	

}

package com.juaracoding.pageobject;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//tags = untuk memilih run nomer berapa saja di file feature
@CucumberOptions(tags = "", 
				features = {"src/test/resources/features/3.LoginAccount.feature",
						"src/test/resources/features/4.CheckOut.feature"},
				glue = "",
				plugin = {"pretty","html:target/cucumber-TestCheckOut-reports.html"})
				
public class TestRunnerOne extends AbstractTestNGCucumberTests {
}


 


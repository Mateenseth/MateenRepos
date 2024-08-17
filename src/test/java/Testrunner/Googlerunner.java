package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class Googlerunner {
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\MATEEN\\eclipse-workspace\\MyCucu_FW\\src\\test\\resources\\FeatureFile\\Google.feature",glue="Stepdef")
public class googlerunner{
	
}
}

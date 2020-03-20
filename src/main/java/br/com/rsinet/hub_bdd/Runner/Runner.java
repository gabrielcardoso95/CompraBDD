package br.com.rsinet.hub_bdd.Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature", glue = { "br.com.rsinet.hub_bdd.stepDefinition" }, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:relatorio/report.html" }, 
monochrome = true, snippets = SnippetType.CAMELCASE, dryRun = false, strict = false)

public class Runner {
	@AfterClass
	public static void ExtentReport() {
		Reporter.loadXMLConfig(new File("config/extension-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.141.59");
		Reporter.setSystemInfo("cucumber-java", "1.2.5");
		Reporter.setSystemInfo("cucumber-junit", "1.2.5");
		Reporter.setSystemInfo("Maven", "4.0.0");
	}
}

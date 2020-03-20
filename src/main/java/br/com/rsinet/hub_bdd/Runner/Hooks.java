//package br.com.rsinet.hub_bdd.Runner;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//import com.cucumber.listener.Reporter;
//import com.google.common.io.Files;
//
//import Contexto.ContextoTeste;
//import br.com.rsinet.hub_bdd.utilities.Generator;
//import cucumber.api.Scenario;
//import cucumber.api.java.After;
//
//public class Hooks {
//
//	private ContextoTeste testeContexto;
//
//	public Hooks(ContextoTeste contexto) {
//		testeContexto = contexto;
//	}
//
//	@After(order = 1)
//	public void capturaCenario(Scenario cenario) {
//			String screenshotName = cenario.getName().replaceAll(" ", "_");
//			try {
//				File sourcePath = ((TakesScreenshot) testeContexto.getWebDriverManager().getDriver())
//						.getScreenshotAs(OutputType.FILE);
//
//				String caminhoDestino = System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + "_"
//						+ Generator.dataHoraParaArquivo() + ".png";
//
//				Files.copy(sourcePath, new File(caminhoDestino));
//
//				Reporter.addScreenCaptureFromPath(caminhoDestino);
//			} catch (IOException e) {
//				System.out.println("não consegui capturar");
//			}
//	}
//
//	@After(order = 0)
//	public void finaliza() {
//		testeContexto.getWebDriverManager().closeDriver();
//	}
//}
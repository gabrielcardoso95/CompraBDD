package br.com.rsinet.hub_bdd.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_bdd.dataProviders.ConfigFileReader;
import br.com.rsinet.hub_bdd.managers.FileReaderManager;

public class PaginaInicial {
	private WebDriver driver;
	private PaginaInicial paginaInicial;
	private ConfigFileReader configFileReader;

	public PaginaInicial(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement btnUser;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input")
	private WebElement usernameLogin;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input")
	private WebElement passwordLogin;

	@FindBy(how = How.ID, using = "speakersImg")
	private WebElement menuSpeakers;

	@FindBy(how = How.ID, using = "sign_in_btnundefined")
	private WebElement btnLogar;

	@FindBy(how = How.ID, using = "menuCart")
	private WebElement btncarrinho;

	public void clicaBtnUser() {
		btnUser.click();
	}

	public void escreveNomeDeUsuario(String username) {
		usernameLogin.sendKeys(username);
	}

	public void escreveSenha(String senha) {
		passwordLogin.sendKeys(senha);
	}

	public void clicaMenuSpeakers() throws InterruptedException {
		Thread.sleep(1000);
		menuSpeakers.click();
	}

	public void clicaLogar() throws InterruptedException {
		Thread.sleep(2000);
		btnLogar.click();
	}

	public void waitElementcart() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(btncarrinho));
	}
	
	public void entraAPP() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
}
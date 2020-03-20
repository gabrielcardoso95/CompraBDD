package br.com.rsinet.hub_bdd.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_bdd.dataProviders.ConfigFileReader;

public class PaginaDeProdutos {
	private WebDriver driver;
	private PaginaDeProdutos paginaDeProdutos;
	private ConfigFileReader configFileReader;
	
	public PaginaDeProdutos(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		configFileReader = new ConfigFileReader();
	}
	
	@FindBy(how = How.ID, using = "20")
	private WebElement produto;
	
	@FindBy(how = How.ID, using = "shoppingCartLink")
	private WebElement btnCarrinho;
	
	@FindBy(how = How.NAME, using = "save_to_cart")
	private WebElement adicionarAoCarrinho;
	
	@FindBy(how = How.ID, using = "checkOutButton")
	private WebElement btnCheckout;
	
	@FindBy(how = How.ID, using = "next_btn")
	private WebElement btnNext;
	
	@FindBy(how = How.ID, using = "pay_now_btn_SAFEPAY")
	private WebElement btnPayNow;
	
	public void clicaProduto() {
		produto.click();
	}
	
	public void clicaAdicionarAoCarrinho() {
		adicionarAoCarrinho.click();
	}
	
	public void clicaBtnCarrinho() {
		btnCarrinho.click();
	}
	
	public void clicaBtnCheckout() {
		btnCheckout.click();
	}
	
	public void clicaBtnNext() {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(btnNext));
		btnNext.click();
	}
	
	public void clicaBtnPayNow() {
		btnPayNow.click();
	}
}

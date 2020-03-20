package Contexto;

import br.com.rsinet.hub_bdd.managers.WebDriverManager;
import br.com.rsinet.hub_bdd.utilities.PageManager;

public class ContextoTeste {

	private WebDriverManager webDriverManager;
	private PageManager pageObjectManager;

	public ContextoTeste() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageManager(webDriverManager.getDriver());
	}

	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PageManager getPageObjectManager() {
		return pageObjectManager;
	}
}
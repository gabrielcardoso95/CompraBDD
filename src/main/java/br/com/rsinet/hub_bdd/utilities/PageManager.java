package br.com.rsinet.hub_bdd.utilities;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pageObject.PaginaDeLogin;
import br.com.rsinet.hub_bdd.pageObject.PaginaDeProdutos;
import br.com.rsinet.hub_bdd.pageObject.PaginaInicial;

public class PageManager {
	private static WebDriver driver;
	private PaginaInicial paginaInicial;
	private PaginaDeLogin paginaDeLogin;
	private PaginaDeProdutos paginaDeProdutos;
	
	public PageManager(WebDriver driver) {
		PageManager.driver = driver;
	}

	public PaginaInicial getPaginaInicial() {
		return (paginaInicial == null) ? paginaInicial = new PaginaInicial(driver) : paginaInicial;
	}

	public PaginaDeLogin getPaginaDeLogin() {
		return (paginaDeLogin == null) ? paginaDeLogin = new PaginaDeLogin(driver) : paginaDeLogin;
	}
	
	public PaginaDeProdutos getPaginaDeProdutos() {
		return (paginaDeProdutos == null) ? paginaDeProdutos = new PaginaDeProdutos(driver) : paginaDeProdutos;
	}
}
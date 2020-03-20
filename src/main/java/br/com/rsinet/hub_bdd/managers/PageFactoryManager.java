package br.com.rsinet.hub_bdd.managers;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pageObject.PaginaDeProdutos;
import br.com.rsinet.hub_bdd.pageObject.PaginaInicial;

public class PageFactoryManager {

	private WebDriver driver;
	private PaginaInicial paginaInicial;
	private PaginaDeProdutos paginaDeProdutos;

	public PageFactoryManager(WebDriver driver) {
		this.driver = driver;
	}

	public PaginaInicial getPaginaInicial() {
		return (paginaInicial == null) ? paginaInicial = new PaginaInicial(driver) : paginaInicial;
	}

	public PaginaDeProdutos getPaginaDeProdutos() {

		return (paginaDeProdutos == null) ? paginaDeProdutos = new PaginaDeProdutos(driver) : paginaDeProdutos;

	}
}
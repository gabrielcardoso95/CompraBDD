package br.com.rsinet.hub_bdd.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Contexto.ContextoTeste;
import br.com.rsinet.hub_bdd.pageObject.PaginaDeProdutos;
import br.com.rsinet.hub_bdd.pageObject.PaginaInicial;
import br.com.rsinet.hub_bdd.utilities.DriverFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CompraStep {
	private static WebDriver driver;
	private static PaginaInicial paginaInicial;
	private static PaginaDeProdutos paginaDeProdutos;
	private static WebDriverWait wait;
	private ContextoTeste testeContexto;
	
//	public CompraStep(ContextoTeste contexto) {
//		testeContexto = contexto;
//		paginaInicial = testeContexto.getPageObjectManager().getPaginaInicial();
//		paginaDeProdutos = testeContexto.getPageObjectManager().getPaginaDeProdutos();
//		driver = testeContexto.getWebDriverManager().getDriver();
//	}
	@Dado("^que estou na pagina inicial$")
	public void que_estou_na_pagina_inicial() throws Throwable {
		driver = new DriverFactory().iniciaNavegador("chrome", "https://www.advantageonlineshopping.com/#/");
	}

	@Dado("^usuario faz login$")
	public void usuario_faz_login() throws Throwable {
		paginaInicial = new PaginaInicial(driver);
		paginaInicial.clicaBtnUser();
		paginaInicial.escreveNomeDeUsuario("GabrielTeste1");
		paginaInicial.escreveSenha("Aa123");
		paginaInicial.clicaLogar();
	}

	@Dado("^clico no menu SPEAKERS$")
	public void clico_no_menu_SPEAKERS() throws Throwable {
		paginaInicial = new PaginaInicial(driver);
		paginaInicial.clicaMenuSpeakers();
	}

	@Dado("^seleciono o produto$")
	public void seleciono_o_produto() throws Throwable {
		paginaDeProdutos = new PaginaDeProdutos(driver);
		paginaDeProdutos.clicaProduto();
	}

	@Dado("^adiciono ao carrinho$")
	public void adiciono_ao_carrinho() throws Throwable {
		paginaDeProdutos.clicaAdicionarAoCarrinho();
	}

	@Dado("^vou para a pagina de chekout$")
	public void vou_para_a_pagina_de_chekout() throws Throwable {
		paginaDeProdutos.clicaBtnCarrinho();
		paginaDeProdutos.clicaBtnCheckout();
	}

	@Dado("^confirmo o endereco de entrega$")
	public void confirmo_o_endereco_de_entrega() throws Throwable {
		paginaDeProdutos.clicaBtnNext();
	}

	@Quando("^confirmo o pagamento$")
	public void confirmo_o_pagamento() throws Throwable {
		paginaDeProdutos.clicaBtnPayNow();
	}

	@Entao("^eu valido a compra feita$")
	public void eu_valido_a_compra_feita() throws Throwable {
		//DriverFactory.encerraNavegador();
	}
}

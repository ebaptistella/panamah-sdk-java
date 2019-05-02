package br.com.casamagalhaes.panamah.sdk;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.casamagalhaes.panamah.sdk.model.PanamahAcesso;
import br.com.casamagalhaes.panamah.sdk.model.PanamahAssinante;
import br.com.casamagalhaes.panamah.sdk.model.PanamahCliente;
import br.com.casamagalhaes.panamah.sdk.model.PanamahCompra;
import br.com.casamagalhaes.panamah.sdk.model.PanamahEan;
import br.com.casamagalhaes.panamah.sdk.model.PanamahEstoqueMovimentacao;
import br.com.casamagalhaes.panamah.sdk.model.PanamahEventoCaixa;
import br.com.casamagalhaes.panamah.sdk.model.PanamahFormaPagamento;
import br.com.casamagalhaes.panamah.sdk.model.PanamahFornecedor;
import br.com.casamagalhaes.panamah.sdk.model.PanamahFuncionario;
import br.com.casamagalhaes.panamah.sdk.model.PanamahGrupo;
import br.com.casamagalhaes.panamah.sdk.model.PanamahHolding;
import br.com.casamagalhaes.panamah.sdk.model.PanamahLocalEstoque;
import br.com.casamagalhaes.panamah.sdk.model.PanamahLoja;
import br.com.casamagalhaes.panamah.sdk.model.PanamahMeta;
import br.com.casamagalhaes.panamah.sdk.model.PanamahProduto;
import br.com.casamagalhaes.panamah.sdk.model.PanamahRevenda;
import br.com.casamagalhaes.panamah.sdk.model.PanamahSecao;
import br.com.casamagalhaes.panamah.sdk.model.PanamahSubgrupo;
import br.com.casamagalhaes.panamah.sdk.model.PanamahTituloPagar;
import br.com.casamagalhaes.panamah.sdk.model.PanamahTituloReceber;
import br.com.casamagalhaes.panamah.sdk.model.PanamahTrocaDevolucao;
import br.com.casamagalhaes.panamah.sdk.model.PanamahVenda;

public class BasePanamahTest {

	private PanamahConfig c = new PanamahConfig("./teste");

	@Test
	public void shouldInitDefault() {
		Panamah p = Panamah.init(new PanamahConfig());
		p.flush();
		assertNotNull(p);
	}

	@Test
	public void shouldInit() {
		Panamah p = Panamah.init(c);
		p.flush();
		assertNotNull(p);
	}

	@Test
	public void shouldProgress() {
		Panamah p = Panamah.init(c);
		p.progress();
		p.flush();
		assertNotNull(p);
	}

	@Test
	public void shouldSendAcesso() {
		PanamahAcesso model = new PanamahAcesso();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendAssinante() {
		PanamahAssinante model = new PanamahAssinante();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendCliente() {
		PanamahCliente model = new PanamahCliente();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendCompra() {
		PanamahCompra model = new PanamahCompra();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendEan() {
		PanamahEan model = new PanamahEan();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendEstoqueMovimentacao() {
		PanamahEstoqueMovimentacao model = new PanamahEstoqueMovimentacao();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendEventoCaixa() {
		PanamahEventoCaixa model = new PanamahEventoCaixa();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendFormaPagamento() {
		PanamahFormaPagamento model = new PanamahFormaPagamento();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendFornecedor() {
		PanamahFornecedor model = new PanamahFornecedor();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendFuncionario() {
		PanamahFuncionario model = new PanamahFuncionario();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendGrupo() {
		PanamahGrupo model = new PanamahGrupo();
		Panamah p = Panamah.init(c);
		p.send(model);
		assertTrue(true);
	}

	@Test
	public void shouldSendHolding() {
		PanamahHolding model = new PanamahHolding();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendLocalEstoque() {
		PanamahLocalEstoque model = new PanamahLocalEstoque();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendLoja() {
		PanamahLoja model = new PanamahLoja();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendMeta() {
		PanamahMeta model = new PanamahMeta();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendProduto() {
		PanamahProduto model = new PanamahProduto();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendRevenda() {
		PanamahRevenda model = new PanamahRevenda();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendSecao() {
		PanamahSecao model = new PanamahSecao();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendSubgrupo() {
		PanamahSubgrupo model = new PanamahSubgrupo();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendTituloPagar() {
		PanamahTituloPagar model = new PanamahTituloPagar();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendTituloReceber() {
		PanamahTituloReceber model = new PanamahTituloReceber();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendTrocaDevolucao() {
		PanamahTrocaDevolucao model = new PanamahTrocaDevolucao();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

	@Test
	public void shouldSendVenda() {
		PanamahVenda model = new PanamahVenda();
		Panamah p = Panamah.init(c);
		p.send(model);
		p.flush();
		assertTrue(true);
	}

}
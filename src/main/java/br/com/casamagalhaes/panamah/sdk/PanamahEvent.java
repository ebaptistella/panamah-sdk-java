package br.com.casamagalhaes.panamah.sdk;

public class PanamahEvent {

	private PanamahConfig config;
	private PanamahLote loteAtual;
	private PanamahOperacao<?> op;
	private Exception ex;
	private boolean cancelled;

	public PanamahEvent(PanamahConfig config, PanamahLote loteAtual, PanamahOperacao<?> op, Exception ex) {
		this.config = config;
		this.loteAtual = loteAtual;
		this.op = op;
		this.ex = ex;
	}

	public PanamahConfig getConfig() {
		return config;
	}

	public void setConfig(PanamahConfig config) {
		this.config = config;
	}

	public PanamahLote getLoteAtual() {
		return loteAtual;
	}

	public void setLoteAtual(PanamahLote loteAtual) {
		this.loteAtual = loteAtual;
	}

	public PanamahOperacao<?> getOp() {
		return op;
	}

	public void setOp(PanamahOperacao<?> op) {
		this.op = op;
	}

	public Exception getEx() {
		return ex;
	}

	public void setEx(Exception ex) {
		this.ex = ex;
	}
	
	public boolean isCancelled() {
		return cancelled;
	}
	
	public void setCancelled(boolean cancelled) {
		this.cancelled = cancelled;
	}

}

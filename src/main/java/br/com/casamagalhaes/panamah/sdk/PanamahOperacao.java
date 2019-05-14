package br.com.casamagalhaes.panamah.sdk;

public class PanamahOperacao<T>{

	private T data;

	private PanamahTipoOperacao op;
	private String tipo;

	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public PanamahTipoOperacao getOp() {
		return op;
	}

	public void setOp(PanamahTipoOperacao tipo) {
		this.op = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipoIdentificador) {
		this.tipo = tipoIdentificador;
	}

}

package br.com.isiflix.fakeerp;

public class CalculadorDeImpostos implements InterfaceOracleERP, InterfaceSAP, MSInterface {

	public void calcularImposto(String documentoFiscal) {
		System.out.println("Processando arquivo...");
		System.out.println("Calculando imposto do documento " + documentoFiscal);
		System.out.println("Gravando em BD...");
		System.out.println("Emitindo guias...");
		System.out.println("----> FIM");
	}

	@Override
	public void summarizeBill(String doc) {
		this.calcularImposto(doc);		
	}

	@Override
	public void calculateTaxesAndSummarizeBill(String doc) {
		this.calcularImposto(doc);
	}

	@Override
	public void calculateTaxes(String doc) {
		this.calcularImposto(doc);
	}
	
}

package br.com.isiflix.fakeerp;

public class ERPMainClass {

	public static void main(String[] args) {
		
		// simulando a chamada da Oracle
		InterfaceOracleERP ioerp = new CalculadorDeImpostos();
		ioerp.calculateTaxes("nf.xml");
		
		// simulando chamada ao erp da Microsoft
		MSInterface msi = new CalculadorDeImpostos();
		msi.summarizeBill("bill.xml");
		
		// simaulando chamada ao erp da SAP
		InterfaceSAP isap = new CalculadorDeImpostos();
		isap.calculateTaxesAndSummarizeBill("nf011912.xml");
		
	}
	
}

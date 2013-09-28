package br.com.scjp.capitulo1.declaracoesecontroleacesso.declararclasses.objetivoI.I;


/*
 * No java contém 4 controles de acesso(Níveis de acesso),porém apenas 3 modificadores(public,protected,private), o quarto controle de acesso (é chamado de default ou pacote).Ou seja caso não declare explicitamente um modificador o compilador automaticamente setará como default(padrão).  
 * Toda classe,método ou variável de intância tem um controle de acesso mesmo que não esteja explicito na classe.
 * Uma classe pode se declarada apenas como default ou public;os outros dois nívéis não se aplicam a classes  
 */
public class ModificadoresAcessoClasseAtributos {
	private int a;//Acessado apenas dentro da classe 
	protected boolean b = true;
	public String c  = "Teste";
    byte d = '2';
}

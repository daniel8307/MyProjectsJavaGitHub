package br.com.scjp.capitulo1.declaracoesecontroleacesso.declararclasses.objetivoI.I;


/*
 * No java cont�m 4 controles de acesso(N�veis de acesso),por�m apenas 3 modificadores(public,protected,private), o quarto controle de acesso (� chamado de default ou pacote).Ou seja caso n�o declare explicitamente um modificador o compilador automaticamente setar� como default(padr�o).  
 * Toda classe,m�todo ou vari�vel de int�ncia tem um controle de acesso mesmo que n�o esteja explicito na classe.
 * Uma classe pode se declarada apenas como default ou public;os outros dois n�v�is n�o se aplicam a classes  
 */
public class ModificadoresAcessoClasseAtributos {
	private int a;//Acessado apenas dentro da classe 
	protected boolean b = true;
	public String c  = "Teste";
    byte d = '2';
}

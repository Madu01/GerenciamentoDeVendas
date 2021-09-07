package gerenciamento;

import java.util.Date;

public class Conta {
	
	private String nome;
	private String descricao;
	private int parcelas;
	private double preco;
	private Date vencimento;
	private String status;
	
	public Conta() {
		
	}
	
	public Conta(String nom, String desc, int parc, double pre, Date venc, String sta) {
		nome = nom;
		descricao = desc;
		parcelas = parc;
		preco = pre;
		vencimento = venc;
		status = sta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	//funcionalidades
	public void contaApagar() {

	}
	
	public void contaAreceber() {

	}

	public String toString() {
		return  "\nNome: "+ nome + "\nDescri��o: " + descricao + "\nParcelas: " + parcelas 
				+ "\nPre�o: " + preco + "\nVencimento: " + vencimento + "\nStatus: " + status;
	}

}

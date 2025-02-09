package modelo;

/**
 * Classe que cont�m as informa��es da capa
 * @author Maria Eduarda Barbosa e Maria Eduarda Marques
 * @version 1.0 (outubro 2021)
 */
public class Capa extends Produto {

	private int capaID;
	private String cor;
	private String textura;

	/**
	 * Construtor que cont�m todas as informa��es a capa ir� possuir
	 * @param id um int que cont�m o c�digo de identifica��o da capa
	 * @param nom uma string que cont�m o nome da capa
	 * @param pre um double que cont�m o valor da capa
	 * @param mat uma string que cont�m o tipo de material da capa 
	 * @param c uma string que cont�m a cor da capa
	 * @param tex uma string que cont�m a textura da capa 
	 * @param mod uma string que cont�m o modelo da capa
	 * @param des uma string que cont�m a descri��o da capa
	 * @param cat uma string que cont�m a categoria da capa 
	 */
	public Capa(int id, String nom, Double pre, String mat, String c, String tex, String mod, String des, String cat) {
		capaID = id;
		nome = nom;
		preco = pre;
		material = mat;
		cor = c;
		textura = tex;
		modelo = mod;
		descricao = des;
		categoria = cat;
	}
	
	/**
	 * Construtor resuzido que cont�m apenas as informa��es essenciais para a venda da capa 
	 * @param id um int que cont�m o c�digo de identifica��o da capa
	 * @param nom uma string que cont�m o nome da capa
	 * @param pre um double que cont�m o valor da capa
	 * @param cat uma string que cont�m a categoria da capa
	 */
	public Capa(int id, String nom, Double pre, String cat) {
		capaID = id;
		nome = nom;
		preco = pre;
		categoria = cat;
	}
	
	/**
	 * M�todo que retorna uma string com todas as informa��es essenciais contidas no objeto 
	 * @return string que cont�m as  informa��es essenciais 
	 */
	public String toStringReduzido() {
		return "\nID: " + capaID + "\nNome da Capa: " + nome + "\nPre�o: " + preco 
				+ "\nCategoria: " + categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getCapaID() {
		return capaID;
	}

	public void setCapaID(int capaID) {
		this.capaID = capaID;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

}

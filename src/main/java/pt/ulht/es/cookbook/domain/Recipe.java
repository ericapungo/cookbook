package pt.ulht.es.cookbook.domain;

public class Recipe {

	private String id;
	private String titulo;
	private String problema;
	private String solucao;
	public String autor;
	public String data;
	public String hora;

	public Recipe(String titulo, String problema, String solucao, String autor,
			String data, String hora) {
		this.titulo = titulo;
		this.problema = problema;
		this.solucao = solucao;
		this.autor = autor;
		this.data = data;
		this.hora = hora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getProblema() {
		return problema;
	}

	public void setProblema(String problema) {
		this.problema = problema;
	}

	public String getSolucao() {
		return solucao;
	}

	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;

	}

}

package pt.ulht.es.cookbook.domain;

<<<<<<< HEAD

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class Recipe extends Recipe_Base implements Comparable<Recipe> {
    
    public  Recipe(String titulo, String problema, String solucao, String autor, String tags) {
        setTitle(titulo);
        setProblem(problema);
        setSolution(solucao);
        setAuthor(autor);
        setCreationTimestamp(new DateTime());
        setTags(tags);
        
        DateTime dt = new DateTime();
		setCreationTimestamp(dt);
		DateTimeFormatter fmt = DateTimeFormat.forPattern("HH:mm:ss, dd-MM-yyyy");
		setTimestampFormatted(fmt.print(dt));
        
        setCookbookManager(CookbookManager.getInstance());
    }


	public void delete() {
		// TODO Auto-generated method stub
		setCookbookManager(null);
		super.deleteDomainObject();
		
	}


	public void edit(Recipe recipe, String titulo, String problema,	String solucao, String autor, String tags) {
		// TODO Auto-generated method stub
		recipe.setTitle(titulo);
		recipe.setProblem(problema);
  		recipe.setAuthor(autor);
		recipe.setSolution(solucao);
		recipe.setTags(tags);
		
		
	}


	public int compareTo(Recipe r) {
		// TODO Auto-generated method stub
		return getTitle().toLowerCase().compareTo(r.getTitle().toLowerCase()) ;
	}


		public boolean match(String[] tokens) {
		// TODO Auto-generated method stub
		for(String token :tokens){
		if(getTitle().toLowerCase().contains(token.toLowerCase())||	
		getProblem().toLowerCase().contains(token.toLowerCase())||
		getSolution().toLowerCase().contains(token.toLowerCase())||
		//getAuthor().toLowerCase().contains(token.toLowerCase())||
		getTags().toLowerCase().contains(token.toLowerCase())){
		return true;
}
}
		return false;
    
}


    
=======
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

>>>>>>> b99a387add36f530669d18f896921a267ec95869
}

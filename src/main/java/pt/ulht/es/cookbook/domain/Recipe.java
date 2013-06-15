package pt.ulht.es.cookbook.domain;


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


    
}

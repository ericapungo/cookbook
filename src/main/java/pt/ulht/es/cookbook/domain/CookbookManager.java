package pt.ulht.es.cookbook.domain;

<<<<<<< HEAD
import pt.ist.fenixframework.FenixFramework;

public class CookbookManager extends CookbookManager_Base {
    
	public static CookbookManager getInstance() {
		return FenixFramework.getRoot();
	}
    
=======
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CookbookManager {

	private static int nextRecipeId = 1;
	private static Map<String, Recipe> RECIPE_MAP = new HashMap<String, Recipe>();

	public static void saveRecipe(Recipe recipe) {
		String id = nextRecipeId + "";
		RECIPE_MAP.put(id, recipe);
		recipe.setId(id);
		nextRecipeId++;

	}

	public static Recipe getRecipe(String id) {
		return RECIPE_MAP.get(id);
	}

	public static Collection<Recipe> getRecipes() {
		return RECIPE_MAP.values();

	}

	public static Collection<Recipe> removeRecipe(String id) {

		RECIPE_MAP.remove(id);
		return RECIPE_MAP.values();
	}

	public static Collection<Recipe> editRecipe (Recipe recipe) {
	
		RECIPE_MAP.put("2", recipe);
		return RECIPE_MAP.values();
	
	}

>>>>>>> b99a387add36f530669d18f896921a267ec95869
}

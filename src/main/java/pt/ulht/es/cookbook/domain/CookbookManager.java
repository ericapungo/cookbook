package pt.ulht.es.cookbook.domain;

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

}

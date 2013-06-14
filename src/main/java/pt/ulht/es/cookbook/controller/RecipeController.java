package pt.ulht.es.cookbook.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.tools.ant.property.GetProperty;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pt.ist.fenixframework.pstm.AbstractDomainObject;
import pt.ulht.es.cookbook.domain.CookbookManager;
import pt.ulht.es.cookbook.domain.Recipe;

import java.util.Date;

@Controller	
public class RecipeController {

	@RequestMapping(method = RequestMethod.GET, value = "/recipes/create")
	public String showRecipeCreationForm() {

		return "createRecipe";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/recipes")
	public String createRecipe(@RequestParam Map<String, String> params) {

		String titulo = params.get("titulo");
		String problema = params.get("problema");
		String solucao = params.get("solucao");
		String autor = params.get("autor");
		String tags = params.get("tags");


		Recipe recipe = new Recipe(titulo, problema, solucao, autor, tags);
	
		return "redirect:/recipes/" + recipe.getExternalId();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/recipes/{id}")
	public String showRecipe(Model model, @PathVariable String id) {

		Recipe recipe = AbstractDomainObject.fromExternalId(id);
		if (recipe != null) {
			model.addAttribute("recipe", recipe);
			return "detailedRecipe";
		} else
			return "recipeNotFound";

	}

	@RequestMapping(method = RequestMethod.GET, value = "/recipes/search")
	public String  showSearchForm () {

		return "searchRecipeForm";
	}
	@RequestMapping(method = RequestMethod.POST, value = "/recipes/search")
	public String  searchRecipes(@RequestParam Map<String, String> params, Model model) {
		String searchParams = params.get("searchParams");
		String[] tokens= searchParams.split(","); 
		List<Recipe> results = new ArrayList<Recipe>();
		for (Recipe recipe: CookbookManager.getInstance().getRecipeSet()){
			if(recipe.match(tokens)) {
				results.add(recipe);}
	}
		model.addAttribute("recipes", results);
		return "searchResult";
	}
	

	
	@RequestMapping(method = RequestMethod.GET, value = "/recipes")
	public String listRrecipes(Model model) {
		//Collection<Recipe> recipes = CookbookManager.getInstance().getRecipeSet();
		List<Recipe> recipes = new ArrayList<Recipe>(CookbookManager.getInstance().getRecipeSet());
		Collections.sort(recipes);
		if (recipes.isEmpty()) {
			return "recipeNotFound";
		} else {
			model.addAttribute("recipes", recipes);
			return "listRecipes";
		}

	}

	// Recebe a receita e altera na posicao da lista
	@RequestMapping(method = RequestMethod.GET, value = "/recipes/edit/{id}")
	public String showRecipeEditForm(Model model, @PathVariable String id) {

		Recipe recipe = AbstractDomainObject.fromExternalId(id);

		model.addAttribute("recipe", recipe);

		return "editRecipe";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/recipes/editRecipe/{id}")
	public String editRecipe(@RequestParam Map<String, String> params, @PathVariable String id) {

		String titulo = params.get("titulo");
		String problema = params.get("problema");
		String solucao = params.get("solucao");
		String autor = params.get("autor");
		String tags = params.get("tags");
		
		Recipe recipe = AbstractDomainObject.fromExternalId(id);
		recipe.edit(recipe, titulo, problema, solucao, autor, tags);

		
		return "redirect:/recipes/";
	}
	

	@RequestMapping(method = RequestMethod.GET, value = "recipes/deleteRecipe/{id}")
	public String deleteRecipe(Model model, @PathVariable String id) {
       
		Recipe recipe = AbstractDomainObject.fromExternalId(id);
		recipe.delete();
		CookbookManager.getInstance().removeRecipe(recipe);
         
		return "redirect:/recipes";
	}

}
package edu.es.eoi.service;

import edu.es.eoi.entity.Ingredient;
import edu.es.eoi.entity.Recipe;
import edu.es.eoi.repository.RecipeRepository;
import edu.es.eoi.repository.RecipeRepositoryMemoryImpl;

public class PublishServiceImpl implements PublishService {

	@Override
	public void publishRecipe() {
		RecipeRepository repository= new RecipeRepositoryMemoryImpl();
		repository.save(e);
	}

	@Override
	public void shareRecipe() {
		Recipe shareRecipe = new Recipe();
		System.out.println(shareRecipe.getRecipeName().concat(shareRecipe.getPhoto()));
		System.out.println(shareRecipe.getDescription());
		for (Ingredient ingredients : shareRecipe.getIngredients()) {
			System.out.println(ingredients.getAmount() + " " + ingredients.getName());
		}
	}

	@Override
	public void valorateRecipe() {
		// TODO Auto-generated method stub

	}

}

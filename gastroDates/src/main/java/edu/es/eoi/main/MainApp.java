package edu.es.eoi.main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import edu.es.eoi.entity.Ingredient;
import edu.es.eoi.entity.Recipe;
import edu.es.eoi.entity.User;
import edu.es.eoi.ui.LoginMenu;

public class MainApp {
	
	public static Map<String, User> users=new HashMap<String, User>();
	public static Map<String, Recipe> recipes=new HashMap<String, Recipe>();	
	public static User user;

	public static void main(String[] args) {
		
		initUsers();
		
		//arrancar mi UI
		LoginMenu.printMenuLogin();		
	
	}

	private static void initUsers() {
		
		User person= new User();
		person.setName("Pepe");
		person.setSurname("Palotes");
		person.setUsername("pepeKitchenLover");
		person.setPassword("password");
				
		users.put(person.getUsername(), person);
		
		person= new User();
		person.setName("Marta");
		person.setSurname("Martinez");
		person.setUsername("hummusLover");
		person.setPassword("password");
		
		users.put(person.getUsername(), person);
	}
	
	private static void initRecipes() {
		
		Recipe recipe = new Recipe();
		recipe.setRecipeName("Banoffee");
		recipe.setDescription("Está muy rica si no te sale un churro");
		recipe.setValoration(4.2);
		
		Ingredient ingrediente1= new Ingredient();
		ingrediente1.setName("Dulce de leche");
		ingrediente1.setAmount(300);
		ingrediente1.setPrice(7);
		
		Ingredient ingrediente2= new Ingredient();
		ingrediente2.setName("Galleta María hojaldrada");
		ingrediente2.setAmount(250);
		ingrediente2.setPrice(5);
		
		Set<Ingredient> ingredientes= new HashSet<>();
		ingredientes.add(ingrediente1);
		ingredientes.add(ingrediente2);
		
		recipe.setIngredients(ingredientes);
		
		recipes.put(recipe.getRecipeName(), recipe);
	}

}

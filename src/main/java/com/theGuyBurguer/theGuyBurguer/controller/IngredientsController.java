package com.theGuyBurguer.theGuyBurguer.controller;

import com.theGuyBurguer.theGuyBurguer.model.Ingredient;
import com.theGuyBurguer.theGuyBurguer.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class IngredientsController {

    @Autowired
    IngredientService ingredientService;

    @DeleteMapping(value = "ingredient")
    public void deleteIngredient(@RequestBody Ingredient pIngredient) {
	ingredientService.delete(pIngredient);
    }

    @PostMapping(value = "ingredient")
    public Ingredient insertIngredient(@RequestBody Ingredient pIngredient) {
	return ingredientService.save(pIngredient);
    }

    @GetMapping(value = "ingredients")
    public List<Ingredient> listAllIngredients() {
	return ingredientService.findAll();
    }

    @GetMapping(value = "ingredient/{id}")
    public Ingredient listIngredientById(@PathVariable(value = "id") Long pId) {
	System.out.println("Teste");
	return ingredientService.findIngredientById(pId);
    }

    @PutMapping(value = "ingredient")
    public Ingredient updateIngredient(@RequestBody Ingredient pIngredient) {
	return ingredientService.save(pIngredient);
    }
}

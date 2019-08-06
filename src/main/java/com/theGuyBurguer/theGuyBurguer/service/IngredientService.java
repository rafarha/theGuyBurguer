package com.theGuyBurguer.theGuyBurguer.service;

import com.theGuyBurguer.theGuyBurguer.model.Ingredient;
import com.theGuyBurguer.theGuyBurguer.repository.IIngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientService {

    @Autowired
    IIngredientsRepository ingredientsRepository;

    public void delete(final Ingredient pIngredient) {
	ingredientsRepository.delete(pIngredient);
    }

    public List<Ingredient> findAll() {
	return ingredientsRepository.findAll();
    }

    public Ingredient findIngredientById(final Long pId) {
	return ingredientsRepository.findIngredientById(pId);
    }

    public Ingredient save(final Ingredient pIngredient) {
	return ingredientsRepository.save(pIngredient);
    }
}

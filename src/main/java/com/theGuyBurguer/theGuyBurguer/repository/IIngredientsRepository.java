package com.theGuyBurguer.theGuyBurguer.repository;

import com.theGuyBurguer.theGuyBurguer.infra.IGenericRepository;
import com.theGuyBurguer.theGuyBurguer.model.Ingredient;

public interface IIngredientsRepository extends IGenericRepository<Ingredient, Long> {

    Ingredient findIngredientById(long pId);

}

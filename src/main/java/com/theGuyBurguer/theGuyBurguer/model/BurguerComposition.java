package com.theGuyBurguer.theGuyBurguer.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "TB_BURGUER_COMPOSITION")
public class BurguerComposition {

    private int amount;

    @OneToOne
    @JoinColumn(name = "burguer_id")
    @JsonIgnore
    private Burguer burguer;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.EAGER, targetEntity = Ingredient.class)
    private Ingredient ingredient;

    public int getAmount() {
	return amount;
    }

    public Burguer getBurguer() {
	return burguer;
    }

    public Long getId() {
	return id;
    }

    public Ingredient getIngredient() {
	return ingredient;
    }

    public void setAmount(final int pAmount) {
	amount = pAmount;
    }

    public void setBurguer(final Burguer pBurguer) {
	burguer = pBurguer;
    }

    public void setId(final Long pId) {
	id = pId;
    }

    public void setIngredient(final Ingredient pIngredient) {
	ingredient = pIngredient;
    }
}

package com.theGuyBurguer.theGuyBurguer.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "TB_INGREDIENT")
public class Ingredient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;

    BigDecimal price;

    public Long getId() {
	return id;
    }

    public String getName() {
	return name;
    }

    public BigDecimal getPrice() {
	return price;
    }

    public void setId(final Long pId) {
	id = pId;
    }

    public void setName(final String pName) {
	name = pName;
    }

    public void setPrice(final BigDecimal pPrice) {
	price = pPrice;
    }
}

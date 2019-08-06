package com.theGuyBurguer.theGuyBurguer.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "TB_BURGUER")
public class Burguer {

    @Transient
    BigDecimal burguerPrice;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "burguer")
    //    @JoinColumn(name = "BURGUER_ID", insertable = false, updatable = false)
		    List<BurguerComposition> compositionsBurguer;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;

    public BigDecimal getBurguerPrice() {
	List<BurguerComposition> ingredients = this.getCompositionsBurguer();
	BigDecimal burguerPrice = new BigDecimal(0);
	for (int i = 0; i < ingredients.size(); i++) {
	    burguerPrice = burguerPrice.add(ingredients.get(i).getIngredient().getPrice());
	}
	return burguerPrice;
    }

    public List<BurguerComposition> getCompositionsBurguer() {
	return compositionsBurguer;
    }

    public Long getId() {
	return id;
    }

    public String getName() {
	return name;
    }

    public void setBurguerPrice(final BigDecimal pBurguerPrice) {
	burguerPrice = pBurguerPrice;
    }

    public void setCompositionsBurguer(final List<BurguerComposition> pCompositionsBurguer) {
	compositionsBurguer = pCompositionsBurguer;
    }

    public void setId(final Long pId) {
	id = pId;
    }

    public void setName(final String pName) {
	name = pName;
    }

}

package com.theGuyBurguer.theGuyBurguer.infra;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.io.Serializable;

public class GenericRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>
		implements IGenericRepository<T, ID> {

    private final EntityManager entityManager;

    public GenericRepositoryImpl(JpaEntityInformation entityInformation,
		    EntityManager entityManager) {
	super(entityInformation, entityManager);
	this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void refresh(final T pT) {
	entityManager.refresh(pT);

    }
}

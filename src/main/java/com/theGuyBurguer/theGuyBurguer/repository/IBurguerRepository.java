package com.theGuyBurguer.theGuyBurguer.repository;

import com.theGuyBurguer.theGuyBurguer.infra.IGenericRepository;
import com.theGuyBurguer.theGuyBurguer.model.Burguer;
import org.springframework.stereotype.Repository;

@Repository
public interface IBurguerRepository extends IGenericRepository<Burguer, Long> {

    Burguer findBurguerById(long pId);
}

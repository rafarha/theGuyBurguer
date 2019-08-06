package com.theGuyBurguer.theGuyBurguer.service;

import com.theGuyBurguer.theGuyBurguer.model.Burguer;
import com.theGuyBurguer.theGuyBurguer.model.BurguerComposition;
import com.theGuyBurguer.theGuyBurguer.repository.IBurguerCompositionRepository;
import com.theGuyBurguer.theGuyBurguer.repository.IBurguerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BurguerService {

    @Autowired
    IBurguerCompositionRepository burguerCompositionRepository;

    @Autowired
    IBurguerRepository burguerRepository;

    public List<Burguer> findAll() {
	List<Burguer> burguers = burguerRepository.findAll();
	return burguers;
    }

    public Burguer findBurguerById(Long pId) {

	return burguerRepository.findBurguerById(pId);
    }

    public Burguer savaOrUpdate(final Burguer pBurguer) {
	List<BurguerComposition> compositions = pBurguer.getCompositionsBurguer();
	Burguer burguer = burguerRepository.save(pBurguer);
	List<BurguerComposition> burguerCompositionList = new ArrayList<>();
	for (int i = 0; i < compositions.size(); i++) {
	    BurguerComposition burguerComposition = compositions.get(i);
	    burguerComposition.setBurguer(burguer);
	    burguerCompositionRepository.save(burguerComposition);
	    burguerCompositionRepository.refresh(burguerComposition);
	    burguerCompositionList.add(burguerComposition);
	}
	burguer.setCompositionsBurguer(burguerCompositionList);
	burguerRepository.refresh(burguer);
	return burguer;
    }
}

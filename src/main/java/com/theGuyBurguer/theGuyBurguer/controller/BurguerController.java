package com.theGuyBurguer.theGuyBurguer.controller;

import com.theGuyBurguer.theGuyBurguer.model.Burguer;
import com.theGuyBurguer.theGuyBurguer.service.BurguerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BurguerController {

    @Autowired
    BurguerService burguerService;

    @GetMapping(value = "burguer")
    public List<Burguer> findAllBurguer() {
	return burguerService.findAll();
    }

    @GetMapping(value = "burguer/{id}")
    public Burguer findBurguerById(@PathVariable(value = "id") Long pId) {
	Burguer burguer = burguerService.findBurguerById(pId);
	return burguer;
    }

    @PostMapping(value = "burguer")
    public Burguer insertBurguer(@RequestBody Burguer pBurguer) {
	return burguerService.savaOrUpdate(pBurguer);
    }
}

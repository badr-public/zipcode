package br.com.badr.zipcode.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.badr.zipcode.br.entity.CepIf;
import br.com.badr.zipcode.br.service.CepService;

@RestController
public class CepRestController {
	
	@Autowired
	private CepService mCepService;
	
	@GetMapping(value = "/api/br/json/{CEP}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CepIf getZipCode(@PathVariable(value = "CEP") String pCep) {
		return mCepService.getCep(pCep);
	}

}

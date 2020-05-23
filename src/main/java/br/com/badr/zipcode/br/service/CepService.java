package br.com.badr.zipcode.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.badr.zipcode.br.entity.Cep;
import br.com.badr.zipcode.br.entity.CepIf;
import br.com.badr.zipcode.br.repository.CepRepository;

@Service
public class CepService {

	@Autowired
	private CepRepository mRepository;
	
	@Autowired
	private ViaCepService mViaCepService;
	
	private Cep findCep(String pCep) {
		String tCep = pCep.trim();
		if (tCep.length() < 8) {
			return null;
		}
		else if (tCep.length() == 8) {
			tCep = tCep.substring(0, 5) + "-" + tCep.substring(5, 8);
		}
		return mRepository.getByCep(tCep);
	}
	
	public CepIf save(Cep pCep) {
		return mRepository.save(pCep);
	}
	
	public CepIf getCep(String pCep) {
		CepIf pDbCep = findCep(pCep);
		if (pDbCep == null) {
			pDbCep = save(mViaCepService.getCep(pCep));
		}
		return pDbCep;
	}
}

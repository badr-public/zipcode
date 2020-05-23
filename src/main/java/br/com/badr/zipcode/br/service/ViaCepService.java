package br.com.badr.zipcode.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.badr.zipcode.br.entity.Cep;

@Service
public class ViaCepService {

	private static final String REQUEST_TYPE="/json/";
	
	@Value("${br.com.badr.zipcode.br.service.viacep.url}")
	private String mUrl;
	
	@Autowired
	private RestTemplate mRestTemplate;
	
	public Cep getCep(String pCep) {
		return mRestTemplate.getForObject(mUrl + pCep + REQUEST_TYPE,
			Cep.class);
	}
	
}

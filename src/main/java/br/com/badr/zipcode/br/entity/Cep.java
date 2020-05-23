package br.com.badr.zipcode.br.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "br_cep")
public class Cep implements CepIf {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer mId;

	@Column(name = "cep", unique = true, insertable = true, nullable = false, updatable = true)
    private String mCep;
    
	@Column(name = "logradouro")
    private String mLogradouro;
    
	@Column(name = "complemento")
    private String mComplemento;
    
	@Column(name = "bairro")
    private String mBairro;
    
	@Column(name = "localidade")
    private String mLocalidade;
    
	@Column(name = "uf")
    private String mUf;
    
	@Column(name = "unidade")
    private String mUnidade;
    
	@Column(name = "ibge")
    private String mIbge;
    
	@Column(name = "gia")
    private String mGia;
	
	public Cep() {
	}
	
//	@Override
//	public Integer getId() {
//		return mId;
//	}
	
	@Override
	public String getCep() {
		return mCep;
	}

	@Override
	public CepIf setCep(String pCep) {
		mCep = pCep;
		return this;
	}

	@Override
	public String getLogradouro() {
		return mLogradouro;
	}

	@Override
	public CepIf setLogradouro(String pLogradouro) {
		mLogradouro = pLogradouro;
		return this;
	}

	@Override
	public String getComplemento() {
		return mComplemento;
	}

	@Override
	public CepIf setComplemento(String pComplemento) {
		mComplemento = pComplemento;
		return this;
	}

	@Override
	public String getBairro() {
		return mBairro;
	}

	@Override
	public CepIf setBairro(String pBairro) {
		mBairro = pBairro;
		return this;
	}

	@Override
	public String getLocalidade() {
		return mLocalidade;
	}

	@Override
	public CepIf setLocalidade(String pLocalidade) {
		mLocalidade = pLocalidade;
		return this;
	}

	@Override
	public String getUf() {
		return mUf;
	}

	@Override
	public CepIf setUf(String pUf) {
		mUf = pUf;
		return this;
	}

	@Override
	public String getUnidade() {
		return mUnidade;
	}

	@Override
	public CepIf setUnidade(String pUnidade) {
		mUnidade = pUnidade;
		return this;
	}

	@Override
	public String getIbge() {
		return mIbge;
	}

	@Override
	public CepIf setIbge(String pIbge) {
		mIbge = pIbge;
		return this;
	}

	@Override
	public String getGia() {
		return mGia;
	}

	@Override
	public CepIf setGia(String pGia) {
		mGia = pGia;
		return this;
	}
	
}

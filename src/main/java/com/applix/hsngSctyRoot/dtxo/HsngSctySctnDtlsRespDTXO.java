package com.applix.hsngSctyRoot.dtxo;

public class HsngSctySctnDtlsRespDTXO {

	private	String	hsngSctySctnDtlsRegnNmbr	=	null;
	private	String	hsngSctySctnDtlsName		=	null;
	private	Integer	hsngSctySctnDtlsFlrs		=	null;
	
	public HsngSctySctnDtlsRespDTXO() {
		super();
	}

	public HsngSctySctnDtlsRespDTXO(String hsngSctySctnDtlsRegnNmbr, String hsngSctySctnDtlsName,
			Integer hsngSctySctnDtlsFlrs) {
		super();
		this.hsngSctySctnDtlsRegnNmbr = hsngSctySctnDtlsRegnNmbr;
		this.hsngSctySctnDtlsName = hsngSctySctnDtlsName;
		this.hsngSctySctnDtlsFlrs = hsngSctySctnDtlsFlrs;
	}

	public String getHsngSctySctnDtlsRegnNmbr() {
		return hsngSctySctnDtlsRegnNmbr;
	}

	public void setHsngSctySctnDtlsRegnNmbr(String hsngSctySctnDtlsRegnNmbr) {
		this.hsngSctySctnDtlsRegnNmbr = hsngSctySctnDtlsRegnNmbr;
	}

	public String getHsngSctySctnDtlsName() {
		return hsngSctySctnDtlsName;
	}

	public void setHsngSctySctnDtlsName(String hsngSctySctnDtlsName) {
		this.hsngSctySctnDtlsName = hsngSctySctnDtlsName;
	}

	public Integer getHsngSctySctnDtlsFlrs() {
		return hsngSctySctnDtlsFlrs;
	}

	public void setHsngSctySctnDtlsFlrs(Integer hsngSctySctnDtlsFlrs) {
		this.hsngSctySctnDtlsFlrs = hsngSctySctnDtlsFlrs;
	}

}

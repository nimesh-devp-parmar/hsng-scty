package com.applix.hsngSctyRoot.mppr;


import com.applix.hsngSctyRoot.dtxo.HsngSctySctnDtlsRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctySctnDtlsRqstDTXO;
import com.applix.hsngSctyRoot.modl.HsngSctySctnDtls;

public class HsngSctySctnDtlsMppr {

	public HsngSctySctnDtlsMppr() {
	}

	public	static	HsngSctySctnDtlsRespDTXO toDTXO(HsngSctySctnDtls parmHsngSctySctnDtls)	{
		
		HsngSctySctnDtlsRespDTXO	hsngSctySctnDtlsRespDTXO	=	new HsngSctySctnDtlsRespDTXO();
		
		hsngSctySctnDtlsRespDTXO.setHsngSctySctnDtlsRegnNmbr(parmHsngSctySctnDtls.getHsngSctySctnDtlsRegnNmbr().toString());
		hsngSctySctnDtlsRespDTXO.setHsngSctySctnDtlsName(parmHsngSctySctnDtls.getHsngSctySctnDtlsName());
		hsngSctySctnDtlsRespDTXO.setHsngSctySctnDtlsFlrs(parmHsngSctySctnDtls.getHsngSctySctnDtlsFlrs());
		
		return hsngSctySctnDtlsRespDTXO;
	}

	public	static	HsngSctySctnDtls	fromDTXO(HsngSctySctnDtlsRqstDTXO parmHsngSctySctnDtlsDTXO)	{
		
		HsngSctySctnDtls	hsngSctySctnDtls	=	new HsngSctySctnDtls();
		
		hsngSctySctnDtls.setHsngSctySctnDtlsRegnNmbr(parmHsngSctySctnDtlsDTXO.getHsngSctySctnDtlsRegnNmbr());
		hsngSctySctnDtls.setHsngSctySctnDtlsName(parmHsngSctySctnDtlsDTXO.getHsngSctySctnDtlsName());
		hsngSctySctnDtls.setHsngSctySctnDtlsFlrs(parmHsngSctySctnDtlsDTXO.getHsngSctySctnDtlsFlrs());
		
		return hsngSctySctnDtls;
	}
}

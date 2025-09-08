package com.applix.hsngSctyRoot.mppr;


import com.applix.hsngSctyRoot.dtxo.HsngSctyFlrsRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyFlrsRqstDTXO;
import com.applix.hsngSctyRoot.modl.HsngSctyFlrs;

public class HsngSctyFlrsMppr {

	public HsngSctyFlrsMppr() {
	}

	public	static	HsngSctyFlrsRespDTXO toDTXO(HsngSctyFlrs parmHsngSctyFlrs)	{
		
		HsngSctyFlrsRespDTXO	hsngSctyFlrsRespDTXO	=	new HsngSctyFlrsRespDTXO();
		
		hsngSctyFlrsRespDTXO.setHsngSctyFlrsRegnNmbr(parmHsngSctyFlrs.getHsngSctyFlrsRegnNmbr());
		hsngSctyFlrsRespDTXO.setHsngSctyFlrsSctnName(parmHsngSctyFlrs.getHsngSctyFlrsSctnName());
		hsngSctyFlrsRespDTXO.setHsngSctyFlrsFlorNmbr(parmHsngSctyFlrs.getHsngSctyFlrsFlorNmbr());
		
		return hsngSctyFlrsRespDTXO;
	}

	public	static	HsngSctyFlrs	fromDTXO(HsngSctyFlrsRqstDTXO parmHsngSctyFlrsDTXO)	{
		
		HsngSctyFlrs	hsngSctyFlrs	=	new HsngSctyFlrs();
		
		hsngSctyFlrs.setHsngSctyFlrsRegnNmbr(parmHsngSctyFlrsDTXO.getHsngSctyFlrsRegnNmbr());
		hsngSctyFlrs.setHsngSctyFlrsSctnName(parmHsngSctyFlrsDTXO.getHsngSctyFlrsSctnName());
		hsngSctyFlrs.setHsngSctyFlrsFlorNmbr(parmHsngSctyFlrsDTXO.getHsngSctyFlrsFlorNmbr());
		
		return hsngSctyFlrs;
	}
}

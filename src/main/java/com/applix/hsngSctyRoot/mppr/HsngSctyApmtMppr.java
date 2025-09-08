package com.applix.hsngSctyRoot.mppr;


import com.applix.hsngSctyRoot.dtxo.HsngSctyApmtRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyApmtRqstDTXO;
import com.applix.hsngSctyRoot.modl.HsngSctyApmt;
import com.google.gson.Gson;

public class HsngSctyApmtMppr {

	public HsngSctyApmtMppr() {
	}

	public	static	HsngSctyApmtRespDTXO toDTXO(HsngSctyApmt parmHsngSctyApmt)	{
		
		System.out.println("parmHsngSctyApmt: " + new Gson().toJson(parmHsngSctyApmt));
		
		HsngSctyApmtRespDTXO	hsngSctyApmtRespDTXO	=	new HsngSctyApmtRespDTXO();
		
		hsngSctyApmtRespDTXO.setHsngSctyApmtRegnNmbr(parmHsngSctyApmt.getHsngSctyApmtRegnNmbr());
		hsngSctyApmtRespDTXO.setHsngSctyApmtSctnName(parmHsngSctyApmt.getHsngSctyApmtSctnName());
		hsngSctyApmtRespDTXO.setHsngSctyApmtFlorNmbr(parmHsngSctyApmt.getHsngSctyApmtFlorNmbr());
		hsngSctyApmtRespDTXO.setHsngSctyApmtNmbr(parmHsngSctyApmt.getHsngSctyApmtNmbr());
		hsngSctyApmtRespDTXO.setHsngSctyApmtSize(parmHsngSctyApmt.getHsngSctyApmtSize());
		hsngSctyApmtRespDTXO.setHsngSctyApmtSizeUnit(parmHsngSctyApmt.getHsngSctyApmtSizeUnit());
		
		System.out.println("hsngSctyApmtRespDTXO: " + new Gson().toJson(hsngSctyApmtRespDTXO));
		return hsngSctyApmtRespDTXO;
	}

	public	static	HsngSctyApmt	fromDTXO(HsngSctyApmtRqstDTXO parmHsngSctyApmtDTXO)	{
		
		HsngSctyApmt	hsngSctyApmt	=	new HsngSctyApmt();
		
		hsngSctyApmt.setHsngSctyApmtRegnNmbr(parmHsngSctyApmtDTXO.getHsngSctyApmtRegnNmbr());
		hsngSctyApmt.setHsngSctyApmtSctnName(parmHsngSctyApmtDTXO.getHsngSctyApmtSctnName());
		hsngSctyApmt.setHsngSctyApmtFlorNmbr(parmHsngSctyApmtDTXO.getHsngSctyApmtFlorNmbr());
		hsngSctyApmt.setHsngSctyApmtNmbr(parmHsngSctyApmtDTXO.getHsngSctyApmtNmbr());
		hsngSctyApmt.setHsngSctyApmtSize(parmHsngSctyApmtDTXO.getHsngSctyApmtSize());
		hsngSctyApmt.setHsngSctyApmtSizeUnit(parmHsngSctyApmtDTXO.getHsngSctyApmtSizeUnit());
		
		return hsngSctyApmt;
	}
}

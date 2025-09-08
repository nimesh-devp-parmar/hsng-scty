package com.applix.hsngSctyRoot.mppr;


import com.applix.hsngSctyRoot.dtxo.HsngSctySctnRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctySctnRqstDTXO;
import com.applix.hsngSctyRoot.modl.HsngSctySctn;

public class HsngSctySctnMppr {

	public HsngSctySctnMppr() {
	}

	public	static	HsngSctySctnRespDTXO toDTXO(HsngSctySctn parmHsngSctySctn)	{
		
		HsngSctySctnRespDTXO	hsngSctySctnRespDTXO	=	new HsngSctySctnRespDTXO();
		
		hsngSctySctnRespDTXO.setHsngSctySctnRegnNmbr(parmHsngSctySctn.getHsngSctySctnRegnNmbr().toString());
		hsngSctySctnRespDTXO.setHsngSctySctnTotl(parmHsngSctySctn.getHsngSctySctnTotl());
		
		return hsngSctySctnRespDTXO;
	}

	public	static	HsngSctySctn	fromDTXO(HsngSctySctnRqstDTXO parmHsngSctySctnDTXO)	{
		
		HsngSctySctn	hsngSctySctn	=	new HsngSctySctn();
		
		hsngSctySctn.setHsngSctySctnRegnNmbr(parmHsngSctySctnDTXO.getHsngSctySctnRegnNmbr());
		hsngSctySctn.setHsngSctySctnTotl(parmHsngSctySctnDTXO.getHsngSctySctnTotl());
		
		return hsngSctySctn;
	}
}

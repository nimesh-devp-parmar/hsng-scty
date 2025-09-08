package com.applix.hsngSctyRoot.mppr;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import com.applix.hsngSctyRoot.dtxo.HsngSctyRootRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyRootRqstDTXO;
import com.applix.hsngSctyRoot.modl.HsngSctyRoot;

public class HsngSctyRootMppr {

	public HsngSctyRootMppr() {
	}

	public	static	HsngSctyRootRespDTXO toDTXO(HsngSctyRoot parmHsngSctyRoot)	{
		HsngSctyRootRespDTXO	hsngSctyRootDTXO	=	new HsngSctyRootRespDTXO();
		hsngSctyRootDTXO.setHsngSctyIden(parmHsngSctyRoot.getHsngSctyIden().toString());
		hsngSctyRootDTXO.setHsngSctyName(parmHsngSctyRoot.getHsngSctyName());
		hsngSctyRootDTXO.setHsngSctyRegnNmbr(parmHsngSctyRoot.getHsngSctyRegnNmbr());
		hsngSctyRootDTXO.setHsngSctyRegnDate(
			Instant
				.ofEpochMilli(parmHsngSctyRoot.getHsngSctyRegnDate())
				.atZone(ZoneId.systemDefault())
				.format(DateTimeFormatter.ofPattern("E, dd MMM yyyy"))
		);
		hsngSctyRootDTXO.setHsngSctyAddrStrt(parmHsngSctyRoot.getHsngSctyAddrStrt());
		hsngSctyRootDTXO.setHsngSctyAddrArea(parmHsngSctyRoot.getHsngSctyAddrArea());
		hsngSctyRootDTXO.setHsngSctyAddrCity(parmHsngSctyRoot.getHsngSctyAddrCity());
		hsngSctyRootDTXO.setHsngSctyAddrStte(parmHsngSctyRoot.getHsngSctyAddrStte());
		hsngSctyRootDTXO.setHsngSctyAddrCtry(parmHsngSctyRoot.getHsngSctyAddrCtry());
		hsngSctyRootDTXO.setHsngSctyAddrPINC(parmHsngSctyRoot.getHsngSctyAddrPINC());
		
		return hsngSctyRootDTXO;
	}

	public	static	HsngSctyRoot fromDTXO(HsngSctyRootRqstDTXO parmHsngSctyRootRqstDTXO)	{
		
		HsngSctyRoot	hsngSctyRoot	=	new HsngSctyRoot();
		
		hsngSctyRoot.setHsngSctyName(parmHsngSctyRootRqstDTXO.getHsngSctyName());
		hsngSctyRoot.setHsngSctyRegnNmbr(parmHsngSctyRootRqstDTXO.getHsngSctyRegnNmbr());
		hsngSctyRoot.setHsngSctyRegnDate(parmHsngSctyRootRqstDTXO.getHsngSctyRegnDate());
		hsngSctyRoot.setHsngSctyAddrStrt(parmHsngSctyRootRqstDTXO.getHsngSctyAddrStrt());
		hsngSctyRoot.setHsngSctyAddrArea(parmHsngSctyRootRqstDTXO.getHsngSctyAddrArea());
		hsngSctyRoot.setHsngSctyAddrCity(parmHsngSctyRootRqstDTXO.getHsngSctyAddrCity());
		hsngSctyRoot.setHsngSctyAddrStte(parmHsngSctyRootRqstDTXO.getHsngSctyAddrStte());
		hsngSctyRoot.setHsngSctyAddrCtry(parmHsngSctyRootRqstDTXO.getHsngSctyAddrCtry());
		hsngSctyRoot.setHsngSctyAddrPINC(parmHsngSctyRootRqstDTXO.getHsngSctyAddrPINC());
		
		return hsngSctyRoot;
	}
}

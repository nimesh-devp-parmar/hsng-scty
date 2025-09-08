package com.applix.hsngSctyRoot.srvc;

import java.util.List;

import org.springframework.stereotype.Service;

import com.applix.hsngSctyRoot.dtxo.HsngSctyApmtRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyApmtRqstDTXO;
import com.applix.hsngSctyRoot.modl.HsngSctyApmt;
import com.applix.hsngSctyRoot.mppr.HsngSctyApmtMppr;
import com.applix.hsngSctyRoot.repo.IHsngSctyApmtRepo;
import com.google.gson.Gson;

@Service
public class HsngSctyApmtSrvc {

	private	IHsngSctyApmtRepo	hsngSctyApmtRepo	=	null;
	
	public HsngSctyApmtSrvc(IHsngSctyApmtRepo parmHsngSctyApmtRepo) {
		this.hsngSctyApmtRepo	=	parmHsngSctyApmtRepo;
	}
	
	public	List<HsngSctyApmtRespDTXO> getHsngSctyApmt()	{
		
		return	hsngSctyApmtRepo
				.findAll()
				.stream()
				.map(HsngSctyApmtMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyApmtRespDTXO> getHsngSctyApmtByRegnNmbrSctnNameFlorNmbr(String parmHsngSctyApmtRegnNmbr, String parmHsngSctyApmtSctnName, Integer parmHsngSctyApmtFlorNmbr)	{
		System.out.println("regnNmbr: " + parmHsngSctyApmtRegnNmbr + ", sctnName: " + parmHsngSctyApmtSctnName + ", florNmbr: " + parmHsngSctyApmtFlorNmbr);
		System.out.println("List Apmt: " + new Gson().toJson(hsngSctyApmtRepo.findByHsngSctyApmtRegnNmbrAndHsngSctyApmtSctnNameAndHsngSctyApmtFlorNmbr(parmHsngSctyApmtRegnNmbr, parmHsngSctyApmtSctnName, parmHsngSctyApmtFlorNmbr)));
		
		return	hsngSctyApmtRepo
				.findByHsngSctyApmtRegnNmbrAndHsngSctyApmtSctnNameAndHsngSctyApmtFlorNmbr(parmHsngSctyApmtRegnNmbr, parmHsngSctyApmtSctnName, parmHsngSctyApmtFlorNmbr)
				.stream()
				.map(HsngSctyApmtMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyApmtRespDTXO> getHsngSctyApmtByRegnNmbrSctnNameFlorNmbrApmtNmbr(String parmHsngSctyApmtRegnNmbr, String parmHsngSctyApmtSctnName, Integer parmHsngSctyApmtFlorNmbr, Integer parmHsngSctyApmtApmtNmbr)	{
		System.out.println("regnNmbr: " + parmHsngSctyApmtRegnNmbr + ", sctnName: " + parmHsngSctyApmtSctnName + ", florNmbr: " + parmHsngSctyApmtFlorNmbr);
		System.out.println("List Apmt: " + new Gson().toJson(hsngSctyApmtRepo.findByHsngSctyApmtRegnNmbrAndHsngSctyApmtSctnNameAndHsngSctyApmtFlorNmbr(parmHsngSctyApmtRegnNmbr, parmHsngSctyApmtSctnName, parmHsngSctyApmtFlorNmbr)));
		
		return	hsngSctyApmtRepo
				.findByHsngSctyApmtRegnNmbrAndHsngSctyApmtSctnNameAndHsngSctyApmtFlorNmbrAndHsngSctyApmtNmbr(parmHsngSctyApmtRegnNmbr, parmHsngSctyApmtSctnName, parmHsngSctyApmtFlorNmbr, parmHsngSctyApmtApmtNmbr)
				.stream()
				.map(HsngSctyApmtMppr::toDTXO)
				.toList();
	}
	
	public HsngSctyApmtRespDTXO	createHsngSctyApmt(HsngSctyApmtRqstDTXO parmHsngSctyApmtRqstDTXO)	{
//		if(hsngSctyOffcBrrsRepo.existsByHsngSctyOffcBrrs(parmHsngSctyRqstDTXO., null, null)))	{
//			throw new HsngSctyRegnNmbrAlreadyExistsException("A housing society with this registration number already exists: " + parmHsngSctyRqstDTXO.getHsngSctyRegnNmbr());
//		}
		HsngSctyApmt	hsngSctyApmt	=	hsngSctyApmtRepo.save(HsngSctyApmtMppr.fromDTXO(parmHsngSctyApmtRqstDTXO));
		return HsngSctyApmtMppr.toDTXO(hsngSctyApmt);
	}
}

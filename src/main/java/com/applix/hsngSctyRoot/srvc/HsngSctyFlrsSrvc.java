package com.applix.hsngSctyRoot.srvc;

import java.util.List;

import org.springframework.stereotype.Service;

import com.applix.hsngSctyRoot.dtxo.HsngSctyFlrsRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyFlrsRqstDTXO;
import com.applix.hsngSctyRoot.modl.HsngSctyFlrs;
import com.applix.hsngSctyRoot.mppr.HsngSctyFlrsMppr;
import com.applix.hsngSctyRoot.repo.IHsngSctyFlrsRepo;

@Service
public class HsngSctyFlrsSrvc {

	private	IHsngSctyFlrsRepo	hsngSctyFlrsRepo	=	null;
	
	public HsngSctyFlrsSrvc(IHsngSctyFlrsRepo parmHsngSctyFlrsRepo) {
		this.hsngSctyFlrsRepo	=	parmHsngSctyFlrsRepo;
	}
	
	public	List<HsngSctyFlrsRespDTXO> getHsngSctyFlrs()	{
		
		return	hsngSctyFlrsRepo
				.findAll()
				.stream()
				.map(HsngSctyFlrsMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyFlrsRespDTXO> getHsngSctyFlrsBySctyRegnNmbrSctnName(String parmHsngSctyRegnNmbr, String parmHsngSctySctnName)	{
		return	hsngSctyFlrsRepo
				.findByHsngSctyFlrsRegnNmbrAndHsngSctyFlrsSctnName(parmHsngSctyRegnNmbr, parmHsngSctySctnName)
				.stream()
				.map(HsngSctyFlrsMppr::toDTXO)
				.toList();
	}
	
	public HsngSctyFlrsRespDTXO	createHsngSctyFlrs(HsngSctyFlrsRqstDTXO parmHsngSctyFlrsRqstDTXO)	{
//		if(hsngSctyOffcBrrsRepo.existsByHsngSctyOffcBrrs(parmHsngSctyRqstDTXO., null, null)))	{
//			throw new HsngSctyRegnNmbrAlreadyExistsException("A housing society with this registration number already exists: " + parmHsngSctyRqstDTXO.getHsngSctyRegnNmbr());
//		}
		HsngSctyFlrs	hsngSctyFlrs	=	hsngSctyFlrsRepo.save(HsngSctyFlrsMppr.fromDTXO(parmHsngSctyFlrsRqstDTXO));
		return HsngSctyFlrsMppr.toDTXO(hsngSctyFlrs);
	}
}

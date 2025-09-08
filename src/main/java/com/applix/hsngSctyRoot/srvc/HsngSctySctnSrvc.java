package com.applix.hsngSctyRoot.srvc;

import java.util.List;

import org.springframework.stereotype.Service;

import com.applix.hsngSctyRoot.dtxo.HsngSctySctnRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctySctnRqstDTXO;
import com.applix.hsngSctyRoot.modl.HsngSctySctn;
import com.applix.hsngSctyRoot.mppr.HsngSctySctnMppr;
import com.applix.hsngSctyRoot.repo.IHsngSctySctnRepo;

@Service
public class HsngSctySctnSrvc {

	private	IHsngSctySctnRepo	hsngSctySctnRepo	=	null;
	
	public HsngSctySctnSrvc(IHsngSctySctnRepo parmHsngSctySctnRepo) {
		this.hsngSctySctnRepo	=	parmHsngSctySctnRepo;
	}
	
	public	List<HsngSctySctnRespDTXO> getHsngSctySctn()	{
		
		return	hsngSctySctnRepo
				.findAll()
				.stream()
				.map(HsngSctySctnMppr::toDTXO)
				.toList();
	}
	
	public HsngSctySctnRespDTXO	createHsngSctySctn(HsngSctySctnRqstDTXO parmHsngSctySctnRqstDTXO)	{
//		if(hsngSctyOffcBrrsRepo.existsByHsngSctyOffcBrrs(parmHsngSctyRqstDTXO., null, null)))	{
//			throw new HsngSctyRegnNmbrAlreadyExistsException("A housing society with this registration number already exists: " + parmHsngSctyRqstDTXO.getHsngSctyRegnNmbr());
//		}
		HsngSctySctn	hsngSctySctn	=	hsngSctySctnRepo.save(HsngSctySctnMppr.fromDTXO(parmHsngSctySctnRqstDTXO));
		return HsngSctySctnMppr.toDTXO(hsngSctySctn);
	}
}

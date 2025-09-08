package com.applix.hsngSctyRoot.srvc;

import java.util.List;

import org.springframework.stereotype.Service;

import com.applix.hsngSctyRoot.dtxo.HsngSctyRootRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyRootRqstDTXO;
import com.applix.hsngSctyRoot.excp.HsngSctyRegnNmbrAlreadyExistsException;
import com.applix.hsngSctyRoot.modl.HsngSctyRoot;
import com.applix.hsngSctyRoot.mppr.HsngSctyRootMppr;
import com.applix.hsngSctyRoot.repo.IHsngSctyRootRepo;

@Service
public class HsngSctyRootSrvc {

	private	IHsngSctyRootRepo	hsngSctyRootRepo	=	null;
	
	public HsngSctyRootSrvc(IHsngSctyRootRepo parmHsngSctyRootRepo) {
		this.hsngSctyRootRepo	=	parmHsngSctyRootRepo;
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyRoot()	{
		
		return	hsngSctyRootRepo
				.findAll()
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public HsngSctyRootRespDTXO	createHsngSctyRoot(HsngSctyRootRqstDTXO parmHsngSctyRqstDTXO)	{
		if(hsngSctyRootRepo.existsByHsngSctyRegnNmbr(parmHsngSctyRqstDTXO.getHsngSctyRegnNmbr()))	{
			throw new HsngSctyRegnNmbrAlreadyExistsException("A housing society with this registration number already exists: " + parmHsngSctyRqstDTXO.getHsngSctyRegnNmbr());
		}
		HsngSctyRoot	hsngSctyRoot	=	hsngSctyRootRepo.save(HsngSctyRootMppr.fromDTXO(parmHsngSctyRqstDTXO));
		return HsngSctyRootMppr.toDTXO(hsngSctyRoot);
	}
}

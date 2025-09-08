package com.applix.hsngSctyRoot.srvc;

import java.util.List;

import org.springframework.stereotype.Service;

import com.applix.hsngSctyRoot.dtxo.HsngSctySctnDtlsRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctySctnDtlsRqstDTXO;
import com.applix.hsngSctyRoot.modl.HsngSctySctnDtls;
import com.applix.hsngSctyRoot.mppr.HsngSctySctnDtlsMppr;
import com.applix.hsngSctyRoot.repo.IHsngSctySctnDtlsRepo;

@Service
public class HsngSctySctnDtlsSrvc {

	private	IHsngSctySctnDtlsRepo	hsngSctySctnDtlsRepo	=	null;
	
	public HsngSctySctnDtlsSrvc(IHsngSctySctnDtlsRepo parmHsngSctySctnDtlsRepo) {
		this.hsngSctySctnDtlsRepo	=	parmHsngSctySctnDtlsRepo;
	}
	
	public	List<HsngSctySctnDtlsRespDTXO> getHsngSctySctnDtls()	{
		
		return	hsngSctySctnDtlsRepo
				.findAll()
				.stream()
				.map(HsngSctySctnDtlsMppr::toDTXO)
				.toList();
	}
	
	public HsngSctySctnDtlsRespDTXO	createHsngSctySctnDtls(HsngSctySctnDtlsRqstDTXO parmHsngSctySctnDtlsRqstDTXO)	{
//		if(hsngSctyOffcBrrsRepo.existsByHsngSctyOffcBrrs(parmHsngSctyRqstDTXO., null, null)))	{
//			throw new HsngSctyRegnNmbrAlreadyExistsException("A housing society with this registration number already exists: " + parmHsngSctyRqstDTXO.getHsngSctyRegnNmbr());
//		}
		HsngSctySctnDtls	hsngSctySctnDtls	=	hsngSctySctnDtlsRepo.save(HsngSctySctnDtlsMppr.fromDTXO(parmHsngSctySctnDtlsRqstDTXO));
		return HsngSctySctnDtlsMppr.toDTXO(hsngSctySctnDtls);
	}
}

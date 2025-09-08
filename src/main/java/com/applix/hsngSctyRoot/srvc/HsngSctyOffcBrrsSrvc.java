package com.applix.hsngSctyRoot.srvc;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.applix.hsngSctyRoot.dtxo.HsngSctyOffcBrrsRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyOffcBrrsRqstDTXO;
import com.applix.hsngSctyRoot.excp.OffcBrrsAlrdRsgdExcp;
import com.applix.hsngSctyRoot.excp.OffcBrrsFnshDateGTStrtDateExcp;
import com.applix.hsngSctyRoot.excp.OffcBrrsFnshDateGTTdaySofDExcp;
import com.applix.hsngSctyRoot.modl.HsngSctyOffcBrrs;
import com.applix.hsngSctyRoot.modl.cmps.HsngSctyOffcBrrsCmps;
import com.applix.hsngSctyRoot.mppr.HsngSctyOffcBrrsMppr;
import com.applix.hsngSctyRoot.repo.IHsngSctyOffcBrrsRepo;
import com.applix.hsngSctyRoot.util.DateUtil;

@Service
public class HsngSctyOffcBrrsSrvc {

	private	IHsngSctyOffcBrrsRepo	hsngSctyOffcBrrsRepo	=	null;
	
	public HsngSctyOffcBrrsSrvc(IHsngSctyOffcBrrsRepo parmHsngSctyOffcBrrsRepo) {
		this.hsngSctyOffcBrrsRepo	=	parmHsngSctyOffcBrrsRepo;
	}
	
	public	List<HsngSctyOffcBrrsRespDTXO> getHsngSctyOffcBrrs()	{
		
		return	hsngSctyOffcBrrsRepo
				.findAll()
				.stream()
				.map(HsngSctyOffcBrrsMppr::toDTXO)
				.toList();
	}
	
	public HsngSctyOffcBrrsRespDTXO	createHsngSctyOffcBrrs(HsngSctyOffcBrrsRqstDTXO parmHsngSctyRqstDTXO)	{
//		if(hsngSctyOffcBrrsRepo.existsByHsngSctyOffcBrrs(parmHsngSctyRqstDTXO., null, null)))	{
//			throw new HsngSctyRegnNmbrAlreadyExistsException("A housing society with this registration number already exists: " + parmHsngSctyRqstDTXO.getHsngSctyRegnNmbr());
//		}
		HsngSctyOffcBrrs	hsngSctyOffcBrrs	=	hsngSctyOffcBrrsRepo.save(HsngSctyOffcBrrsMppr.fromDTXO(parmHsngSctyRqstDTXO));
		return HsngSctyOffcBrrsMppr.toDTXO(hsngSctyOffcBrrs);
	}

	public HsngSctyOffcBrrsRespDTXO	updtFnshDateHsngSctyOffcBrrs(HsngSctyOffcBrrsRqstDTXO parmHsngSctyRqstDTXO)	{

		HsngSctyOffcBrrs			hsngSctyOffcBrrsOrig	=	null;
		HsngSctyOffcBrrs			hsngSctyOffcBrrsUpdd	=	null;
		HsngSctyOffcBrrsCmps		hsngSctyOffcBrrsCmps	=	null;
		long						offcBrrsDateStrt		=	0L;
		long						offcBrrsDateFnshParm	=	0L;
		long						tdaySofD				=	0L;
		Optional<HsngSctyOffcBrrs>	optn					=	null;

		offcBrrsDateStrt		=	parmHsngSctyRqstDTXO.getHsngSctyOffcBrrsDateStrt();
		offcBrrsDateFnshParm	=	parmHsngSctyRqstDTXO.getHsngSctyOffcBrrsDateFnsh();
		tdaySofD				=	LocalDate.now(ZoneId.systemDefault()).atStartOfDay().toInstant(ZoneOffset.ofHours(0)).toEpochMilli();
		hsngSctyOffcBrrsCmps	=	new HsngSctyOffcBrrsCmps();
		hsngSctyOffcBrrsCmps.setHsngSctyOffcBrrsRegnNmbr(parmHsngSctyRqstDTXO.getHsngSctyOffcBrrsRegnNmbr());
		hsngSctyOffcBrrsCmps.setHsngSctyOffcBrrsSeqnNmbr(parmHsngSctyRqstDTXO.getHsngSctyOffcBrrsSeqnNmbr());
		hsngSctyOffcBrrsCmps.setHsngSctyOffcBrrsTitl(parmHsngSctyRqstDTXO.getHsngSctyOffcBrrsTitl());
		optn					=	hsngSctyOffcBrrsRepo.findById(hsngSctyOffcBrrsCmps);
		
		if(optn.isPresent())	{
			hsngSctyOffcBrrsOrig	=	optn.get();
			
			if(null != hsngSctyOffcBrrsOrig.getHsngSctyOffcBrrsDateFnsh() && (hsngSctyOffcBrrsOrig.getHsngSctyOffcBrrsDateFnsh() > 0) && (hsngSctyOffcBrrsOrig.getHsngSctyOffcBrrsDateFnsh() > hsngSctyOffcBrrsOrig.getHsngSctyOffcBrrsDateStrt()))	{
				throw new OffcBrrsAlrdRsgdExcp("This office bearer started office on: " + DateUtil.cnvtDateFromMilsToStrn(hsngSctyOffcBrrsOrig.getHsngSctyOffcBrrsDateStrt()) + " and already resigned on : " + DateUtil.cnvtDateFromMilsToStrn(hsngSctyOffcBrrsOrig.getHsngSctyOffcBrrsDateFnsh()));
			}
			if(offcBrrsDateFnshParm < offcBrrsDateStrt)	{
				throw new OffcBrrsFnshDateGTStrtDateExcp("The finish date: " + DateUtil.cnvtDateFromMilsToStrn(offcBrrsDateFnshParm) + " of an office bearer cannot be before the start date: " + DateUtil.cnvtDateFromMilsToStrn(offcBrrsDateStrt));
			}
			if(offcBrrsDateFnshParm > tdaySofD)	{
				throw new OffcBrrsFnshDateGTTdaySofDExcp("The finish date: " + DateUtil.cnvtDateFromMilsToStrn(offcBrrsDateFnshParm) + " of an office bearer cannot be in the future");
			}
			hsngSctyOffcBrrsOrig.setHsngSctyOffcBrrsDateFnsh(parmHsngSctyRqstDTXO.getHsngSctyOffcBrrsDateFnsh());
			hsngSctyOffcBrrsUpdd	=	hsngSctyOffcBrrsRepo.save(hsngSctyOffcBrrsOrig);
		}
		return HsngSctyOffcBrrsMppr.toDTXO(hsngSctyOffcBrrsUpdd);
	}
}

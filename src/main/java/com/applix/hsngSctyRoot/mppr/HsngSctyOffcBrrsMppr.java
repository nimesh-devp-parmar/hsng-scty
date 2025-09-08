package com.applix.hsngSctyRoot.mppr;

import com.applix.hsngSctyRoot.dtxo.HsngSctyOffcBrrsRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyOffcBrrsRqstDTXO;
import com.applix.hsngSctyRoot.modl.HsngSctyOffcBrrs;
import com.applix.hsngSctyRoot.util.DateUtil;

public class HsngSctyOffcBrrsMppr {

	public HsngSctyOffcBrrsMppr() {
	}

	public	static	HsngSctyOffcBrrsRespDTXO toDTXO(HsngSctyOffcBrrs parmHsngSctyOffcBrrs)	{
		
		String	offcBrrsFnshDate	=	"Tenure On-Going";
		
		HsngSctyOffcBrrsRespDTXO	hsngSctyOffcBrrsRespDTXO	=	new HsngSctyOffcBrrsRespDTXO();
		
		hsngSctyOffcBrrsRespDTXO.setHsngSctyOffcBrrsRegnNmbr(parmHsngSctyOffcBrrs.getHsngSctyOffcBrrsRegnNmbr().toString());
		hsngSctyOffcBrrsRespDTXO.setHsngSctyOffcBrrsTitl(parmHsngSctyOffcBrrs.getHsngSctyOffcBrrsTitl());
		hsngSctyOffcBrrsRespDTXO.setHsngSctyOffcBrrsSeqnNmbr(parmHsngSctyOffcBrrs.getHsngSctyOffcBrrsSeqnNmbr());
		hsngSctyOffcBrrsRespDTXO.setHsngSctyOffcBrrsNameFrst(parmHsngSctyOffcBrrs.getHsngSctyOffcBrrsNameFrst());
		hsngSctyOffcBrrsRespDTXO.setHsngSctyOffcBrrsNameMidl(parmHsngSctyOffcBrrs.getHsngSctyOffcBrrsNameMidl());
		hsngSctyOffcBrrsRespDTXO.setHsngSctyOffcBrrsNameLast(parmHsngSctyOffcBrrs.getHsngSctyOffcBrrsNameLast());
		hsngSctyOffcBrrsRespDTXO.setHsngSctyOffcBrrsDateStrt(DateUtil.cnvtDateFromMilsToStrn(parmHsngSctyOffcBrrs.getHsngSctyOffcBrrsDateStrt()));
		
		offcBrrsFnshDate	=	(null==parmHsngSctyOffcBrrs.getHsngSctyOffcBrrsDateFnsh()) ? 
								"Tenure On-Going" : 
								DateUtil.cnvtDateFromMilsToStrn(parmHsngSctyOffcBrrs.getHsngSctyOffcBrrsDateFnsh());
		hsngSctyOffcBrrsRespDTXO.setHsngSctyOffcBrrsDateFnsh(offcBrrsFnshDate);
		
		hsngSctyOffcBrrsRespDTXO.setHsngSctyOffcBrrsCntcNmbr(parmHsngSctyOffcBrrs.getHsngSctyOffcBrrsCntcNmbr());
		hsngSctyOffcBrrsRespDTXO.setHsngSctyOffcBrrsCntcMail(parmHsngSctyOffcBrrs.getHsngSctyOffcBrrsCntcMail());
		hsngSctyOffcBrrsRespDTXO.setHsngSctyOffcBrrsCntcWtsp(parmHsngSctyOffcBrrs.getHsngSctyOffcBrrsCntcWtsp());
		
		return hsngSctyOffcBrrsRespDTXO;
	}

	public	static	HsngSctyOffcBrrs	fromDTXO(HsngSctyOffcBrrsRqstDTXO parmHsngSctyOffcBrrsRqstDTXO)	{
		
		HsngSctyOffcBrrs	hsngSctyOffcBrrs	=	new HsngSctyOffcBrrs();
		
		hsngSctyOffcBrrs.setHsngSctyOffcBrrsTitl(parmHsngSctyOffcBrrsRqstDTXO.getHsngSctyOffcBrrsTitl());
		hsngSctyOffcBrrs.setHsngSctyOffcBrrsSeqnNmbr(parmHsngSctyOffcBrrsRqstDTXO.getHsngSctyOffcBrrsSeqnNmbr());
		hsngSctyOffcBrrs.setHsngSctyOffcBrrsNameFrst(parmHsngSctyOffcBrrsRqstDTXO.getHsngSctyOffcBrrsNameFrst());
		hsngSctyOffcBrrs.setHsngSctyOffcBrrsNameMidl(parmHsngSctyOffcBrrsRqstDTXO.getHsngSctyOffcBrrsNameMidl());
		hsngSctyOffcBrrs.setHsngSctyOffcBrrsNameLast(parmHsngSctyOffcBrrsRqstDTXO.getHsngSctyOffcBrrsNameLast());
		hsngSctyOffcBrrs.setHsngSctyOffcBrrsDateStrt(parmHsngSctyOffcBrrsRqstDTXO.getHsngSctyOffcBrrsDateStrt());
		hsngSctyOffcBrrs.setHsngSctyOffcBrrsDateFnsh(parmHsngSctyOffcBrrsRqstDTXO.getHsngSctyOffcBrrsDateFnsh());
		hsngSctyOffcBrrs.setHsngSctyOffcBrrsCntcNmbr(parmHsngSctyOffcBrrsRqstDTXO.getHsngSctyOffcBrrsCntcNmbr());
		hsngSctyOffcBrrs.setHsngSctyOffcBrrsCntcMail(parmHsngSctyOffcBrrsRqstDTXO.getHsngSctyOffcBrrsCntcMail());
		hsngSctyOffcBrrs.setHsngSctyOffcBrrsCntcWtsp(parmHsngSctyOffcBrrsRqstDTXO.getHsngSctyOffcBrrsCntcWtsp());
		
		return hsngSctyOffcBrrs;
	}
}

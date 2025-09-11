package com.applix.hsngSctyRoot.ctlr;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applix.hsngSctyRoot.srvc.HsngSctyRootHlthChckSrvc;

@RestController
@RequestMapping("/hsng-scty-root-hlth-chck")
public class HsngSctyHlthChckCtlr {

	private			final	HsngSctyRootHlthChckSrvc	hsngSctyHlthChckSrvc;
    private static final	Logger						log	= LoggerFactory.getLogger(HsngSctyRootHlthChckSrvc.class);
	
	public HsngSctyHlthChckCtlr(HsngSctyRootHlthChckSrvc parmHsngSctyHlthChckSrvc) {
		this.hsngSctyHlthChckSrvc	=	parmHsngSctyHlthChckSrvc;
	}
	
	@GetMapping("/getStts")
	public	ResponseEntity<Boolean>	getHsngSctyHlthChckStts()	{

		Boolean					dataOkay				=	false;
		Boolean					rootDataOkay			=	false;
		Boolean					offcBrrsDataOkay		=	false;
		Boolean					sctnDataOkay			=	false;
		Boolean					sctnDtlsDataOkay		=	false;
		Boolean					flrsDataOkay			=	false;
		Boolean					apmtDataOkay			=	false;
		Map<String, Integer>	mappRootTablXNmbrRecs	=	null;
		
		mappRootTablXNmbrRecs	=	hsngSctyHlthChckSrvc.getHsngSctyHlthChckStts();
		if(null!=mappRootTablXNmbrRecs && !(mappRootTablXNmbrRecs.isEmpty()) && mappRootTablXNmbrRecs.size()>0)	{

			for(Map.Entry<String, Integer> entry:mappRootTablXNmbrRecs.entrySet())	{
				if(entry.getKey().equals("com.applix.hsngSctyRoot.modl.HsngSctyRoot"))	{
					if(entry.getValue()==2)	{
						rootDataOkay	=	true;
					}
				}
				if(entry.getKey().equals("com.applix.hsngSctyRoot.modl.HsngSctyOffcBrrs"))	{
					if(entry.getValue()==5)	{
						offcBrrsDataOkay	=	true;
					}
				}
				if(entry.getKey().equals("com.applix.hsngSctyRoot.modl.HsngSctySctn"))	{
					if(entry.getValue()==2)	{
						sctnDataOkay	=	true;
					}
				}
				if(entry.getKey().equals("com.applix.hsngSctyRoot.modl.HsngSctySctnDtls"))	{
					if(entry.getValue()==2)	{
						sctnDtlsDataOkay	=	true;
					}
				}
				if(entry.getKey().equals("com.applix.hsngSctyRoot.modl.HsngSctyFlrs"))	{
					if(entry.getValue()==18)	{
						flrsDataOkay	=	true;
					}
				}
				if(entry.getKey().equals("com.applix.hsngSctyRoot.modl.HsngSctyApmt"))	{
					if(entry.getValue()==28)	{
						apmtDataOkay	=	true;
					}
				}
			}
			log.info("rootDataOkay: " + rootDataOkay);
			log.info("offcBrrsDataOkay: " + offcBrrsDataOkay);
			log.info("sctnDataOkay: " + sctnDataOkay);
			log.info("sctnDtlsDataOkay: " + sctnDtlsDataOkay);
			log.info("flrsDataOkay: " + flrsDataOkay);
			log.info("apmtDataOkay: " + apmtDataOkay);
			
			if(rootDataOkay && offcBrrsDataOkay && sctnDataOkay && sctnDtlsDataOkay && flrsDataOkay && apmtDataOkay)	{
				dataOkay	=	true;
			}
		}
		return ResponseEntity.ok().body(dataOkay);
	}

}

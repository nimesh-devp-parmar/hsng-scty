package com.applix.hsngSctyRoot.ctlr;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.applix.hsngSctyRoot.dtxo.HsngSctyApmtRespDTXO;
import com.applix.hsngSctyRoot.srvc.HsngSctyApmtSrvc;

@RestController
@RequestMapping("/hsng-scty-apmt")
public class HsngSctyApmtCtlr {

	private	final	HsngSctyApmtSrvc	hsngSctyApmtSrvc;
	
	public HsngSctyApmtCtlr(HsngSctyApmtSrvc parmHsngSctyApmtSrvc) {
		this.hsngSctyApmtSrvc	=	parmHsngSctyApmtSrvc;
	}
	
	@GetMapping("/all")
	public	ResponseEntity<List<HsngSctyApmtRespDTXO>>	getHsngSctyApmt()	{
		return ResponseEntity.ok().body(hsngSctyApmtSrvc.getHsngSctyApmt());
	}

	@GetMapping("/slctByRegnSctnFlor")
	public	ResponseEntity<List<HsngSctyApmtRespDTXO>>	getHsngSctyFlrsBySctyRegnNmbrSctnNameFlorNmbr(@RequestParam String regnNmbr, @RequestParam String sctnName, @RequestParam Integer florNmbr)	{
		System.out.println("regnNmbr: " + regnNmbr + ", sctnName: " + sctnName + ", florNmbr: " + florNmbr);
		return ResponseEntity.ok().body(hsngSctyApmtSrvc.getHsngSctyApmtByRegnNmbrSctnNameFlorNmbr(regnNmbr, sctnName, florNmbr));
	}
	@GetMapping("/slctByRegnSctnFlorApmt")
	public	ResponseEntity<List<HsngSctyApmtRespDTXO>>	getHsngSctyFlrsBySctyRegnNmbrSctnNameFlorNmbrApmtNmbr(@RequestParam String regnNmbr, @RequestParam String sctnName, @RequestParam Integer florNmbr, @RequestParam Integer apmtNmbr)	{
		System.out.println("regnNmbr: " + regnNmbr + ", sctnName: " + sctnName + ", florNmbr: " + florNmbr + ", apmtrNmbr: " + apmtNmbr);
		return ResponseEntity.ok().body(hsngSctyApmtSrvc.getHsngSctyApmtByRegnNmbrSctnNameFlorNmbrApmtNmbr(regnNmbr, sctnName, florNmbr, apmtNmbr));
	}
}

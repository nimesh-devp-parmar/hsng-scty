package com.applix.hsngSctyRoot.ctlr;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.applix.hsngSctyRoot.dtxo.HsngSctyFlrsRespDTXO;
import com.applix.hsngSctyRoot.srvc.HsngSctyFlrsSrvc;

@RestController
@RequestMapping("/hsng-scty-flrs")
public class HsngSctyFlrsCtlr {

	private	final	HsngSctyFlrsSrvc	hsngSctyFlrsSrvc;
	
	public HsngSctyFlrsCtlr(HsngSctyFlrsSrvc parmHsngSctyFlrsSrvc) {
		this.hsngSctyFlrsSrvc	=	parmHsngSctyFlrsSrvc;
	}
	
	@GetMapping("/all")
	public	ResponseEntity<List<HsngSctyFlrsRespDTXO>>	getHsngSctyFlrs()	{
		return ResponseEntity.ok().body(hsngSctyFlrsSrvc.getHsngSctyFlrs());
	}

	@GetMapping("/slct")
	public	ResponseEntity<List<HsngSctyFlrsRespDTXO>>	getHsngSctyFlrsBySctyRegnNmbrSctnName(@RequestParam String regnNmbr, @RequestParam String sctnName)	{
		return ResponseEntity.ok().body(hsngSctyFlrsSrvc.getHsngSctyFlrsBySctyRegnNmbrSctnName(regnNmbr, sctnName));
	}
}

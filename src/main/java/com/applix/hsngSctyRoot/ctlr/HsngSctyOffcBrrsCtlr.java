package com.applix.hsngSctyRoot.ctlr;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applix.hsngSctyRoot.dtxo.HsngSctyOffcBrrsRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyOffcBrrsRqstDTXO;
import com.applix.hsngSctyRoot.srvc.HsngSctyOffcBrrsSrvc;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/hsng-scty-offc-brrs")
public class HsngSctyOffcBrrsCtlr {

	private	final	HsngSctyOffcBrrsSrvc	hsngSctyOffcBrrsSrvc;
	
	public HsngSctyOffcBrrsCtlr(HsngSctyOffcBrrsSrvc parmHsngSctyOffcBrrsSrvc) {
		this.hsngSctyOffcBrrsSrvc	=	parmHsngSctyOffcBrrsSrvc;
	}
	
	@GetMapping
	public	ResponseEntity<List<HsngSctyOffcBrrsRespDTXO>>	getHsngSctyOffcBrrs()	{
		return ResponseEntity.ok().body(hsngSctyOffcBrrsSrvc.getHsngSctyOffcBrrs());
	}

	@PostMapping()
	public	ResponseEntity<HsngSctyOffcBrrsRespDTXO>	createHsngSctyOffcBrrs(@Valid @RequestBody HsngSctyOffcBrrsRqstDTXO parmHsngSctyOffcBrrsRqstDTXO)	{
		return ResponseEntity.ok().body(hsngSctyOffcBrrsSrvc.createHsngSctyOffcBrrs(parmHsngSctyOffcBrrsRqstDTXO));
	}

	@PutMapping()
	public	ResponseEntity<HsngSctyOffcBrrsRespDTXO>	updtFnshDateHsngSctyOffcBrrs(@Valid @RequestBody HsngSctyOffcBrrsRqstDTXO parmHsngSctyOffcBrrsRqstDTXO)	{
		return ResponseEntity.ok().body(hsngSctyOffcBrrsSrvc.updtFnshDateHsngSctyOffcBrrs(parmHsngSctyOffcBrrsRqstDTXO));
	}

}

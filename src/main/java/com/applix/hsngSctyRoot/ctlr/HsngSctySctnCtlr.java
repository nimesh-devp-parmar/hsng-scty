package com.applix.hsngSctyRoot.ctlr;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applix.hsngSctyRoot.dtxo.HsngSctySctnRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctySctnRqstDTXO;
import com.applix.hsngSctyRoot.srvc.HsngSctySctnSrvc;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/hsng-scty-sctn")
public class HsngSctySctnCtlr {

	private	final	HsngSctySctnSrvc	hsngSctySctnSrvc;
	
	public HsngSctySctnCtlr(HsngSctySctnSrvc parmHsngSctySctnSrvc) {
		this.hsngSctySctnSrvc	=	parmHsngSctySctnSrvc;
	}
	
	@GetMapping
	public	ResponseEntity<List<HsngSctySctnRespDTXO>>	getHsngSctySctn()	{
		return ResponseEntity.ok().body(hsngSctySctnSrvc.getHsngSctySctn());
	}

	@PostMapping()
	public	ResponseEntity<HsngSctySctnRespDTXO>	createHsngSctySctn(@Valid @RequestBody HsngSctySctnRqstDTXO parmHsngSctySctnRqstDTXO)	{
		return ResponseEntity.ok().body(hsngSctySctnSrvc.createHsngSctySctn(parmHsngSctySctnRqstDTXO));
	}

}

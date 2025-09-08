package com.applix.hsngSctyRoot.ctlr;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applix.hsngSctyRoot.dtxo.HsngSctySctnDtlsRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctySctnDtlsRqstDTXO;
import com.applix.hsngSctyRoot.srvc.HsngSctySctnDtlsSrvc;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/hsng-scty-sctn-dtls")
public class HsngSctySctnDtlsCtlr {

	private	final	HsngSctySctnDtlsSrvc	hsngSctySctnDtlsSrvc;
	
	public HsngSctySctnDtlsCtlr(HsngSctySctnDtlsSrvc parmHsngSctySctnDtlsSrvc) {
		this.hsngSctySctnDtlsSrvc	=	parmHsngSctySctnDtlsSrvc;
	}
	
	@GetMapping
	public	ResponseEntity<List<HsngSctySctnDtlsRespDTXO>>	getHsngSctySctnDtls()	{
		return ResponseEntity.ok().body(hsngSctySctnDtlsSrvc.getHsngSctySctnDtls());
	}

	@PostMapping()
	public	ResponseEntity<HsngSctySctnDtlsRespDTXO>	createHsngSctySctnDtls(@Valid @RequestBody HsngSctySctnDtlsRqstDTXO parmHsngSctySctnDtlsRqstDTXO)	{
		return ResponseEntity.ok().body(hsngSctySctnDtlsSrvc.createHsngSctySctnDtls(parmHsngSctySctnDtlsRqstDTXO));
	}

}

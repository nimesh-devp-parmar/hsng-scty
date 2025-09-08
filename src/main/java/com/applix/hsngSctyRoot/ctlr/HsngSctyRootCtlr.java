package com.applix.hsngSctyRoot.ctlr;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applix.hsngSctyRoot.dtxo.HsngSctyRootRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyRootRqstDTXO;
import com.applix.hsngSctyRoot.srvc.HsngSctyRootSrvc;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/hsng-scty-root")
public class HsngSctyRootCtlr {

	private	final	HsngSctyRootSrvc	hsngSctyRootSrvc;
	
	public HsngSctyRootCtlr(HsngSctyRootSrvc parmHsngSctyRootSrvc) {
		this.hsngSctyRootSrvc	=	parmHsngSctyRootSrvc;
	}
	
	@GetMapping
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyRoot()	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyRoot());
	}

	@PostMapping()
	public	ResponseEntity<HsngSctyRootRespDTXO>	createHsngSctyRoot(@Valid @RequestBody HsngSctyRootRqstDTXO parmHsngSctyRootRqstDTXO)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.createHsngSctyRoot(parmHsngSctyRootRqstDTXO));
	}

}

package com.applix.hsngSctyRoot.ctlr;

import java.util.List;
import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.applix.hsngSctyRoot.dtxo.HsngSctyRootRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyRootRqstDTXO;
import com.applix.hsngSctyRoot.srvc.HsngSctyRootSrvc;

import jakarta.validation.Valid;
import jakarta.validation.groups.Default;

@RestController
@RequestMapping("/hsng-scty-root")
public class HsngSctyRootCtlr {

	private	final	HsngSctyRootSrvc	hsngSctyRootSrvc;
	
	public HsngSctyRootCtlr(HsngSctyRootSrvc parmHsngSctyRootSrvc) {
		this.hsngSctyRootSrvc	=	parmHsngSctyRootSrvc;
	}
	
	@PostMapping()
	public	ResponseEntity<HsngSctyRootRespDTXO>	createHsngSctyRoot(@Valid @RequestBody HsngSctyRootRqstDTXO parmHsngSctyRootRqstDTXO)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.createHsngSctyRoot(parmHsngSctyRootRqstDTXO));
	}

	@GetMapping("/all")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyRoot()	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyRoot());
	}

	@GetMapping("/getByPartialName")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyNameLike(@RequestParam String hsngSctyNamePrtl)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyNameLike("%" + hsngSctyNamePrtl + "%"));
	}

	@GetMapping("/getByNameStartsWith")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyNameStartsWith(@RequestParam String hsngSctyNameStartsWith)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyNameStartsWith(hsngSctyNameStartsWith));
	}

	@GetMapping("/getByNameEndsWith")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyNameEndsWith(@RequestParam String hsngSctyNameEndsWith)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyNameEndsWith(hsngSctyNameEndsWith));
	}

	@GetMapping("/getByPartialRegnNmbr")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyRegnNmbrLike(@RequestParam String hsngSctyRegnNmbrPrtl)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyRegnNmbrLike("%" + hsngSctyRegnNmbrPrtl + "%"));
	}

	@GetMapping("/getByRegnNmbrStartsWith")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyRegnNmbrStartsWith(@RequestParam String hsngSctyRegnNmbrStartsWith)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyRegnNmbrStartsWith(hsngSctyRegnNmbrStartsWith));
	}

	@GetMapping("/getByRegnNmbrEndsWith")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyRegnNmbrEndsWith(@RequestParam String hsngSctyRegnNmbrEndsWith)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyRegnNmbrEndsWith(hsngSctyRegnNmbrEndsWith));
	}

	@GetMapping("/getByAddrStrtLike")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrStrtLike(@RequestParam String hsngSctyAddrStrtPrtl)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyAddrStrtLike("%" + hsngSctyAddrStrtPrtl + "%"));
	}

	@GetMapping("/getByAddrStrtStartsWith")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrStrtStartsWith(@RequestParam String hsngSctyAddrStrtStartsWith)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyAddrStrtStartsWith(hsngSctyAddrStrtStartsWith));
	}

	@GetMapping("/getByAddrStrtEndsWith")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrStrtEndsWith(@RequestParam String hsngSctyAddrStrtEndsWith)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyAddrStrtEndsWith(hsngSctyAddrStrtEndsWith));
	}

	@GetMapping("/getByAddrArea")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrArea(@RequestParam String hsngSctyAddrArea)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyByAddrArea(hsngSctyAddrArea));
	}

	@GetMapping("/getByAddrCity")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrCity(@RequestParam String hsngSctyAddrCity)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyByAddrCity(hsngSctyAddrCity));
	}

	@GetMapping("/getByAddrStte")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrStte(@RequestParam String hsngSctyAddrStte)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyByAddrStte(hsngSctyAddrStte));
	}

	@GetMapping("/getByAddrCtry")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrCtry(@RequestParam String hsngSctyAddrCtry)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyByAddrCtry(hsngSctyAddrCtry));
	}

	@GetMapping("/getByAddrPINC")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrPINC(@RequestParam String hsngSctyAddrPINC)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyByAddrPINC(hsngSctyAddrPINC));
	}

	@PutMapping("/{hsngSctyIden}")
	public ResponseEntity<HsngSctyRootRespDTXO> updtHsngSctyRoot(@PathVariable UUID hsngSctyIden, @Validated({Default.class}) @RequestBody HsngSctyRootRqstDTXO hsngSctyRootRqstDTXO) {
		HsngSctyRootRespDTXO hsngSctyRootRespDTXO	= hsngSctyRootSrvc.updtHsngSctyRoot(hsngSctyIden, hsngSctyRootRqstDTXO);
	    return ResponseEntity.ok().body(hsngSctyRootRespDTXO);
	}
	
	@DeleteMapping("/{hsngSctyIden}")
	public ResponseEntity<HsngSctyRootRespDTXO> dletHsngSctyRoot(@PathVariable UUID hsngSctyIden) {
		hsngSctyRootSrvc.dletHsngSctyRoot(hsngSctyIden);
	    return ResponseEntity.noContent().build();
	}
}

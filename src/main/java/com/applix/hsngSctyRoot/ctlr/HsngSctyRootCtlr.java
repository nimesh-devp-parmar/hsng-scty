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

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.groups.Default;

@RestController
@RequestMapping("/hsng-scty-root")
@Tag	(
	name		=	"Housing Society Root",
	description	=	"APIs for CRUD operations against the Housing Society Root table"
)
public class HsngSctyRootCtlr {

	private	final	HsngSctyRootSrvc	hsngSctyRootSrvc;
	
	public HsngSctyRootCtlr(HsngSctyRootSrvc parmHsngSctyRootSrvc) {
		this.hsngSctyRootSrvc	=	parmHsngSctyRootSrvc;
	}
	
	@PostMapping()
	@Operation	(
		summary		=	"Create a new Housing Society in the system",
		description	=	"Creates a new Housing Society in the system",
		tags		=	{
			"Housing Society Root", "post"
		}
	)
	public	ResponseEntity<HsngSctyRootRespDTXO>	createHsngSctyRoot(@Valid @RequestBody HsngSctyRootRqstDTXO parmHsngSctyRootRqstDTXO)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.createHsngSctyRoot(parmHsngSctyRootRqstDTXO));
	}

	@GetMapping("/all")
	@Operation	(
		summary		=	"Retrieve all Housing Societies in the system",
		description	=	"Retrieves all the Housing Societies in the system",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyRoot()	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyRoot());
	}

	@GetMapping("/getByPrtlName")
	@Operation	(
		summary		=	"Retrieve Housing Societies that has the given string anywhere in its name",
		description	=	"Retrieves Housing Societies that has the given string anywhere in its name",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyNameLike	(
		@Parameter(description = "The Housing Society Name will be searched and if the name contains this search string, that Housing Society root record will be returned", required = true, example = "serv")
		@RequestParam String hsngSctyNamePrtl)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyNameLike("%" + hsngSctyNamePrtl + "%"));
	}

	@GetMapping("/getByNameStartsWith")
	@Operation	(
		summary		=	"Retrieve Housing Societies whose name starts with the given string",
		description	=	"Retrieves Housing Societies whose name starts with the given string",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyNameStartsWith	(
		@Parameter(description = "The Housing Society Name will be searched and if the name starts with this search string, that Housing Society root record will be returned", required = true, example = " Ikon")
		@RequestParam String hsngSctyNameStartsWith)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyNameStartsWith(hsngSctyNameStartsWith));
	}

	@GetMapping("/getByNameEndsWith")
	@Operation	(
		summary		=	"Retrieve Housing Societies whose name ends with the given string",
		description	=	"Retrieves Housing Societies whose name ends with the given string",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyNameEndsWith	(
		@Parameter(description = "The Housing Society Name will be searched and if the name ends with this search string, that Housing Society root record will be returned", required = true, example = " society")
		@RequestParam String hsngSctyNameEndsWith)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyNameEndsWith(hsngSctyNameEndsWith));
	}

	@Operation	(
		summary		=	"Retrieve Housing Societies that has the given string anywhere in its Registration Number",
		description	=	"Retrieves Housing Societies that has the given string anywhere in its Registration Number",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	@GetMapping("/getByPrtlRegnNmbr")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyRegnNmbrLike	(
		@Parameter(description = "The Housing Society Registration Number will be searched and if the number contains this search string, that Housing Society root record will be returned", required = true, example = "12345")
		@RequestParam String hsngSctyRegnNmbrPrtl)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyRegnNmbrLike("%" + hsngSctyRegnNmbrPrtl + "%"));
	}

	@Operation	(
		summary		=	"Retrieve Housing Societies that start with given string anywhere in its Registration Number",
		description	=	"Retrieves Housing Societies that starts with the given string anywhere in its Registration Number",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	@GetMapping("/getByRegnNmbrStartsWith")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyRegnNmbrStartsWith	(
		@Parameter(description = "The Housing Society Registration Number will be searched and if the number starts with this search string, that Housing Society root record will be returned", required = true, example = "12345")
		@RequestParam String hsngSctyRegnNmbrStartsWith)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyRegnNmbrStartsWith(hsngSctyRegnNmbrStartsWith));
	}

	@Operation	(
		summary		=	"Retrieve Housing Societies that end with given string anywhere in its Registration Number",
		description	=	"Retrieves Housing Societies that ends with the given string anywhere in its Registration Number",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	@GetMapping("/getByRegnNmbrEndsWith")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyRegnNmbrEndsWith	(
		@Parameter(description = "The Housing Society Registration Number will be searched and if the number ends with this search string, that Housing Society root record will be returned", required = true, example = "12345")
		@RequestParam String hsngSctyRegnNmbrEndsWith)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyRegnNmbrEndsWith(hsngSctyRegnNmbrEndsWith));
	}

	@Operation	(
		summary		=	"Retrieve Housing Societies that has the given string anywhere in its Street Address",
		description	=	"Retrieves Housing Societies that have the given string anywhere in their Street Address",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	@GetMapping("/getByPrtlStrtLike")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrStrtLike	(
		@Parameter(description = "The Housing Society Street Address will be searched and if the street address contains this search string, that Housing Society root record will be returned", required = true, example = "12345")
		@RequestParam String hsngSctyAddrStrtPrtl)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyAddrStrtLike("%" + hsngSctyAddrStrtPrtl + "%"));
	}

	@Operation	(
		summary		=	"Retrieve Housing Societies whose Street Address start with the given string",
		description	=	"Retrieves Housing Societies whose Street Address start with the given string",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	@GetMapping("/getByAddrStrtStartsWith")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrStrtStartsWith	(
		@Parameter(description = "The Housing Society Street Address will be searched and if the street address starts with this search string, that Housing Society root record will be returned", required = true, example = "12345")
		@RequestParam String hsngSctyAddrStrtStartsWith)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyAddrStrtStartsWith(hsngSctyAddrStrtStartsWith));
	}

	@Operation	(
		summary		=	"Retrieve Housing Societies whose Street Address end with the given string",
		description	=	"Retrieves Housing Societies whose Street Address end with the given string",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	@GetMapping("/getByAddrStrtEndsWith")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrStrtEndsWith	(
		@Parameter(description = "The Housing Society Street Address will be searched and if the street address ends with this search string, that Housing Society root record will be returned", required = true, example = "12345")
		@RequestParam String hsngSctyAddrStrtEndsWith)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyAddrStrtEndsWith(hsngSctyAddrStrtEndsWith));
	}

	@Operation	(
		summary		=	"Retrieve Housing Societies whose Address Area matches the given string",
		description	=	"Retrieve Housing Societies whose Address Area matches the given string",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	@GetMapping("/getByAddrArea")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrArea(
		@Parameter(description = "The Housing Society Address Area will be searched and if the area matches this search string, that Housing Society root record will be returned", required = true, example = "12345")
		@RequestParam String hsngSctyAddrArea)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyByAddrArea(hsngSctyAddrArea));
	}

	@Operation	(
		summary		=	"Retrieve Housing Societies whose Address City matches the given string",
		description	=	"Retrieve Housing Societies whose Address City matches the given string",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	@GetMapping("/getByAddrCity")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrCity(
		@Parameter(description = "The Housing Society Address City will be searched and if the city matches this search string, that Housing Society root record will be returned", required = true, example = "12345")
		@RequestParam String hsngSctyAddrCity)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyByAddrCity(hsngSctyAddrCity));
	}

	@Operation	(
		summary		=	"Retrieve Housing Societies whose Address State matches the given string",
		description	=	"Retrieve Housing Societies whose Address State matches the given string",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	@GetMapping("/getByAddrStte")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrStte(
		@Parameter(description = "The Housing Society Address City will be searched and if the state matches this search string, that Housing Society root record will be returned", required = true, example = "12345")
		@RequestParam String hsngSctyAddrStte)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyByAddrStte(hsngSctyAddrStte));
	}

	@Operation	(
		summary		=	"Retrieve Housing Societies whose Address Country matches the given string",
		description	=	"Retrieve Housing Societies whose Address Country matches the given string",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	@GetMapping("/getByAddrCtry")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrCtry(
		@Parameter(description = "The Housing Society Address Country will be searched and if the country matches this search string, that Housing Society root record will be returned", required = true, example = "12345")
		@RequestParam String hsngSctyAddrCtry)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyByAddrCtry(hsngSctyAddrCtry));
	}

	@Operation	(
		summary		=	"Retrieve Housing Societies whose Address PIN Code matches the given string",
		description	=	"Retrieve Housing Societies whose Address PIN Code matches the given string",
		tags		=	{
			"Housing Society Root", "get"
		}
	)
	@GetMapping("/getByAddrPINC")
	public	ResponseEntity<List<HsngSctyRootRespDTXO>>	getHsngSctyAddrPINC	(
		@Parameter(description = "The Housing Society Address PIN Code will be searched and if the PIN Code matches this search string, that Housing Society root record will be returned", required = true, example = "12345")
		@RequestParam String hsngSctyAddrPINC)	{
		return ResponseEntity.ok().body(hsngSctyRootSrvc.getHsngSctyByAddrPINC(hsngSctyAddrPINC));
	}

	@PutMapping("/{hsngSctyIden}")
	public ResponseEntity<HsngSctyRootRespDTXO> updtHsngSctyRoot	(
		@PathVariable UUID hsngSctyIden, 
		@Validated	(
			{Default.class}
		) 
		@RequestBody HsngSctyRootRqstDTXO hsngSctyRootRqstDTXO) {
		HsngSctyRootRespDTXO hsngSctyRootRespDTXO	= hsngSctyRootSrvc.updtHsngSctyRoot(hsngSctyIden, hsngSctyRootRqstDTXO);
	    return ResponseEntity.ok().body(hsngSctyRootRespDTXO);
	}
	
	@DeleteMapping("/{hsngSctyIden}")
	public ResponseEntity<HsngSctyRootRespDTXO> dletHsngSctyRoot(@PathVariable UUID hsngSctyIden) {
		hsngSctyRootSrvc.dletHsngSctyRoot(hsngSctyIden);
	    return ResponseEntity.noContent().build();
	}
}

package com.applix.hsngSctyRoot.dtxo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class HsngSctySctnDtlsRqstDTXO {

	@NotNull(message="Housing Society Registration Number cannot be empty")
	@NotBlank(message="Housing Society Registration Number cannot be empty")
	private	String	hsngSctySctnDtlsRegnNmbr	=	null;

	@NotNull(message="Housing Society section name cannot be empty")
	private	String	hsngSctySctnDtlsName		=	null;

	@NotNull(message="Housing Society section must have at least 1 floor")
	@Positive
	@Min(value=1)
	private	Integer	hsngSctySctnDtlsFlrs		=	null;

	public HsngSctySctnDtlsRqstDTXO() {
		super();
	}

	public HsngSctySctnDtlsRqstDTXO(
			@NotNull(message = "Housing Society Registration Number cannot be empty") @NotBlank(message = "Housing Society Registration Number cannot be empty") String hsngSctySctnDtlsRegnNmbr,
			@NotNull(message = "Housing Society section name cannot be empty") String hsngSctySctnDtlsName,
			@NotNull(message = "Housing Society section must have at least 1 floor") @Positive @Min(1) Integer hsngSctySctnDtlsFlrs) {
		super();
		this.hsngSctySctnDtlsRegnNmbr = hsngSctySctnDtlsRegnNmbr;
		this.hsngSctySctnDtlsName = hsngSctySctnDtlsName;
		this.hsngSctySctnDtlsFlrs = hsngSctySctnDtlsFlrs;
	}

	public String getHsngSctySctnDtlsRegnNmbr() {
		return hsngSctySctnDtlsRegnNmbr;
	}

	public void setHsngSctySctnDtlsRegnNmbr(String hsngSctySctnDtlsRegnNmbr) {
		this.hsngSctySctnDtlsRegnNmbr = hsngSctySctnDtlsRegnNmbr;
	}

	public String getHsngSctySctnDtlsName() {
		return hsngSctySctnDtlsName;
	}

	public void setHsngSctySctnDtlsName(String hsngSctySctnDtlsName) {
		this.hsngSctySctnDtlsName = hsngSctySctnDtlsName;
	}

	public Integer getHsngSctySctnDtlsFlrs() {
		return hsngSctySctnDtlsFlrs;
	}

	public void setHsngSctySctnDtlsFlrs(Integer hsngSctySctnDtlsFlrs) {
		this.hsngSctySctnDtlsFlrs = hsngSctySctnDtlsFlrs;
	}

}

package com.applix.hsngSctyRoot.dtxo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class HsngSctyFlrsRqstDTXO {

	@NotNull(message="Housing Society Registration Number cannot be empty")
	@NotBlank(message="Housing Society Registration Number cannot be empty")
	private	String	hsngSctyFlrsRegnNmbr	=	null;

	@NotNull(message="Housing Society section name cannot be empty")
	@NotBlank(message="Housing Society section name cannot be empty")
	private	String	hsngSctyFlrsSctnName	=	null;

	@NotNull(message="Housing Society floor number cannot be empty")
	@Positive(message="Housing Society floor number cannot be negative or 0")
	@Min(value=1, message="Housing Society floor number cannot be less than 0")
	private	Integer	hsngSctyFlrsFlorNmbr	=	null;

	public HsngSctyFlrsRqstDTXO() {
		super();
	}

	public HsngSctyFlrsRqstDTXO(
			@NotNull(message = "Housing Society Registration Number cannot be empty") @NotBlank(message = "Housing Society Registration Number cannot be empty") String hsngSctyFlrsRegnNmbr,
			@NotNull(message = "Housing Society section name cannot be empty") @NotBlank(message = "Housing Society section name cannot be empty") String hsngSctyFlrsSctnName,
			@NotNull(message = "Housing Society floor number cannot be empty") @Positive(message = "Housing Society floor number cannot be negative or 0") @Min(value = 1, message = "Housing Society floor number cannot be less than 0") Integer hsngSctyFlrsFlorNmbr) {
		super();
		this.hsngSctyFlrsRegnNmbr = hsngSctyFlrsRegnNmbr;
		this.hsngSctyFlrsSctnName = hsngSctyFlrsSctnName;
		this.hsngSctyFlrsFlorNmbr = hsngSctyFlrsFlorNmbr;
	}

	public String getHsngSctyFlrsRegnNmbr() {
		return hsngSctyFlrsRegnNmbr;
	}

	public void setHsngSctyFlrsRegnNmbr(String hsngSctyFlrsRegnNmbr) {
		this.hsngSctyFlrsRegnNmbr = hsngSctyFlrsRegnNmbr;
	}

	public String getHsngSctyFlrsSctnName() {
		return hsngSctyFlrsSctnName;
	}

	public void setHsngSctyFlrsSctnName(String hsngSctyFlrsSctnName) {
		this.hsngSctyFlrsSctnName = hsngSctyFlrsSctnName;
	}

	public Integer getHsngSctyFlrsFlorNmbr() {
		return hsngSctyFlrsFlorNmbr;
	}

	public void setHsngSctyFlrsFlorNmbr(Integer hsngSctyFlrsFlorNmbr) {
		this.hsngSctyFlrsFlorNmbr = hsngSctyFlrsFlorNmbr;
	}

}

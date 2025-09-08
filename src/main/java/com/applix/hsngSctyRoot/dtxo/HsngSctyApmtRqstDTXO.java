package com.applix.hsngSctyRoot.dtxo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class HsngSctyApmtRqstDTXO {

	@NotNull(message="Housing Society Registration Number cannot be empty")
	@NotBlank(message="Housing Society Registration Number cannot be empty")
	private	String	hsngSctyApmtRegnNmbr	=	null;

	@NotNull(message="Housing Society section name cannot be empty")
	@NotBlank(message="Housing Society section name cannot be empty")
	private	String	hsngSctyApmtSctnName	=	null;

	@NotNull(message="Housing Society floor number cannot be empty")
	@Positive(message="Housing Society floor number cannot be negative or 0")
	@Min(value=1, message="Housing Society floor number cannot be less than 0")
	private	Integer	hsngSctyApmtFlorNmbr	=	null;

	@NotNull(message="Housing Society apartment number cannot be empty")
	@Positive(message="Housing Society apartment number cannot be negative or 0")
	@Min(value=1, message="Housing Society apartment number cannot be less than 0")
	private	Integer	hsngSctyApmtNmbr		=	null;

	@NotNull(message="Housing Society apartment size cannot be empty")
	@Positive(message="Housing Society apartment size cannot be negative or 0")
	@Min(value=1, message="Housing Society apartment size cannot be less than 0")
	private	Integer	hsngSctyApmtSize		=	null;

	@NotNull(message="Housing Society apartment size cannot be empty")
	@NotBlank(message="Housing Society apartment size cannot be empty")
	private	String	hsngSctyApmtSizeUnit	=	null;

	public HsngSctyApmtRqstDTXO() {
		super();
	}

	public HsngSctyApmtRqstDTXO(
			@NotNull(message = "Housing Society Registration Number cannot be empty") @NotBlank(message = "Housing Society Registration Number cannot be empty") String hsngSctyApmtRegnNmbr,
			@NotNull(message = "Housing Society section name cannot be empty") @NotBlank(message = "Housing Society section name cannot be empty") String hsngSctyApmtSctnName,
			@NotNull(message = "Housing Society floor number cannot be empty") @Positive(message = "Housing Society floor number cannot be negative or 0") @Min(value = 1, message = "Housing Society floor number cannot be less than 0") Integer hsngSctyApmtFlorNmbr,
			@NotNull(message = "Housing Society apartment number cannot be empty") @Positive(message = "Housing Society apartment number cannot be negative or 0") @Min(value = 1, message = "Housing Society apartment number cannot be less than 0") Integer hsngSctyApmtNmbr,
			@NotNull(message = "Housing Society apartment size cannot be empty") @Positive(message = "Housing Society apartment size cannot be negative or 0") @Min(value = 1, message = "Housing Society apartment size cannot be less than 0") Integer hsngSctyApmtSize,
			@NotNull(message = "Housing Society apartment size cannot be empty") @NotBlank(message = "Housing Society apartment size cannot be empty") String hsngSctyApmtSizeUnit) {
		super();
		this.hsngSctyApmtRegnNmbr = hsngSctyApmtRegnNmbr;
		this.hsngSctyApmtSctnName = hsngSctyApmtSctnName;
		this.hsngSctyApmtFlorNmbr = hsngSctyApmtFlorNmbr;
		this.hsngSctyApmtNmbr = hsngSctyApmtNmbr;
		this.hsngSctyApmtSize = hsngSctyApmtSize;
		this.hsngSctyApmtSizeUnit = hsngSctyApmtSizeUnit;
	}

	public String getHsngSctyApmtRegnNmbr() {
		return hsngSctyApmtRegnNmbr;
	}

	public void setHsngSctyApmtRegnNmbr(String hsngSctyApmtRegnNmbr) {
		this.hsngSctyApmtRegnNmbr = hsngSctyApmtRegnNmbr;
	}

	public String getHsngSctyApmtSctnName() {
		return hsngSctyApmtSctnName;
	}

	public void setHsngSctyApmtSctnName(String hsngSctyApmtSctnName) {
		this.hsngSctyApmtSctnName = hsngSctyApmtSctnName;
	}

	public Integer getHsngSctyApmtFlorNmbr() {
		return hsngSctyApmtFlorNmbr;
	}

	public void setHsngSctyApmtFlorNmbr(Integer hsngSctyApmtFlorNmbr) {
		this.hsngSctyApmtFlorNmbr = hsngSctyApmtFlorNmbr;
	}

	public Integer getHsngSctyApmtNmbr() {
		return hsngSctyApmtNmbr;
	}

	public void setHsngSctyApmtNmbr(Integer hsngSctyApmtNmbr) {
		this.hsngSctyApmtNmbr = hsngSctyApmtNmbr;
	}

	public Integer getHsngSctyApmtSize() {
		return hsngSctyApmtSize;
	}

	public void setHsngSctyApmtSize(Integer hsngSctyApmtSize) {
		this.hsngSctyApmtSize = hsngSctyApmtSize;
	}

	public String getHsngSctyApmtSizeUnit() {
		return hsngSctyApmtSizeUnit;
	}

	public void setHsngSctyApmtSizeUnit(String hsngSctyApmtSizeUnit) {
		this.hsngSctyApmtSizeUnit = hsngSctyApmtSizeUnit;
	}

}

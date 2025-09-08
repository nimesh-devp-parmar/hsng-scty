package com.applix.hsngSctyRoot.dtxo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class HsngSctyRootRqstDTXO {

	@NotBlank(message="Housing Society Name cannot exceed be blank")
	private	String	hsngSctyName		=	null;

	@NotBlank(message="Housing Society Number cannot exceed be blank")
	@Pattern(message="The expected pattern is: REG/AAA/AA(AAA) 99999/9999", regexp="^REG/[A-Z][A-Z][A-Z]/[A-Z][A-Z]\\([A-Z][A-Z][A-Z]\\)\\s\\d\\d\\d\\d\\d/\\d\\d\\d\\d")
	private	String	hsngSctyRegnNmbr	=	null;

	@Positive(message="Housing Society Registration Date cannot be a date earlier than 01/01/1970")
	@Min(0)
	private	Long	hsngSctyRegnDate	=	null;

	@NotBlank(message="Housing Society Address: Street cannot exceed be blank")
	private	String	hsngSctyAddrStrt	=	null;

	@NotBlank(message="Housing Society Address: Area cannot exceed be blank")
	private	String	hsngSctyAddrArea	=	null;

	@NotBlank(message="Housing Society Address: City cannot exceed be blank")
	private	String	hsngSctyAddrCity	=	null;

	@NotBlank(message="Housing Society Address: State cannot exceed be blank")
	private	String	hsngSctyAddrStte	=	null;

	@NotBlank(message="Housing Society Address: Country cannot exceed be blank")
	private	String	hsngSctyAddrCtry	=	null;

	@NotBlank(message="Housing Society Address: Pin Code cannot exceed be blank")
	@Pattern(regexp = "\\d+", message = "Housing Society Address: Pin Code must be numeric")
	@Size(min=6, max=6, message = "Housing Society Address: Pin Code must be 6-digits")
	private	String	hsngSctyAddrPINC	=	null;

	public String getHsngSctyName() {
		return hsngSctyName;
	}

	public void setHsngSctyName(String hsngSctyName) {
		this.hsngSctyName = hsngSctyName;
	}

	public String getHsngSctyRegnNmbr() {
		return hsngSctyRegnNmbr;
	}

	public void setHsngSctyRegnNmbr(String hsngSctyRegnNmbr) {
		this.hsngSctyRegnNmbr = hsngSctyRegnNmbr;
	}

	public Long getHsngSctyRegnDate() {
		return hsngSctyRegnDate;
	}

	public void setHsngSctyRegnDate(Long hsngSctyRegnDate) {
		this.hsngSctyRegnDate = hsngSctyRegnDate;
	}

	public String getHsngSctyAddrStrt() {
		return hsngSctyAddrStrt;
	}

	public void setHsngSctyAddrStrt(String hsngSctyAddrStrt) {
		this.hsngSctyAddrStrt = hsngSctyAddrStrt;
	}

	public String getHsngSctyAddrArea() {
		return hsngSctyAddrArea;
	}

	public void setHsngSctyAddrArea(String hsngSctyAddrArea) {
		this.hsngSctyAddrArea = hsngSctyAddrArea;
	}

	public String getHsngSctyAddrCity() {
		return hsngSctyAddrCity;
	}

	public void setHsngSctyAddrCity(String hsngSctyAddrCity) {
		this.hsngSctyAddrCity = hsngSctyAddrCity;
	}

	public String getHsngSctyAddrStte() {
		return hsngSctyAddrStte;
	}

	public void setHsngSctyAddrStte(String hsngSctyAddrStte) {
		this.hsngSctyAddrStte = hsngSctyAddrStte;
	}

	public String getHsngSctyAddrCtry() {
		return hsngSctyAddrCtry;
	}

	public void setHsngSctyAddrCtry(String hsngSctyAddrCtry) {
		this.hsngSctyAddrCtry = hsngSctyAddrCtry;
	}

	public String getHsngSctyAddrPINC() {
		return hsngSctyAddrPINC;
	}

	public void setHsngSctyAddrPINC(String hsngSctyAddrPINC) {
		this.hsngSctyAddrPINC = hsngSctyAddrPINC;
	}
	
}

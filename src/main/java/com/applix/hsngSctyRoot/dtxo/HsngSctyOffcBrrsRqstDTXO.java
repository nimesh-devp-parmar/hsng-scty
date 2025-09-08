package com.applix.hsngSctyRoot.dtxo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class HsngSctyOffcBrrsRqstDTXO {

	@NotNull(message="Housing Society Registration Number cannot be empty")
	private	String	hsngSctyOffcBrrsRegnNmbr	=	null;

	@NotNull(message="Housing Society Office Bearer Title cannot be empty")
	private	String	hsngSctyOffcBrrsTitl		=	null;

	@NotNull(message="Housing Society Office Bearer Sequence Number cannot be empty")
	private	Integer	hsngSctyOffcBrrsSeqnNmbr	=	null;

	@NotBlank(message="Housing Society Office Bearer First Name cannot be blank")
	private	String	hsngSctyOffcBrrsNameFrst	=	null;

	private	String	hsngSctyOffcBrrsNameMidl	=	null;

	@NotBlank(message="Housing Society Office Bearer Lasst Name cannot be blank")
	private	String	hsngSctyOffcBrrsNameLast	=	null;

	@Positive(message="Housing Society Office Bearer Start Date cannot be empty")
	@Min(0)
	private	Long	hsngSctyOffcBrrsDateStrt	=	null;

	private	Long	hsngSctyOffcBrrsDateFnsh	=	null;

	private	Long	hsngSctyOffcBrrsCntcNmbr	=	null;

	private	String	hsngSctyOffcBrrsCntcMail	=	null;

	private	Long	hsngSctyOffcBrrsCntcWtsp	=	null;

	public String getHsngSctyOffcBrrsRegnNmbr() {
		return hsngSctyOffcBrrsRegnNmbr;
	}

	public void setHsngSctyOffcBrrsRegnNmbr(String hsngSctyOffcBrrsRegnNmbr) {
		this.hsngSctyOffcBrrsRegnNmbr = hsngSctyOffcBrrsRegnNmbr;
	}

	public String getHsngSctyOffcBrrsTitl() {
		return hsngSctyOffcBrrsTitl;
	}

	public void setHsngSctyOffcBrrsTitl(String hsngSctyOffcBrrsTitl) {
		this.hsngSctyOffcBrrsTitl = hsngSctyOffcBrrsTitl;
	}

	public Integer getHsngSctyOffcBrrsSeqnNmbr() {
		return hsngSctyOffcBrrsSeqnNmbr;
	}

	public void setHsngSctyOffcBrrsSeqnNmbr(Integer hsngSctyOffcBrrsSeqnNmbr) {
		this.hsngSctyOffcBrrsSeqnNmbr = hsngSctyOffcBrrsSeqnNmbr;
	}

	public String getHsngSctyOffcBrrsNameFrst() {
		return hsngSctyOffcBrrsNameFrst;
	}

	public void setHsngSctyOffcBrrsNameFrst(String hsngSctyOffcBrrsNameFrst) {
		this.hsngSctyOffcBrrsNameFrst = hsngSctyOffcBrrsNameFrst;
	}

	public String getHsngSctyOffcBrrsNameMidl() {
		return hsngSctyOffcBrrsNameMidl;
	}

	public void setHsngSctyOffcBrrsNameMidl(String hsngSctyOffcBrrsNameMidl) {
		this.hsngSctyOffcBrrsNameMidl = hsngSctyOffcBrrsNameMidl;
	}

	public String getHsngSctyOffcBrrsNameLast() {
		return hsngSctyOffcBrrsNameLast;
	}

	public void setHsngSctyOffcBrrsNameLast(String hsngSctyOffcBrrsNameLast) {
		this.hsngSctyOffcBrrsNameLast = hsngSctyOffcBrrsNameLast;
	}

	public Long getHsngSctyOffcBrrsDateStrt() {
		return hsngSctyOffcBrrsDateStrt;
	}

	public void setHsngSctyOffcBrrsDateStrt(Long hsngSctyOffcBrrsDateStrt) {
		this.hsngSctyOffcBrrsDateStrt = hsngSctyOffcBrrsDateStrt;
	}

	public Long getHsngSctyOffcBrrsDateFnsh() {
		return hsngSctyOffcBrrsDateFnsh;
	}

	public void setHsngSctyOffcBrrsDateFnsh(Long hsngSctyOffcBrrsDateFnsh) {
		this.hsngSctyOffcBrrsDateFnsh = hsngSctyOffcBrrsDateFnsh;
	}

	public Long getHsngSctyOffcBrrsCntcNmbr() {
		return hsngSctyOffcBrrsCntcNmbr;
	}

	public void setHsngSctyOffcBrrsCntcNmbr(Long hsngSctyOffcBrrsCntcNmbr) {
		this.hsngSctyOffcBrrsCntcNmbr = hsngSctyOffcBrrsCntcNmbr;
	}

	public String getHsngSctyOffcBrrsCntcMail() {
		return hsngSctyOffcBrrsCntcMail;
	}

	public void setHsngSctyOffcBrrsCntcMail(String hsngSctyOffcBrrsCntcMail) {
		this.hsngSctyOffcBrrsCntcMail = hsngSctyOffcBrrsCntcMail;
	}

	public Long getHsngSctyOffcBrrsCntcWtsp() {
		return hsngSctyOffcBrrsCntcWtsp;
	}

	public void setHsngSctyOffcBrrsCntcWtsp(Long hsngSctyOffcBrrsCntcWtsp) {
		this.hsngSctyOffcBrrsCntcWtsp = hsngSctyOffcBrrsCntcWtsp;
	}

}

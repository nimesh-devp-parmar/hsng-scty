/**
 * 
 */
package com.applix.hsngSctyRoot.modl;

import java.io.Serializable;

import com.applix.hsngSctyRoot.modl.cmps.HsngSctyOffcBrrsCmps;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

/**
 * 
 */

@Entity
@IdClass(HsngSctyOffcBrrsCmps.class)
@Table(name = "HSNG_SCTY_OFFC_BRRS")
public	class		HsngSctyOffcBrrs 
		implements	Serializable	{

	private static final long serialVersionUID = -7129831142562623796L;

	@Id
	@NotNull
	@Column(name="Hsng_Scty_Offc_Brrs_Regn_Nmbr")
	private	String	hsngSctyOffcBrrsRegnNmbr	=	null;

	@Id
	@NotNull
	@Column(name="Hsng_Scty_Offc_Brrs_Seqn_Nmbr")
	private	Integer	hsngSctyOffcBrrsSeqnNmbr	=	null;
	
	@Id
	@NotNull
	@Column(name="Hsng_Scty_Offc_Brrs_Titl")
    private	String	hsngSctyOffcBrrsTitl		=	null;
	
	@NotNull
	@Column(name="Hsng_Scty_Offc_Brrs_Name_Frst")
	private	String	hsngSctyOffcBrrsNameFrst	=	null;
	
	
	@NotNull
	@Column(name="Hsng_Scty_Offc_Brrs_Name_Midl")
	private	String	hsngSctyOffcBrrsNameMidl	=	null;
	
	@NotNull
	@Column(name="Hsng_Scty_Offc_Brrs_Name_Last")
	private	String	hsngSctyOffcBrrsNameLast	=	null;
	
	@NotNull
	@Column(name="Hsng_Scty_Offc_Brrs_Date_Strt")
	private	Long	hsngSctyOffcBrrsDateStrt	=	null;
	
	@Column(name="Hsng_Scty_Offc_Brrs_Date_Fnsh")
	private	Long	hsngSctyOffcBrrsDateFnsh	=	null;
	
	@Column(unique=true, name="Hsng_Scty_Offc_Brrs_Cntc_Nmbr")
	private	Long	hsngSctyOffcBrrsCntcNmbr	=	null;
	
	@Column(unique=true, name="Hsng_Scty_Offc_Brrs_Cntc_Mail")
	private	String	hsngSctyOffcBrrsCntcMail	=	null;
	
	@Column(unique=true, name="Hsng_Scty_Offc_Brrs_Cntc_Wtsp")
	private	Long	hsngSctyOffcBrrsCntcWtsp	=	null;

	public String getHsngSctyOffcBrrsTitl() {
		return hsngSctyOffcBrrsTitl;
	}

	public String getHsngSctyOffcBrrsRegnNmbr() {
		return hsngSctyOffcBrrsRegnNmbr;
	}

	public void setHsngSctyOffcBrrsRegnNmbr(String hsngSctyOffcBrrsRegnNmbr) {
		this.hsngSctyOffcBrrsRegnNmbr = hsngSctyOffcBrrsRegnNmbr;
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

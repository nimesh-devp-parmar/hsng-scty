/**
 * 
 */
package com.applix.hsngSctyRoot.modl;

import java.io.Serializable;

import com.applix.hsngSctyRoot.modl.cmps.HsngSctyFlrsCmps;

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
@IdClass(HsngSctyFlrsCmps.class)
@Table(name = "HSNG_SCTY_FLRS")
public	class		HsngSctyFlrs 
		implements	Serializable	{

	private static final long serialVersionUID = 2573736897691678710L;

	@Id
	@NotNull
	@Column(name="Hsng_Scty_Flrs_Regn_Nmbr")
	private	String	hsngSctyFlrsRegnNmbr	=	null;

	@Id
	@NotNull
	@Column(name="Hsng_Scty_Flrs_Sctn_Name")
	private	String	hsngSctyFlrsSctnName	=	null;

	@Id
	@NotNull
	@Column(name="Hsng_Scty_Flrs_Flor_Nmbr")
	private	Integer	hsngSctyFlrsFlorNmbr	=	null;

	public HsngSctyFlrs() {
		super();
	}

	public HsngSctyFlrs(@NotNull String hsngSctyFlrsRegnNmbr, @NotNull String hsngSctyFlrsSctnName,
			@NotNull Integer hsngSctyFlrsFlorNmbr) {
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

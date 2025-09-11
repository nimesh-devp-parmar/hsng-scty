/**
 * 
 */
package com.applix.hsngSctyRoot.modl;

import java.io.Serializable;

import com.applix.hsngSctyRoot.modl.cmps.HsngSctyApmtCmps;

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
@IdClass(HsngSctyApmtCmps.class)
@Table(name = "hsng_scty_apmt")
public	class		HsngSctyApmt 
		implements	Serializable	{

	private static final long serialVersionUID = -4591449653891855929L;

	@Id
	@NotNull
	@Column(name="Hsng_Scty_Apmt_Regn_Nmbr")
	private	String	hsngSctyApmtRegnNmbr	=	null;

	@Id
	@NotNull
	@Column(name="Hsng_Scty_Apmt_Sctn_Name")
	private	String	hsngSctyApmtSctnName	=	null;

	@Id
	@NotNull
	@Column(name="Hsng_Scty_Apmt_Flor_Nmbr")
	private	Integer	hsngSctyApmtFlorNmbr	=	null;

	@Id
	@NotNull
	@Column(name="Hsng_Scty_Apmt_Nmbr")
	private	Integer	hsngSctyApmtNmbr		=	null;

	@NotNull
	@Column(name="Hsng_Scty_Apmt_Size")
	private	Integer	hsngSctyApmtSize		=	null;

	@NotNull
	@Column(name="Hsng_Scty_Apmt_Size_Unit")
	private	String	hsngSctyApmtSizeUnit	=	null;

	public HsngSctyApmt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HsngSctyApmt(@NotNull String hsngSctyApmtRegnNmbr, @NotNull String hsngSctyApmtSctnName,
			@NotNull Integer hsngSctyApmtFlorNmbr, @NotNull Integer hsngSctyApmtNmbr, @NotNull Integer hsngSctyApmtSize,
			@NotNull String hsngSctyApmtSizeUnit) {
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

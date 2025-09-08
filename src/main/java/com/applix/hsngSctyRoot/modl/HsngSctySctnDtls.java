/**
 * 
 */
package com.applix.hsngSctyRoot.modl;

import java.io.Serializable;

import com.applix.hsngSctyRoot.modl.cmps.HsngSctySctnDtlsCmps;

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
@IdClass(HsngSctySctnDtlsCmps.class)
@Table(name = "HSNG_SCTY_SCTN_DTLS")
public	class		HsngSctySctnDtls 
		implements	Serializable	{

	private static final long serialVersionUID = -6713892628498645652L;

	@Id
	@NotNull
	@Column(name="Hsng_Scty_Sctn_Dtls_Regn_Nmbr")
	private	String	hsngSctySctnDtlsRegnNmbr	=	null;

	@Id
	@NotNull
	@Column(name="Hsng_Scty_Sctn_Dtls_Name")
	private	String	hsngSctySctnDtlsName		=	null;

	@NotNull
	@Column(name="Hsng_Scty_Sctn_Dtls_Flrs")
	private	Integer	hsngSctySctnDtlsFlrs		=	null;

	public HsngSctySctnDtls() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HsngSctySctnDtls(@NotNull String hsngSctySctnDtlsRegnNmbr, @NotNull String hsngSctySctnDtlsName,
			@NotNull Integer hsngSctySctnDtlsFlrs) {
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

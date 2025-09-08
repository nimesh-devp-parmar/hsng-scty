/**
 * 
 */
package com.applix.hsngSctyRoot.modl;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

/**
 * 
 */

@Entity
@Table(name = "HSNG_SCTY_SCTN")
public	class		HsngSctySctn 
		implements	Serializable	{

	private static final long serialVersionUID = -2868348650645243496L;

	@Id
	@NotNull
	@Column(name="Hsng_Scty_Sctn_Regn_Nmbr")
	private	String	hsngSctySctnRegnNmbr	=	null;

	@NotNull
	@Column(name="Hsng_Scty_Sctn_Totl")
	private	Integer	hsngSctySctnTotl		=	null;

	public HsngSctySctn() {
		super();
	}

	public HsngSctySctn(@NotNull String hsngSctySctnRegnNmbr, @NotNull Integer hsngSctySctnTotl) {
		super();
		this.hsngSctySctnRegnNmbr = hsngSctySctnRegnNmbr;
		this.hsngSctySctnTotl = hsngSctySctnTotl;
	}

	public String getHsngSctySctnRegnNmbr() {
		return hsngSctySctnRegnNmbr;
	}

	public void setHsngSctySctnRegnNmbr(String hsngSctySctnRegnNmbr) {
		this.hsngSctySctnRegnNmbr = hsngSctySctnRegnNmbr;
	}

	public Integer getHsngSctySctnTotl() {
		return hsngSctySctnTotl;
	}

	public void setHsngSctySctnTotl(Integer hsngSctySctnTotl) {
		this.hsngSctySctnTotl = hsngSctySctnTotl;
	}
	
}

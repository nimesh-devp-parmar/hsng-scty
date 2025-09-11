/**
 * 
 */
package com.applix.hsngSctyRoot.modl;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

/**
 * 
 */
@Entity
@Table(name = "hsng_scty_root")
public	class		HsngSctyRoot 
		implements	Serializable	{

	/**
	 * 
	 */
	
    private static final long serialVersionUID = -4615397557555892552L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="Hsng_Scty_Iden")
	private	UUID	hsngSctyIden		=	null;
	
	@NotNull
	@Column(name="Hsng_Scty_Name")
	private	String	hsngSctyName		=	null;
	
	@NotNull
	@Column(unique=true, name="Hsng_Scty_Regn_Nmbr")
	private	String	hsngSctyRegnNmbr	=	null;

	@NotNull
	@Column(name="Hsng_Scty_Regn_Date")
	private	Long	hsngSctyRegnDate	=	null;
	
	@NotNull
	@Column(name="Hsng_Scty_Addr_Strt")
	private	String	hsngSctyAddrStrt	=	null;

	@NotNull
	@Column(name="Hsng_Scty_Addr_Area")
	private	String	hsngSctyAddrArea	=	null;

	@NotNull
	@Column(name="Hsng_Scty_Addr_City")
	private	String	hsngSctyAddrCity	=	null;

	@NotNull
	@Column(name="Hsng_Scty_Addr_Stte")
	private	String	hsngSctyAddrStte	=	null;

	@NotNull
	@Column(name="Hsng_Scty_Addr_Ctry")
	private	String	hsngSctyAddrCtry	=	null;

	@NotNull
	@Column(name="Hsng_Scty_Addr_Pinc")
	private	String	hsngSctyAddrPINC	=	null;

	public HsngSctyRoot() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param hsngSctyIden
	 * @param hsngSctyName
	 * @param hsngSctyRegnNmbr
	 * @param hsngSctyRegnDate
	 * @param hsngSctyAddrStrt
	 * @param hsngSctyAddrArea
	 * @param hsngSctyAddrCity
	 * @param hsngSctyAddrStte
	 * @param hsngSctyAddrCtry
	 * @param hsngSctyAddrPINC
	 */
	public HsngSctyRoot	(
			UUID hsngSctyIden,
			@NotNull String hsngSctyName,
			@NotNull String hsngSctyRegnNmbr,
			@NotNull Long	hsngSctyRegnDate,
			@NotNull String hsngSctyAddrStrt,
			@NotNull String hsngSctyAddrArea,
			@NotNull String hsngSctyAddrCity,
			@NotNull String hsngSctyAddrStte,
			@NotNull String hsngSctyAddrCtry,
			@NotNull String hsngSctyAddrPINC
		) {
		super();
		this.hsngSctyIden		=	hsngSctyIden;
		this.hsngSctyName		=	hsngSctyName;
		this.hsngSctyRegnNmbr	=	hsngSctyRegnNmbr;
		this.hsngSctyRegnDate	=	hsngSctyRegnDate;
		this.hsngSctyAddrStrt	=	hsngSctyAddrStrt;
		this.hsngSctyAddrArea	=	hsngSctyAddrArea;
		this.hsngSctyAddrCity	=	hsngSctyAddrCity;
		this.hsngSctyAddrStte	=	hsngSctyAddrStte;
		this.hsngSctyAddrCtry	=	hsngSctyAddrCtry;
		this.hsngSctyAddrPINC	=	hsngSctyAddrPINC;
	}

	public UUID getHsngSctyIden() {
		return hsngSctyIden;
	}

	public void setHsngSctyIden(UUID hsngSctyIden) {
		this.hsngSctyIden = hsngSctyIden;
	}

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

package com.applix.hsngSctyRoot.dtxo;

public class HsngSctyApmtRespDTXO {

	private	String	hsngSctyApmtRegnNmbr	=	null;
	private	String	hsngSctyApmtSctnName	=	null;
	private	Integer	hsngSctyApmtFlorNmbr	=	null;
	private	Integer	hsngSctyApmtNmbr		=	null;
	private	Integer	hsngSctyApmtSize		=	null;
	private	String	hsngSctyApmtSizeUnit	=	null;
	
	public HsngSctyApmtRespDTXO() {
		super();
	}

	public HsngSctyApmtRespDTXO(String hsngSctyApmtRegnNmbr, String hsngSctyApmtSctnName, Integer hsngSctyApmtFlorNmbr,
			Integer hsngSctyApmtNmbr, Integer hsngSctyApmtSize, String hsngSctyApmtSizeUnit) {
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

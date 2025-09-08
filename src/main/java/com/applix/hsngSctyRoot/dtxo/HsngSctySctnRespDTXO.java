package com.applix.hsngSctyRoot.dtxo;

public class HsngSctySctnRespDTXO {

	private	String	hsngSctySctnRegnNmbr	=	null;
	private	Integer	hsngSctySctnTotl		=	null;
	
	public HsngSctySctnRespDTXO() {
		super();
	}

	public HsngSctySctnRespDTXO(String hsngSctySctnRegnNmbr, Integer hsngSctySctnTotl) {
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

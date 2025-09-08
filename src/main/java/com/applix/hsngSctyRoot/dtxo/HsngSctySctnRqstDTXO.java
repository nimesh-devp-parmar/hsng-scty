package com.applix.hsngSctyRoot.dtxo;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class HsngSctySctnRqstDTXO {

	@NotNull(message="Housing Society Registration Number cannot be empty")
	@NotBlank(message="Housing Society Registration Number cannot be empty")
	private	String	hsngSctySctnRegnNmbr	=	null;

	@NotNull(message="Housing Society number of scetions cannot be empty")
	@Positive
	@Min(value=0)
	private	Integer	hsngSctySctnTotl		=	null;

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

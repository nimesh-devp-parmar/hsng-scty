package com.applix.hsngSctyRoot.modl.cmps;

import java.io.Serializable;
import java.util.Objects;

public	class		HsngSctyApmtCmps
		implements	Serializable	{
	
	private static final long serialVersionUID = -4185955739547417043L;
	
	private	String	hsngSctyApmtRegnNmbr;
    private	String	hsngSctyApmtSctnName;
    private	Integer	hsngSctyApmtFlorNmbr;
    private	Integer	hsngSctyApmtNmbr;
    
	public HsngSctyApmtCmps() {
		super();
	}

	public HsngSctyApmtCmps(String hsngSctyApmtRegnNmbr, String hsngSctyApmtSctnName, Integer hsngSctyApmtFlorNmbr,
			Integer hsngSctyApmtNmbr) {
		super();
		this.hsngSctyApmtRegnNmbr = hsngSctyApmtRegnNmbr;
		this.hsngSctyApmtSctnName = hsngSctyApmtSctnName;
		this.hsngSctyApmtFlorNmbr = hsngSctyApmtFlorNmbr;
		this.hsngSctyApmtNmbr = hsngSctyApmtNmbr;
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

	@Override
    public boolean equals(Object o) {
			
		boolean 			mtch					=	false;
		HsngSctyApmtCmps	parmHsngSctyAptsCmps	=	null;
		
		if(o instanceof HsngSctyApmtCmps)	{
			parmHsngSctyAptsCmps	=	(HsngSctyApmtCmps)o;
			if	(
				(parmHsngSctyAptsCmps.hsngSctyApmtRegnNmbr.equals(this.hsngSctyApmtRegnNmbr))	&&
				(parmHsngSctyAptsCmps.hsngSctyApmtSctnName.equals(this.hsngSctyApmtSctnName))	&&
				(parmHsngSctyAptsCmps.hsngSctyApmtFlorNmbr.intValue() == this.hsngSctyApmtFlorNmbr.intValue())	&&
				(parmHsngSctyAptsCmps.hsngSctyApmtNmbr.intValue() == this.hsngSctyApmtNmbr.intValue())
			)	{
				mtch	=	true;
			}
		}
		return mtch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hsngSctyApmtRegnNmbr, hsngSctyApmtSctnName, hsngSctyApmtFlorNmbr, hsngSctyApmtNmbr);
    }
 }

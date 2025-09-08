package com.applix.hsngSctyRoot.modl.cmps;

import java.io.Serializable;
import java.util.Objects;

public	class		HsngSctySctnDtlsCmps
		implements	Serializable	{
	
	private static final long serialVersionUID = 7939333895788133824L;
	private	String	hsngSctySctnDtlsRegnNmbr;
    private	String	hsngSctySctnDtlsName;
    
	public HsngSctySctnDtlsCmps() {
		super();
	}

	public HsngSctySctnDtlsCmps(String hsngSctySctnDtlsRegnNmbr, String hsngSctySctnDtlsName) {
		super();
		this.hsngSctySctnDtlsRegnNmbr = hsngSctySctnDtlsRegnNmbr;
		this.hsngSctySctnDtlsName = hsngSctySctnDtlsName;
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

	@Override
    public boolean equals(Object o) {
			
		boolean 				mtch						=	false;
		HsngSctySctnDtlsCmps	parmHsngSctySctnDtlsCmps	=	null;
		
		if(o instanceof HsngSctySctnDtlsCmps)	{
			parmHsngSctySctnDtlsCmps	=	(HsngSctySctnDtlsCmps)o;
			if	(
				(parmHsngSctySctnDtlsCmps.hsngSctySctnDtlsRegnNmbr.equals(this.hsngSctySctnDtlsRegnNmbr))	&&
				(parmHsngSctySctnDtlsCmps.hsngSctySctnDtlsName.equals(this.hsngSctySctnDtlsName))
			)	{
				mtch	=	true;
			}
		}
		return mtch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hsngSctySctnDtlsRegnNmbr, hsngSctySctnDtlsName);
    }}

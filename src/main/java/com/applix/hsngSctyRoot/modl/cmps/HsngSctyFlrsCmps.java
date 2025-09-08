package com.applix.hsngSctyRoot.modl.cmps;

import java.io.Serializable;
import java.util.Objects;

public	class		HsngSctyFlrsCmps
		implements	Serializable	{
	
	private static final long serialVersionUID = -46086173228153042L;
	
	private	String	hsngSctyFlrsRegnNmbr;
    private	String	hsngSctyFlrsSctnName;
    private	Integer	hsngSctyFlrsFlorNmbr;
    
	public HsngSctyFlrsCmps() {
		super();
	}

	public HsngSctyFlrsCmps(String hsngSctyFlrsRegnNmbr, String hsngSctyFlrsSctnName, Integer hsngSctyFlrsFlorNmbr) {
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

	@Override
    public boolean equals(Object o) {
			
		boolean 			mtch					=	false;
		HsngSctyFlrsCmps	parmHsngSctyFlrsCmps	=	null;
		
		if(o instanceof HsngSctyFlrsCmps)	{
			parmHsngSctyFlrsCmps	=	(HsngSctyFlrsCmps)o;
			if	(
				(parmHsngSctyFlrsCmps.hsngSctyFlrsRegnNmbr.equals(this.hsngSctyFlrsRegnNmbr))	&&
				(parmHsngSctyFlrsCmps.hsngSctyFlrsSctnName.equals(this.hsngSctyFlrsSctnName))	&&
				parmHsngSctyFlrsCmps.hsngSctyFlrsFlorNmbr.intValue() == this.hsngSctyFlrsFlorNmbr.intValue()
			)	{
				mtch	=	true;
			}
		}
		return mtch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hsngSctyFlrsRegnNmbr, hsngSctyFlrsSctnName, hsngSctyFlrsFlorNmbr);
    }}

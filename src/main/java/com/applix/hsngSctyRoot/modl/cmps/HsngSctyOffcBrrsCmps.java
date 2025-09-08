package com.applix.hsngSctyRoot.modl.cmps;

import java.io.Serializable;
import java.util.Objects;

public	class		HsngSctyOffcBrrsCmps
		implements	Serializable	{
	
	private static final long serialVersionUID = -46086173228153042L;
	
	private	String	hsngSctyOffcBrrsRegnNmbr;
    private	Integer	hsngSctyOffcBrrsSeqnNmbr;
    private	String	hsngSctyOffcBrrsTitl;
    
	public HsngSctyOffcBrrsCmps() {
		super();
	}

	public HsngSctyOffcBrrsCmps(String hsngSctyOffcBrrsRegnNmbr, Integer hsngSctyOffcBrrsSeqnNmbr,
			String hsngSctyOffcBrrsTitl) {
		super();
		this.hsngSctyOffcBrrsRegnNmbr = hsngSctyOffcBrrsRegnNmbr;
		this.hsngSctyOffcBrrsSeqnNmbr = hsngSctyOffcBrrsSeqnNmbr;
		this.hsngSctyOffcBrrsTitl = hsngSctyOffcBrrsTitl;
	}

	public String getHsngSctyOffcBrrsRegnNmbr() {
		return hsngSctyOffcBrrsRegnNmbr;
	}

	public void setHsngSctyOffcBrrsRegnNmbr(String hsngSctyOffcBrrsRegnNmbr) {
		this.hsngSctyOffcBrrsRegnNmbr = hsngSctyOffcBrrsRegnNmbr;
	}

	public Integer getHsngSctyOffcBrrsSeqnNmbr() {
		return hsngSctyOffcBrrsSeqnNmbr;
	}

	public void setHsngSctyOffcBrrsSeqnNmbr(Integer hsngSctyOffcBrrsSeqnNmbr) {
		this.hsngSctyOffcBrrsSeqnNmbr = hsngSctyOffcBrrsSeqnNmbr;
	}

	public String getHsngSctyOffcBrrsTitl() {
		return hsngSctyOffcBrrsTitl;
	}

	public void setHsngSctyOffcBrrsTitl(String hsngSctyOffcBrrsTitl) {
		this.hsngSctyOffcBrrsTitl = hsngSctyOffcBrrsTitl;
	}

	@Override
    public boolean equals(Object o) {
			
		boolean 				mtch						=	false;
		HsngSctyOffcBrrsCmps	parmHsngSctyOffcBrrsCmps	=	null;
		
		if(o instanceof HsngSctyOffcBrrsCmps)	{
			parmHsngSctyOffcBrrsCmps	=	(HsngSctyOffcBrrsCmps)o;
			if	(
				(parmHsngSctyOffcBrrsCmps.hsngSctyOffcBrrsRegnNmbr.equals(this.hsngSctyOffcBrrsRegnNmbr))					&&
				(parmHsngSctyOffcBrrsCmps.hsngSctyOffcBrrsSeqnNmbr.intValue() == this.hsngSctyOffcBrrsSeqnNmbr.intValue())	&&
				parmHsngSctyOffcBrrsCmps.hsngSctyOffcBrrsTitl.equals(this.hsngSctyOffcBrrsTitl)
			)	{
				mtch	=	true;
			}
		}
		return mtch;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hsngSctyOffcBrrsRegnNmbr, hsngSctyOffcBrrsSeqnNmbr, hsngSctyOffcBrrsTitl);
    }}

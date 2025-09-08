package com.applix.hsngSctyRoot.repo;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applix.hsngSctyRoot.modl.HsngSctyRoot;

@Repository
public interface IHsngSctyRootRepo extends JpaRepository<HsngSctyRoot, UUID> {
	
	List<HsngSctyRoot>	findByHsngSctyNameLike(String hsngSctyName);
	List<HsngSctyRoot>	findByHsngSctyNameStartsWith(String parmHsngSctyNameStrt);
	List<HsngSctyRoot>	findByHsngSctyNameEndsWith(String parmHsngSctyNameEnds);
	
	boolean	existsByHsngSctyRegnNmbr(String parmHsngSctyRegnNmbr);
	List<HsngSctyRoot>	findByHsngSctyRegnNmbrLike(String parmHsngSctyRegnNmbrPrtl);
	List<HsngSctyRoot>	findByHsngSctyRegnNmbrStartsWith(String parmHsngSctyRegnNmbrStrt);
	List<HsngSctyRoot>	findByHsngSctyRegnNmbrEndsWith(String parmHsngSctyRegnNmbrEnds);
	
	List<HsngSctyRoot>	findByHsngSctyAddrStrtLike(String parmHsngSctyAddrStrtPrtl);
	List<HsngSctyRoot>	findByHsngSctyAddrStrtStartsWith(String parmHsngSctyAddrStrtStrt);
	List<HsngSctyRoot>	findByHsngSctyAddrStrtEndsWith(String parmHsngSctyAddrStrtEnds);
	
	List<HsngSctyRoot>	findByHsngSctyAddrArea(String parmHsngSctyAddrArea);

	List<HsngSctyRoot>	findByHsngSctyAddrCity(String parmHsngSctyAddrCity);
	
	List<HsngSctyRoot>	findByHsngSctyAddrStte(String parmHsngSctyAddrStte);

	List<HsngSctyRoot>	findByHsngSctyAddrCtry(String parmHsngSctyAddrCtry);
	
	List<HsngSctyRoot>	findByHsngSctyAddrPINC(String parmHsngSctyAddrPINC);
}

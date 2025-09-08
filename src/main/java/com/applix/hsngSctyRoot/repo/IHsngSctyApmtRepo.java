package com.applix.hsngSctyRoot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applix.hsngSctyRoot.modl.HsngSctyApmt;
import com.applix.hsngSctyRoot.modl.cmps.HsngSctyApmtCmps;

@Repository
public interface IHsngSctyApmtRepo extends JpaRepository<HsngSctyApmt, HsngSctyApmtCmps> {
	List<HsngSctyApmt> findByHsngSctyApmtRegnNmbrAndHsngSctyApmtSctnName(String parmHsngSctyRegnNmbr, String parmHsngSctySctnName);
	List<HsngSctyApmt> findByHsngSctyApmtRegnNmbrAndHsngSctyApmtSctnNameAndHsngSctyApmtFlorNmbr(String parmHsngSctyRegnNmbr, String parmHsngSctySctnName, Integer parmHsngSctyFlorNmbr);
	List<HsngSctyApmt> findByHsngSctyApmtRegnNmbrAndHsngSctyApmtSctnNameAndHsngSctyApmtFlorNmbrAndHsngSctyApmtNmbr(String parmHsngSctyRegnNmbr, String parmHsngSctySctnName, Integer parmHsngSctyFlorNmbr, Integer parmHsngSctyApmtNmbr);
	List<HsngSctyApmt> findByHsngSctyApmtSize(Integer parmHsngSctyApmtSize);
}

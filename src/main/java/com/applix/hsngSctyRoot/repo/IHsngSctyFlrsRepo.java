package com.applix.hsngSctyRoot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applix.hsngSctyRoot.modl.HsngSctyFlrs;
import com.applix.hsngSctyRoot.modl.cmps.HsngSctyFlrsCmps;

@Repository
public interface IHsngSctyFlrsRepo extends JpaRepository<HsngSctyFlrs, HsngSctyFlrsCmps> {
	List<HsngSctyFlrs> findByHsngSctyFlrsRegnNmbrAndHsngSctyFlrsSctnName(String parmHsngSctyRegnNmbr, String parmHsngSctySctnName);
}

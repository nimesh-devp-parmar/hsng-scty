package com.applix.hsngSctyRoot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applix.hsngSctyRoot.modl.HsngSctySctnDtls;
import com.applix.hsngSctyRoot.modl.cmps.HsngSctySctnDtlsCmps;

@Repository
public interface IHsngSctySctnDtlsRepo extends JpaRepository<HsngSctySctnDtls, HsngSctySctnDtlsCmps> {
}

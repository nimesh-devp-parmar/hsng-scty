package com.applix.hsngSctyRoot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applix.hsngSctyRoot.modl.HsngSctyOffcBrrs;
import com.applix.hsngSctyRoot.modl.cmps.HsngSctyOffcBrrsCmps;

@Repository
public interface IHsngSctyOffcBrrsRepo extends JpaRepository<HsngSctyOffcBrrs, HsngSctyOffcBrrsCmps> {
}

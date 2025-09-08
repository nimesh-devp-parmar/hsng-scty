package com.applix.hsngSctyRoot.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applix.hsngSctyRoot.modl.HsngSctyRoot;

@Repository
public interface IHsngSctyRootRepo extends JpaRepository<HsngSctyRoot, UUID> {
	boolean	existsByHsngSctyRegnNmbr(String parmHsngSctyRegnNmbr);
}

package com.applix.hsngSctyRoot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.applix.hsngSctyRoot.modl.HsngSctySctn;

@Repository
public interface IHsngSctySctnRepo extends JpaRepository<HsngSctySctn, String> {
}

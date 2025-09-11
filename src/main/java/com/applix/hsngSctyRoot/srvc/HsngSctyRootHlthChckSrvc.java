package com.applix.hsngSctyRoot.srvc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.applix.hsngSctyRoot.dtxo.HsngSctyApmtRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyFlrsRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyOffcBrrsRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyRootRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctySctnDtlsRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctySctnRespDTXO;
import com.applix.hsngSctyRoot.modl.HsngSctyApmt;
import com.applix.hsngSctyRoot.modl.HsngSctyFlrs;
import com.applix.hsngSctyRoot.modl.HsngSctyOffcBrrs;
import com.applix.hsngSctyRoot.modl.HsngSctyRoot;
import com.applix.hsngSctyRoot.modl.HsngSctySctn;
import com.applix.hsngSctyRoot.modl.HsngSctySctnDtls;
import com.applix.hsngSctyRoot.mppr.HsngSctyApmtMppr;
import com.applix.hsngSctyRoot.mppr.HsngSctyFlrsMppr;
import com.applix.hsngSctyRoot.mppr.HsngSctyOffcBrrsMppr;
import com.applix.hsngSctyRoot.mppr.HsngSctyRootMppr;
import com.applix.hsngSctyRoot.mppr.HsngSctySctnDtlsMppr;
import com.applix.hsngSctyRoot.mppr.HsngSctySctnMppr;
import com.applix.hsngSctyRoot.repo.IHsngSctyApmtRepo;
import com.applix.hsngSctyRoot.repo.IHsngSctyFlrsRepo;
import com.applix.hsngSctyRoot.repo.IHsngSctyOffcBrrsRepo;
import com.applix.hsngSctyRoot.repo.IHsngSctyRootRepo;
import com.applix.hsngSctyRoot.repo.IHsngSctySctnDtlsRepo;
import com.applix.hsngSctyRoot.repo.IHsngSctySctnRepo;
import com.google.gson.Gson;

@Service
public class HsngSctyRootHlthChckSrvc {

    private static final Logger log = LoggerFactory.getLogger(HsngSctyRootHlthChckSrvc.class);

    private	IHsngSctyRootRepo		hsngSctyRootRepo		=	null;
	private	IHsngSctyOffcBrrsRepo	hsngSctyOffcBrrsRepo	=	null;
	private	IHsngSctySctnRepo		hsngSctySctnRepo		=	null;
	private	IHsngSctySctnDtlsRepo	hsngSctySctnDtlsRepo	=	null;
	private	IHsngSctyFlrsRepo		hsngSctyFlrsRepo		=	null;
	private	IHsngSctyApmtRepo		hsngSctyApmtRepo		=	null;
	
	public HsngSctyRootHlthChckSrvc	(
		IHsngSctyRootRepo parmHsngSctyRootRepo,
		IHsngSctyOffcBrrsRepo parmHsngSctyOffcBrrsRepo,
		IHsngSctySctnRepo parmHsngSctySctnRepo,
		IHsngSctySctnDtlsRepo parmHsngSctySctnDtlsRepo,
		IHsngSctyFlrsRepo parmHsngSctyFlrsRepo,
		IHsngSctyApmtRepo parmHsngSctyApmtRepo
	) {
		this.hsngSctyRootRepo		=	parmHsngSctyRootRepo;
		this.hsngSctyOffcBrrsRepo	=	parmHsngSctyOffcBrrsRepo;
		this.hsngSctySctnRepo		=	parmHsngSctySctnRepo;
		this.hsngSctySctnDtlsRepo	=	parmHsngSctySctnDtlsRepo;
		this.hsngSctyFlrsRepo		=	parmHsngSctyFlrsRepo;
		this.hsngSctyApmtRepo		=	parmHsngSctyApmtRepo;
	}
	
	public	Map<String, Integer> getHsngSctyHlthChckStts()	{
		
		List<HsngSctyRootRespDTXO>			listRootRespDTXO		=	null;
		List<HsngSctyOffcBrrsRespDTXO>		listOffcBrrsRespDTXO	=	null;
		List<HsngSctySctnRespDTXO>			listSctnRespDTXO		=	null;
		List<HsngSctySctnDtlsRespDTXO>		listSctnDtlsRespDTXO	=	null;
		List<HsngSctyFlrsRespDTXO>			listFlrsRespDTXO		=	null;
		List<HsngSctyApmtRespDTXO>			listApmtRespDTXO		=	null;
		Map<String, Integer>				mappRootTablXNmbrRecs	=	null;
		
		mappRootTablXNmbrRecs	=	new HashMap<String, Integer>();
		
		listRootRespDTXO		=	getHsngSctyRootRepo();
		if(null!=listRootRespDTXO && !(listRootRespDTXO.isEmpty()) && listRootRespDTXO.size()>0)	{
			mappRootTablXNmbrRecs.put(HsngSctyRoot.class.getName(), listRootRespDTXO.size());
			log.info("listRootRespDTXO: " + new Gson().toJson(listRootRespDTXO) + ", listRootRespDTXO.size: " + listRootRespDTXO.size());
		}

		listOffcBrrsRespDTXO	=	getHsngSctyOffcBrrsRepo();
		if(null!=listOffcBrrsRespDTXO && !(listOffcBrrsRespDTXO.isEmpty()) && listOffcBrrsRespDTXO.size()>0)	{
			mappRootTablXNmbrRecs.put(HsngSctyOffcBrrs.class.getName(), listOffcBrrsRespDTXO.size());
			log.info("listOffcBrrsRespDTXO: " + new Gson().toJson(listOffcBrrsRespDTXO) + ", listOffcBrrsRespDTXO.size: " + listOffcBrrsRespDTXO.size());
		}

		listSctnRespDTXO		=	getHsngSctySctnRepo();
		if(null!=listSctnRespDTXO && !(listSctnRespDTXO.isEmpty()) && listSctnRespDTXO.size()>0)	{
			mappRootTablXNmbrRecs.put(HsngSctySctn.class.getName(), listSctnRespDTXO.size());
			log.info("listSctnRespDTXO: " + new Gson().toJson(listSctnRespDTXO) + ", listSctnRespDTXO.size: " + listSctnRespDTXO.size());
		}

		listSctnDtlsRespDTXO	=	getHsngSctySctnDtlsRepo();
		if(null!=listSctnDtlsRespDTXO && !(listSctnDtlsRespDTXO.isEmpty()) && listSctnDtlsRespDTXO.size()>0)	{
			mappRootTablXNmbrRecs.put(HsngSctySctnDtls.class.getName(), listSctnDtlsRespDTXO.size());
			log.info("listSctnDtlsRespDTXO: " + new Gson().toJson(listSctnDtlsRespDTXO) + ", listSctnDtlsRespDTXO.size: " + listSctnDtlsRespDTXO.size());
		}
		
		listFlrsRespDTXO		=	getHsngSctyFlrsRepo();
		if(null!=listFlrsRespDTXO && !(listFlrsRespDTXO.isEmpty()) && listFlrsRespDTXO.size()>0)	{
			mappRootTablXNmbrRecs.put(HsngSctyFlrs.class.getName(), listFlrsRespDTXO.size());
			log.info("listFlrsRespDTXO: " + new Gson().toJson(listFlrsRespDTXO) + ", listFlrsRespDTXO.size: " + listFlrsRespDTXO.size());
		}

		listApmtRespDTXO		=	getHsngSctyApmtRepo();
		if(null!=listApmtRespDTXO && !(listApmtRespDTXO.isEmpty()) && listApmtRespDTXO.size()>0)	{
			mappRootTablXNmbrRecs.put(HsngSctyApmt.class.getName(), listApmtRespDTXO.size());
			log.info("listApmtRespDTXO: " + new Gson().toJson(listApmtRespDTXO) + ", listApmtRespDTXO.size: " + listApmtRespDTXO.size());
		}

		log.info("mappRootTablXNmbrRecs: " + new Gson().toJson(mappRootTablXNmbrRecs));
		return mappRootTablXNmbrRecs;
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyRootRepo()	{
		
		return	hsngSctyRootRepo
				.findAll()
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}

	public	List<HsngSctyOffcBrrsRespDTXO> getHsngSctyOffcBrrsRepo()	{
		
		return	hsngSctyOffcBrrsRepo
				.findAll()
				.stream()
				.map(HsngSctyOffcBrrsMppr::toDTXO)
				.toList();
	}

	public	List<HsngSctySctnRespDTXO> getHsngSctySctnRepo()	{
		
		return	hsngSctySctnRepo
				.findAll()
				.stream()
				.map(HsngSctySctnMppr::toDTXO)
				.toList();
	}

	public	List<HsngSctySctnDtlsRespDTXO> getHsngSctySctnDtlsRepo()	{
		
		return	hsngSctySctnDtlsRepo
				.findAll()
				.stream()
				.map(HsngSctySctnDtlsMppr::toDTXO)
				.toList();
	}

	public	List<HsngSctyFlrsRespDTXO> getHsngSctyFlrsRepo()	{
		
		return	hsngSctyFlrsRepo
				.findAll()
				.stream()
				.map(HsngSctyFlrsMppr::toDTXO)
				.toList();
	}

	public	List<HsngSctyApmtRespDTXO> getHsngSctyApmtRepo()	{
		
		return	hsngSctyApmtRepo
				.findAll()
				.stream()
				.map(HsngSctyApmtMppr::toDTXO)
				.toList();
	}
}

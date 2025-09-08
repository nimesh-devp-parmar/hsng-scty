package com.applix.hsngSctyRoot.srvc;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.applix.hsngSctyRoot.dtxo.HsngSctyRootRespDTXO;
import com.applix.hsngSctyRoot.dtxo.HsngSctyRootRqstDTXO;
import com.applix.hsngSctyRoot.excp.CantDletHsngSctyRootChldExstExcp;
import com.applix.hsngSctyRoot.excp.HsngSctyRegnNmbrAlreadyExistsException;
import com.applix.hsngSctyRoot.excp.HsngSctyRootRegnDateFutrExcp;
import com.applix.hsngSctyRoot.modl.HsngSctyOffcBrrs;
import com.applix.hsngSctyRoot.modl.HsngSctyRoot;
import com.applix.hsngSctyRoot.mppr.HsngSctyRootMppr;
import com.applix.hsngSctyRoot.repo.IHsngSctyRootRepo;
import com.applix.hsngSctyRoot.util.DateUtil;

@Service
public class HsngSctyRootSrvc {

	private	IHsngSctyRootRepo	hsngSctyRootRepo	=	null;
	
	public HsngSctyRootSrvc(IHsngSctyRootRepo parmHsngSctyRootRepo) {
		this.hsngSctyRootRepo	=	parmHsngSctyRootRepo;
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyRoot()	{
		
		return	hsngSctyRootRepo
				.findAll()
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public HsngSctyRootRespDTXO	createHsngSctyRoot(HsngSctyRootRqstDTXO parmHsngSctyRqstDTXO)	{
		if(hsngSctyRootRepo.existsByHsngSctyRegnNmbr(parmHsngSctyRqstDTXO.getHsngSctyRegnNmbr()))	{
			throw new HsngSctyRegnNmbrAlreadyExistsException("A housing society with this registration number already exists: " + parmHsngSctyRqstDTXO.getHsngSctyRegnNmbr());
		}
		HsngSctyRoot	hsngSctyRoot	=	hsngSctyRootRepo.save(HsngSctyRootMppr.fromDTXO(parmHsngSctyRqstDTXO));
		return HsngSctyRootMppr.toDTXO(hsngSctyRoot);
	}

	public	List<HsngSctyRootRespDTXO> getHsngSctyNameLike(String parmHsngSctyNamePrtl)	{
		return	hsngSctyRootRepo
				.findByHsngSctyNameLike(parmHsngSctyNamePrtl)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyNameStartsWith(String parmHsngSctyNameStrt)	{
		return	hsngSctyRootRepo
				.findByHsngSctyNameStartsWith(parmHsngSctyNameStrt)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyNameEndsWith(String parmHsngSctyNameEnds)	{
		return	hsngSctyRootRepo
				.findByHsngSctyNameEndsWith(parmHsngSctyNameEnds)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyRegnNmbrLike(String parmHsngSctyRegnNmbrPrtl)	{
		return	hsngSctyRootRepo
				.findByHsngSctyRegnNmbrLike(parmHsngSctyRegnNmbrPrtl)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyRegnNmbrStartsWith(String parmHsngSctyRegnNmbrStrt)	{
		return	hsngSctyRootRepo
				.findByHsngSctyRegnNmbrStartsWith(parmHsngSctyRegnNmbrStrt)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyRegnNmbrEndsWith(String parmHsngSctyRegnNmbrEnds)	{
		return	hsngSctyRootRepo
				.findByHsngSctyRegnNmbrEndsWith(parmHsngSctyRegnNmbrEnds)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyAddrStrtLike(String parmHsngSctyAddrStrtPrtl)	{
		return	hsngSctyRootRepo
				.findByHsngSctyAddrStrtLike(parmHsngSctyAddrStrtPrtl)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyAddrStrtStartsWith(String parmHsngSctyAddrStrtStrt)	{
		return	hsngSctyRootRepo
				.findByHsngSctyAddrStrtStartsWith(parmHsngSctyAddrStrtStrt)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyAddrStrtEndsWith(String parmHsngSctyAddrStrtEnds)	{
		return	hsngSctyRootRepo
				.findByHsngSctyAddrStrtEndsWith(parmHsngSctyAddrStrtEnds)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyByAddrArea(String parmHsngSctyAddrArea)	{
		return	hsngSctyRootRepo
				.findByHsngSctyAddrArea(parmHsngSctyAddrArea)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyByAddrCity(String parmHsngSctyAddrCity)	{
		return	hsngSctyRootRepo
				.findByHsngSctyAddrCity(parmHsngSctyAddrCity)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyByAddrStte(String parmHsngSctyAddrStte)	{
		return	hsngSctyRootRepo
				.findByHsngSctyAddrStte(parmHsngSctyAddrStte)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyByAddrCtry(String parmHsngSctyAddrCtry)	{
		return	hsngSctyRootRepo
				.findByHsngSctyAddrCtry(parmHsngSctyAddrCtry)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public	List<HsngSctyRootRespDTXO> getHsngSctyByAddrPINC(String parmHsngSctyAddrPINC)	{
		return	hsngSctyRootRepo
				.findByHsngSctyAddrPINC(parmHsngSctyAddrPINC)
				.stream()
				.map(HsngSctyRootMppr::toDTXO)
				.toList();
	}
	
	public HsngSctyRootRespDTXO updtHsngSctyRoot(UUID hsngSctyIden, HsngSctyRootRqstDTXO hsngSctyRootRqstDTXO) {

		HsngSctyRoot			hsngSctyRootOrig	=	null;
		HsngSctyRoot			hsngSctyRootUpdd	=	null;
		long					tdaySofD			=	0L;
		Optional<HsngSctyRoot>	optn				=	null;

		tdaySofD	=	LocalDate.now(ZoneId.systemDefault()).atStartOfDay().toInstant(ZoneOffset.ofHours(0)).toEpochMilli();
		optn		=	hsngSctyRootRepo.findById(hsngSctyIden);
		
		if(optn.isPresent())	{
			hsngSctyRootOrig	=	optn.get();
			
			if(hsngSctyRootOrig.getHsngSctyRegnDate().longValue() == hsngSctyRootRqstDTXO.getHsngSctyRegnDate().longValue())	{
			}
			else if(hsngSctyRootRqstDTXO.getHsngSctyRegnDate().longValue() > tdaySofD)	{
				throw new HsngSctyRootRegnDateFutrExcp("Society Registration date: " + DateUtil.cnvtDateFromMilsToStrn(hsngSctyRootRqstDTXO.getHsngSctyRegnDate().longValue()) + " cannot be a future date");
			}
			else	{
				hsngSctyRootOrig.setHsngSctyRegnDate(hsngSctyRootRqstDTXO.getHsngSctyRegnDate());
			}
			
			hsngSctyRootOrig.setHsngSctyName(hsngSctyRootRqstDTXO.getHsngSctyName());
			hsngSctyRootOrig.setHsngSctyAddrStrt(hsngSctyRootRqstDTXO.getHsngSctyAddrStrt());
			hsngSctyRootOrig.setHsngSctyAddrArea(hsngSctyRootRqstDTXO.getHsngSctyAddrArea());
			hsngSctyRootOrig.setHsngSctyAddrCity(hsngSctyRootRqstDTXO.getHsngSctyAddrCity());
			hsngSctyRootOrig.setHsngSctyAddrStte(hsngSctyRootRqstDTXO.getHsngSctyAddrStte());
			hsngSctyRootOrig.setHsngSctyAddrCtry(hsngSctyRootRqstDTXO.getHsngSctyAddrCtry());
			hsngSctyRootOrig.setHsngSctyAddrPINC(hsngSctyRootRqstDTXO.getHsngSctyAddrPINC());
			hsngSctyRootUpdd	=	hsngSctyRootRepo.save(hsngSctyRootOrig);
		}
		return HsngSctyRootMppr.toDTXO(hsngSctyRootUpdd);
	}
	
	public void dletHsngSctyRoot(UUID parmUUID)	{
		HsngSctyRoot			hsngSctyRoot	=	null;
		Optional<HsngSctyRoot>	optn			=	null;
		
		optn	=	hsngSctyRootRepo.findById(parmUUID);
		if(optn.isPresent())	{
			hsngSctyRoot	=	optn.get();
			try	{
				hsngSctyRootRepo.deleteById(parmUUID);
			}
			catch(DataIntegrityViolationException dive)	{
				throw new CantDletHsngSctyRootChldExstExcp("Cannot delete Housing Society: " + hsngSctyRoot.getHsngSctyName() + " because there is other data in the system that is related to this Housing Society");
			}
		}
	}
}

package com.applix.hsngSctyRoot.excp;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlblExcpHdlr {

	private	static	final	Logger	log	=	LoggerFactory.getLogger(GlblExcpHdlr.class);
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public	ResponseEntity<Map<String, String>> hndlVldnExcp(MethodArgumentNotValidException ex)	{
		Map<String, String>	mappExcp	=	new HashMap<String, String>();
		ex.getBindingResult().getFieldErrors().forEach(excp -> mappExcp.put(excp.getField(), excp.getDefaultMessage()));
		return ResponseEntity.badRequest().body(mappExcp);
	}
	
	@ExceptionHandler(HsngSctyRegnNmbrAlreadyExistsException.class)
	public	ResponseEntity<Map<String, String>> HsngSctyRegnNmbrAlreadyExistsExcp(MethodArgumentNotValidException ex)	{
		
		log.warn("A Housing Society with this registration number: {} already exists", ex.getMessage());
		
		Map<String, String>	mappExcp	=	new HashMap<String, String>();
		mappExcp.put("message", "A Housing Society with the given registration number already exists");
		return ResponseEntity.badRequest().body(mappExcp);
	}
	
}

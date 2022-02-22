package com.matheusalves.cursomc.services.exceptions;

public class ObjNotFoundsException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ObjNotFoundsException(String msg) {
		super(msg);
	}
	
	public ObjNotFoundsException(String msg, Throwable cause) {
		super(msg,cause);
	}
}

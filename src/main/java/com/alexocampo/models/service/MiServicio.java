package com.alexocampo.models.service;

import org.springframework.stereotype.Component;


@Component("miServicioSimple")
public class MiServicio implements IServicio {
	
	@Override
	public String operacion() {
		return "ejecutando proecesos 1";
		
	}

}

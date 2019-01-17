package com.co.dominio.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.co.dtos.Direccion;
import com.co.dtos.Persona;

@Service
public class Stream {

	public void primerEjemplo() {
		List<Persona> listPersonas = new ArrayList();
		Persona persona1 = new Persona("123", 10, new Direccion("A"));
		Persona persona2 = new Persona("123456", 20, new Direccion("B"));
		Persona persona3 = new Persona("12345678", 30, new Direccion("C"));
		Persona persona4 = new Persona("123456789", 40, new Direccion("Z"));

		listPersonas.add(persona1);
		listPersonas.add(persona2);
		listPersonas.add(persona3);
		listPersonas.add(persona4);
		
		listPersonas.stream().map(Persona::getEdad).reduce((a,b)->a+b).ifPresent((System.out::println));
		int sumatoria = listPersonas.stream().mapToInt(Persona::getEdad).sum();
		System.out.println(sumatoria);
		listPersonas = listPersonas.stream().filter(e -> e.getEdad() < 30).collect(Collectors.toList());
		listPersonas.stream().map(Persona::getCedula).forEach(System.out::println);


		
	}
}

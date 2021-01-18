package com.example.multimodule.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Persona {

	private String nombre;
	private String apellido;
	@Setter(value = AccessLevel.NONE)
	private long age;
	private LocalDate fecha;

	public String getNombre() {
		return nombre;
	}

	public long getAge() {
		if (age <= 0) {
			age = Math.abs(ChronoUnit.YEARS.between(LocalDateTime.now(), LocalDateTime.of(fecha, LocalTime.now())));
		}
		return age;
	}

}

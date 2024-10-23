package org.example;

import java.util.ArrayList;

public class Cancha {
	private String nombre;
	private String superficie;
	private int capacidad;
	private String ubicacion;
	private ArrayList<String> horasOcupadas;
	private ArrayList<Object[]> reservas;

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public String getSuperficie() {return superficie;}
	public void setSuperficie(String superficie) {this.superficie = superficie;}
	public int getCapacidad() {return capacidad;}
	public void setCapacidad(int capacidad) {this.capacidad = capacidad;}
	public String getUbicacion() {return ubicacion;}
	public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion;}
	public ArrayList<String> getHorasOcupadas() {return horasOcupadas;}
	public ArrayList<Object[]> getReservas() {return reservas;}

	public Cancha(String nombre, String superficie, int capacidad, String ubicacion) {
		this.nombre = nombre;
		this.superficie = superficie;
		this.capacidad = capacidad;
		this.ubicacion = ubicacion;
		this.horasOcupadas = new ArrayList<>();
		this.reservas = new ArrayList<>();
	}

	public void reservarHora(String hora, Partido partido) {
		if ocupadas.contains(hora) {
			System.out.println("Esta hora está ocupada");
		}
		else {
			Object[] reserva = new Object[2];
			reserva[0] = partido;
			reserva[1] = hora;

			getHorasOcupadas().add(hora);
			getReservas().add(reserva);
			System.out.println("Se ha reservado la hora")
		}
	}
}
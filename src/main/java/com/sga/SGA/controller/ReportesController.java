package com.sga.SGA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sga.SGA.models.CantidadAlumnosRegistradosPorDia;
import com.sga.SGA.models.ReporteAlumnosPorSeccion;
import com.sga.SGA.models.ResumenDeCantidades;
import com.sga.SGA.service.ReportesSercie;

@RestController
@RequestMapping("/Reportes")
public class ReportesController {
	@Autowired
	private ReportesSercie repo;
	
	@GetMapping("/resumenCantidades")
	public ResponseEntity<ResumenDeCantidades> VerResumenCantidades(){
		ResumenDeCantidades resumen = repo.VerResumenCantidades();
		return new ResponseEntity<ResumenDeCantidades>  (resumen,HttpStatus.OK);	
	}
	
	
	@GetMapping("/cantidaAlumnoRegistradosPorFecha")
	public ResponseEntity<List<CantidadAlumnosRegistradosPorDia>> VerRegistradosPorFrcha(){
		List<CantidadAlumnosRegistradosPorDia> lstaCantidaPorFecha = repo.ListarRegistradosPorDia();
		return new ResponseEntity<List<CantidadAlumnosRegistradosPorDia>>  (lstaCantidaPorFecha,HttpStatus.OK);	
	}
	
	@GetMapping("/cantidadAlumnosPorSeccion")
	public ResponseEntity<List<ReporteAlumnosPorSeccion>> ReporeCantidadAlumnosPorSeccion(){
		List<ReporteAlumnosPorSeccion> lstaCantidaPorFecha = repo.ReporteCantitdaSeccionesPorAlumno();
		return new ResponseEntity<List<ReporteAlumnosPorSeccion>>  (lstaCantidaPorFecha,HttpStatus.OK);	
	}
	
}

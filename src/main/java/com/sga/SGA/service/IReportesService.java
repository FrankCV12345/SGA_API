package com.sga.SGA.service;

import java.util.List;

import com.sga.SGA.models.CantidadAlumnosRegistradosPorDia;
import com.sga.SGA.models.ReporteAlumnosPorSeccion;
import com.sga.SGA.models.ResumenDeCantidades;

public interface IReportesService {
	ResumenDeCantidades VerResumenCantidades();
	List<CantidadAlumnosRegistradosPorDia> ListarRegistradosPorDia();
	List<ReporteAlumnosPorSeccion> ReporteCantitdaSeccionesPorAlumno();
}

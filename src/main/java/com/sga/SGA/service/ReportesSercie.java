package com.sga.SGA.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.sga.SGA.Repository.IRepositoryGrupo;
import com.sga.SGA.Repository.IRepositoryReportes;
import com.sga.SGA.models.CantidadAlumnosRegistradosPorDia;
import com.sga.SGA.models.ReporteAlumnosPorSeccion;
import com.sga.SGA.models.ResumenDeCantidades;
@Service
public class ReportesSercie implements IReportesService {
	@Autowired
	private IRepositoryGrupo repoGrupo;
	
	@Autowired
	private IRepositoryReportes repoReportes;
	
	@Override
	public ResumenDeCantidades VerResumenCantidades() {
		// TODO Auto-generated method stub
		List<Object[]> lista = repoGrupo.ResumenDeCantidades();
		ResumenDeCantidades resumen = new ResumenDeCantidades();
		for(Object[] obj :lista ) {
			resumen.setCantidad_profesores_calificados( Integer.parseInt( (obj[0].toString())));
			resumen.setCantidad_profesores( Integer.parseInt( (obj[1].toString())));
			resumen.setCantidaMatriculados( Integer.parseInt( (obj[2].toString())));
			resumen.setCantidad_Secciones(Integer.parseInt( (obj[3].toString())));
		}
		return resumen;
	}
	
	@Override
	public List <CantidadAlumnosRegistradosPorDia> ListarRegistradosPorDia() {
			List<Object[]> listaObjt = repoReportes.AlumnosRegistradosPorDia();
			List <CantidadAlumnosRegistradosPorDia> lsta = new ArrayList<>();
			for( Object[] obj : listaObjt) {
				CantidadAlumnosRegistradosPorDia i = new CantidadAlumnosRegistradosPorDia(
						obj[0].toString(),
						Integer.parseInt( obj[1].toString())
						);
				lsta.add(i);
			}
		return lsta;
	}

	@Override
	public List<ReporteAlumnosPorSeccion> ReporteCantitdaSeccionesPorAlumno() {
		List<Object[]> listaObjt = repoReportes.reporteAlumnosPorSeccion();
		List<ReporteAlumnosPorSeccion> lsta = new ArrayList<>();
		for(Object[] obj : listaObjt) {
			ReporteAlumnosPorSeccion reporte  = new ReporteAlumnosPorSeccion(
					Integer.parseInt(obj[0].toString()),
					obj[1].toString(),
					obj[2].toString(),
					Integer.parseInt(obj[3].toString())
					);
			lsta.add(reporte);
		}
		return lsta;
	}

}

package tp2prog3;

import controlador.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.*;

public class TP2Prog3 {

    public static void main(String[] args) {
        try {
            GestorTurno gestorTurno = new GestorTurno();
            GestorEmpleado gestorEmpleado = new GestorEmpleado();
            //Domicilio domicilio = new Domicilio();
            Empleado empleado = new Empleado();
            Medico medico = new Medico();
            List<Medico> medicos = new ArrayList<Medico>();
            Especialidad especialidad = new Especialidad();
            List<Especialidad> especialidades = new ArrayList<Especialidad>();
            Paciente paciente = new Paciente();
            Turno turno = new Turno();
            List<Turno> turnos = new ArrayList<Turno>();
            HistoriaClinica historiaClinica = new HistoriaClinica();  
            DetalleHistoriaClinica detalleHistoriaClinica = new DetalleHistoriaClinica(); 
            List<DetalleHistoriaClinica> detallesHistoriaClinica = new ArrayList<DetalleHistoriaClinica>();

            detalleHistoriaClinica.setDiagnostico("Gripe");
            detalleHistoriaClinica.setFechaAtencion(new Date(2021 - 1900, 8, 29));
            detalleHistoriaClinica.setIdDetalleHC(1);
            detalleHistoriaClinica.setObservaciones("Caso leve");
            detalleHistoriaClinica.setSintomas("estornudos");
            detalleHistoriaClinica.setHistoriaClinica(historiaClinica);
            
            detallesHistoriaClinica.add(detalleHistoriaClinica);
            
            historiaClinica.setDetalleHistoriaClinica(detallesHistoriaClinica);
            historiaClinica.setFechaAlta(new Date(2021, 8, 29));
            historiaClinica.setIdHistoriaClinica(1);
            historiaClinica.setNumero(123);
            historiaClinica.setPaciente(paciente);
            
            turno.setFecha(new Date(2021 - 1900, 8, 29));
            turno.setHora(9);
            turno.setMinutos(30);
            turno.setIdTurno(1);
            turno.setMedico(medico);
            turno.setPaciente(paciente);
            
            turnos.add(turno);
            
            paciente.setHistoriaClinica(historiaClinica);
            paciente.setIdPaciente(1);
            paciente.setNroSocio(654);
            paciente.setTurnos(turnos);
            paciente.setNombre("Juan");
            paciente.setApellido("Gomez");
            paciente.setDni(32222555);
            Domicilio domicilioPaciente = new Domicilio();
            domicilioPaciente.setCalle("Jacaranda");
            domicilioPaciente.setIdDomicilio(1);
            domicilioPaciente.setLocalidad("Godoy Cruz");
            domicilioPaciente.setNumero(458);
            paciente.setDomicilio(domicilioPaciente);
            
            especialidad.setDenominacion("Enfermedades respiratorias");
            especialidad.setIdEspecialidad(1);
            especialidad.setMedicos(medicos);

            especialidades.add(especialidad);
             
            medico.setNombre("Jorge");
            medico.setApellido("Gonzalez");
            medico.setCelular(156899357);
            medico.setDni(24895624);
            Domicilio domicilioMedico = new Domicilio();
            domicilioMedico.setCalle("San Martin");
            domicilioMedico.setIdDomicilio(2);
            domicilioMedico.setLocalidad("Ciudad");
            domicilioMedico.setNumero(6681);
            medico.setDomicilio(domicilioMedico);
            medico.setEspecialidades(especialidades);
            medico.setIdMedico(1);
            medico.setMatricula(6589);
            medico.setTurnos(turnos);
            
            medicos.add(medico);
                    
            empleado.setNombre("Jimena");
            empleado.setApellido("Moreno");
            empleado.setDni(30589651);
            Domicilio domicilioEmpleado = new Domicilio();
            domicilioEmpleado.setCalle("Juan B Justo");
            domicilioEmpleado.setIdDomicilio(3);
            domicilioEmpleado.setLocalidad("Ciudad");
            domicilioEmpleado.setNumero(258);
            empleado.setDomicilio(domicilioEmpleado);
            empleado.setNroLegajo(456);
            empleado.setSueldo(56998);
                    
            
            
            gestorTurno.guardar(turno);
            turno.toString();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

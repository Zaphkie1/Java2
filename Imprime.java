import Polimorfismo.Persona.Estudiante;
import Polimorfismo.Persona.Persona;

public class Imprime {
    public String imprimeEstudiante(Estudiante p) {
       return "Nombre: "+p.getNombre()+"\n"+
        "Apellido: "+p.getApellido()+"\n"+
        "Direccion: "p.getDireccion()+"\n"+
        "Edad: "+p.getEdad()+"\n"+
        "Sexo: "+p.getSexo()+"\n"+
        "Peso: "+p.getPeso()+"\n"+
        "Altura: "p.getAltura()+"\n"+
        "Escuela: "p.getEscuela()+"\n"+
        "Carrera: "p.getPromedio()+"\n"+
        "Promedio: "p.getPromedio()+"\n"+
        "Correo: "p.getCorreo()+"\n"+
        "Matricula: "+p.getMatricula();

    }
}

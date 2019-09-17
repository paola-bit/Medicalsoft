
package medicalsoft;


public class Medicalsoft {

    
    public static void main(String[] args) {
       
      /*Medico primerMedico = new Medico("Luis","Lopez");
        System.out.println(primerMedico.getNombre());
        System.out.println(primerMedico.getApellido);*/
        
        Medico medico1 = new Medico();
        medico1.setNombre("Luis");
        medico1.setApellido("Lopez");
        medico1.setFecha_nacimiento("30/11/1999");
        
        System.out.println("El medico "+medico1.getFullName()+", su edad es: "+medico1.getEdad()+"y " +medico1.getEmail());
        
        
    }
    
}

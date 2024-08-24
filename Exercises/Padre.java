package Exercises;

public class Padre {
    String apellido;
    public Padre(String apellido){
        this.apellido = apellido;
    }
   
}



    public Boolean pruebaParternidad(){
        return this.apellido == this.apellidoReal;
    }
    
}

public Boolean test(){
    Hijo hijo=new Hijo("Juan", String apellido);
    EspirituSanto es = new EspirituSanto(String nombre, String apellido, "Lopez");
    return es.pruebaParternidad();
}
package Exercises;


     public Alumno(String nombre, String materia, int calificacion){
            super(nombre, materia, calificacion);
        }

        public String reprobar(){
        
            if (this.calificacion<6)
            return ":(";
        else
            return ":)";
            
        }
    }
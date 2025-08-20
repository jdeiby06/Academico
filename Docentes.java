public class Docentes {
// Atributos
  private int idDocente;
  private String nombreDocente;
  public String materia;
  public int nota;

  // Constructor
  public Docentes() {}

  public Docentes(int idDocente, String nombre) {
    this.nombreDocente = nombre;
    this.idDocente = idDocente;
  }
  
  
  public Docentes(int idDocente, String nombreDocente, String materia) {
    this.idDocente = idDocente;
    this.nombreDocente = nombreDocente;
    this.materia = materia;
    
  }

  // Method o Funciones
  public void Presentarse() {
    System.out.println("Mi identificacion es: " + idDocente);
    System.out.println("Mi nombre es: " + nombreDocente);
    System.out.println("Enseño la materia de: " + materia);
  }
    public void calificar(){
        System.out.println("Tu calificacion en la materia de :" + materia + "es de: " + nota );

    }
}
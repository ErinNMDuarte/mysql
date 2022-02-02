package modelo;


public class Usuario {
    private String nombre1;
    private String apellidos1;
    private String fechaN;
    private String correoi;
    private String correop;
    private Long ntcelular;
    private Long ntfijo;
    private String programaa;
    

    public Usuario(String nombre1, String apellidos1, String fechaN, String correoi, String correop, Long ntcelular, Long ntfijo, String programaa) {
        this.nombre1 = nombre1;
        this.apellidos1 = apellidos1;
        this.fechaN = fechaN;
        this.correoi = correoi;
        this.correop = correop;
        this.ntcelular = ntcelular;
        this.ntfijo = ntfijo;
        this.programaa = programaa;
    }

    public Usuario(String correoi, String correop, Long ntcelular, Long ntfijo, String programaa) {
        this.correoi = correoi;
        this.correop = correop;
        this.ntcelular = ntcelular;
        this.ntfijo = ntfijo;
        this.programaa = programaa;
    }

    
    
    public Usuario() {
    }

    public Usuario(String corri) {
        this.correoi = corri;
    }

    
    
    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getApellidos1() {
        return apellidos1;
    }

    public void setApellidos1(String apellidos1) {
        this.apellidos1 = apellidos1;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getCorreoi() {
        return correoi;
    }

    public void setCorreoi(String correoi) {
        this.correoi = correoi;
    }

    public String getCorreop() {
        return correop;
    }

    public void setCorreop(String correop) {
        this.correop = correop;
    }
   

    public Long getNtcelular() {
        return ntcelular;
    }

    public void setNtcelular(Long ntcelular) {
        this.ntcelular = ntcelular;
    }

    public Long getNtfijo() {
        return ntfijo;
    }

    public void setNtfijo(Long ntfijo) {
        this.ntfijo = ntfijo;
    }
  public String getProgramaa() {
        return programaa;
    }

    public void setProgramaa(String programaa) {
        this.programaa = programaa;
}
        @Override
    public String toString() {
        return  " \nNombres:" + nombre1 
                + "\nApellidos: " + apellidos1 
                + "\nFecha nacimiento: " + fechaN 
                + "\nCorreo institucional: " + correoi 
                + "\nCorreo personal:" + correop 
                + "\nNúmero de teléfono celular: " + ntcelular 
                + "\nNúmero de teléfono fijo:" + ntfijo
                + "\nPrograma académico:" + programaa
                + "\n";
                
                
    }
    
    
}

   
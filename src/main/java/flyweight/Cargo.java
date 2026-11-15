package flyweight;

public class Cargo {

    private String titulo;
    private String departamento;

    public Cargo(String titulo, String departamento) {
        this.titulo = titulo;
        this.departamento = departamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDepartamento() {
        return departamento;
    }
}
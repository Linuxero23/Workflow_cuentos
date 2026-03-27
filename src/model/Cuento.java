package model;

public class Cuento {
    private String titulo;
    private String ideaPrincipal;
    private String personajes;
    private String escenario;
    private String inicio;
    private String conflicto;
    private String desenlace;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIdeaPrincipal() {
        return ideaPrincipal;
    }

    public void setIdeaPrincipal(String ideaPrincipal) {
        this.ideaPrincipal = ideaPrincipal;
    }

    public String getPersonajes() {
        return personajes;
    }

    public void setPersonajes(String personajes) {
        this.personajes = personajes;
    }

    public String getEscenario() {
        return escenario;
    }

    public void setEscenario(String escenario) {
        this.escenario = escenario;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getConflicto() {
        return conflicto;
    }

    public void setConflicto(String conflicto) {
        this.conflicto = conflicto;
    }

    public String getDesenlace() {
        return desenlace;
    }

    public void setDesenlace(String desenlace) {
        this.desenlace = desenlace;
    }

    public String generarContenidoCuento() {
        StringBuilder contenido = new StringBuilder();
        contenido.append("========================================").append(System.lineSeparator());
        contenido.append("CUENTO CREADO EN STORYFLOW").append(System.lineSeparator());
        contenido.append("========================================").append(System.lineSeparator());
        contenido.append("Titulo: ").append(titulo).append(System.lineSeparator());
        contenido.append("Idea principal: ").append(ideaPrincipal).append(System.lineSeparator());
        contenido.append("Personajes: ").append(personajes).append(System.lineSeparator());
        contenido.append("Escenario: ").append(escenario).append(System.lineSeparator());
        contenido.append(System.lineSeparator());
        contenido.append("Inicio:").append(System.lineSeparator());
        contenido.append(inicio).append(System.lineSeparator());
        contenido.append(System.lineSeparator());
        contenido.append("Conflicto:").append(System.lineSeparator());
        contenido.append(conflicto).append(System.lineSeparator());
        contenido.append(System.lineSeparator());
        contenido.append("Desenlace:").append(System.lineSeparator());
        contenido.append(desenlace).append(System.lineSeparator());
        contenido.append("========================================");
        return contenido.toString();
    }

    public void mostrarCuento() {
        System.out.println();
        System.out.println(generarContenidoCuento());
    }
}

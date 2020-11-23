package co.edu.unab.acmemedical;

public class Doctor {

    String especialidad, nombreDoc, detalle;
    Integer idDoctor;

    public Doctor() {
    }

    public Doctor(String especialidad, String nombreDoc, String detalle) {
        this.especialidad = especialidad;
        this.nombreDoc = nombreDoc;
        this.detalle = detalle;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombreDoc() {
        return nombreDoc;
    }

    public void setNombreDoc(String nombreDoc) {
        this.nombreDoc = nombreDoc;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }
}

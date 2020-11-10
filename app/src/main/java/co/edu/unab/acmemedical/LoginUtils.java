package co.edu.unab.acmemedical;

public class LoginUtils {

    public boolean correoValido (String correo) {
        boolean arroba = correo.indexOf("@") > -1;
        return arroba;
    }

}

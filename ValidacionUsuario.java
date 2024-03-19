public class ValidacionUsuario {
    public String[] validarUsuario(boolean emailValidado) {
        if (emailValidado) {
            String nombre = "agustin";
            String apellido = "aponte";
            return new String[]{nombre, apellido};
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        ValidacionUsuario validador = new ValidacionUsuario();
        boolean emailValidado = true;
        String[] resultadoValidacion = validador.validarUsuario(emailValidado);
        if (resultadoValidacion != null) {
            String nombre = resultadoValidacion[0];
            String apellido = resultadoValidacion[1];
            System.out.println("El nombre del usuario es: " + nombre);
            System.out.println("El nombre del usuario es: " + apellido);
        } else {
            System.out.println("El email del usuario no está validado.");
        }
    }
}

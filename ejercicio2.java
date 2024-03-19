import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un año del 2000 al 2010: ");
        int añoPelicula = scanner.nextInt();
        
        switch (añoPelicula) {
            case 2000:
                System.out.println("La película es Memento");
                break;
            case 2001:
                System.out.println("La película es El Señor de los Anillos: La Comunidad del Anillo.");
                break;
            case 2002:
                System.out.println("La película es El pianista");
                break;
            case 2003:
                System.out.println("La película es Buscando a Nemo.");
                break;
            case 2004:
                System.out.println("La película es Shrek 2");
                break;
            case 2005:
                System.out.println("La película es Crash");
                break;
            case 2006:
                System.out.println("La película es El código Da Vinci");
                break;
            case 2007:
                System.out.println("La película es Spider-Man 3");
                break;
            case 2008:
                System.out.println("La película es The Dark Knight");
                break;
            case 2009:
                System.out.println("La película es Slumdog Millionaire.");
                break;
            case 2010:
                System.out.println("La película es Toy Story 3");
                break;
            default:
                System.out.println("El año ingresado no está en el rango correcto.");
                break;
        }
    }
}
import java.util.Scanner;

public class bvb {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Pedir por pantalla los datos de estudiante
    System.out.print("Ingrese el nombre del estudiante: ");
    String nombre = scanner.nextLine();

    System.out.print("Ingrese el apellido del estudiante: ");
    String apellido = scanner.nextLine();

    System.out.print("Ingrese la fecha de nacimiento del estudiante (dd/mm/aaaa): ");
    String fechaNacimiento = scanner.nextLine();

    System.out.print("Ingrese el DNI del estudiante: ");
    String dni = scanner.nextLine();

    System.out.print("Ingrese los estudios previos del estudiante: ");
    String estudiosPrevios = scanner.nextLine();

    System.out.print("Ingrese el teléfono del estudiante: ");
    String telefono = scanner.nextLine();

    // Imprimir los datos del estudiante
    System.out.println("Nombre: " + nombre);
    System.out.println("Apellido: " + apellido);
    System.out.println("Fecha de nacimiento: " + fechaNacimiento);
    System.out.println("DNI: " + dni);
    System.out.println("Estudios previos: " + estudiosPrevios);
    System.out.println("Teléfono: " + telefono);
  }
}
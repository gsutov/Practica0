import java.util.Scanner;

public class Promedio{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre del estudiante; ");
        String nombre = sc.nextLine();
        
        float[] calificaciones = new float[3];
        for (int i = 0; i < 3; i++){
            System.out.println("Ingresa la calificación " + (i + 1) + ":");
            calificaciones[i] = sc.nextFloat();
        }

        float suma = 0;
        for (int i = 0; i < calificaciones.length; i++){
            suma = suma + calificaciones[i];
        }

        float promedio = suma / calificaciones.length;
        System.out.println("Promedio: " + promedio);

        boolean aprobado = promedio >= 6.0f;
        if(aprobado) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }
}
import java.util.Scanner;

public class Promedio{

    /**
    *Metodo publico para calcular el promedio con las 3 calificaciones dadas
    *@param calificaciones
    *@return promedio final de las calificaciones
    */
    public static float calcularPromedio(float[] calificaciones) {
        float suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma = suma + calificaciones[i];
        }
        return suma / calificaciones.length;
    }

    /**
    *Metodo publico para verificar si se tiene un promedio aprobatorio
    *@param promedio
    *@return true si es aprobado en caso contrario false
    */
    public static boolean estaAprobado(float promedio) {
        return promedio >= 6.0f;
    }

    /**
    *Metodo publico para mostrar el nombre y el promedio ademas de mostrar si esta aprobado o reprobado
    *@nombre
    *@promedio
    *@aprobado
    */
    public static void mostrarResultado(String nombre, float promedio, boolean aprobado) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        if (aprobado) {
            System.out.println("Estado: APROBADO");
        } else {
            System.out.println("Estado: REPROBADO");
        }
    }

    /**
    *Metodo publico para ver si la cadena de texto contiene un numero
    *@param texto
    *@return true si hay algun numero y false si no lo hay
    */
    public static boolean contieneNumero(String texto) {
        String digitos = "0123456789";
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (digitos.indexOf(letra) != -1) {
                return true;
            }
        }
        return false;
    }

    /**
    *Metodo main para solicitar el nombre del estudiante y validar si no contiene numeros o este vacio
    *tambien se le pide 3 calificaciones dentro del rango de 0 a 10 que seran usadas para obtener el promedio
    *con esto se puede determinar si el alumno aprobo o reprobo mostrando el resultado final 
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean nombreValido = false;
        String nombre = "";
        while (!nombreValido) {
            System.out.println("Nombre del estudiante: ");
            String entrada = sc.nextLine();

            if (entrada.trim().isEmpty()) {
                System.out.println("El nombre no puede quedar vacío.");
            } else if (contieneNumero(entrada)) {
                System.out.println("El nombre no puede contener números.");
            } else {
                nombre = entrada;
                nombreValido = true;
            }
        }

        float[] calificaciones = new float[3];
        for (int i = 0; i < 3; i++) {
            boolean calValida = false;
            while (!calValida) {
                System.out.println("Ingresa la calificación " + (i + 1) + ": ");
                String entrada = sc.next();

                try {
                    int cal = Integer.parseInt(entrada);
                    if (cal < 0 || cal > 10) {
                        throw new IllegalArgumentException("La calificación debe estar entre 0 y 10 -_-");
                    }
                    calificaciones[i] = cal;
                    calValida = true;

                } catch (NumberFormatException e) {
                    System.out.println("Debes ingresar un número entero (sin decimales :b)");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        float promedio = calcularPromedio(calificaciones);
        boolean aprobado = estaAprobado(promedio);
        mostrarResultado(nombre, promedio, aprobado);
    }
}

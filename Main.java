
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.regex.*;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escriba la contraseña :\n" );
        String contra = scanner.nextLine();
        if (
            largo(contra).size() > 0 &&
            mayusculas(contra).size() > 0 &&
            caracteres(contra).size() > 0 &&
            minusculas(contra).size() > 0 &&
            numeros(contra).size() > 0 
           
        ) {
            System.out.println("Contraseña válida: " + contra);
            guardarEnArchivo(contra);
           

        } else {
            System.out.println("Contraseña inválida: " + contra);
        }
        
    }
    public static void guardarEnArchivo(String texto) {
        Path archivo = Paths.get("lista.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(archivo, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            writer.write(texto);
            writer.newLine(); // Para que cada contraseña quede en línea separada
        } catch (IOException e) {
            System.out.println("⚠ Error al guardar en lista.txt: " + e.getMessage());
        }
    }

    public static List<String> largo(String texto) {
        List<String> result = new ArrayList<>();
        if (texto.length() >= 8) ;
        return result;
    }

    public static List<String> mayusculas(String texto) {
        List<String> result = new ArrayList<>();
        Matcher matcher = Pattern.compile("[A-Z]").matcher(texto);
        int count = 0;
        while (matcher.find()) count++;
        if (count >= 2) ;
        return result;
    }
    public static List<String> minusculas(String texto) {
        List<String> result = new ArrayList<>();
        Matcher matcher = Pattern.compile("[a-z]").matcher(texto);
        int count = 0;
        while (matcher.find()) count++;
        if (count >= 3);
        return result;
    }
    public static List<String> numeros(String texto) {
        List<String> result = new ArrayList<>();
        Matcher matcher = Pattern.compile("[0-9]").matcher(texto);
        int count = 0;
        while (matcher.find()) count++;
        if (count >= 2) ;
        return result;
    }


    public static List<String> caracteres(String texto) {
        List<String> result = new ArrayList<>();
        Matcher matcher = Pattern.compile("[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]").matcher(texto);
        int count = 0;
        while (matcher.find()) count++;
        if (count >= 1) ;
        return result;
    }    
   
}
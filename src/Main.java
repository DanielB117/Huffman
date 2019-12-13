

import java.util.Scanner;

public class Main {
//Implementacion del Codigo de Huffman

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("Bienvenido al codificador de datos, Huffman");
            System.out.println("Escriba el texto que desee codificar, si desea salir del programa presione Enter");
            String text = in.nextLine().trim();


            if (text.isEmpty()) {

                System.out.println("El programa ha finalizado");

                return;

            }


            Huffman huff = new Huffman();

            String data = huff.encode(text);


            int normalSize = text.length() * 8;

            int compressedSize = data.length();

            double Factor = 100.0 - (compressedSize * 100.0 / normalSize);

            System.out.println("------------------");

            System.out.println("Texto codificado:");

            System.out.println(huff.decode(data));
            System.out.println("------------------");

            System.out.println("Tamaño original del texto: " + normalSize);
            System.out.println("------------------");

            System.out.println("Tamaño del texto comprimido: " + compressedSize);
            System.out.println("----------------------");



            System.out.printf("esta comprimido %.2f%% ", Factor);

            System.out.println();

            System.out.println("----------------------");

            System.out.println("Datos codificados:");

            System.out.println(data);




        }
    }

}

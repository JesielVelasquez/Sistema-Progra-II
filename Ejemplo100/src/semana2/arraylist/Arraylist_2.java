/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana2.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Jesiel Velasquez
 */
public class Arraylist_2 {

    public static void main(String[] args) {

        int n = 0;
        int i = 0;
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> nombreArrayList = new ArrayList<String>();

        //AÑADE EL ELEMENTO AL ArrayList
        nombreArrayList.add("Victor");
        nombreArrayList.add("Amaya");
        nombreArrayList.add("Julio");
        nombreArrayList.add("Jose");
        nombreArrayList.add("Beatriz");
        nombreArrayList.add("Julio");
        nombreArrayList.add("Veronica");
        nombreArrayList.add("Alejandra");
        nombreArrayList.add("Julio");
        nombreArrayList.add("Raul");

        System.out.println("Los alumnos en la lista son: ");
        for (String nombre : nombreArrayList) {
            System.out.println((i + 1) + ".-" + nombre);
            i++;
        }

        //DEVUELVE EL NUMERO DE ELEMENTOS DEL ArrayList
        System.out.println("Tamanyo de la lista: " + nombreArrayList.size());

        //DEVUELVE EL ELEMENTO QUE ESTA EN LA POSICION "2" DEL ArrayList
        System.out.println("Elemento en la posicion 2: " + nombreArrayList.get(2));

        //COMPRUEBA SI EXISTE DEL ELEMENTO ("ELEMENTO") QUE SE LE PASA COMO PARAMETRO
        System.out.println("Elemento parametro Alejandra" + nombreArrayList.contains("Alejandra"));

        //DEVUELVE LA POSICION DE LA PRIMETA OCURRENCIA ("JULIO") EN EL ArrayList
        System.out.println("Posicion de la primera ocurrencia" + nombreArrayList.indexOf("Julio"));

        //DEVUELVE LA POSICION DE LA ULTIMA OCURRENCIA ("JULIO") EN EL ArrayList
        System.out.println("Posicion de la ultima ocurrencia" + nombreArrayList.lastIndexOf("Julio"));

        //SIMPLE For LOOP
        System.out.println("==============> 1.Simple For loop.");
        for (int j = 0; j < nombreArrayList.size(); j++) {
            System.out.println((j + 1) + ".-" + nombreArrayList.get(j));
        }

        //NEW ENHANCED For loop
        System.out.println("============== 2. For loop..");
        for (String temp : nombreArrayList) {
            System.out.println((i + 1) + ".-" + temp);
            i++;
        }

        //ITERATOR - RETURNS AN ITERATOR OVER THE ELEMENTS IN THIS LIST IN PROPER SEQUENCE
        System.out.println("\n==============> 3. Iterator...");
        Iterator<String> iterator = nombreArrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n==============> ListIterator...");
        ListIterator<String> nombreArrayListIterator = nombreArrayList.listIterator();
        while (nombreArrayListIterator.hasNext()) {
            System.out.println(nombreArrayListIterator.next());
        }

        //WHILE LOOP
        System.out.println("\n==============> 5. While Loop Example....");
        int y = 0;
        while (y < nombreArrayList.size()) {
            System.out.println(nombreArrayList.get(y));
            y++;
        }

        //Iterable.forEach()util: RETURNS A SEQUENTIAL STREAM WITH THIS COLLECTION AS ITS SOURCE
        System.out.println("\n==============> 6. Iterable.forEach()Example.....");
        nombreArrayList.forEach((temp) -> {
            System.out.println(temp);
        });

        //ORDENANDO EL ArrayList
        Collections.sort(nombreArrayList);

        System.out.println("\n==============> 5. While Loop Lista ordenada");
        int z = 0;
        while (z < nombreArrayList.size()) {
            System.out.println(nombreArrayList.get(z));
            z++;
        }

        System.out.println("Introduzca el numero del elemento que desea eliminar [0-10]: ");
        int elementoInt = entrada.nextInt();
        //BORRA EL ELEMENTO DE LA POSICION "ElementoInt" del ArrayList
        nombreArrayList.remove(elementoInt);

        System.out.println("\n==============> Luego de eliminar elemento indicado queda esta lista de elementos...");
        while (n < nombreArrayList.size()) {
            System.out.println(nombreArrayList.get(n));
            n++;
        }

        //BORRA LA PRIMER OCURRENCIA DEL "Elemento" que se le paso como parametro
        nombreArrayList.remove("Julio");

        System.out.println("\n==============> Luego de eliminar la primer ocurrencia indicada...");
        n = 0;
        while (n < nombreArrayList.size()) {
            System.out.println(nombreArrayList.get(n));
            n++;
        }

        //COPIAR UN ArrayList
        ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();

        //PASA EL ArrayList A UN Array
        Object[] array = nombreArrayList.toArray();

        System.out.println("\n==============> Luego de copiar la lista se imprime la nueva lista...");
        n = 0;
        while (n < arrayListCopia.size()) {
            System.out.println(arrayListCopia.get(n));
            n++;
        }

        //BORRAR TODOS LOS ELEMENTOS DEL ArrayList
        nombreArrayList.clear();
        System.out.println("\n==============> Luego de eliminar todos los elementos de la lista...");

        //DEVUELVE True SI EL ArrayList ESTA VACIO. SI NO DEVUELVE False
        System.out.println("Lista vacia?..." + nombreArrayList.isEmpty());

    }

}

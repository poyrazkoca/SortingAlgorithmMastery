
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//-----------------------------------------------------
// Title: Main
//Author: Poyraz Koca
// Description: demonstrates the sorting functionality of the Car objects array using the QuickSort algorithm in
//descending order based on their model years.
//it reads an array of integers from an input file
//sorts them using the MergeSort algorithm, and prints the sorted array.
//-----------------------------------------------------

public class Main {

    public static void main(String[] args) {

        Car[] cars = new Car[10];

        cars[0] = new Car("Toyota", "Camry", 2015);
        cars[1] = new Car("Honda", "Accord", 2019);
        cars[2] = new Car("Ford", "Fusion", 2010);
        cars[3] = new Car("Chevrolet", "Malibu", 2022);
        cars[4] = new Car("BMW", "3 Series", 2018);
        cars[5] = new Car("Audi", "A4", 2016);
        cars[6] = new Car("Mercedes-Benz", "C-Class", 2017);
        cars[7] = new Car("Lexus", "ES", 2021);

        cars[8] = new Car("Subaru", "Legacy", 2013);
        cars[9] = new Car("Mazda", "6", 2020);



//QuickSort.partition(cars, 0, cars.length - 1);
//for (int i = cars.length - 1; i >= 0; i--) {
//		 System.out.println(cars[i]);
//}
        QuickSort.sort(cars);

        System.out.println("Sorted cars array in descending order:");
        for (Car car : cars) {

            System.out.println(car);
        }

        try {
            // to reach the file

            String filePath = "src/InputFile.txt";


            // bufferreader -> to read the file
            BufferedReader bRead = new BufferedReader(new FileReader(filePath));

            //read the first


            int boyut = Integer.parseInt(bRead.readLine());

            // creating the sequence

            int[] dizi = new int[boyut];

            String satir;
            int index = 0;
            while ((satir = bRead.readLine()) != null && index < boyut) {
                dizi[index] = Integer.parseInt(satir);

                index++;
            }

            // close the file
            bRead.close();

            Comparable[] comparableDizi = new Comparable[boyut];

            for (int i = 0; i < boyut; i++) {
                comparableDizi[i] = dizi[i];
            }

            Merge.sort(comparableDizi);
            //Convert float[] to Comparable[]
            ;
            // pr'nt'ng on screen
//		            System.out.println("Elements in the sequence:");
//		            for (int i = 0; i < boyut; i++) {
//		            	Sort.InsertionSort(dizi);
//		            	System.out.println(dizi[i]);
//		            	System.out.println(comparableDizi[i]);
//		            }

        } catch (IOException e) {
            e.printStackTrace();
        }}


}

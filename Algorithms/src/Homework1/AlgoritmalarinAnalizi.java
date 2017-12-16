package Homework1;


import java.io.IOException;
import java.util.Scanner;

public class AlgoritmalarinAnalizi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); // kullanicidan veri girisi saglanir
		int eleman_sayisi;

		System.out.print("Dizi icin eleman sayisi giriniz: ");
		eleman_sayisi = input.nextInt();
		System.out.println("-----" + eleman_sayisi+  "  ELEMANLI DÝZÝ--------------------------------");
		MergesortFunction(eleman_sayisi);
		InsertionsortFunction(eleman_sayisi);
		
		
		
		
		/*	
		
		System.out.println("-----10000000 ELEMANLI DÝZÝ-----------------------");
		MergesortFunction(10000000);
		//InsertionsortFunction(10000000);
		
		System.out.println("-----300000 ELEMANLI DÝZÝ--------------------------");
		MergesortFunction(300000);
		InsertionsortFunction(300000);
		
		System.out.println("-----500000 ELEMANLI DÝZÝ--------------------------");
		MergesortFunction(500000);
		InsertionsortFunction(500000);
		
		System.out.println("-----1000000 ELEMANLI DÝZÝ----------------------------");
		MergesortFunction(1000000);
		InsertionsortFunction(1000000); */
		
		
		
	}
public static void MergesortFunction (int elemansayisi) throws IOException {
		
		
		Dizi birDizi=new Dizi(elemansayisi);  // mergesort algoritmasi icin bir dizi yaratiliyor
		//birDizi.listele();
		Mergesort mrgNesne= new Mergesort();
		
		long startTime = System.nanoTime(); // dizi mergesort algoritmasina girmeden önceki zaman 
		mrgNesne.mergesortUygula(birDizi.getBirdizi());
		long endTime   = System.nanoTime(); // dizi mergesort algoritmasindan ciktiktan sonraki zaman 
		long totalTime = endTime - startTime; // bu iki Time'in farký bize islemin calisma suresi verir
		
		System.out.println( elemansayisi + " elemanli dizi icin Mergesort'un Calisma Suresi (Run Time):"+ (double)totalTime/1000000);
		//saniye seklinde
		birDizi.listele("MergeSort.txt"); // dizinin siralanmis hali txt dosyasina yazdirilir (istege bagli)
		// cok uzun diziler icin text dosyasinda bellek sorunu olusabilir
		// bu  nedenle algoritmanin ciktisini gorebilmek icin daha kucuk dizi yaratilmali (100 ile 1000 arasinda)
		
		
	}


public static void InsertionsortFunction(int elemansayisi) throws IOException {
	
	Dizi birDizi2=new Dizi(elemansayisi); // insertionsort algoritmasi icin bir dizi yaratiliyor
	//birDizi2.listele("insertion.txt");
	
	Insertionsort insNesne= new Insertionsort();
	long startTime = System.nanoTime(); // dizi insertionsort algoritmasina girmeden önceki zaman 
	insNesne.InsertionsortUygula(birDizi2.getBirdizi()); 
	long endTime   = System.nanoTime(); // dizi insertionsort algoritmasindan ciktiktan sonraki zaman
	long totalTime = endTime - startTime; // bu iki Time'in farký bize islemin calisma suresi verir
	System.out.println( elemansayisi + " elemanli dizi icin Inserionsort'un Calisma Suresi (Run Time):"+ (double)totalTime/1000000); //milisaniye seklinde
	birDizi2.listele("InsertionSort.txt");   // dizinin siralanmis hali txt dosyasina yazdirilir (istege bagli)
	// cok uzun diziler icin text dosyasinda bellek sorunu olusabilir
	// bu  nedenle algoritmanin ciktisini gorebilmek icin daha kucuk dizi yaratilmali (100 ile 1000 arasinda)
	
}



}

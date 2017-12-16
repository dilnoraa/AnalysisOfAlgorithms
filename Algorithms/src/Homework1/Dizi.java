package Homework1;


import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.Random;

public class Dizi {

	
	private int birDizi [];
	private int  elemanSayisi;
	
	public  Dizi(int n) { // constructor metodu

		  elemanSayisi=n;
		  birDizi= new int [n] ;
	
		  Random rnd=new Random(); //random sýnýfý
		
		   int rasgeleSayi;
		 
	       for(int i=0;i<n;i++) {
	    	 
	    	 rasgeleSayi=rnd.nextInt(10000);// rasgele sayinin araligi 0 ile 1000 arasýnda
	    	 birDizi[i]=rasgeleSayi;
	    	 
	       }
	}

	
	public void listele (String str) throws IOException { // dizi elamanlarin listelemesi
		
		
		// elemanlar dosyada yazdýralacagi icin dosya yaratilmalidir
		 FileWriter fileWriter = new FileWriter(str);
		 PrintWriter printW = new PrintWriter(fileWriter);
		 
		try {
		
		 int sayac=0; 
		 for(int i=0; i<elemanSayisi; i++){
				sayac++;
			 printW.print("    " + birDizi[i]);
			 if(sayac%15==0) // bir satýrda sadece 15 tane eleman yer alsin diye 
				 printW.println();
			}
		} finally {
		 printW.close();
		}
		
		
		
		
		
		
	}
	
	public int uzunluk () { // dizideki eleman sayisi
		 return elemanSayisi;
	}
	
	public int[] getBirdizi () {
		
		return this.birDizi;  // Dizi sinifina ait dizi degiskeni dondurulur
		
	}
	
	
	

}



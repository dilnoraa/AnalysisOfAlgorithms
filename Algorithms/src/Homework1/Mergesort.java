package Homework1;

public class Mergesort {

	public void mergesortUygula(int[] gelenDizi){
		
		if(gelenDizi.length <2) // recursive seklinde calistigi icin en son mu kosul calisir
			return;
		
	    int uzunluk=gelenDizi.length;
	    int orta = uzunluk/2;
	    int left[] = new int[orta];  // dizi 2ye ayrilir sol ve sag diye
	    int right[] = new int[uzunluk-orta];
	    for(int i=0; i<orta; i++){ // dizinin sol kismi aktarilir
	        left[i] = gelenDizi[i];
	    }
	    for(int i=0; i<uzunluk-orta; i++){ //dizinin sag kismi aktarilir
	        right[i] = gelenDizi[orta+i];
	    }
	    mergesortUygula(left); // öz yinelemeli seklinde left dizisi icin metot cagrilir
	    mergesortUygula(right); // öz yinelemeli seklinde sag dizisi icin metot cagrilir
	    merge(left, right, gelenDizi); 
	}

	private static void merge(int[] left, int[] right, int[] gelen_dizi){
	    int i=0, j=0, k=0;
	    while(i<left.length && j<right.length){ // her iki diziden elemanlar tek tek karsilastirilir uygun olani ana diziye atanir
	        if(left[i] < right[j]){
	            gelen_dizi[k] = left[i];
	            i++;
	        }else{
	            gelen_dizi[k] = right[j];
	            j++;
	        }
	        k++;
	    }
	    while(i<left.length){ //kalan sol elemanlar da varsa eklenir
	        gelen_dizi[k++] = left[i++];
	    }
	    while(j<right.length){ //kalan sag elemanlar da varsa  eklenir
	        gelen_dizi[k++] = right[j++];
	    }
	}

	
	}
	
	
	



package Homework1;

public class Insertionsort {

public void InsertionsortUygula(int[] gelenDizi){
        
	  int i, j, birDeger;
      for (i = 1; i < gelenDizi.length; i++) {
            birDeger = gelenDizi[i];
            j = i;
            while (j > 0 && gelenDizi[j - 1] > birDeger) {
                  gelenDizi[j] = gelenDizi[j - 1];
                  j--;
            }
            gelenDizi[j] = birDeger;
      }
      
      
      
      
        
    }

}


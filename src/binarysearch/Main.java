package binarysearch; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    
    public static void main( String[] args ) throws IOException {
        read();        
    }
    
  public static void read() throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
	  	while(br!=null){
            int N = Integer.parseInt(br.readLine());
            int[] a = new int[N];
            for(int i=0; i<N; ++i){
               a[i] = Integer.parseInt(br.readLine()); 
            }
            int m = Integer.parseInt(br.readLine());
            int b1=-1 , b2=-1;
            for(int i=0; i<N-1; ++i){
                
                for(int j=i+1; j<N; ++j){
                    
                    if( a[i]+a[j] == m ){
                        if( b1 == -1 && b2 == -1 ){
                            b1=i;
                            b2=j;
                        }
                        else if( Math.abs(a[i]-a[j])<Math.abs(a[b1]-a[b2]) ){
                            b1=i;
                            b2=j;
                        }
                    }
                }
            }
            
            int i=a[b1] , j=a[b2] ;
           System.out.printf("Peter should buy books whose prices are %d and %d.\n\n", Math.min(i,j) , Math.max(i,j)  );
      
	  	}
  } 
}
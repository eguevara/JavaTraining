package com.eguevara.sandbox;

/**
 * Created by erickguevara on 2/14/15.
 */



interface T1{
}
interface T2{
    int VALUE = 10;
    void m1();
}

interface T3 extends T1, T2{
    public void m1();
    public void m1(int x);
}


class Eagle {

    
    Eagle() {
        
        
    }
    
    public float [] charTest = new float[2];
    public String stringTest;
    public float float3;
    
    public static void main(String[] args) {

        int i=0, j=0;
        X1: for(i = 0; i < 3; i++){
            X2: for(j = 3; j > 0; j--){
                if(i < j) continue X1;
                else break X2;
            }
        }
        System.out.println(i+" "+j);


    }
    
    static void crazyLoop4() {
        outer:
        for ( int i = 0 ; i<3 ; i++ ){
            for ( int j = 0 ; j<2 ; j++ ){
                if ( i == j ){
                    continue outer;
                }
                System.out.println( "i=" + i + " , j=" + j );
            }
        }
        
    }
    
    static void crazyLoop2() {

        int c = 0;
        A: for(int i = 0; i < 2; i++){
            B: for(int j = 0; j < 2; j++){
                C: for(int k = 0; k < 3; k++){
                    c++;
                    if(k>j) break;
                }
            }
        }
        System.out.println(c);
        
    }
    
    
    static void crazyLoop3() {

        int i=0, j=11;
        do{
            if(i > j) { break; }
            j--;
        }while( ++i < 5);
        System.out.println(i+"  "+j);
        
    }


    static void crazyLoop(){
        int c = 0;
        JACK: while (c < 8){
            JILL: System.out.println(c);
            if (c > 3) break JACK; else c++;
        }
    }
}

class Bird {
    
    
}
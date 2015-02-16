package com.eguevara.sandbox;

/**
 * Created by erickguevara on 2/14/15.
 */
class Eagle {

    
    Eagle() {
        
        
    }
    
    static char c;
    static boolean[] ba = new boolean[1];
    
    public static void main(String[] args) {
        System.out.println("erick");
//        crazyLoop3();
        System.out.println(c);

        System.out.println(ba[c]);
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
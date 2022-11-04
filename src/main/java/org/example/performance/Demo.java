package org.example.performance;

public class Demo {

    public static void main(String[] args) {
        int a,b;
        b=2;
        a=42;
        //0(1)
        if (a < 10){
            //do something
        }

        //0(n)
        for(int x = 1; x < 10; x++) {
            //0(1)
            if (a < 10) {
                //do something
            }
        }
        // 0(1) * 0(n)
        //looping = 0(n)

        //0(n^2)
        for(int y = 1; y < 10; y++) {
            for (int x = 1; x < 20; x++) {
                //(0)1
                if (a < 10) {
                    //do something
                }
            }
        }
         // 0(1) * 0(n) * 0(n) = 0(n^2)

        // 0(n^3)
        for(int z = 1; z <= 800; z++) {
            for (int y = 1; y < 10; y++) {
                for (int x = 1; x < 20000000; x++) {
                    //(0)1
                    if (a < 10) {
                        //do something
                    }
                }
            }
        }

        // addition example
        for(int x = 1; x <= 10; x++) {

        }
        for (int y = 1; y<= 100; y++) {

        }

        //0(n) + 0(n)

        //if inline, add
        //if nested, multiply

        // addition example
        for(int x = 1; x <= 10; x++) {
            // *
            for(int z = 1; z <= 10; z++){

            }
        }
        // +
        for (int y = 1; y<= 100; y++) {

        }
        //0(n^2) + 0(n) = 0(n^2 + n) = 0(n^2)


    }
}

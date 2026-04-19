public class Patterns {
    public static void main(String[] args){

    // 1. Print the pattern
    //    * * * * *
    //    * * * * *
    //    * * * * *
    //    * * * * *
         for (int i = 1 ; i <=4 ; i++ ){ 
            for  (int j = 1 ; j <=5 ; j++ ){
                System.out.print("* ");
            
            }
            System.out.println();
        }
    
    // 2. print the pattern (Hollow Rectengle)
    // * * * * *
    // *       *
    // *       *
    // * * * * *
    

        // outer loop 
        for (int i = 1 ; i <=4 ; i ++){
            //inner loop 
            for (int  j = 1 ; j <= 5 ; j ++){
                //cell 
                if ( i == 1 || j == 1 || i == 4 || j ==5){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    
    //3. Print the pattern
    //   * 
    //   * * 
    //   * * *
    //   * * * * 

        //outer loop 
        for (int i = 1 ; i <= 4 ; i++){
            //inner loop 
            for (int j = 1 ; j <= i ; j++ ){
                System.out.print("* ");
            }
            System.out.println( );

        }
    
    //4. Print the pattern
    //   * * * * 
    //   * * *
    //   * * 
    //   *      
        
        //outer loop
        for (int i = 4 ; i >= 1 ; i--){
            // inner loop 
            for (int j = 1 ; j <= i ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
        

    //5. Print the pattern
    //         *
    //       * *
    //     * * *
    //   * * * * 

        // outer loop 
        for (int i = 1 ; i <= 4 ; i ++){
            //inner loop -> space print 
            for (int j = 1 ; j <= 4-i ; j ++ ){
                System.out.print("   ");
            }
            //inner loop -> star print
            for (int j = 1 ; j <= i ; j ++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    //6. Print the pattern
    //   1 
    //   1 2  
    //   1 2 3 
    //   1 2 3 4

        // outer loop
        for(int i = 1 ; i <=4 ; i ++){
            //inner loop 
            for (int j = 1 ; j <=i ; j ++){
                System.out.print(j + " ");
            }
            System.out.println( );
        }
    

    //7. Print the pattern
    //   1 2 3 4
    //   1 2 3 
    //   1 2 
    //   1 

        //outer loop 
        for (int i = 4 ; i >=1 ; i --){
            //inner loop 
            for (int j = 1 ; j <= i ; j ++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    //8. Print the pattern 
    // 1 
    // 2 3 
    // 4 5 6
    // 7 8 9 10

        int number = 1;

        //outer loop 
        for (int i = 1 ; i <=4 ; i ++ ){
            //inner loop 
            for (int j = 1 ; j <= i ; j ++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }

    

    }

}

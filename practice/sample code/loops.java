public class loops {
    public static void main(String[] args){

        //--- for loop ---
        for(int counter = 0 ; counter < 5 ; counter += 1)
        System.out.println("hello world");
        
        //--- while loop ---
        int i = 0 ;
        while (i < 5 ) {
            System.out.println(i);
            i += 1;
        }

        //--- do-while loop ---
        int j = 0 ;
        do {
            System.out.println(j);
            j +=1 ;
        } while (j <3);
    }
    
}

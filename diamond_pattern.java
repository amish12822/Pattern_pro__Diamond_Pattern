/**
 * diamond_pattern
 */
public class diamond_pattern {

    public static void main(String[] args) {
        
        int n = 4;

        //  up side
        for (int i=1; i<=n; i++){

            // space
            int space = ( n-i );
            for (int j=1; j<=space; j++){
                System.out.print("  ");
            }

            // star 
            int star = ( 2*i)-1;
            for (int j=1; j<=star; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        // down side
        for (int i=n; i>=1; i--){

            // space
            int space = ( n-i );
            for (int j=1; j<=space; j++){
                System.out.print("  ");
            }

            // star 
            int star = ( 2*i)-1;
            for (int j=1; j<=star; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}
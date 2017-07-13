/**
 * Created by aharyadi on 7/13/17.
 */
public class MinCharPalindrome {

    public int solve(String A) {
        if(A.length()<=1){
            return 0;
        }
        StringBuffer b = new StringBuffer();
        b.append(A);
        String rev = A + '#' + b.reverse().toString();
        int[] LPS = computeLPS(rev);
        return A.length() - LPS[LPS.length-1];
    }
    public int[] computeLPS(String A){
        int [] LPS = new int[A.length()];
        int maxLPS = 0;
        int i = 1;
        LPS[0] = 0;
        int len = A.length();
        while(i < len){
            if(A.charAt(i) == A.charAt(maxLPS)){
                maxLPS++;
                LPS[i] = maxLPS;
                i++;
            }
            else{
                if(maxLPS != 0){
                    maxLPS = LPS[maxLPS-1];
                }
                else{
                    LPS[i] = 0;
                    i++;
                }
            }
        }
        return LPS;

    }
}

import java.util.Collections;

/**
 * Created by aharyadi on 7/19/17.
 */
public class NobleInteger {

    public int solve(ArrayList<Integer> A) {

        int result = -1;
        Collections.sort(A);
        for(int i = 0;i < A.size()-1;i++){
            int n = A.get(i);
            if(n == A.size()-1-i && n < A.get(i+1)){
                return 1;
            }
        }
        if(A.get(A.size()-1) == 0){
            return 1;
        }
        return -1;
    }
}

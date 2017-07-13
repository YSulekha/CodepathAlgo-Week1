import java.util.ArrayList;

/**
 * Created by aharyadi on 7/13/17.
 */
public class MinSteps {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int res = 0;
        for(int i = 0;i < X.size()-1;i++){
            int x = X.get(i);
            int y = Y.get(i);
            int xNext = X.get(i+1);
            int yNext = Y.get(i+1);
            res = res + Math.max(Math.abs((xNext-x)),Math.abs((yNext - y)));
        }
        return res;
    }
}

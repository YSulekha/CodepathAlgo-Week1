import java.util.ArrayList;

/**
 * Created by aharyadi on 7/13/17.
 */
public class NonNegativeSubarray {

    public ArrayList<Integer> maxset(ArrayList<Integer> a) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 0;i < a.size();i++){
            if(a.get(i) >= 0){
                temp.add(a.get(i));
            }
            else{

                long sumRes = findSum(res);
                long sumTemp = findSum(temp);
                if(sumRes < sumTemp){
                    res.clear();
                    res.addAll(temp);
                    temp.clear();
                }
                else if(sumRes == sumTemp){
                    if(res.size() < temp.size()){
                        res.clear();
                        res.addAll(temp);
                        temp.clear();
                    }
                    else{
                        temp.clear();
                    }
                }
                else{
                    temp.clear();
                }
            }

        }
        long sumRes = findSum(res);
        long sumTemp = findSum(temp);
        if(sumRes < sumTemp){
            res.clear();
            res.addAll(temp);
            temp.clear();
        }
        else if(sumRes == sumTemp){
            if(res.size() < temp.size()){
                res.clear();
                res.addAll(temp);
                temp.clear();
            }
        }

        return res;
    }

    public long findSum(ArrayList<Integer> a){
        long sum=0;
        for(int i = 0;i < a.size();i++){
            sum = sum+a.get(i);
        }
        return sum;
    }
}

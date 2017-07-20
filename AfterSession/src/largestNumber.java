import java.util.Collections;

/**
 * Created by aharyadi on 7/19/17.
 */
public class largestNumber {

    public String largestNumber(final List<Integer> a) {

        if(a.size() < 1){
            return null;
        }
        StringBuilder b = new StringBuilder();
        Collections.sort(a,new Comparator<Integer>(){
            public int compare(Integer s1,Integer s2){
                String temp1 = String.valueOf(s1)+String.valueOf(s2);
                String  temp2 = String.valueOf(s2)+String.valueOf(s1);
                return temp1.compareTo(temp2);
            }
        });

        for(int i=a.size()-1;i>=0;i--){
            b.append(a.get(i));
        }



        if(b.toString().charAt(0)=='0'){
            return "0";
        }
        return b.toString();
    }

    public static int nextHighest(ArrayList<Integer> c){
        int largest = 0;
        for(int j = 1;j < c.size();j++){
            int k = c.get(j);
            String n = c.get(largest)+ ""+ k;
            String l = k+""+c.get(largest);
            if(l.compareTo(n)>0){
                largest = j;
            }
        }
        return largest;
    }
}

/**
 * Created by aharyadi on 7/19/17.
 */
public class AtoI {

    public int atoi(final String a) {
        long resl = 0;
        String res = "";
        String str = a.trim();
        long max = Integer.MAX_VALUE;
        long min = Integer.MIN_VALUE;
        for(int i = 0;i < str.length();i++){
            char c = str.charAt(i);
            if(c >= '0' && c <='9'){
                res = res+c;
            }
            else if ((c == '-' || c =='+') && i==0){
                res = res+c;
            }
            else{
                break;
            }
            if(res.length()>1  && Long.valueOf(res).longValue() > max){
                return Integer.MAX_VALUE;
            }
            if(res.length()>1 && Long.valueOf(res).longValue() < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
        if(res.length()==1 && res.charAt(0)=='-'){
            return 0;
        }
        if(res.length()==1 && res.charAt(0)=='+'){
            return 0;
        }

        return res.length()==0?0:(Long.valueOf(res)).intValue();
    }
}

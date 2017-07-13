
public class Palindrome {
    public int isPalindrome(String a) {

        String s = a.toUpperCase();
        s = s.replaceAll(" ","");
        int res = 0;

        StringBuffer buffer = new StringBuffer();
        for(int i = 0;i <s.length();i++){
            if((s.charAt(i) >='A' && s.charAt(i) <= 'Z') || (s.charAt(i) >='0' && s.charAt(i) <='9')){
                buffer.append(s.charAt(i));
            }
        }
        String neS = buffer.toString();
        int len = neS.length()-1;
        for(int i=0;i<neS.length();i++){
            if(neS.charAt(i) != neS.charAt(len-i)){
                return 0;
            }
        }
        return 1;
    }
}

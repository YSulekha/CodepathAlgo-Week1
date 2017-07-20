/**
 * Created by aharyadi on 7/19/17.
 */
public class LastWordLength {

    public int lengthOfLastWord(final String a) {

        int len = a.length();
        int lastLength = 0;
        boolean isCharEncounter = false;
        for(int i = len-1;i>=0;i--){
            char c = a.charAt(i);
            if(c == ' '){
                if(isCharEncounter)
                    break;
            }
            else{
                lastLength++;
                isCharEncounter = true;
            }
        }
        return lastLength;
    }
}

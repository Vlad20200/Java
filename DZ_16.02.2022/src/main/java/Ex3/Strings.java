package Ex3;

import java.util.ArrayList;
import java.util.List;

public class Strings {
    public Strings() {
    }
    public boolean Palindrom(String str){
        StringBuffer buffer = new StringBuffer((CharSequence) str);
        buffer.reverse();
        StringBuilder stringBuilder = new StringBuilder(str);
        if(str.equals(stringBuilder.reverse())){
            return true;
        }
        else
            return false;
    }
    public int CountGlasnuh(String str){
        List<String> str2 = new ArrayList<>();
        str2 = List.of(str.split(""));
        int count = 0;
        String[] alfavit = new String[]{"a","e","i","o","y","u","j"};
        for(int i=0;i<str2.size();i++){
            for(int j=0;j<alfavit.length;j++){
                if(str2.get(i).equals(alfavit[j])){
                    count++;
                }
            }
        }
        return count;
    }
}

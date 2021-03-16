package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DigitsCounter {
/*A DigitsCounter osztálynak legyen egy int getCountOfDigits(String s) metódusa, mely megszámolja,
hogy hány különböző számjegy van a bemeneti Stringben.*/
    public int getCountOfDigits(String s) {
        if(isEmpty(s)){
            return 0;
        }

        List<String> result = new ArrayList<String>(List.of(s.split("")));
        List<String> numbers = new ArrayList<>();

        for (String item:result) {
                if(IsInt(item)){
                    if(!numbers.contains(item)){
                        numbers.add(item);
                    }
                }
        }
        return numbers.size();
    }

    private boolean isEmpty(String s){
        return s==null || s.equals("");
    }

    private boolean IsInt(String s){
        try{
          Integer.parseInt(s);
        }catch (NumberFormatException ne){
            return false;
        }
        return true;
    }

}

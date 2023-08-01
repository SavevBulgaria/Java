package Class4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String bullshit = "$%3Hello)8)Good)**world!!3{}}|";
        System.out.println(fixBullshit(bullshit));
    }
    //


    public static String fixBullshit(String hehe){
        String lessBullshit = "";

        for (int i = 0; i < hehe.length(); i++) {
            if((hehe.charAt(i) >= 'a' && hehe.charAt(i) <= 'z') || (hehe.charAt(i) >= 'A' && hehe.charAt(i) <= 'Z')){
                    lessBullshit = lessBullshit + hehe.charAt(i);
            }
        }


        return lessBullshit;
    }
}
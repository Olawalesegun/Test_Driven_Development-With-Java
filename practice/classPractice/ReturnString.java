package classPractice;

import javax.print.DocFlavor;

public class ReturnString {
    String stringCollected;
    public static void main(String[] args) {
        ReturnString ret = new ReturnString();
        String firstStringEntered = "JamBBola";
        String secondStringEntered = "ZACTTola";
        ret.checkStringForSameValue(firstStringEntered, secondStringEntered);
    }
    public StringBuilder checkStringForSameValue(String firstStringEntered, String secondStringEntered){

        StringBuilder builder = new StringBuilder();

        for (int index = 0; index < firstStringEntered.length(); index++) {
            boolean found = false;
            for (int index2 = 0; index2 < secondStringEntered.length(); index2++) {
                if (firstStringEntered.charAt(index) == secondStringEntered.charAt(index2)) {
                    found = true;
                }
            }
            if (!found) {
                builder.append(firstStringEntered.charAt(index));
            }
        }
        System.out.println(builder);
        return builder;
    }

    public void checkTheMostFrequentCharacter(String input){
        int counter= 0;
       /* char [] highest = new char[input.length()];
        for(int index = 0; index<input.length(); index++){
            String charToCheck = char.valueOf(input.charAt(index));
            for(int index2 = index + 1; index<input.length() -1; index++){
                if(charToCheck.equals(input.charAt(index2))){
                    highest[index] = charToCheck;
                }
            }*/
        }


    }

       /* StringBuilder stringCollected = new StringBuilder();
        int lengthOfFirstStringEntered = firstStringEntered.length();
        for(int counter = 0; counter<lengthOfFirstStringEntered; counter++){
            if (firstStringEntered.charAt(counter) != secondStringEntered.charAt(counter)) {
                if(firstStringEntered.charAt(counter) != 'a'){
                    stringCollected.append(firstStringEntered.charAt(counter));
                }

            }
        }
        String rep = new String(stringCollected);
        return rep;*/
        //System.out.println(stringCollected);
        //return new String(stringCollected);
    //}

//}

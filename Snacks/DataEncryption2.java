public class DataEncryption {
    public static void main(String[] args) {
        encryptData("0149");
    }

    public static String encryptData(String data){
        int firstEncryptChar = 0;
        int secEncryptChar = 0;
        int thirdEncryptChar = 0;
        int fourthEncryptChar = 0;
        int currentDigit = 0;

        if(data.length() != 4) {
            return "Kindly enter 4 digit numbers";
        }
        for(int index = 0; index<data.length(); index++){
            char currentCharacter = data.charAt(index);
            //currentDigit = (int) currentCharacter;
            //System.out.print(currentDigit);
            currentDigit = currentCharacter - '0';
            System.out.print(currentDigit);

            int encryptedDigit = (currentDigit + 7) % 10;
            if(index ==0) firstEncryptChar = encryptedDigit;
            if(index == 1) secEncryptChar = encryptedDigit;
            if(index == 2) thirdEncryptChar = encryptedDigit;
            if(index == 3) fourthEncryptChar = encryptedDigit;

        }
        String finalException;
        finalException = firstEncryptChar +""+secEncryptChar+""+thirdEncryptChar+""+fourthEncryptChar;
        return finalException;
    }

}

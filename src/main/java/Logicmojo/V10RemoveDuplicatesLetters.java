package Logicmojo;

public class V10RemoveDuplicatesLetters {

    public static void main(String[] args) {

        String string = "abbcdeeb";
        System.out.println(removeDuplicates(string));

    }

    public static String removeDuplicates(String str1){

        // create a array with 256 length because the ascii values of string will range from 1-255
        int[] ascii = new int[256];

        char[] charArray = str1.toCharArray();

        for(int i = 0; i < charArray.length; i++){

            if(ascii[charArray[i]] == 0){
                ascii[charArray[i]] = -1;
            }
            else if(ascii[charArray[i]] == -1){
                charArray[i] = '0';
            }
        }


        StringBuilder stringBuilder = new StringBuilder();

        for (char c : charArray) {

            stringBuilder.append(c);

        }
        return stringBuilder.toString().replaceAll("0","");
    }
}

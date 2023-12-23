package oddEVEN;
/**
 * CaesarCipher
 */
public class CaesarCipher {
    int[] oneSum (){
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
       
   int[] rows =  new int[mat.length];
   int[] cols =  new int[mat[0].length];

   for( int i = 0 ; i < mat.length ; i ++){
       for (int j =0 ; j < mat[0].length ; j++){
           rows[i]+= mat[i][j];
           cols[j]+= mat[i][j];
       }
   }
   return cols;
   }

    String encryptedText(String plainText, int shiftNumber){

        StringBuilder encryptedText = new StringBuilder();


        for( int i = 0 ; i < plainText.length() ; i++){
            char currentCharacter = plainText.charAt(i);


            if(Character.isLetter(currentCharacter)){
             char    base = (Character.isUpperCase(currentCharacter)) ? 'A':'a';
             char encryptedChar = (char) (((currentCharacter - base + shiftNumber)%26)+base);
             encryptedText.append(encryptedChar);

            }else{
                encryptedText.append(currentCharacter);
            }
        }
return encryptedText.toString();
    }
    String dencryptedText(String plainText, int shiftNumber){

        StringBuilder encryptedText = new StringBuilder();


        for( int i = 0 ; i < plainText.length() ; i++){
            char currentCharacter = plainText.charAt(i);


            if(Character.isLetter(currentCharacter)){
             char    base = (Character.isUpperCase(currentCharacter)) ? 'A':'a';
             char encryptedChar = (char) (((currentCharacter - base - shiftNumber+26)%26)+base);
             encryptedText.append(encryptedChar);

            }else{
                encryptedText.append(currentCharacter);
            }
        }
return encryptedText.toString();
    }
}
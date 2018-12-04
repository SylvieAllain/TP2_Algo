
public class TP2PartieB
{
    static final int BYTE_SIZE = 8;
    
    static char [] convertCharArrayToBinary(char [] charArray){
        int sizeBinaryArray = charArray.length * BYTE_SIZE;
        char [] binaryArray = new char [sizeBinaryArray];
        for (int i = 0; i < charArray.length; i++){
            char [] charBinaryArray = TP2PartieA.convertCharToBinary(charArray[i]);
            for (int j = 0; j < charBinaryArray.length; j++){
                binaryArray [j + (i * BYTE_SIZE)] = charBinaryArray[j];
            }
        }
        
        return binaryArray;
    }
    
    static char [] convertBinaryToCharArray (char [] binaryArray){
        int sizeCharArray = binaryArray.length / BYTE_SIZE;
        char [] charArray = new char [sizeCharArray];
        char [] charBinaryArray = new char [BYTE_SIZE];
        for (int i = 0; i < charArray.length; i++){
            for (int j = 0; j < BYTE_SIZE; j ++){
                charBinaryArray[j] = binaryArray [j + ( i * BYTE_SIZE)]; 
            }
            charArray [i] = TP2PartieA.convertBinaryToChar(charBinaryArray);
        }
        
        return charArray;
    }
}
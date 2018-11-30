
public class TP2PartieD
{
    static int NIBBLE = 4;
    
    static String mainCipher(String msg, String key, boolean isEncrypting)
    {
        char[] msgCharArray = msg.toCharArray();
        char[] keyCharArray = key.toCharArray();

        char[] rep = null;
        if(isEncrypting)
        {
            char[] binaryCipher = TP2PartieC.encryptXOR(msgCharArray, keyCharArray);
            rep = convertBinaryArrayToHexArray(binaryCipher);
        }
        else
        {
            char[] binaryCipher = convertHexArrayToBinaryArray(msgCharArray);           
            rep = TP2PartieC.decryptXOR(binaryCipher, keyCharArray);
        }
        String s = new String(rep);

        return s;
    }
    
    static char switchBinaryToHex ( char [] binaryArray){
        char hexChar = '0';
        int binaryToInt = TP2PartieA.convertFromBinaryToInt(binaryArray); 
        
        switch (binaryToInt){
            case 1:
                hexChar = '1';
                break;
            case 2 :
                hexChar = '2';
                break;
            case 3 : 
                hexChar = '3';
                break;
            case 4 :
                hexChar = '4';
                break;
            case 5 :
                hexChar = '5';
                break;
            case 6 :
                hexChar = '6';
                break;
            case 7 :
                hexChar = '7';
                break;
            case 8 :
                hexChar = '8';
                break;
            case 9 :
                hexChar = '9';
                break;
            case 10 :
                hexChar = 'A';
                break;
            case 11 :
                hexChar = 'B';
                break;
            case 12 : 
                hexChar = 'C';
                break;
            case 13 : 
                hexChar = 'D';
                break;
            case 14 :
                hexChar = 'E';
                break;
            case 15 : 
                hexChar = 'F';
                break;
        }
        
        return hexChar;
    }
    
    static char [] switchHexToBinaryArray ( char hexChar){
        int intChar = 0;
        
        switch (hexChar){
            case '1' :
                intChar = 1;
                break;
            case '2' :
                intChar = 2;
                break;
            case '3' :
                intChar = 3;
                break;
            case '4' : 
                intChar = 4;
                break;
            case '5' : 
                intChar = 5;
                break;
            case '6' : 
                intChar = 6;
                break;
            case '7' : 
                intChar = 7;
                break;
            case '8' : 
                intChar = 8;
                break;
            case '9' : 
                intChar = 9;
                break;
            case 'A' : 
                intChar = 10;
                break;
            case 'B' :
                intChar = 11;
                break;
            case 'C' : 
                intChar = 12;
                break;
            case 'D' : 
                intChar = 13;
                break;
            case 'E' : 
                intChar = 14;
                break;
            case 'F' : 
                intChar = 15;
                break;
        }
        char [] binaryArray = TP2PartieA.convertFromIntToBinary (intChar, NIBBLE);
        
        return binaryArray;
    }
    
    static char [] convertBinaryArrayToHexArray (char [] binaryArray){
        int sizeHexArray = binaryArray.length / NIBBLE;
        char [] hexArray = new char [sizeHexArray];
        char [] nibbleBinaryArray = new char [NIBBLE];
        for (int i = 0; i < hexArray.length; i++){
            for (int j = 0; j < NIBBLE;j++){
                nibbleBinaryArray [j] = binaryArray [j + (i * NIBBLE)];
            }
            hexArray [i] = switchBinaryToHex (nibbleBinaryArray);
        }
        
        return hexArray;
    }
    
    static char [] convertHexArrayToBinaryArray (char [] hexArray){
        int sizeBinaryArray = hexArray.length * NIBBLE;
        char [] binaryArray = new char [sizeBinaryArray];
        for (int i = 0; i < hexArray.length; i++){
            char [] charBinaryArray = switchHexToBinaryArray (hexArray [i]);
            for (int j = 0; j < NIBBLE; j++){
                binaryArray [j + (i * NIBBLE)] = charBinaryArray [j]; 
            }
        }
        
        return binaryArray;
    }
}
               
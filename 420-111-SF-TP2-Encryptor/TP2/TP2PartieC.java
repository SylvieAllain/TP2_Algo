
public class TP2PartieC
{
    static String mainCipher(String msg, String key, boolean isEncrypting)
    {
        char[] msgCharArray = msg.toCharArray();
        char[] keyCharArray = key.toCharArray();

        char[] rep = null;
        if(isEncrypting)
        {
            char[] binaryCipher = encryptXOR(msgCharArray, keyCharArray);
            rep = binaryCipher;
        }
        else
        {
            char[] binaryCipher = msgCharArray;           
            rep = decryptXOR(binaryCipher, keyCharArray);
        }
        String s = new String(rep);

        return s;
    } 
    
    static char [] changeKeyToBeAtLeastSameLengthThanMsg (char [] charMsg, char [] charKey){
        if (charMsg.length == charKey.length){
            return charKey;
        }
        
        char [] newCharKey = new char [charMsg.length];
        int numberOfChar = charKey.length;
        int addChar = 0;
        
        for (int i = 0; i < charMsg.length; i++){
            newCharKey [i] = charKey[addChar];
            addChar++;
            if (addChar == numberOfChar){
                addChar = 0;
            }
        }
        
        return newCharKey;
    }
    
    static char [] convertBinarySequencesToBinaryXORCipher (char [] binarySequence1, char [] binarySequence2){
        char [] binaryXORCipher = new char [binarySequence1.length];
        
        for (int i = 0; i < binarySequence1.length; i++){
            if (binarySequence1[i] == binarySequence2[i]){
                binaryXORCipher[i] = '0';
            }
            else{
                binaryXORCipher[i] = '1';
            }
        }
        
        return binaryXORCipher;
    }
    
    static char [] encryptXOR (char [] charMsg, char [] charKey){
        char [] newCharKey = changeKeyToBeAtLeastSameLengthThanMsg (charMsg, charKey);
        char [] binaryCharMsg = TP2PartieB.convertCharArrayToBinary (charMsg);
        char [] binaryCharKey = TP2PartieB.convertCharArrayToBinary (newCharKey);
        char [] binaryArrayXOR = convertBinarySequencesToBinaryXORCipher(binaryCharMsg, binaryCharKey);
        
        return binaryArrayXOR;
    }
    
    static char [] decryptXOR(char [] binaryMsg, char [] charKey){
        char [] binaryCharKey = TP2PartieB.convertCharArrayToBinary (charKey);
        char [] newBinaryCharKey = changeKeyToBeAtLeastSameLengthThanMsg (binaryMsg, binaryCharKey);
        char [] binaryCharMsg = convertBinarySequencesToBinaryXORCipher (binaryMsg, newBinaryCharKey);
        char [] charMsg = TP2PartieB.convertBinaryToCharArray (binaryCharMsg);
        
        return charMsg;
    } 
}
               
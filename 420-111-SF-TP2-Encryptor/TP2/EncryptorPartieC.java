

public class EncryptorPartieC implements Encryptor 
{
    public static void execute()
    {
        Encryptor encryptor = new EncryptorPartieC(); 
        new GUI(encryptor); 
    }
    
    private boolean isBinarayValue(char c)
    {
        if (c == '0' || c == '1'){
           return true; 
        }
        return false;
    }
    public void validateMessageFormatForDecrytion(String msg, boolean encrypt) throws messageToDecryptNotInRightFormat
    {
        if (!encrypt){
            char[] msgCharArray = msg.toCharArray();
            for (int i = 0; i < msg.length(); i++){
                if (!isBinarayValue(msgCharArray[i])){
                    messageToDecryptNotInRightFormat ex = new messageToDecryptNotInRightFormat();
                    ex.message = "Message to decrypt must be in binary format.";
                    throw ex;
                }
            }
        }   
    }
    
    public String runMainCipher(String msg, String key, boolean encrypt)
    {
        return TP2PartieC.mainCipher(msg, key, encrypt);
    }
}



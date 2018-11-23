public class EncryptorPartieD implements Encryptor 
{
    public static void execute()
    {
        Encryptor encryptor = new EncryptorPartieD(); 
        new GUI(encryptor); 
    }
    
    private boolean isHexadecimalValue(char c)
    {
        char[] hexValues = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        for (int i = 0; i < hexValues.length; i++) {
            if(hexValues[i] == c){
                return true;
            }
        }
        return false;
    }
    public void validateMessageFormatForDecrytion(String msg, boolean encrypt) throws messageToDecryptNotInRightFormat
    {
        if (!encrypt){
            char[] msgCharArray = msg.toCharArray();
            for (int i = 0; i < msg.length(); i++){
                if (!isHexadecimalValue(msgCharArray[i])){
                    messageToDecryptNotInRightFormat ex = new messageToDecryptNotInRightFormat();
                    ex.message = "Message to decrypt must be in hexadecimal format.";
                    throw ex;
                }
            }
        }   
    }
    
    public String runMainCipher(String msg, String key, boolean encrypt)
    {
        return TP2PartieD.mainCipher(msg, key, encrypt);
    }
}

/**
 * Décrivez votre interface Encryptor ici.
 *
 * @author  Jasmin Brassard
 * @version 18 novembre 2016
 */

public interface Encryptor
{
    public void validateMessageFormatForDecrytion(String msg, boolean encrypt) throws messageToDecryptNotInRightFormat;
    public String runMainCipher(String msg, String key, boolean encrypt);
    
}

class messageToDecryptNotInRightFormat extends Exception
{
    public String message; 
}

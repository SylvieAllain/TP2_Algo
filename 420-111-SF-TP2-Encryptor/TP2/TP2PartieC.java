
public class TP2PartieC
{
    static String mainCipher(String msg, String key, boolean isEncrypting)
    {
        char[] msgCharArray = msg.toCharArray();
        char[] keyCharArray = key.toCharArray();

        char[] rep = null;
        if(isEncrypting)
        {
            //char[] binaryCipher = encryptXOR(msgCharArray, keyCharArray);
            //rep = binaryCipher;
        }
        else
        {
            char[] binaryCipher = msgCharArray;           
            //rep = decryptXOR(binaryCipher, keyCharArray);
        }
        String s = new String(rep);

        return s;
    }     
}
               

public class TP2PartieD
{
    static String mainCipher(String msg, String key, boolean isEncrypting)
    {
        char[] msgCharArray = msg.toCharArray();
        char[] keyCharArray = key.toCharArray();

        char[] rep = null;
        if(isEncrypting)
        {
            //char[] binaryCipher = TP2PartieC.encryptXOR(msgCharArray, keyCharArray);
            //rep = convertBinaryArrayToHexArray(binaryCipher);
        }
        else
        {
            //char[] binaryCipher = convertHexArrayToBinaryArray(msgCharArray);           
            //rep = TP2PartieC.decryptXOR(binaryCipher, keyCharArray);
        }
        String s = new String(rep);

        return s;
    }
}
               
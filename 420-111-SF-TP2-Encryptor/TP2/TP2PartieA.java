

public class TP2PartieA
{
    static char convertBinaryToChar (char[] binarySequence){
        return transformASCII_IntToChar(convertFromBinaryToInt(binarySequence));
    }
    
    static char[] convertCharToBinary(char c){
        return convertFromIntToBinary(transformASCII_CharToInt(c),8);
    }
    
    static int convertFromBinaryToInt(char[] binarySequence){
        int value = 0;
        for (int i = binarySequence.length - 1; i >= 0; i--){
            if (binarySequence[i] == '1'){
                value = value + getBinValue(binarySequence.length - i - 1);
            }
        }
        return value;
    }

    static int getBinValue(int pos){
        int valueOfPosition = 1;
        for (int i = 0; i < pos; i++){
            valueOfPosition = valueOfPosition + valueOfPosition;
        }
        return valueOfPosition;
    }
    
    static char[] convertFromIntToBinary(int value,int resultSize){
        char[] charArray = new char[resultSize];
        for(int i = 0; i < resultSize; i++){
            int binPosValue = getBinValue(resultSize - 1 - i);
            if(binPosValue <= value){
                value = value - binPosValue;
                charArray[i] = '1';
            }
            else{
                charArray[i] = '0';
            }
        }
        return charArray;
    }
    
    static char transformASCII_IntToChar(int value){ 
        return (char)value;
    }

    static int transformASCII_CharToInt(char c){
        return (int)c;
    }   
}

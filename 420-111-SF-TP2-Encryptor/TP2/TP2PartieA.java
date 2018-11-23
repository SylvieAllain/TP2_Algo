

public class TP2PartieA
{
    static int convertFromBinaryToInt(char[] binArray){
        int value = 0;
        for (int i = binArray.length - 1; i >= 0; i--){
            if (binArray[i] == '1'){
                value = value + getBinValue(binArray.length - i - 1);
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
    
    static char[] convertFromIntToBinary(int value,int sizeRequired){
        char[] charArray = new char[sizeRequired];
        for(int i = 0; i < sizeRequired; i++){
            int binPosValue = getBinValue(sizeRequired - 1 - i);
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

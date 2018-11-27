
import org.junit.Test;
import static org.junit.Assert.*;

public class TP2PartieBTest
{
    
    //Tests de la fonction "convertCharArrayToBinary"
    @Test
    public void WHEN_receiveChar_A_And_C_THEN_convertCharArrayToBinary_returnsArrayWithBinary(){
        //Arrange
        char [] charArray = {'A','C'};
        
        //Act
        char [] binaryArray = TP2PartieB.convertCharArrayToBinary(charArray);
        
        //Assert
        final char [] EXPECTED_BINARY_ARRAY = {'0','1','0','0','0','0','0','1','0','1','0','0','0','0','1','1'};
        assertArrayEquals (EXPECTED_BINARY_ARRAY,binaryArray);
    }
    
    @Test
    public void WHEN_receiveChar_A_THEN_convertCharArrayToBinary_returnsArrayWithBinary(){
        //Arrange
        char [] charArray = {'A'};
        
        //Act
        char [] binaryArray = TP2PartieB.convertCharArrayToBinary(charArray);
        
        //Assert
        final char [] EXPECTED_BINARY_ARRAY = {'0','1','0','0','0','0','0','1'};
        assertArrayEquals (EXPECTED_BINARY_ARRAY,binaryArray);
    }
    
    @Test
    public void WHEN_receiveChar_A_And_C_And_Plus_THEN_convertCharArrayToBinary_returnsArrayWithBinary(){
        //Arrange
        char [] charArray = {'A','C','+'};
        
        //Act
        char [] binaryArray = TP2PartieB.convertCharArrayToBinary(charArray);
        
        //Assert
        final char [] EXPECTED_BINARY_ARRAY = {'0','1','0','0','0','0','0','1','0','1','0','0','0','0','1','1','0','0','1','0','1','0','1','1'};
        assertArrayEquals (EXPECTED_BINARY_ARRAY,binaryArray);
    }
    
    @Test
    public void WHEN_receiveChar_A_And_Space_And_a_THEN_convertCharArrayToBinary_returnsArrayWithBinary(){
        //Arrange
        char [] charArray = {'A',' ','a'};
        
        //Act
        char [] binaryArray = TP2PartieB.convertCharArrayToBinary(charArray);
        
        //Assert
        final char [] EXPECTED_BINARY_ARRAY = {'0','1','0','0','0','0','0','1','0','0','1','0','0','0','0','0','0','1','1','0','0','0','0','1'};
        assertArrayEquals (EXPECTED_BINARY_ARRAY,binaryArray);
    }
    
    // Tests de la fonction "convertBinaryToCharArray"
    @Test
    public void WHEN_receiveBinaryWithOneByte_THEN_convertBinaryToCharArray_returnsCharArrayWith_A(){
        //Arrange
        char [] binaryArray = {'0','1','0','0','0','0','0','1'};
        
        //Act
        char [] charArray = TP2PartieB.convertBinaryToCharArray(binaryArray);
        
        //Assert
        final char [] EXPECTED_CHAR_ARRAY = {'A'};
        assertArrayEquals (EXPECTED_CHAR_ARRAY,charArray);
    }
    
    @Test
    public void WHEN_receiveBinaryWithTwoBytes_THEN_convertBinaryToCharArray_returnsCharArrayWith_A_and_C(){
        //Arrange
        char [] binaryArray = {'0','1','0','0','0','0','0','1','0','1','0','0','0','0','1','1'};
        
        //Act
        char [] charArray = TP2PartieB.convertBinaryToCharArray(binaryArray);
        
        //Assert
        final char [] EXPECTED_CHAR_ARRAY = {'A','C'};
        assertArrayEquals (EXPECTED_CHAR_ARRAY,charArray);
    }
    
    @Test
    public void WHEN_receiveBinaryWithThreeBytes_THEN_convertBinaryToCharArray_returnsCharArrayWith_A_and_C_and_Plus(){
        //Arrange
        char [] binaryArray = {'0','1','0','0','0','0','0','1','0','1','0','0','0','0','1','1','0','0','1','0','1','0','1','1'};
        
        //Act
        char [] charArray = TP2PartieB.convertBinaryToCharArray(binaryArray);
        
        //Assert
        final char [] EXPECTED_CHAR_ARRAY = {'A','C','+'};
        assertArrayEquals (EXPECTED_CHAR_ARRAY,charArray);
    }
    
    @Test
    public void WHEN_receiveBinaryWithThreeBytesIncludeASpace_THEN_convertBinaryToCharArray_returnsCharArrayWith_A_and_Space_and_a(){
        //Arrange
        char [] binaryArray = {'0','1','0','0','0','0','0','1','0','0','1','0','0','0','0','0','0','1','1','0','0','0','0','1'};
        
        //Act
        char [] charArray = TP2PartieB.convertBinaryToCharArray(binaryArray);
        
        //Assert
        final char [] EXPECTED_CHAR_ARRAY = {'A',' ','a'};
        assertArrayEquals (EXPECTED_CHAR_ARRAY,charArray);
    }
}

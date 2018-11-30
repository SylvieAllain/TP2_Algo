import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TP2PartieDTest
{
    //Tests de la fonction switchBinaryToHex;
    @Test
    public void WHEN_binaryArrayRepresentInt_0_THEN_switchBinaryToHex_returnsHexChar_0(){
        //Arrange
        char [] binaryArray = {'0','0','0','0'};
        
        //Act
        char hexChar = TP2PartieD.switchBinaryToHex (binaryArray);
        
        //Assert
        final char EXPECTED_HEX_CHAR = '0';
        assertEquals (EXPECTED_HEX_CHAR, hexChar);
    }
    
    @Test
    public void WHEN_binaryArrayRepresentInt_1_THEN_switchBinaryToHex_returnsHexChar_1(){
        //Arrange
        char [] binaryArray = {'0','0','0','1'};
        
        //Act
        char hexChar = TP2PartieD.switchBinaryToHex (binaryArray);
        
        //Assert
        final char EXPECTED_HEX_CHAR = '1';
        assertEquals (EXPECTED_HEX_CHAR, hexChar);
    }
    
    @Test
    public void WHEN_binaryArrayRepresentInt_5_THEN_switchBinaryToHex_returnsHexChar_5(){
        //Arrange
        char [] binaryArray = {'0','1','0','1'};
        
        //Act
        char hexChar = TP2PartieD.switchBinaryToHex (binaryArray);
        
        //Assert
        final char EXPECTED_HEX_CHAR = '5';
        assertEquals (EXPECTED_HEX_CHAR, hexChar);
    }
    
     @Test
    public void WHEN_binaryArrayRepresentInt_10_THEN_switchBinaryToHex_returnsHexChar_A(){
        //Arrange
        char [] binaryArray = {'1','0','1','0'};
        
        //Act
        char hexChar = TP2PartieD.switchBinaryToHex (binaryArray);
        
        //Assert
        final char EXPECTED_HEX_CHAR = 'A';
        assertEquals (EXPECTED_HEX_CHAR, hexChar);
    }
    
     @Test
    public void WHEN_binaryArrayRepresentInt_15_THEN_switchBinaryToHex_returnsHexChar_F(){
        //Arrange
        char [] binaryArray = {'1','1','1','1'};
        
        //Act
        char hexChar = TP2PartieD.switchBinaryToHex (binaryArray);
        
        //Assert
        final char EXPECTED_HEX_CHAR = 'F';
        assertEquals (EXPECTED_HEX_CHAR, hexChar);
    }
    
    //Tests de la fonction convertBinaryArrayToHexArray 
    @Test
    public void WHEN_binaryArrayRepresentOneHexChar_THEN_convertBinaryArrayToHexArray (){
        //Arrange
        char [] binaryArray = {'0','0','0','0'};
        
        //Act
        char [] hexArray = TP2PartieD.convertBinaryArrayToHexArray(binaryArray);
        
        //Assert
        final char [] EXPECTED_HEX_ARRAY = {'0'};
        assertArrayEquals (EXPECTED_HEX_ARRAY,hexArray);
    }
    
    @Test
    public void WHEN_binaryArrayRepresentTwoHexChar_THEN_convertBinaryArrayToHexArray (){
        //Arrange
        char [] binaryArray = {'0','0','0','0','1','1','1','1'};
        
        //Act
        char [] hexArray = TP2PartieD.convertBinaryArrayToHexArray(binaryArray);
        
        //Assert
        final char [] EXPECTED_HEX_ARRAY = {'0','F'};
        assertArrayEquals (EXPECTED_HEX_ARRAY,hexArray);
    }
    
    @Test
    public void WHEN_binaryArrayRepresentManyHexChar_THEN_convertBinaryArrayToHexArray (){
        //Arrange
        char [] binaryArray = {'0','0','0','0','1','1','1','1','0','0','0','0','1','1','1','1'};
        
        //Act
        char [] hexArray = TP2PartieD.convertBinaryArrayToHexArray(binaryArray);
        
        //Assert
        final char [] EXPECTED_HEX_ARRAY = {'0','F','0','F'};
        assertArrayEquals (EXPECTED_HEX_ARRAY,hexArray);
    }
    
    @Test
    public void WHEN_binaryArrayRepresentManyHexCharIncludingAn_A_THEN_convertBinaryArrayToHexArray (){
        //Arrange
        char [] binaryArray = {'0','0','0','0','1','1','1','1','1','0','1','0','0','0','0','0','1','1','1','1'};
        
        //Act
        char [] hexArray = TP2PartieD.convertBinaryArrayToHexArray(binaryArray);
        
        //Assert
        final char [] EXPECTED_HEX_ARRAY = {'0','F','A','0','F'};
        assertArrayEquals (EXPECTED_HEX_ARRAY,hexArray);
    }
    
    //Tests de la fonction switchHexToArray 
    @Test
    public void WHEN_binaryArrayRepresentInt_0_THEN_switchHexToBinaryArray_returnsHexChar_0(){
        //Arrange
        char hexChar = '0';
        
        //Act
        char [] binaryArray = TP2PartieD.switchHexToBinaryArray (hexChar);
        
        //Assert
        final char [] EXPECTED_BINARY_ARRAY = {'0','0','0','0'};
        assertArrayEquals (EXPECTED_BINARY_ARRAY, binaryArray);
    }
    
    @Test
    public void WHEN_hexCharRepresent_1_THEN_switchHexToBinaryArray_returnsBinaryArray(){
        //Arrange
        char hexChar = '1';
        
        //Act
        char [] binaryArray = TP2PartieD.switchHexToBinaryArray (hexChar);
        
        //Assert
        final char [] EXPECTED_BINARY_ARRAY = {'0','0','0','1'};
        assertArrayEquals (EXPECTED_BINARY_ARRAY, binaryArray);
    }
    
    @Test
    public void WHEN_hexCharRepresent_5_THEN_switchHexToBinaryArray_returnsBinaryArray(){
        //Arrange
        char hexChar = '5';
        
        //Act
        char [] binaryArray = TP2PartieD.switchHexToBinaryArray (hexChar);
        
        //Assert
        final char [] EXPECTED_BINARY_ARRAY = {'0','1','0','1'};
        assertArrayEquals (EXPECTED_BINARY_ARRAY, binaryArray);
    }
    
     @Test
    public void WHEN_hexCharRepresent_A_THEN_switchHexToBinaryArray_returnsBinaryArray(){
        //Arrange
        char hexChar = 'A';
        
        //Act
        char [] binaryArray = TP2PartieD.switchHexToBinaryArray (hexChar);
        
        //Assert
        final char [] EXPECTED_BINARY_ARRAY = {'1','0','1','0'};
        assertArrayEquals (EXPECTED_BINARY_ARRAY, binaryArray);
    }
    
     @Test
    public void WHEN_hexCharRepresent_F_THEN_switchHexToBinaryArray_returnsBinaryArray(){
        //Arrange
        char hexChar = 'F';
        
        //Act
        char [] binaryArray = TP2PartieD.switchHexToBinaryArray (hexChar);
        
        //Assert
        final char [] EXPECTED_BINARY_ARRAY = {'1','1','1','1'};
        assertArrayEquals (EXPECTED_BINARY_ARRAY, binaryArray);
    }
    
    //Tests de la fonction convertHexArrayToBinaryArray
    @Test
    public void WHEN_hexArrayRepresentOneBinaryNibble_THEN_convertHexArrayToBinaryArray_ReturnBinaryArray (){
        //Arrange
        char [] hexArray = {'0'};
        
        //Act
        char [] binaryArray = TP2PartieD.convertHexArrayToBinaryArray (hexArray);
        
        //Assert
        final char [] EXPECTED_BINARY_ARRAY = {'0','0','0','0'};
        assertArrayEquals (EXPECTED_BINARY_ARRAY, binaryArray);
    }
    
    @Test
    public void WHEN_hexArrayRepresentTwoBinaryNibble_THEN_convertHexArrayToBinaryArray_ReturnBinaryArray (){
        //Arrange
        char [] hexArray = {'0','F'};
        
        //Act
        char [] binaryArray = TP2PartieD.convertHexArrayToBinaryArray (hexArray);
        
        //Assert
        final char [] EXPECTED_BINARY_ARRAY = {'0','0','0','0','1','1','1','1'};
        assertArrayEquals (EXPECTED_BINARY_ARRAY, binaryArray);
    }
    
    @Test
    public void WHEN_hexArrayRepresentManyBinaryNibble_THEN_convertHexArrayToBinaryArray_ReturnBinaryArray (){
        //Arrange
        char [] hexArray = {'0','F','0','F'};
        
        //Act
        char [] binaryArray = TP2PartieD.convertHexArrayToBinaryArray (hexArray);
        
        //Assert
        final char [] EXPECTED_BINARY_ARRAY = {'0','0','0','0','1','1','1','1','0','0','0','0','1','1','1','1'};
        assertArrayEquals (EXPECTED_BINARY_ARRAY, binaryArray);
    }
    
     @Test
    public void WHEN_hexArrayIncludingAn_A_RepresentManyBinaryNibble_THEN_convertHexArrayToBinaryArray_ReturnBinaryArray (){
        //Arrange
        char [] hexArray = {'0','F','A','0','F'};
        
        //Act
        char [] binaryArray = TP2PartieD.convertHexArrayToBinaryArray (hexArray);
        
        //Assert
        final char [] EXPECTED_BINARY_ARRAY = {'0','0','0','0','1','1','1','1','1','0','1','0','0','0','0','0','1','1','1','1'};
        assertArrayEquals (EXPECTED_BINARY_ARRAY, binaryArray);
    }
}

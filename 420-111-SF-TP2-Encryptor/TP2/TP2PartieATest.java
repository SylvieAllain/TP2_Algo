
import org.junit.Test;

import static org.junit.Assert.*;

public class TP2PartieATest
{
    
    // ========== TODO: tests additionnels à faire par l'étudiant
    

    
    
    // ========== tests fournis par le professeur
    
    //convertFromBinaryToInt
    @Test
    public void WHEN_binaryNumberRepresentsInt_28_THEN_convertFromBinaryToInt_returnsIntValue(){
        //Arrange        
        final char[] BINARY_ARRAY = {'1','1','1','0','0'};
        
        //Act
        int intValue = TP2PartieA.convertFromBinaryToInt(BINARY_ARRAY);
        
        //Assert
        final int EXPECTED_INT_VALUE = 28;
        assertEquals(EXPECTED_INT_VALUE, intValue);
    }
    @Test
    public void WHEN_binaryNumberRepresentsInt_31_THEN_convertFromBinaryToInt_returnsIntValue(){
        //Arrange
        final char[] BINARY_ARRAY = {'1','1','1','1','1'};
        
        //Act
        int intValue = TP2PartieA.convertFromBinaryToInt(BINARY_ARRAY);
        
        //Assert
        final int EXPECTED_INT_VALUE = 31;
        assertEquals(EXPECTED_INT_VALUE, intValue);
    }
    @Test
    public void WHEN_binaryNumberRepresentsInt_17_THEN_convertFromBinaryToInt_returnsIntValue(){
        //Arrange
        final char[] BINARY_ARRAY = {'1','0','0','0','1'};
        
        //Act
        int intValue = TP2PartieA.convertFromBinaryToInt(BINARY_ARRAY);
        
        //Assert
        final int EXPECTED_INT_VALUE = 17;
        assertEquals(EXPECTED_INT_VALUE, intValue);
    }
    
    //ConvertFromInToBinary
    @Test
    public void WHEN_intValueIs_28_THEN_convertFromIntToBinary_returnsBinaryRepresentationOfIntValue(){
        //Arrange
        int INT_VALUE = 28;
        int BINARY_ARRAY_SIZE = 5;
        
        //Act
        char[] binaryArray = TP2PartieA.convertFromIntToBinary(INT_VALUE, BINARY_ARRAY_SIZE);
        
        //Assert
        final char[] EXPECTED_BINARY_ARRAY = {'1','1','1','0','0'};
        assertArrayEquals(EXPECTED_BINARY_ARRAY, binaryArray);
    }
    @Test
    public void WHEN_intValueIs_31_THEN_convertFromIntToBinary_returnsBinaryRepresentationOfIntValue(){
        //Arrange
        int INT_VALUE = 31;
        int BINARY_ARRAY_SIZE = 5;
    
        //Act
        char[] binaryArray = TP2PartieA.convertFromIntToBinary(INT_VALUE, BINARY_ARRAY_SIZE);
        
        //Assert
        final char[] EXPECTED_BINARY_ARRAY = {'1','1','1','1','1'};
        assertArrayEquals(EXPECTED_BINARY_ARRAY, binaryArray);
    }
    @Test
    public void WHEN_intValueIs_17_THEN_convertFromIntToBinary_returnsBinaryRepresentationOfIntValue(){
        //Arrange
        int INT_VALUE = 17;
        int BINARY_ARRAY_SIZE = 5;

        //Act
        char[] binaryArray = TP2PartieA.convertFromIntToBinary(INT_VALUE, BINARY_ARRAY_SIZE);
        
        //Assert
        final char[] EXPECTED_BINARY_ARRAY = {'1','0','0','0','1'};
        assertArrayEquals(EXPECTED_BINARY_ARRAY, binaryArray);
    }    

    //convertCharToBinary
    @Test
    public void WHEN_charIs_a_THEN_convertCharToBinary_returnsBinaryRepresentationOfChar(){
        //Arrange
        char CHAR_VALUE = 'a';

        //Act
        char[] binaryArray = TP2PartieA.convertCharToBinary(CHAR_VALUE);
        
        //Assert
        final char[] EXPECTED_BINARY_ARRAY = {'0','1','1','0','0','0','0','1'};
        assertArrayEquals(EXPECTED_BINARY_ARRAY, binaryArray);        
    }
    @Test
    public void WHEN_charIs_c_THEN_convertCharToBinary_returnsBinaryRepresentationOfChar(){
        //Arrange
        char CHAR_VALUE = 'c';
        
        //Act
        char[] binaryArray = TP2PartieA.convertCharToBinary(CHAR_VALUE);
        
        //Assert
        final char[] EXPECTED_BINARY_ARRAY = {'0','1','1','0','0','0','1','1'};
        assertArrayEquals(EXPECTED_BINARY_ARRAY, binaryArray); 
    }
    @Test
    public void WHEN_charIs_z_THEN_convertCharToBinary_returnsBinaryRepresentationOfChar(){
        //Arrange
        char CHAR_VALUE = 'z';
        
        //Act
        char[] binaryArray = TP2PartieA.convertCharToBinary(CHAR_VALUE);
        
        //Assert
        final char[] EXPECTED_BINARY_ARRAY = {'0','1','1','1','1','0','1','0'};
        assertArrayEquals(EXPECTED_BINARY_ARRAY, binaryArray);        
    }
    @Test
    public void WHEN_charIs_A_THEN_convertCharToBinary_returnsBinaryRepresentationOfChar(){
        //Arrange
        char CHAR_VALUE = 'A';
        
        //Act
        char[] binaryArray = TP2PartieA.convertCharToBinary(CHAR_VALUE);
        
        //Assert
        final char[] EXPECTED_BINARY_ARRAY = {'0','1','0','0','0','0','0','1'};
        assertArrayEquals(EXPECTED_BINARY_ARRAY, binaryArray);        
    } 
    @Test
    public void WHEN_charIs_Z_THEN_convertCharToBinary_returnsBinaryRepresentationOfChar(){
        //Arrange
        char CHAR_VALUE = 'Z';
        
        //Act
        char[] binaryArray = TP2PartieA.convertCharToBinary(CHAR_VALUE);
        
        //Assert
        final char[] EXPECTED_BINARY_ARRAY = {'0','1','0','1','1','0','1','0'};
        assertArrayEquals(EXPECTED_BINARY_ARRAY, binaryArray);        
    }
    @Test
    public void WHEN_charIs_0_THEN_convertCharToBinary_returnsBinaryRepresentationOfChar(){    
        //Arrange
        char CHAR_VALUE = '0';
        
        //Act
        char[] binaryArray = TP2PartieA.convertCharToBinary(CHAR_VALUE);
        
        //Assert
        final char[] EXPECTED_BINARY_ARRAY = {'0','0','1','1','0','0','0','0'};
        assertArrayEquals(EXPECTED_BINARY_ARRAY, binaryArray);        
    }
    
    //convertBinaryToChar
    @Test
    public void WHEN_binaryNumberRepresentsChar_a_THEN_convertBinaryToChar_returnsChar()
    {
        //Arrange
        final char[] BINARY_ARRAY = {'0','1','1','0','0','0','0','1'};
        
        //Act
        char charValue = TP2PartieA.convertBinaryToChar(BINARY_ARRAY);
        
        //Assert
        final char EXPECTED_CHAR_VALUE = 'a';
        assertEquals(EXPECTED_CHAR_VALUE, charValue);
    }
    @Test
    public void WHEN_binaryNumberRepresentsChar_c_THEN_convertBinaryToChar_returnsChar()
    {
        //Arrange
        final char[] BINARY_ARRAY = {'0','1','1','0','0','0','1','1'};
        
        //Act
        char charValue = TP2PartieA.convertBinaryToChar(BINARY_ARRAY);
        
        //Assert
        final char EXPECTED_CHAR_VALUE = 'c';
        assertEquals(EXPECTED_CHAR_VALUE, charValue);
    }
    @Test
    public void WHEN_binaryNumberRepresentsChar_z_THEN_convertBinaryToChar_returnsChar()
    {
        //Arrange
        final char[] BINARY_ARRAY = {'0','1','1','1','1','0','1','0'};
        
        //Act
        char charValue = TP2PartieA.convertBinaryToChar(BINARY_ARRAY);
        
        //Assert
        final char EXPECTED_CHAR_VALUE = 'z';
        assertEquals(EXPECTED_CHAR_VALUE, charValue);
    }
    @Test
    public void WHEN_binaryNumberRepresents_colon_THEN_convertBinaryToChar_returnsChar()
    {
        //Arrange
        final char[] BINARY_ARRAY = {'0','0','1','1','1','0','1','0'};
        
        //Act
        char charValue = TP2PartieA.convertBinaryToChar(BINARY_ARRAY);
        
        //Assert
        final char EXPECTED_CHAR_VALUE = ':';
        assertEquals(EXPECTED_CHAR_VALUE, charValue);
    }
    @Test
    public void WHEN_binaryNumberRepresentsChar_plus_THEN_convertBinaryToChar_returnsChar()
    {
        //Arrange
        final char[] BINARY_ARRAY = {'0','0','1','0','1','0','1','1'};
        
        //Act
        char charValue = TP2PartieA.convertBinaryToChar(BINARY_ARRAY);
        
        //Assert
        final char EXPECTED_CHAR_VALUE = '+';
        assertEquals(EXPECTED_CHAR_VALUE, charValue);
    }
}

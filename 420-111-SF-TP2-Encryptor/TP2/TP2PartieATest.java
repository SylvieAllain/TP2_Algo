
import org.junit.Test;

import static org.junit.Assert.*;

public class TP2PartieATest
{
    
    // ========== TODO: tests additionnels à faire par l'étudiant
    
    //De la fonction convertFromBinaryToInt
    @Test
    public void WHEN_binArrayValueIsZero_THEN_convertFromBinaryToInt_returnsIsZero(){
        //Arrange        
        final char[] BINARY_ARRAY = {'0'};
        
        //Act
        int intValue = TP2PartieA.convertFromBinaryToInt(BINARY_ARRAY);
        
        //Assert
        final int EXPECTED_INT_VALUE = 0;
        assertEquals(EXPECTED_INT_VALUE, intValue);
    }
    
    @Test
    public void WHEN_binArrayValueIsOne_THEN_convertFromBinaryToInt_returnsIsOne(){
        //Arrange        
        final char[] BINARY_ARRAY = {'1'};
        
        //Act
        int intValue = TP2PartieA.convertFromBinaryToInt(BINARY_ARRAY);
        
        //Assert
        final int EXPECTED_INT_VALUE = 1;
        assertEquals(EXPECTED_INT_VALUE, intValue);
    }
    
    @Test
    public void WHEN_binArrayValueIsZeroOne_THEN_convertFromBinaryToInt_returnsIsTwo(){
        //Arrange        
        final char[] BINARY_ARRAY = {'1','0'};
        
        //Act
        int intValue = TP2PartieA.convertFromBinaryToInt(BINARY_ARRAY);
        
        //Assert
        final int EXPECTED_INT_VALUE = 2;
        assertEquals(EXPECTED_INT_VALUE, intValue);
    }
    
    
    //De la fonction getBinValue
    @Test 
    public void WHEN_positionIsZero_THEN_getBinValue_returnsOne(){
        //Arrange        
        final int POSITION = 0;
        
        //Act
        int intValue = TP2PartieA.getBinValue(POSITION);
        
        //Assert
        final int EXPECTED_INT_VALUE = 1;
        assertEquals(EXPECTED_INT_VALUE, intValue);
    }
    
    @Test
    public void WHEN_positionIsOne_THEN_getBinValue_returnsTwo(){
        //Arrange        
        final int POSITION = 1;
        
        //Act
        int intValue = TP2PartieA.getBinValue(POSITION);
        
        //Assert
        final int EXPECTED_INT_VALUE = 2;
        assertEquals(EXPECTED_INT_VALUE, intValue);
    }
    
    @Test
    public void WHEN_positionIsTwo_THEN_getBinValue_returnsFour(){
        //Arrange        
        final int POSITION = 2;
        
        //Act
        int intValue = TP2PartieA.getBinValue(POSITION);
        
        //Assert
        final int EXPECTED_INT_VALUE = 4;
        assertEquals(EXPECTED_INT_VALUE, intValue);
    }
    
    @Test
    public void WHEN_positionIsThree_THEN_getBinValue_returnsHeigh(){
        //Arrange        
        final int POSITION = 3;
        
        //Act
        int intValue = TP2PartieA.getBinValue(POSITION);
        
        //Assert
        final int EXPECTED_INT_VALUE = 8;
        assertEquals(EXPECTED_INT_VALUE, intValue);
    }
    
    @Test
    public void WHEN_positionIsSeven_THEN_getBinValue_returns128(){
        //Arrange        
        final int POSITION = 7;
        
        //Act
        int intValue = TP2PartieA.getBinValue(POSITION);
        
        //Assert
        final int EXPECTED_INT_VALUE = 128;
        assertEquals(EXPECTED_INT_VALUE, intValue);
    }
    
    //De la fonction convertIntToBinary
    @Test
    public void WHEN_intValueIs_0_THEN_convertFromIntToBinary_returnsBinaryRepresentationOfIntValue(){
        //Arrange
        int INT_VALUE = 0;
        int BINARY_ARRAY_SIZE = 1;

        //Act
        char[] binaryArray = TP2PartieA.convertFromIntToBinary(INT_VALUE, BINARY_ARRAY_SIZE);
        
        //Assert
        final char[] EXPECTED_BINARY_ARRAY = {'0'};
        assertArrayEquals(EXPECTED_BINARY_ARRAY, binaryArray);
    }
    @Test
    public void WHEN_intValueIs_1_THEN_convertFromIntToBinary_returnsBinaryRepresentationOfIntValue(){
        //Arrange
        int INT_VALUE = 1;
        int BINARY_ARRAY_SIZE = 1;

        //Act
        char[] binaryArray = TP2PartieA.convertFromIntToBinary(INT_VALUE, BINARY_ARRAY_SIZE);
        
        //Assert
        final char[] EXPECTED_BINARY_ARRAY = {'1'};
        assertArrayEquals(EXPECTED_BINARY_ARRAY, binaryArray);
    }
    @Test
    public void WHEN_intValueIs_2_THEN_convertFromIntToBinary_returnsBinaryRepresentationOfIntValue(){
        //Arrange
        int INT_VALUE = 2;
        int BINARY_ARRAY_SIZE = 2;

        //Act
        char[] binaryArray = TP2PartieA.convertFromIntToBinary(INT_VALUE, BINARY_ARRAY_SIZE);
        
        //Assert
        final char[] EXPECTED_BINARY_ARRAY = {'1','0'};
        assertArrayEquals(EXPECTED_BINARY_ARRAY, binaryArray);
    }
    @Test
    public void WHEN_intValueIs_3_THEN_convertFromIntToBinary_returnsBinaryRepresentationOfIntValue(){
        //Arrange
        int INT_VALUE = 3;
        int BINARY_ARRAY_SIZE = 2;

        //Act
        char[] binaryArray = TP2PartieA.convertFromIntToBinary(INT_VALUE, BINARY_ARRAY_SIZE);
        
        //Assert
        final char[] EXPECTED_BINARY_ARRAY = {'1','1'};
        assertArrayEquals(EXPECTED_BINARY_ARRAY, binaryArray);
    }
    
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
    
    //ConvertFromIntToBinary
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
/*
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
    }*/
}



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TP2PartieCTest
{
  //Tests de la fonction sameLengthKeyThatMsg
  @Test
  public void WHEN_msgIs_T_andKeyIs_a_THEN_changeKeyToBeAtLeastSameLengthThanMsg_returnsNewCharArray(){
    //Arrange
    char [] charMsg = {'T'};
    char [] charKey = {'a'};
    
    //Act
    char [] newCharKeyArray = TP2PartieC.changeKeyToBeAtLeastSameLengthThanMsg(charMsg, charKey);
    //Assert
    final char [] EXPECTED_KEY_CHAR_ARRAY = {'a'};
    assertArrayEquals (EXPECTED_KEY_CHAR_ARRAY, newCharKeyArray);
    
    }
    
    @Test
  public void WHEN_msgIs_TT_andKeyIs_a_THEN_changeKeyToBeAtLeastSameLengthThanMsg_returnsNewCharArray(){
    //Arrange
    char [] charMsg = {'T','T'};
    char [] charKey = {'a'};
    
    //Act
    char [] newCharKeyArray = TP2PartieC.changeKeyToBeAtLeastSameLengthThanMsg(charMsg, charKey);
    //Assert
    final char [] EXPECTED_KEY_CHAR_ARRAY = {'a','a'};
    assertArrayEquals (EXPECTED_KEY_CHAR_ARRAY, newCharKeyArray);
    
    }
    
   @Test
  public void WHEN_msgIs_Te_andKeyIs_a_THEN_changeKeyToBeAtLeastSameLengthThanMsg_returnsNewCharArray(){
    //Arrange
    char [] charMsg = {'T','e'};
    char [] charKey = {'a'};
    
    //Act
    char [] newCharKeyArray = TP2PartieC.changeKeyToBeAtLeastSameLengthThanMsg(charMsg, charKey);
    //Assert
    final char [] EXPECTED_KEY_CHAR_ARRAY = {'a','a'};
    assertArrayEquals (EXPECTED_KEY_CHAR_ARRAY, newCharKeyArray);
    
    }
    
   @Test
  public void WHEN_msgIs_Test_andKeyIs_ab_THEN_changeKeyToBeAtLeastSameLengthThanMsg_returnsNewCharArray(){
    //Arrange
    char [] charMsg = {'T','e','s','t'};
    char [] charKey = {'a','b'};
    
    //Act
    char [] newCharKeyArray = TP2PartieC.changeKeyToBeAtLeastSameLengthThanMsg(charMsg, charKey);
    //Assert
    final char [] EXPECTED_KEY_CHAR_ARRAY = {'a','b','a','b'};
    assertArrayEquals (EXPECTED_KEY_CHAR_ARRAY, newCharKeyArray);
    
    }
  
  @Test
  public void WHEN_msgIs_Tests_andKeyIs_ab_THEN_changeKeyToBeAtLeastSameLengthThanMsg_returnsNewCharArray(){
    //Arrange
    char [] charMsg = {'T','e','s','t','s'};
    char [] charKey = {'a','b'};
    
    //Act
    char [] newCharKeyArray = TP2PartieC.changeKeyToBeAtLeastSameLengthThanMsg(charMsg, charKey);
    //Assert
    final char [] EXPECTED_KEY_CHAR_ARRAY = {'a','b','a','b','a'};
    assertArrayEquals (EXPECTED_KEY_CHAR_ARRAY, newCharKeyArray);
     
    }
    
   @Test
  public void WHEN_theKeyLengthIsGreaterThanMsgLength_THEN_changeKeyToBeAtLeastSameLengthThanMsg_returnsNewCharArray(){
    //Arrange
    char [] charMsg = {'T','e','s'};
    char [] charKey = {'a','b','c','d','e'};
    
    //Act
    char [] newCharKeyArray = TP2PartieC.changeKeyToBeAtLeastSameLengthThanMsg(charMsg, charKey);
    //Assert
    final char [] EXPECTED_KEY_CHAR_ARRAY = {'a','b','c'};
    assertArrayEquals (EXPECTED_KEY_CHAR_ARRAY, newCharKeyArray);
    
    }
    
   @Test
  public void WHEN_msgIsABinarySequenceOfChars_TT_andKeyIsBinarySequenceOfChar_a_THEN_changeKeyToBeAtLeastSameLengthThanMsg_returnsNewCharArray(){
    //Arrange
    char [] charMsg = {'0','1','0','1','0','1','0','0','0','1','0','1','0','1','0','0'};
    char [] charKey = {'0','1','1','0','0','0','0','1'};
    
    //Act
    char [] newCharKeyArray = TP2PartieC.changeKeyToBeAtLeastSameLengthThanMsg(charMsg, charKey);
    //Assert
    final char [] EXPECTED_KEY_CHAR_ARRAY = {'0','1','1','0','0','0','0','1','0','1','1','0','0','0','0','1'};
    assertArrayEquals (EXPECTED_KEY_CHAR_ARRAY, newCharKeyArray);
    
    }
  
  // Tests de la fonction convertBinarySequencesToBinaryXORCipher
  @Test
  public void WHEN_binarySequencesContaintsOneBitThatDiffer1_THEN_convertBinarySequencesToBinaryXORCipher_returnsBinaryXORCipher(){
    //Arrange
    char [] binarySequence1 = {'1'};
    char [] binarySequence2 = {'0'};
    
    //Act
    char [] binaryXORCipher = TP2PartieC.convertBinarySequencesToBinaryXORCipher(binarySequence1, binarySequence2);
    
    //Assert
    final char [] EXPECTED_BINARY_XOR_CIPHER = {'1'};
    assertArrayEquals (EXPECTED_BINARY_XOR_CIPHER,binaryXORCipher);
    
    }
    
    @Test
  public void WHEN_binarySequencesContaintsOneBitThatDiffer2_THEN_convertBinarySequencesToBinaryXORCipher_returnsBinaryXORCipher(){
    //Arrange
    char [] binarySequence1 = {'0'};
    char [] binarySequence2 = {'1'};
    
    //Act
    char [] binaryXORCipher = TP2PartieC.convertBinarySequencesToBinaryXORCipher(binarySequence1, binarySequence2);
    
    //Assert
    final char [] EXPECTED_BINARY_XOR_CIPHER = {'1'};
    assertArrayEquals (EXPECTED_BINARY_XOR_CIPHER,binaryXORCipher);
    
    }
    
  @Test
  public void WHEN_binarySequencesContaintsTwoBitsThatAreChars_1_THEN_convertBinarySequencesToBinaryXORCipher_returnsBinaryXORCipher(){
    //Arrange
    char [] binarySequence1 = {'1'};
    char [] binarySequence2 = {'1'};
    
    //Act
    char [] binaryXORCipher = TP2PartieC.convertBinarySequencesToBinaryXORCipher(binarySequence1, binarySequence2);
    
    //Assert
    final char [] EXPECTED_BINARY_XOR_CIPHER = {'0'};
    assertArrayEquals (EXPECTED_BINARY_XOR_CIPHER,binaryXORCipher);
    
    }
    
   @Test
  public void WHEN_binarySequencesContaintsTwoBitsThatAreChars_0_THEN_convertBinarySequencesToBinaryXORCipher_returnsBinaryXORCipher(){
    //Arrange
    char [] binarySequence1 = {'0'};
    char [] binarySequence2 = {'0'};
    
    //Act
    char [] binaryXORCipher = TP2PartieC.convertBinarySequencesToBinaryXORCipher(binarySequence1, binarySequence2);
    
    //Assert
    final char [] EXPECTED_BINARY_XOR_CIPHER = {'0'};
    assertArrayEquals (EXPECTED_BINARY_XOR_CIPHER,binaryXORCipher);
    
    }
    
  @Test
  public void WHEN_binarySequencesContaintsTwoBits_THEN_convertBinarySequencesToBinaryXORCipher_returnsBinaryXORCipher(){
    //Arrange
    char [] binarySequence1 = {'1','0'};
    char [] binarySequence2 = {'1','1'};
    
    //Act
    char [] binaryXORCipher = TP2PartieC.convertBinarySequencesToBinaryXORCipher(binarySequence1, binarySequence2);
    
    //Assert
    final char [] EXPECTED_BINARY_XOR_CIPHER = {'0','1'};
    assertArrayEquals (EXPECTED_BINARY_XOR_CIPHER,binaryXORCipher);
    
    }
    
  @Test
  public void WHEN_binarySequencesContaintsOneByte_THEN_convertBinarySequencesToBinaryXORCipher_returnsBinaryXORCipher(){
    //Arrange
    char [] binarySequence1 = {'1','0','1','1','0','0','0','1'};
    char [] binarySequence2 = {'1','1','0','1','0','0','1','1'};
    
    //Act
    char [] binaryXORCipher = TP2PartieC.convertBinarySequencesToBinaryXORCipher(binarySequence1, binarySequence2);
    
    //Assert
    final char [] EXPECTED_BINARY_XOR_CIPHER = {'0','1','1','0','0','0','1','0'};
    assertArrayEquals (EXPECTED_BINARY_XOR_CIPHER,binaryXORCipher);
    
    }
    
  @Test
  public void WHEN_binarySequencesContaintsTwoBytes_THEN_convertBinarySequencesToBinaryXORCipher_returnsBinaryXORCipher(){
    //Arrange
    char [] binarySequence1 = {'1','0','1','1','0','0','0','1','0','0','1','1','1','0','0','1'};
    char [] binarySequence2 = {'1','1','0','1','0','0','1','1','1','0','1','0','1','0','1','0'};
    
    //Act
    char [] binaryXORCipher = TP2PartieC.convertBinarySequencesToBinaryXORCipher(binarySequence1, binarySequence2);
    
    //Assert
    final char [] EXPECTED_BINARY_XOR_CIPHER = {'0','1','1','0','0','0','1','0','1','0','0','1','0','0','1','1'};
    assertArrayEquals (EXPECTED_BINARY_XOR_CIPHER,binaryXORCipher);
    
    }
  
  //Tests de la fonction encryptXOR
  @Test
  public void WHEN_msgIs_T_andKeyIs_a_THEN_encryptXOR_returnsBinaryArrayXOR(){
    //Arrange
    char [] charMsg = {'T'};
    char [] charKey = {'a'};
    
    //Act
    char [] binaryArrayXOR = TP2PartieC.encryptXOR ( charMsg, charKey);
    //Assert
    final char [] EXPECTED_BINARY_ARRAY_XOR = {'0','0','1','1','0','1','0','1'};
    assertArrayEquals (EXPECTED_BINARY_ARRAY_XOR,binaryArrayXOR);
    }
  
  @Test
  public void WHEN_msgIs_Test_andKeyIs_abab_THEN_encryptXOR_returnsBinaryArrayXOR(){
    //Arrange
    char [] charMsg = {'T','e','s','t'};
    char [] charKey = {'a','b','a','b'};
    
    //Act
    char [] binaryArrayXOR = TP2PartieC.encryptXOR ( charMsg, charKey);
    //Assert
    final char [] EXPECTED_BINARY_ARRAY_XOR = {'0','0','1','1','0','1','0','1','0','0','0','0','0','1','1','1','0','0','0','1','0','0','1','0','0','0','0','1','0','1','1','0'};
    assertArrayEquals (EXPECTED_BINARY_ARRAY_XOR,binaryArrayXOR);
    }
    
   @Test
  public void WHEN_msgIs_Test_andKeyIs_ab_THEN_encryptXOR_returnsBinaryArrayXOR(){
    //Arrange
    char [] charMsg = {'T','e','s','t'};
    char [] charKey = {'a','b'};
    
    //Act
    char [] binaryArrayXOR = TP2PartieC.encryptXOR ( charMsg, charKey);
    //Assert
    final char [] EXPECTED_BINARY_ARRAY_XOR = {'0','0','1','1','0','1','0','1','0','0','0','0','0','1','1','1','0','0','0','1','0','0','1','0','0','0','0','1','0','1','1','0'};
    assertArrayEquals (EXPECTED_BINARY_ARRAY_XOR,binaryArrayXOR);
    } 
    
   @Test
  public void WHEN_msgIs_T_andKeyIs_abcd_THEN_encryptXOR_returnsBinaryArrayXOR(){
    //Arrange
    char [] charMsg = {'T'};
    char [] charKey = {'a','b','c','d'};
    
    //Act
    char [] binaryArrayXOR = TP2PartieC.encryptXOR ( charMsg, charKey);
    //Assert
    final char [] EXPECTED_BINARY_ARRAY_XOR = {'0','0','1','1','0','1','0','1'};
    assertArrayEquals (EXPECTED_BINARY_ARRAY_XOR,binaryArrayXOR);
    } 
    
      @Test
  public void WHEN_msgIs_Test_Plus_andKeyIs_ab_colon_THEN_encryptXOR_returnsBinaryArrayXOR(){
    //Arrange
    char [] charMsg = {'T','e','s','t','+'};
    char [] charKey = {'a','b',':'};
    
    //Act
    char [] binaryArrayXOR = TP2PartieC.encryptXOR ( charMsg, charKey);
    //Assert
    final char [] EXPECTED_BINARY_ARRAY_XOR = {'0','0','1','1','0','1','0','1','0','0','0','0','0','1','1','1','0','1','0','0','1','0','0','1','0','0','0','1','0','1','0','1','0','1','0','0','1','0','0','1'};
    assertArrayEquals (EXPECTED_BINARY_ARRAY_XOR,binaryArrayXOR);
    } 
    
  //Tests de la fonction decryptXOR
  @Test
  public void WHEN_binaryMsgCipherContaintsOnlyOneByte_THEN_decryptXOR_returnsCharArray_T(){
      //Arrange
      char [] binaryMsg = {'0','0','1','1','0','1','0','1'};
      char [] charKey = {'a'};
      
      //Act
      char [] charMsg = TP2PartieC.decryptXOR (binaryMsg, charKey);
      
      //Assert
      final char [] EXPECTED_CHAR_MSG = {'T'};
      assertArrayEquals (EXPECTED_CHAR_MSG,charMsg);
    }
    
   @Test
  public void WHEN_binaryMsgCipherContaintsOnlyOneBytesButTheKeyContaintsManyBytes_THEN_decryptXOR_returnsCharArray_T(){
      //Arrange
      char [] binaryMsg = {'0','0','1','1','0','1','0','1'};
      char [] charKey = {'a','b','c','d'};
      
      //Act
      char [] charMsg = TP2PartieC.decryptXOR (binaryMsg, charKey);
      
      //Assert
      final char [] EXPECTED_CHAR_MSG = {'T'};
      assertArrayEquals (EXPECTED_CHAR_MSG,charMsg);
    }
  
   @Test
  public void WHEN_binaryMsgCipherContaintsAsManyBytesThenTheKey_THEN_decryptXOR_returnsCharArray_Test(){
      //Arrange
      char [] binaryMsg = {'0','0','1','1','0','1','0','1','0','0','0','0','0','1','1','1','0','0','0','1','0','0','1','0','0','0','0','1','0','1','1','0'};
      char [] charKey = {'a','b','a','b'};
      
      //Act
      char [] charMsg = TP2PartieC.decryptXOR (binaryMsg, charKey);
      
      //Assert
      final char [] EXPECTED_CHAR_MSG = {'T','e','s','t'};
      assertArrayEquals (EXPECTED_CHAR_MSG,charMsg);
    }
  
     @Test
  public void WHEN_binaryMsgCipherContaintsMoreBytesThenTheKey_THEN_decryptXOR_returnsCharArray_Test(){
      //Arrange
      char [] binaryMsg = {'0','0','1','1','0','1','0','1','0','0','0','0','0','1','1','1','0','0','0','1','0','0','1','0','0','0','0','1','0','1','1','0'};
      char [] charKey = {'a','b'};
      
      //Act
      char [] charMsg = TP2PartieC.decryptXOR (binaryMsg, charKey);
      
      //Assert
      final char [] EXPECTED_CHAR_MSG = {'T','e','s','t'};
      assertArrayEquals (EXPECTED_CHAR_MSG,charMsg);
    }
    
     @Test
  public void WHEN_binaryMsgCipherContaintsAByteThatRepresentACharOtherThanLetters_THEN_decryptXOR_returnsCharArray_Test_Plus(){
      //Arrange
      char [] binaryMsg = {'0','0','1','1','0','1','0','1','0','0','0','0','0','1','1','1','0','1','0','0','1','0','0','1','0','0','0','1','0','1','0','1','0','1','0','0','1','0','0','1'};
      char [] charKey = {'a','b',':'};
      
      //Act
      char [] charMsg = TP2PartieC.decryptXOR (binaryMsg, charKey);
      
      //Assert
      final char [] EXPECTED_CHAR_MSG = {'T','e','s','t','+'};
      assertArrayEquals (EXPECTED_CHAR_MSG,charMsg);
    }
}

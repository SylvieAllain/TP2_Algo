

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TP2PartieCTest
{
  //Tests de la fonction sameLengthKeyThatMsg
  @Test
  public void WHEN_msgIs_T_andKeyIs_a_THEN_changeToSameLengthKeyAndMsg_returnsNewCharArray(){
    //Arrange
    char [] charMsg = {'T'};
    char [] charKey = {'a'};
    
    //Act
    char [] binaryArrayXOR = TP2PartieC.changeToSameLengthKeyAndMsg( charMsg, charKey);
    //Assert
    final char [] EXPECTED_BINARY_ARRAY_XOR = {'a'};
    assertArrayEquals (EXPECTED_BINARY_ARRAY_XOR,binaryArrayXOR);
    
    }
    
    @Test
  public void WHEN_msgIs_TT_andKeyIs_a_THEN_changeToSameLengthKeyAndMsg_returnsNewCharArray(){
    //Arrange
    char [] charMsg = {'T','T'};
    char [] charKey = {'a'};
    
    //Act
    char [] binaryArrayXOR = TP2PartieC.changeToSameLengthKeyAndMsg( charMsg, charKey);
    //Assert
    final char [] EXPECTED_BINARY_ARRAY_XOR = {'a','a'};
    assertArrayEquals (EXPECTED_BINARY_ARRAY_XOR,binaryArrayXOR);
    
    }
    
   @Test
  public void WHEN_msgIs_Te_andKeyIs_a_THEN_changeToSameLengthKeyAndMsg_returnsNewCharArray(){
    //Arrange
    char [] charMsg = {'T','e'};
    char [] charKey = {'a'};
    
    //Act
    char [] binaryArrayXOR = TP2PartieC.changeToSameLengthKeyAndMsg( charMsg, charKey);
    //Assert
    final char [] EXPECTED_BINARY_ARRAY_XOR = {'a','a'};
    assertArrayEquals (EXPECTED_BINARY_ARRAY_XOR,binaryArrayXOR);
    
    }
    
   @Test
  public void WHEN_msgIs_Test_andKeyIs_ab_THEN_changeToSameLengthKeyAndMsg_returnsNewCharArray(){
    //Arrange
    char [] charMsg = {'T','e','s','t'};
    char [] charKey = {'a','b'};
    
    //Act
    char [] binaryArrayXOR = TP2PartieC.changeToSameLengthKeyAndMsg( charMsg, charKey);
    //Assert
    final char [] EXPECTED_BINARY_ARRAY_XOR = {'a','b','a','b'};
    assertArrayEquals (EXPECTED_BINARY_ARRAY_XOR,binaryArrayXOR);
    
    }
  
  @Test
  public void WHEN_msgIs_Tests_andKeyIs_ab_THEN_changeToSameLengthKeyAndMsg_returnsNewCharArray(){
    //Arrange
    char [] charMsg = {'T','e','s','t','s'};
    char [] charKey = {'a','b'};
    
    //Act
    char [] binaryArrayXOR = TP2PartieC.changeToSameLengthKeyAndMsg( charMsg, charKey);
    //Assert
    final char [] EXPECTED_BINARY_ARRAY_XOR = {'a','b','a','b','a'};
    assertArrayEquals (EXPECTED_BINARY_ARRAY_XOR,binaryArrayXOR);
    
    }
    
   @Test
  public void WHEN_msgIs_Tes_andKeyIs_abcde_THEN_changeToSameLengthKeyAndMsg_returnsNewCharArray(){
    //Arrange
    char [] charMsg = {'T','e','s'};
    char [] charKey = {'a','b','c','d','e'};
    
    //Act
    char [] binaryArrayXOR = TP2PartieC.changeToSameLengthKeyAndMsg( charMsg, charKey);
    //Assert
    final char [] EXPECTED_BINARY_ARRAY_XOR = {'a','b','c'};
    assertArrayEquals (EXPECTED_BINARY_ARRAY_XOR,binaryArrayXOR);
    
    }
  
  // Tests de la fonction binaryXORCipher
  @Test
  public void WHEN_binarySequencesContaintsOneBitThatDiffer_THEN_convertBinarySequencesToBinaryXORCipher_returnBinaryXORCipher(){
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
  public void WHEN_binarySequencesContaintsOneBitThatAreTheSame_THEN_convertBinarySequencesToBinaryXORCipher_returnBinaryXORCipher(){
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
  public void WHEN_binarySequencesContaintsTwoBits_THEN_convertBinarySequencesToBinaryXORCipher_returnBinaryXORCipher(){
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
  public void WHEN_binarySequencesContaintsOneByte_THEN_convertBinarySequencesToBinaryXORCipher_returnBinaryXORCipher(){
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
  public void WHEN_binarySequencesContaintsTwoBytes_THEN_convertBinarySequencesToBinaryXORCipher_returnBinaryXORCipher(){
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
}

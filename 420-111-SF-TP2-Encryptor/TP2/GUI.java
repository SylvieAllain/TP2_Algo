import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class GUI extends JFrame
{
    
    public static final int PARTIEC = 3;
    public static final int PARTIED = 4;
    
    private static final long serialVersionUID = -6474848462188907749L;

    private final String ERROR_DIALOG_MESSAGE_NAME = "Error";
    private final String RESULT_TEXT_AREA_NAME = "Result"; 
    private final String MESSAGE_TEXT_AREA_NAME = "Message"; 
    private final String ENCRYPT_BUTTON_NAME = "encrypt"; 
    private final String DECRYPT_BUTTON_NAME = "decrypt"; 
    
    private final JButton encryptButton = new JButton(ENCRYPT_BUTTON_NAME);
    private final JButton decryptButton = new JButton(DECRYPT_BUTTON_NAME);
    private JTextArea messageTextArea = new JTextArea(MESSAGE_TEXT_AREA_NAME, 10,50);
    private JTextField keyTextField = new JTextField(50);
    private JTextArea resultTextArea = new JTextArea(RESULT_TEXT_AREA_NAME, 10, 50); 
    
    private Encryptor encryptor; 
    
    public GUI(Encryptor encryptor) 
    {
        createGUIContent();
        this.encryptor = encryptor; 
        
        this.setTitle("THE ENCRYPTOR");
        this.setResizable(false);
        this.setVisible(true);
        this.setSize(800,500);
        this.encryptButton.addActionListener(new EncryptListener());
        this.decryptButton.addActionListener(new DecryptListener());
        resultTextArea.setEditable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void createGUIContent()
    {
        this.setLayout(new BorderLayout());
        JScrollPane scrollPane = new JScrollPane(this.messageTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.add(scrollPane, BorderLayout.NORTH);
        
        JPanel center = new JPanel(new BorderLayout());
        JPanel tempPanel = new JPanel();
        tempPanel.setLayout(new FlowLayout());
        tempPanel.add(new JLabel("Key: "));
        tempPanel.add(this.keyTextField);
        center.add(tempPanel, BorderLayout.NORTH);
        
        tempPanel = new JPanel();
        tempPanel.setLayout(new FlowLayout());
        tempPanel.add(this.encryptButton);
        tempPanel.add(this.decryptButton);
        center.add(tempPanel, BorderLayout.SOUTH);
        
        this.add(center, BorderLayout.CENTER);
        
        scrollPane = new JScrollPane(this.resultTextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        this.add(scrollPane, BorderLayout.SOUTH);
    }

    private class DecryptListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            doAction(false);
        }
    }
    
    private class EncryptListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            doAction(true);
        }
    }

    private void doAction(boolean encrypt)
    {
        resultTextArea.setText("");
        String msg = messageTextArea.getText();
        String key = keyTextField.getText();
        String result = "";
        
        if(msg.length() == 0){
            JOptionPane.showMessageDialog(this,
                                          "You must enter a message",
                                          ERROR_DIALOG_MESSAGE_NAME,
                                          JOptionPane.ERROR_MESSAGE);
        }
        else if(key.length() == 0){ 
            JOptionPane.showMessageDialog(this,
                                          "You must enter a key",
                                          ERROR_DIALOG_MESSAGE_NAME,
                                          JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                this.encryptor.validateMessageFormatForDecrytion(msg, encrypt); 
                result = this.encryptor.runMainCipher(msg, key, encrypt);
                resultTextArea.setText(result);
            }
            catch (messageToDecryptNotInRightFormat ex){
                JOptionPane.showMessageDialog(this,
                                              ex.message,
                                              ERROR_DIALOG_MESSAGE_NAME,
                                              JOptionPane.ERROR_MESSAGE);
            }
        }

    }

}
package com.sahabatpetani.util;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;

public class PhoneFormater {
    public void tfPhoneKeyPressed(JTextField tf, java.awt.event.KeyEvent evt) {
        String number = tf.getText();
        int length = number.length();
        char c = evt.getKeyChar();

        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9') {
            if(length<12){
                tf.setEditable(true);
            }else{
                tf.setEditable(false);
            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
                tf.setEditable(true);
            }else{
                tf.setEditable(false);
            }
        }
    }
}

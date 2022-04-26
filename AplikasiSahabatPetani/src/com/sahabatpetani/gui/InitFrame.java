/* 
 * Class untuk memanggil frame
 */
package com.sahabatpetani.gui;

import javax.swing.JFrame;

public class InitFrame {
    public JFrame getFrame(String typeUser) {
        JFrame mainFrame = new JFrame("Sahabat Petani");
        switch (typeUser) {
            case "admin":
                //init admin frame
                break;
        
            default:
                //init user frame
                break;
        }

        return mainFrame;
    }
}

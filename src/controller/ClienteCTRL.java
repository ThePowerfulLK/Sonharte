package controller;

import java.awt.Component;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;

public class ClienteCTRL {

 public void LimpaTela(JInternalFrame Frame) {     
            //limpa os campos     
            for (int i=0; i < Frame.getContentPane().getComponentCount(); i++) {   
                //varre todos os componentes     
                Component c = Frame.getContentPane().getComponent(i);     
                if (c instanceof JTextField) {                           
                    JTextField field = (JTextField) c;   
                    field.setText("");                      
                    }   
                }   
            }

}

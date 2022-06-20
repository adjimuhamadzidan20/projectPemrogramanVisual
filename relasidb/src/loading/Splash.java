/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loading;

/**
 *
 * @author TOSHIBA
 */
import loadingBar.loadingBar;
import login;
import javax.swing.JOptionPane;
public class Splash {
    public static void main(String[] args) {
        loadingBar lb = new loadingBar();
        login lg = new login();
        lb.setVisible(true);
        
            try {
                for(int i = 0; i <= 100; i++){
                
                Thread.sleep(40);
                lb.LoadingValue.setText(Integer.toString(i)+ "%");
                lb.LoadingBar.setValue(i);
                
                if(i == 10){
                    lb.LoadingName.setText("Turn On Program");
                }
                if(i == 20){
                    lb.LoadingName.setText("Loading Database");
                }
                if(i == 50){
                    lb.LoadingName.setText("Connecting Database");
                }
                if(i == 70){
                    lb.LoadingName.setText("Loading Application");
                }
                if(i == 80){
                    lb.LoadingName.setText("Sucsesfully Application");
                }
                if(i == 100){
                    lb.setVisible(false);
                    lg.setVisible(true);
                }
                
            } 
            }
                catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

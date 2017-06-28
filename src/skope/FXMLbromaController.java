/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skope;

import skope.FXMLDocumentController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author felipegadeallopis
 */
public class FXMLbromaController implements Initializable {

    @FXML
    private Text usuario;
    @FXML
    private Text contraseña;
    
    private String c;
    
    private boolean verContraseña = false;
    public String getUsuario() {
        return usuario.getText();
    }

    public void setUsuario(String usuario) {
        this.usuario.setText(usuario);
    }

    public String getContraseña() {
        return contraseña.getText();
    }

    public void setContraseña(String contraseña) {
        c = contraseña;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.contraseña.setText("********");
        
    }

    @FXML
    private void salir(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void verContraseña(ActionEvent event) {
        this.verContraseña = !this.verContraseña;
        if(this.verContraseña){
            this.contraseña.setText(c);
        }else
            this.contraseña.setText("********");
        
    }
    
}

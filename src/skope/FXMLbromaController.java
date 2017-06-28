/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skope;

import java.io.IOException;
import skope.FXMLDocumentController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

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
        if(contraseña.compareTo("") > 0){
            this.contraseña.setText("********");
            c = contraseña;
        } 
            
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        c = "";
        
    }

    @FXML
    private void salir(ActionEvent event) {
        //Cerrar ventana actual
        final Node source = (Node) event.getSource();
        final Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void verContraseña(ActionEvent event) {
        this.verContraseña = !this.verContraseña;
        if(this.verContraseña){
            this.contraseña.setText(c);
        }else{
            if(c.compareTo("") > 0)this.contraseña.setText("********");
        }
            
        
    }
    
}

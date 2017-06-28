/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skope;

import skope.FXMLbromaController;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author felipegadeallopis
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Text txtIniSesion;
    @FXML
    private Text noTienesCuenta;
    @FXML
    private Text crearUna;
    @FXML
    private ImageView bSiguiente;
    @FXML
    private ImageView bIniSesión;
    @FXML
    private ImageView bAtras;
    @FXML
    private Text olvidarContraseña;
    @FXML
    private TextField rellenar;
    
    private String user;
    private String password;
    @FXML
    private BorderPane borderPane;
    @FXML
    private PasswordField passwordField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    private void clicSiguiente(MouseEvent event) {
        this.bSiguiente.setDisable(true);
        this.bSiguiente.setVisible(false);
        this.bAtras.setDisable(false);
        this.bAtras.setVisible(true);
        this.bIniSesión.setDisable(false);
        this.bIniSesión.setVisible(true);
        this.crearUna.setVisible(false);
        this.noTienesCuenta.setVisible(false);
        this.olvidarContraseña.setVisible(true);
        this.user = this.rellenar.getText();
        this.rellenar.clear();
        this.rellenar.setVisible(false);
        this.rellenar.setDisable(true);
        this.passwordField.setVisible(true);
        this.passwordField.setDisable(false);
        this.txtIniSesion.setText("Escribir contraseña");
    }

    public  String getUser() {
        return user;
    }

    public String getPasword() {
        return password;
    }

    @FXML
    private void clicIniSesión(MouseEvent event) throws IOException {
        this.password = this.passwordField.getText();
        this.passwordField.clear();
        System.out.print("Usuario: " + this.user + "\nContraseña: " + this.password + "\n");
        Stage stage =new Stage();
        FXMLLoader loader= new FXMLLoader();
        VBox root =(VBox)loader.load(getClass().getResource("FXMLbroma.fxml").openStream());
        FXMLbromaController ventana =(FXMLbromaController)loader.getController();
        ventana.setUsuario(getUser());
        ventana.setContraseña(getPasword());
        //stage.setResizable(false);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void clicAtras(MouseEvent event) {
        this.bSiguiente.setDisable(false);
        this.bSiguiente.setVisible(true);
        this.bAtras.setDisable(true);
        this.bAtras.setVisible(false);
        this.bIniSesión.setDisable(true);
        this.bIniSesión.setVisible(false);
        this.crearUna.setVisible(true);
        this.noTienesCuenta.setVisible(true);
        this.olvidarContraseña.setVisible(false);
        this.rellenar.clear();
        this.rellenar.setVisible(true);
        this.rellenar.setDisable(false);
        this.passwordField.setVisible(false);
        this.passwordField.setDisable(true);
        this.txtIniSesion.setText("Iniciar sesión");
    }

    @FXML
    private void mouseSaleSiguiente(MouseEvent event) {
        this.bSiguiente.setScaleX(1);
        this.bSiguiente.setScaleY(1);
    }

    @FXML
    private void mouseEntraSiguiente(MouseEvent event) {
        this.bSiguiente.setScaleX(1.02);
        this.bSiguiente.setScaleY(1.02);
    }

    @FXML
    private void mouseSaleIniSes(MouseEvent event) {
        this.bIniSesión.setScaleX(1);
        this.bIniSesión.setScaleY(1);
    }

    @FXML
    private void mouseEntraIniSes(MouseEvent event) {
        this.bIniSesión.setScaleX(1.03);
        this.bIniSesión.setScaleY(1.03);
    }

    @FXML
    private void mouseSaleAtras(MouseEvent event) {
        this.bAtras.setScaleX(1);
        this.bAtras.setScaleY(1);
    }

    @FXML
    private void mouseEntraAtras(MouseEvent event) {
        this.bAtras.setScaleX(1.03);
        this.bAtras.setScaleY(1.03);
    }

    @FXML
    private void noPuedeIniSes(MouseEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("http://www.skype.com"));
    }

    @FXML
    private void facebook(MouseEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("http://www.facebook.com"));
    }

    @FXML
    private void privacidadCookies(MouseEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("http://www.skype.com"));
    }

    @FXML
    private void microsoft(MouseEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("http://www.microsoft.com"));
    }

    @FXML
    private void crearCuenta(MouseEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("http://www.skype.com"));
    }

    @FXML
    private void CondicionesUso(MouseEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("http://www.skype.com"));
    }

    @FXML
    private void olvidaContraeña(MouseEvent event) throws URISyntaxException, IOException {
        Desktop.getDesktop().browse(new URI("http://www.skype.com"));
    }

    
}

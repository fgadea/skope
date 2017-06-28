/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superfx;

import java.awt.MouseInfo;
import java.awt.Point;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author felipegadeallopis
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private ImageView menInicio;
    @FXML
    private ImageView background;
    @FXML
    private Button btnApagar;
    @FXML
    private Button btnAjustes;
    @FXML
    private Button btnExplorereMen;
    @FXML
    private ImageView icono;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.menInicio.setVisible(false);
        this.btnAjustes.setDisable(true);
        this.btnApagar.setDisable(true);
        this.btnExplorereMen.setDisable(true);
    }    

    @FXML
    private void skype(MouseEvent event) throws Exception {
        skope.Main skype = new skope.Main();
        Stage stage = new Stage();
        skype.start(stage);
    }

    @FXML
    private void botonInicio(ActionEvent event) {
        this.menInicio.setVisible(!this.menInicio.isVisible());
        this.btnAjustes.setDisable(!this.btnAjustes.isDisable());
        this.btnApagar.setDisable(!this.btnApagar.isDisable());
        this.btnExplorereMen.setDisable(!this.btnExplorereMen.isDisable());
    }

    @FXML
    private void explorer(ActionEvent event) {
       FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Buscar Imagen");

        // Agregar filtros para facilitar la busqueda
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"),
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("PNG", "*.png")
        );

        // Obtener la imagen seleccionada
        Stage stage = new Stage();
        File imgFile = fileChooser.showOpenDialog(stage);
        // Mostar la imagen
        if (imgFile != null) {
            Image image = new Image("file:" + imgFile.getAbsolutePath());
            this.background.setImage(image);
        }
    
    }

    @FXML
    private void cerrar(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void ajustes(ActionEvent event) {
    }

    @FXML
    private void explordorArchivosMen(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Buscar Imagen");

        // Agregar filtros para facilitar la busqueda

        // Obtener la imagen seleccionada
        Stage stage = new Stage();
        fileChooser.setTitle("explorer");
        File imgFile = fileChooser.showOpenDialog(stage);
    }
    @FXML
    private void moverIcono(MouseEvent event) {
        icono.setLayoutX(event.getSceneX());
        icono.setLayoutY(event.getSceneY());
    }
    
}

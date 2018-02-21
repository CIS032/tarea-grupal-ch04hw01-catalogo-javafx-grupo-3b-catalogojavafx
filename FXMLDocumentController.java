/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menujavafx;

import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Bryan Requenes
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label,textfield,checkbox,combobox,spinnerpresentar;
    @FXML
    TextField textnombre,textced;
    
    @FXML
    private void handleButtonAction1(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("HOLA!");
    }
    @FXML
    private void handleButtonAction2(ActionEvent event) {
        String x = "Nombre: "+textnombre.getText()+"\nCedula: "+textced.getText();
        textfield.setText(x);
    }
    
    ObservableList<String>lista = FXCollections.observableArrayList("Programacion","Base de datos","Estructura de datos");
    ObservableList<String>lista2 = FXCollections.observableArrayList("1","2","3","4");
    @FXML
    ComboBox combo1,combo2;
    @FXML
    private void handleButtonAction3(ActionEvent event) {
         String x = "Materia: "+combo1.getValue()+"\nHoras: "+combo2.getValue();
        combobox.setText(x);
    }
    @FXML
    private CheckBox gato,perro,otros;
    
    @FXML
    private void handleButtonAction4(ActionEvent event) {
        String lista ="Animales seleccionados"+"   ";
        if (gato.isSelected()) {
            lista = lista+ gato.getText()+", ";
        }
        if (perro.isSelected()) {
            lista = lista+ perro.getText()+", ";
        }
        if (otros.isSelected()) {
            lista = lista+ otros.getText()+", ";
        }
        checkbox.setText(lista);
    }
    @FXML
    TextField txtnombre1,txtapellido;
    @FXML
    Spinner spinnerdia,spinnermes,spinneryear;
    @FXML
    SpinnerValueFactory<Integer> dia = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 31,15);
     @FXML
     SpinnerValueFactory<Integer> mes = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 12,6);
     @FXML
     SpinnerValueFactory<Integer> year = new SpinnerValueFactory.IntegerSpinnerValueFactory(1800, 2018,2000);
    @FXML
    private void handleButtonAction5(ActionEvent event) {
       this.spinnerdia.setValueFactory(dia);
       this.spinnermes.setValueFactory(mes);
       this.spinneryear.setValueFactory(year);
        String p;
        p = "Nombre: "+txtnombre1.getText()
                +"\n Apellido: "+txtapellido.getText()
                +"\nDia: "+spinnerdia.getValue()
                +"\nMes: "+spinnermes.getValue()
                +"\nAños: "+spinneryear.getValue();
                
        spinnerpresentar.setText(p);

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        combo1.setValue("Programacion");
        combo1.setItems(lista);
        combo2.setValue("1");
        combo2.setItems(lista2);
        
        
    }   
    
    @FXML
    private TextField usuario;
    @FXML
    private PasswordField contraseña;
    @FXML
    private Button aceptar;
    @FXML
    private ImageView imagen;
        
    @FXML
    private void actionIniciar(ActionEvent event) {
        String Usuario = "Paul";
        String Contraseña = "12345";
        String contra = contraseña.getText();
       
        System.out.println("contrasseña: 12345678985432123456789098765432123456789098765432123456789"+contra);
        if ((usuario.getText().equalsIgnoreCase(Usuario)) && (contra.equals(Contraseña))) {
            
            Alert dialogAlerta = new Alert(Alert.AlertType.INFORMATION);
            dialogAlerta.setContentText("Su usuario ha sido aceptado \n Bienvenido ");
            dialogAlerta.show();
            
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Su usuario o contraseña son incorrectas");
            alert.show();
        }
    }
    
    @FXML
    private RadioButton rbamarillo;
    @FXML
    private RadioButton rbazul;
    @FXML
    private RadioButton rbrojo;
    //@FXML
    //private Button Aceptar;
    @FXML
    private Label texto;
   @FXML
    private Button button; 
    @FXML
    private void actionAceptar(ActionEvent event) {
        String mensaje="Color seleccionado: ";
        if (rbazul.isSelected()) {
            mensaje=mensaje+" azul";
        }
        if (rbrojo.isSelected()) {
            mensaje=mensaje+" rojo";
        }
        if (rbamarillo.isSelected()) {
            mensaje=mensaje+"amarillo";
        }
        
        texto.setText(mensaje);
    }
    
    @FXML
    private Label texto1;
    @FXML
    private ToggleButton uno;
    @FXML
    private ToggleButton dos;
    @FXML
    private ToggleButton tres;
    
    int valor = 0;
    String mensaje = "";
    
    @FXML
    private void selec1 (ActionEvent event){
        valor = valor+ 1;
        mensaje = mensaje+valor+"-";
        texto1.setText(mensaje);
    }
    
    @FXML
    private void selec2 (ActionEvent event){
        valor = valor+ 2;
        mensaje = mensaje+valor+"-";
        texto1.setText(mensaje);
    }
    
    @FXML
    private void selec3 (ActionEvent event){
        valor = valor+ 3;
        mensaje = mensaje+valor+"-";
        texto1.setText(mensaje);
    }
    
    ////////////
    @FXML
    private Label texto2;
    @FXML
    private TextArea text;
    
    @FXML
    private void formKeyReleased(javafx.scene.input.KeyEvent evt) {                                 
       
       String txt="Ha dejado de presionar la tecla ";
       texto2.setText(txt);
    }                                
    @FXML
    private void formKeyPressed(javafx.scene.input.KeyEvent evt) { 
        texto2.setText("");
        String txt="";
       // char ch = getAsciiCharFromKeyCode(evt.getKeyCode());
       // char s=(char)KeyCode.UNDEFINED;
        if (evt.getCode()==KeyCode.ENTER) {
            txt="Ha presionado la tecla ENTER ";

        }else if (evt.getCode()==KeyCode.A){
            txt="Ha presionado la tecla A ";
        }else if(evt.getCode()==KeyCode.SPACE){    
            txt="Ha presionado la tecla ESPACIO ";
        }else{
            txt="Ha presionado otra tecla ";
        }
         texto2.setText(txt);  
    }
       

    @FXML
    private void mousepresion(MouseEvent evt){
       String txt="HA DADO CLICK ";
        
      texto.setText(txt);
    }
    
    /////
    @FXML
    private Label mensaje1;
    @FXML private TextArea area;
    
   @FXML
   public void MouseEntered(){
     mensaje1.setText("Ha entrado en el area de texo");
   }
   
   @FXML
   public void MouseExited(){
       mensaje1.setText("Ha salido del area de texto");
   }
   
   @FXML
   public void MouseClicked(){
       mensaje1.setText("Ha dado un click");
   }
    ////
   
   @FXML
    private Button boton;
    
    @FXML private int n=6;
    @FXML int n1=70;
    @FXML
    private void MouseMoved(MouseEvent evt) {                                
        boton.setLayoutX(n*2);
    }                               
    @FXML
    private void MouseDragged(MouseEvent evt) {                                   
        // TODO add your handling code here:
       boton.setLayoutY(n+10);
       
    }                                  
    @FXML
    private void pnMouseMoved(MouseEvent evt) {                                 
       
       boton.setText("HOLA");
    }
}

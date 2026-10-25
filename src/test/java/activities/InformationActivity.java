package activities;

import control.Button;
import control.Label;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import sesion.Sesion;

public class InformationActivity  {

    private String name ;
    public Label informationLabel = new Label(AppiumBy.xpath("//android.view.View[@content-desc=\""+name+"\"]"));

    // Pantalla de detalle del contacto: boton "atras" del sistema Android
    public void goBack() {
        Sesion.getSesion().getDevice().navigate().back();
}
}

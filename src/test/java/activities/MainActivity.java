package activities;

import control.Button;
import control.Label;
import control.TextBox;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class MainActivity {

    public Button addButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Create new contact\"]"));
    public Label firstItemLabel = new Label(By.xpath("//android.widget.TextView[@resource-id=\"com.android.contacts:id/header\"]"));

    // Nombre del primer contacto en la lista de contactos
    public Label firstContactNameLabel = new Label(By.xpath("(//android.widget.TextView[@resource-id=\"com.android.contacts:id/cliv_name_textview\"])[1]"));
}

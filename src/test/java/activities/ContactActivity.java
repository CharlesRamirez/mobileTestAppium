package activities;

import control.Button;
import control.TextBox;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

import java.awt.*;

public class ContactActivity {

    public static Button cancelButton = new Button(By.xpath("//android.widget.Button[@resource-id='com.android.contacts:id/left_button']"));
    public static TextBox firstNameTextBox = new TextBox(By.xpath("//android.widget.EditText[@text='First name']"));
    public static TextBox lastNameTextBox = new TextBox(By.xpath("//android.widget.EditText[@text='Last name']"));
    public static TextBox numberTextBox = new TextBox(By.xpath("//android.widget.EditText[@text='Phone']"));
    public static Button saveButton = new Button(By.xpath("//android.widget.Button[@resource-id=\"com.android.contacts:id/editor_menu_save_button\"]"));
}

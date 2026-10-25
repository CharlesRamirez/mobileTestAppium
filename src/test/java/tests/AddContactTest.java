package tests;

import activities.ContactActivity;
import activities.InformationActivity;
import activities.MainActivity;
//import activities.whendo.TaskActivity;
//import activities.whendo.MainActivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sesion.Sesion;

import static activities.ContactActivity.*;

public class AddContactTest {

    MainActivity mainActivity = new MainActivity();
    ContactActivity taskActivity = new ContactActivity();
    InformationActivity informationActivity = new InformationActivity();

    @BeforeEach
    public void setup(){

    }

    @AfterEach
    public void tearDown(){
        Sesion.getSesion().closeSesion();
    }

    @Test
    public void addContactTest(){

        mainActivity.addButton.click();
        ContactActivity.cancelButton.click();
        ContactActivity.firstNameTextBox.setText("Charles");
        ContactActivity.lastNameTextBox.setText("Gegner");
        ContactActivity.numberTextBox.setText("+59163567962");
        ContactActivity.saveButton.click();


        Assertions.assertEquals("+591 63567962", mainActivity.firstItemLabel.getText());

        // Volver a la lista de contactos y verificar el nombre del contacto creado
        informationActivity.goBack();

        Assertions.assertEquals("Charles Gegner", mainActivity.firstContactNameLabel.getText(),
                "El nombre del contacto en la lista no coincide con el ingresado");
    }
}

package org.vaadin.example;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route(value="contact", layout=MainView.class)
public class ContactView extends VerticalLayout{
    public ContactView(){
        this.setMargin(true);
        TextField nameField=new TextField();
        nameField.setLabel("Your Name: ");
        this.add(nameField);

        EmailField emailField=new EmailField();
        emailField.setLabel("Email: ");
        this.add(emailField);

        TextField phoneField=new TextField();
        phoneField.setLabel("Your Phone Number: ");
        this.add(phoneField);

        TextArea commentField = new TextArea("Description");
        commentField.setLabel("Your Comment: ");
        commentField.setWidth("70%");
        commentField.setHeight("500px");
        this.add(commentField);
    }
}
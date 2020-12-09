package org.vaadin.example;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "about", layout = MainView.class)
public class AboutView extends VerticalLayout{
    public AboutView(){
        this.setMargin(true);
        this.add(new Html("<h1>IMSOFA</h1>"));
        this.add(new Html("<ul><li>Address: YZU</li><li>Phone: 123</li><li>Email: imsofa.bp@gmail.com</li></ul>"));
    }
}
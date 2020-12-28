package org.vaadin.example;

import com.vaadin.flow.component.Html;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "about", layout = MainView.class)
public class AboutView extends VerticalLayout{
    public AboutView(){
        this.setMargin(true);
        this.add(new Html("<b>Hello~</b>"));
    }
}
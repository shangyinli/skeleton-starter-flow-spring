package org.vaadin.example;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "products2", layout = MainView.class)
public class ProductView2 extends HorizontalLayout{
    public ProductView2(){
        for(int i=0; i<100; i++){
            Label label=new Label("test1");
            this.add(label);
        }
    }
}
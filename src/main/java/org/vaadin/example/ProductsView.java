package org.vaadin.example;

import java.util.Random;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainView.class)
public class ProductsView extends VerticalLayout{
    public ProductsView(){
        this.setMargin(true);
        Random random=new Random();
        for(int i=0; i<100; i++){
            ProductView product=new ProductView(
                "https://picsum.photos/200/100?random="+random.nextInt(), 
                "Test", 
                "Test Description");
            add(product);
        }
    }
}
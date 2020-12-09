package org.vaadin.example;

import com.github.appreciated.card.Card;
import com.github.appreciated.card.content.IconItem;
import com.vaadin.flow.component.html.Image;

public class ProductView extends Card {
    public ProductView(String image, String title, String description){
        super(new IconItem(new Image(image, ""), title, description));
        this.setWidth("100%");
    }
}
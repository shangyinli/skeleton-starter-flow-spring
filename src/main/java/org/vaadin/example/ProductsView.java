package org.vaadin.example;

import java.util.Random;

import com.github.appreciated.card.Card;
import com.github.appreciated.card.content.IconItem;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainView.class)
public class ProductsView extends VerticalLayout {
    public ProductsView() {
        this.setMargin(true);
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            Card card = new Card();
            Image img = new Image("https://picsum.photos/300/200?random=" + random.nextInt(), "");
            card.add(new IconItem(img, "Title", "description"));
            card.setWidth("500px");
            this.add(card);
        }
    }
}
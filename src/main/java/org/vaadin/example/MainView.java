package org.vaadin.example;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
// import com.vaadin.flow.theme.Theme;
// import com.vaadin.flow.theme.material.Material;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and use @Route
 * annotation to announce it in a URL as a Spring managed bean.
 * <p>
 * A new instance of this class is created for every new user and every browser
 * tab/window.
 * <p>
 * The main view contains a text field for getting the user name and a button
 * that shows a greeting message in a notification.
 */

@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
// @Theme(value=Material.class)
public class MainView extends AppLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed
     *                bean.
     */
    public MainView() {
        Tabs tabs = new Tabs();
        this.addToNavbar(tabs);

        Tab homeTab = new Tab();
        tabs.add(homeTab);

        RouterLink homeLink = new RouterLink("Home", ProductsView.class);
        homeTab.add(homeLink);

        Tab aboutTab = new Tab();
        tabs.add(aboutTab);

        RouterLink aboutLink = new RouterLink("About", AboutView.class);
        aboutTab.add(aboutLink);
    }

}

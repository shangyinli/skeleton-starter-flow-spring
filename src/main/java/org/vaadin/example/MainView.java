package org.vaadin.example;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.material.Material;

/**
 * A sample Vaadin view class.
 * <p>
 * To implement a Vaadin view just extend any Vaadin component and
 * use @Route annotation to announce it in a URL as a Spring managed
 * bean.
 * Use the @PWA annotation make the application installable on phones,
 * tablets and some desktop browsers.
 * <p>
 * A new instance of this class is created for every new user and every
 * browser tab/window.
 */
@PWA(name = "Vaadin Application",
        shortName = "Vaadin App",
        description = "This is an example Vaadin application.",
        enableInstallPrompt = false)
@CssImport("./styles/shared-styles.css")
@CssImport(value = "./styles/vaadin-text-field-styles.css", themeFor = "vaadin-text-field")
@Theme(value = Material.class)
public class MainView extends AppLayout {

    /**
     * Construct a new Vaadin view.
     * <p>
     * Build the initial UI state for the user accessing the application.
     *
     * @param service The message service. Automatically injected Spring managed bean.
     */
    public MainView() {
        
        Image img = new Image("https://i.imgur.com/GPpnszs.png", "Vaadin Logo");
        
        
        RouterLink routerLink=new RouterLink(null, ProductsView.class);
        routerLink.add("Home");
        Tab homeTab=new Tab();
        homeTab.add(routerLink);

        RouterLink aboutLink=new RouterLink(null, AboutView.class);
        aboutLink.add("About");
        Tab aboutTab=new Tab();
        aboutTab.add(aboutLink);

        RouterLink contactLink=new RouterLink(null, ContactView.class);
        contactLink.add("Contact");
        Tab contactTab=new Tab();
        contactTab.add(contactLink);

        Tabs tabs = new Tabs(homeTab, aboutTab, contactTab);
        img.setHeight("44px");
        addToNavbar(img);
        addToNavbar(tabs);
        tabs.setAutoselect(true);
        tabs.setSelectedTab(homeTab);
    }


}

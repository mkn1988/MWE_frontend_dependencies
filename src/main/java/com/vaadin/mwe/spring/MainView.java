package com.vaadin.mwe.spring;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.router.Route;
import com.vaadin.mwe.spring.dynamic.DynamicComponent;

@Route
public class MainView extends AppLayout {

  private static final long serialVersionUID = 1L;

  public MainView(@Autowired Collection<DynamicComponent> comps) {
    
    comps.forEach(comp -> {
      addToDrawer(new Button(comp.getDynamicId(), e -> showRouterLayoutContent(comp)));
    });
  }

}

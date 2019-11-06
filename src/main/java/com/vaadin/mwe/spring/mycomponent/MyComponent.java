package com.vaadin.mwe.spring.mycomponent;

import org.springframework.stereotype.Component;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.spring.annotation.UIScope;
import com.vaadin.mwe.spring.dynamic.DynamicComponent;

@Component
@UIScope
public class MyComponent extends FormLayout implements DynamicComponent {

  private static final long serialVersionUID = 1L;

  public MyComponent() {
    TextField textField = new TextField();
    textField.setLabel("my field");
    add(textField);
  }
  
  @Override
  public String getDynamicId() {
    return "myComponent";
  }

}

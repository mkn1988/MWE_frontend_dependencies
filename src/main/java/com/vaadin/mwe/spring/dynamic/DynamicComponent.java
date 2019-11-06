package com.vaadin.mwe.spring.dynamic;

import com.vaadin.flow.component.HasElement;

/**
 * Interface that every dynamic component implements.
 */
public interface DynamicComponent extends HasElement {
  
  String getDynamicId();
  
}

package com.github.datasnap.controller;



public class SampleObjectForTest {
  @Foo private final int annotatedField;
  private final String stringField;
  private final long longField;
 // private final Class<?> clazzField;

  public SampleObjectForTest() {
    annotatedField = 5;
    stringField = "someDefaultValue";
    longField = 1234;
  }
}


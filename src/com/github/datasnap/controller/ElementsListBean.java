package com.github.datasnap.controller;

import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;

// @Data
// @EqualsAndHashCode
// @ToString
// @JsonSerialize(using = ElementsListBean.CustomSerializer.class)
public class ElementsListBean<T> {

    public ElementsListBean()
    {
    }

    public ElementsListBean(final String fieldName, final List<T> elements)
    {
        this.fieldName = fieldName;
        this.elements = elements;
    }

    private String fieldName;

    private List<T> elements;

    public int length()
    {
        return (this.elements != null) ? this.elements.size() : 0;
    }
    
    
    

    /*private static class CustomSerializer extends JsonSerializer<Object> {
        public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider) throws IOException,
                JsonProcessingException
        {
            if (value instanceof ElementsListBean) {
                final ElementsListBean<?> o = (ElementsListBean<?>) value;
                jgen.writeStartObject();
                jgen.writeArrayFieldStart(o.getFieldName());
                for (Object e : o.getElements()) {
                    jgen.writeObject(e);
                }
                jgen.writeEndArray();
                jgen.writeNumberField("length", o.length());
                jgen.writeEndObject();
            }
        }
    }*/
}

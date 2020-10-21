/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.mimp.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

/**
 *
 * @author Omar
 */
public class FindAllByFieldBean implements Serializable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object field;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Object value;

    public Object getField() {
        return field;
    }

    public void setField(Object field) {
        this.field = field;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}

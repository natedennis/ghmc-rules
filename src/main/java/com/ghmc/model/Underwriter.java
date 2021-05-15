package com.ghmc.model;

import java.io.Serializable;

public class Underwriter implements Serializable {

    private static final long serialVersionUID = -1223074598762261322L;
    private String name;
    private UnderwriterType underwriterType;

    public Underwriter() {
    }

    public Underwriter(String name, UnderwriterType underwriterType) {
        this.name = name;
        this.underwriterType = underwriterType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UnderwriterType getUnderwriterType() {
        return underwriterType;
    }

    public void setUnderwriterType(UnderwriterType underwriterType) {
        this.underwriterType = underwriterType;
    }
}

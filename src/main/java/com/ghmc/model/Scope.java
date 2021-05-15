package com.ghmc.model;

import java.io.Serializable;

public class Scope implements Serializable {


    private static final long serialVersionUID = 2835810136122765469L;
    private ScopeType type;

    public Scope() {
    }

    public Scope(ScopeType type) {
        this.type = type;
    }

    public ScopeType getType() {
        return type;
    }

    public void setType(ScopeType type) {
        this.type = type;
    }


}

package com.ghmc.model;

import java.io.Serializable;

public class RuleEvent implements Serializable {


    private static final long serialVersionUID = 5492947090623419012L;
    private String rule;
    private String response;

    public RuleEvent() {
    }

    public RuleEvent(String rule, String response) {
        this.rule = rule;
        this.response = response;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}

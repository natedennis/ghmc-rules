package com.ghmc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Loan implements Serializable {

    private static final long serialVersionUID = 4193167881120219136L;
    private String id;

    private Applicant applicant;

    private Underwriter underwriter;

    private int amount;
    private int deposit;

    private Set<RuleEvent> eligibilityList = new HashSet<>();
    private Set<RuleEvent> pricingList = new HashSet<>();
    private Set<RuleEvent> securityList = new HashSet<>();


    public Loan() {
    }

    public Loan(String id, Applicant applicant, Underwriter underwriter, int amount, int deposit) {
        this.id = id;
        this.applicant = applicant;
        this.underwriter = underwriter;
        this.amount = amount;
        this.deposit = deposit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Underwriter getUnderwriter() {
        return underwriter;
    }

    public void setUnderwriter(Underwriter underwriter) {
        this.underwriter = underwriter;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public Set<RuleEvent> getEligibilityList() {
        return eligibilityList;
    }

    public void setEligibilityList(Set<RuleEvent> eligibilityList) {
        this.eligibilityList = eligibilityList;
    }

    public Set<RuleEvent> getPricingList() {
        return pricingList;
    }

    public void setPricingList(Set<RuleEvent> pricingList) {
        this.pricingList = pricingList;
    }

    public Set<RuleEvent> getSecurityList() {
        return securityList;
    }

    public void setSecurityList(Set<RuleEvent> securityList) {
        this.securityList = securityList;
    }
}

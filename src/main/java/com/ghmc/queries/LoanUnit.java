package com.ghmc.queries;

import com.ghmc.model.Loan;
import com.ghmc.model.Scope;
import org.kie.kogito.rules.DataSource;
import org.kie.kogito.rules.DataStore;
import org.kie.kogito.rules.RuleUnitData;

public class LoanUnit implements RuleUnitData {

    private DataStore<Loan> loans;
    private DataStore<Scope> scope;

    public LoanUnit() {
        this(DataSource.createStore(), DataSource.createStore());
    }

    public LoanUnit(DataStore<Loan> loans, DataStore<Scope> scope) {
        this.loans = loans;
        this.scope = scope;
    }

    public DataStore<Loan> getLoans() {
        return loans;
    }

    public void setLoans(DataStore<Loan> loans) {
        this.loans = loans;
    }

    public DataStore<Scope> getScope() {
        return scope;
    }

    public void setScope(DataStore<Scope> scope) {
        this.scope = scope;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.loan;

import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.lang.Math;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author josephpriolo
 */
@ManagedBean(name="loanBean") @SessionScoped
public class LoanBean {
    private float loanAmount;
    private Integer loanLength;
    private float interestRate;
    private String monthlyPayment;
    private String totalInterest;
    
    public float getLoanAmount() {
        return loanAmount;
    }
 
    public void setLoanAmount(float loanAmount) {
        this.loanAmount = loanAmount;
    }
    
    public Integer getLoanLength() {
        return loanLength;
    }
 
    public void setLoanLength(Integer loanLength) {
        this.loanLength = loanLength;
    }
    
    public float getInterestRate() {
        return interestRate;
    }
 
    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }
    
    public String getMonthlyPayment() {
        return monthlyPayment;
    }
 
    public void setMonthlyPayment(String monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
    
    public String getTotalInterest() {
        return totalInterest;
    }
 
    public void setTotalInterest(String totalInterest) {
        this.totalInterest = totalInterest;
    }
    
    public void calculatePayment() throws IOException {
        
        double totalPaid = 0;
        double monthlyPay = 0;
        double totalInt = 0;
        
        double monthlyInterest = (interestRate/(double)100)/(double)12;
        
        monthlyPay = (loanAmount * monthlyInterest)/
                (1 - Math.pow(1 + monthlyInterest, -loanLength));
        
        totalPaid = monthlyPay * loanLength;
        totalInt = totalPaid - loanAmount;
        
        monthlyPayment = String.format("%.2f", monthlyPay);
        totalInterest = String.format("%.2f", totalInt);

        ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
        ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
    } 
}

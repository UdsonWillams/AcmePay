package br.com.acme_pay;

import java.util.List;

public class Customer {
    private String customerDocument;
    private List<Account> customerAccount;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public String getCustomerDocument() {
        return customerDocument;
    }

    public void setCustomerDocument(String customerDocument) {
        this.customerDocument = customerDocument;
    }

    public List<Account> getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(List<Account> customerAccount) {
        this.customerAccount = customerAccount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}

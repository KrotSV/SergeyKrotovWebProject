package entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

public class CreditCard implements Serializable{
    private int cardNumber;
    private Date validity;
    private int accountId;
    private int clientId;
    private TypeCard typeCard;


    private double limit;

    public CreditCard(){}

    public CreditCard(int cardNumber, int clientId, Date validity, TypeCard typeCard, int accountId) {
        this.cardNumber = cardNumber;
        this.clientId = clientId;
        this.accountId = accountId;
        this.validity = validity;
        this.typeCard = typeCard;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public Date getValidity() {
        return validity;
    }

    public TypeCard getTypeCard() {
        return typeCard;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getLimit() {
        return limit;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public void setTypeCard(TypeCard typeCard) {
        this.typeCard = typeCard;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}

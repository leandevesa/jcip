package com.jcip.controller.chapter.three.ex.three;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InmutableReservation {

    private String transactionId;
    private Date creationDate;
    private List<CollectAttempt> collectAttempts;

    public InmutableReservation(String transactionId, Date creationDate) {
        this.transactionId = transactionId;
        this.creationDate = creationDate;
        this.collectAttempts = new ArrayList<CollectAttempt>();
    }
    public InmutableReservation(String transactionId, Date creationDate, List<CollectAttempt> collectAttempts) {
        this.transactionId = transactionId;
        this.creationDate = creationDate;
        this.collectAttempts = collectAttempts;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public List<CollectAttempt> getCollectAttempts() {
        return collectAttempts;
    }

    public void addCollectionAttempt(CollectAttempt one) {
        collectAttempts.add(one);
    }

    public static class CollectAttempt {
        private Date creationDate;
        private String binCard;
        private String lastDigits;
        private String token;


        public Date getCreationDate() {
            return creationDate;
        }

        public void setCreationDate(Date creationDate) {
            this.creationDate = creationDate;
        }

        public String getBinCard() {
            return binCard;
        }

        public void setBinCard(String binCard) {
            this.binCard = binCard;
        }

        public String getLastDigits() {
            return lastDigits;
        }

        public void setLastDigits(String lastDigits) {
            this.lastDigits = lastDigits;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }
    }
}
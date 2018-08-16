package com.jcip.controller.chapter.three.ex.four;

import java.util.Date;
import java.util.Map;

public class Request {

    private Map<String, String> parameters;
    private Date fromDate;
    private Date toDate;
    private String destination;

    public Request(Map<String, String> parameters, Date fromDate,
                   Date toDate, String destination) {

        this.parameters = parameters;
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.destination = destination;
    }

    public String getParameter(String parameterId) {
        return this.parameters.get(parameterId);
    }

    public Date getFrom() {
        return this.fromDate;
    }

    public Date getTo() {
        return this.toDate;
    }

    public String getDestination() {
        return this.destination;
    }
}
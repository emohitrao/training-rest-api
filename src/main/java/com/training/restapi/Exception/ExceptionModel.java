package com.training.restapi.Exception;

import java.util.Date;

public class ExceptionModel {



    private String errorCode;

    private String errorDesc;

    private Date timestamp;

    public ExceptionModel( String errorCode, String errorDesc, Date timestamp) {

        this.errorCode = errorCode;
        this.errorDesc = errorDesc;
        this.timestamp = timestamp;
    }

    protected ExceptionModel() {
    }



    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}

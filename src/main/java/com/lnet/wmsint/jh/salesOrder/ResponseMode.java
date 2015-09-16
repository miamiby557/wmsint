package com.lnet.wmsint.jh.salesOrder;

public class ResponseMode {
    private String _companyCode;
    private String _billCode;
    private String _headId;
    private String _receiveStatus;
    private String _errorReason;

    public void set_companyCode(String _companyCode) {
        this._companyCode = _companyCode;
    }

    public void set_billCode(String _billCode) {
        this._billCode = _billCode;
    }

    public void set_headId(String _headId) {
        this._headId = _headId;
    }

    public void set_receiveStatus(String _receiveStatus) {
        this._receiveStatus = _receiveStatus;
    }

    public void set_errorReason(String _errorReason) {
        this._errorReason = _errorReason;
    }

    public String get_billCode() {
        return _billCode;
    }

    public String get_companyCode() {
        return _companyCode;
    }

    public String get_headId() {
        return _headId;
    }

    public String get_receiveStatus() {
        return _receiveStatus;
    }

    public String get_errorReason() {
        return _errorReason;
    }
}
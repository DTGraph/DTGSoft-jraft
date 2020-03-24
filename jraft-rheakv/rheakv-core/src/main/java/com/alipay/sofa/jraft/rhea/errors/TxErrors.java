package com.alipay.sofa.jraft.rhea.errors;

public class TxErrors extends ApiException {
    private static final long serialVersionUID = -1581764185707039953L;

    public TxErrors() {
    }

    public TxErrors(String message) {
        super(message);
    }

    public TxErrors(String message, Throwable cause) {
        super(message, cause);
    }

    public TxErrors(Throwable cause) {
        super(cause);
    }
}

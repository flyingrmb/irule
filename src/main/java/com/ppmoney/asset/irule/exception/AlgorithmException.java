package com.ppmoney.asset.irule.exception;

/**
 * Created by paul on 2018/5/12.
 */
public class AlgorithmException extends Exception {
    public AlgorithmException() {
        super();
    }

    public AlgorithmException(String desc) {
        super(desc);
    }

    public AlgorithmException(String desc, Throwable th) {
        super(desc, th);
    }
}

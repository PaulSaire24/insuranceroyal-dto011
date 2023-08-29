package com.bbva.pisd.dto.insurance.interfaces;

public interface PISDErrorsInterface {

    String getAdviceCode();
    boolean isRollback();
    String getMessage();

}

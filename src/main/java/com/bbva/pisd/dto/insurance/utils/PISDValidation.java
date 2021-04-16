package com.bbva.pisd.dto.insurance.utils;

import com.bbva.apx.exception.business.BusinessException;

public class PISDValidation {

    private PISDValidation() {

    }

    public static BusinessException build(PISDErrors error) {
        return new BusinessException(error.getAdviceCode(), error.isRollback(), error.getMessage());
    }
}

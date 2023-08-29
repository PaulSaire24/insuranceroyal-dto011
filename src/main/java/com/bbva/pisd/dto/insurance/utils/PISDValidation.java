package com.bbva.pisd.dto.insurance.utils;

import com.bbva.apx.exception.business.BusinessException;
import com.bbva.pisd.dto.insurance.interfaces.PISDErrorsInterface;

public class PISDValidation {

    private PISDValidation() {

    }

    public static BusinessException build(PISDErrors error) {
        return new BusinessException(error.getAdviceCode(), error.isRollback(), error.getMessage());
    }

    public static BusinessException buildV2(PISDErrorsInterface error) {
        return new BusinessException(error.getAdviceCode(), error.isRollback(), error.getMessage());
    }
}

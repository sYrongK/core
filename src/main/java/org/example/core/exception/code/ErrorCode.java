package org.example.core.exception.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    FORBIDDEN(90001, "금지된 요청입니다.")
    ;

    private final int code;
    private final String defaultMessage;
}

package org.example.core.exception.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    FORBIDDEN(90001, "금지된 요청입니다."),
    NOT_FOUND(90002, "요청을 찾을 수 없습니다.")
    ;

    private final int code;
    private final String defaultMessage;
}

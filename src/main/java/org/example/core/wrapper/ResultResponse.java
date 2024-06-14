package org.example.core.wrapper;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultResponse<T> implements Serializable {

    private int status;
    private int code;
    private String message;
    private T result;

    public ResultResponse() {
        this.status = HttpStatus.OK.value();
        this.message = "SUCCESS";
    }

    public ResultResponse(HttpStatus httpStatus) {
        this.status = httpStatus.value();
    }

    public ResultResponse(T result) {
        this.status = HttpStatus.OK.value();
        this.message = "SUCCESS";
        this.result = result;
    }

    public ResultResponse(int code, String message) {
        this.status = HttpStatus.OK.value();
        this.code = code;
        this.message = message;
    }
}

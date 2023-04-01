package com.bluespoon.echo.aspect;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.bluespoon.echo.model.GeneralErrorResponse;

@RestControllerAdvice
public class ExceptionControllerAdvice {
    /**
     * ここで定義しない不特定の例外を捕捉して、その他のエラーとしてステータスコード、レスポンスヘッダ、ボディを生成する。
     * @param ex
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    protected ResponseEntity<GeneralErrorResponse> handleAllException(Exception ex) {
        GeneralErrorResponse ger = new GeneralErrorResponse();
        ger.setType("other");
        ger.setTitle("There were some kind of problems in the request.");

        return new ResponseEntity<GeneralErrorResponse>(ger, HttpStatus.INTERNAL_SERVER_ERROR);
    }

}

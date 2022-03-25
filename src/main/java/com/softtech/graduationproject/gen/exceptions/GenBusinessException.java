package com.softtech.graduationproject.gen.exceptions;


import com.softtech.graduationproject.gen.enums.BaseErrorMessage;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
@RequiredArgsConstructor
@Data
public class GenBusinessException extends RuntimeException{

    private final BaseErrorMessage baseErrorMessage;
}

package com.example.petshopstudy.service.exceptions;

import java.io.Serial;

public class ObjetoNaoEncontradoException extends RuntimeException{

    private static final long serialVersionUID = -2036306774403089526L;

    public ObjetoNaoEncontradoException(String msg){
        super(msg);
    }

    public ObjetoNaoEncontradoException(String msg, Throwable cause){
        super(msg, cause);
    }


}

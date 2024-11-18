package br.com.mtanuri.validator.impl;

import br.com.mtanuri.validator.Validator;

public class EmailValidator implements Validator {
    public EmailValidator(String mail) {
    }

    @Override
    public boolean validate() {
        return false;
    }
}

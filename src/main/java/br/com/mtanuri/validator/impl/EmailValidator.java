package br.com.mtanuri.validator.impl;

import br.com.mtanuri.validator.Validator;

public class EmailValidator implements Validator {

    String mail;

    public EmailValidator(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean validate() {

        if (this.mail == null){
            return false;
        }

        if (!this.mail.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")){
            return false;
        }
        return true;
    }
}

package br.com.mtanuri.validator.impl;

import br.com.mtanuri.validator.Validator;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    private final String mail;
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
        "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$"
    );

    public EmailValidator(String mail) {
        this.mail = mail;
    }

    @Override
    public boolean validate() {
        return this.mail != null && !this.mail.isBlank() && EMAIL_PATTERN.matcher(this.mail).matches();
    }
}

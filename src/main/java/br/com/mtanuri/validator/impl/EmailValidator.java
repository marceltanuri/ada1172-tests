package br.com.mtanuri.validator.impl;

import br.com.mtanuri.validator.Validator;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {
    private static final String EMAIL_REGEX =
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    private final String email;

    public EmailValidator(String email) {
        this.email = email;
    }

    @Override
    public boolean validate() {
        if (email == null || email.isEmpty()) {
            return false;
        }
        return EMAIL_PATTERN.matcher(email).matches();
    }
}

package com.wordz.domain;

import org.junit.jupiter.api.Test;

import javax.naming.InvalidNameException;

import static org.assertj.core.api.Assertions.*;

public class UsernameTest {
    @Test
    public void convertsToLowerCase() throws InvalidNameException {
        var username = new Username("SirLara35179");
        String actual = username.asLowerCase();
        assertThat(actual).isEqualTo("sirlara35179");
    }
    @Test
    public void rejectsShortName() {
        assertThatExceptionOfType(InvalidNameException.class)
                .isThrownBy(()->new Username("Abc"));
    }
    @Test
    public void acceptsMinimumLengthName() {
        assertThatNoException()
                .isThrownBy(()->new Username("Abcd"));
    }
}

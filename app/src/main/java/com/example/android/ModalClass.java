package com.example.android;

import android.widget.Button;

public class ModalClass {

    private String question;
    private Button option_A, option_B, option_C, option_D;

    public ModalClass() {
    }

    public ModalClass(String question, Button option_A, Button option_B, Button option_C, Button option_D) {
        this.question = question;
        this.option_A = option_A;
        this.option_B = option_B;
        this.option_C = option_C;
        this.option_D = option_D;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Button getOption_A() {
        return option_A;
    }

    public void setOption_A(Button option_A) {
        this.option_A = option_A;
    }

    public Button getOption_B() {
        return option_B;
    }

    public void setOption_B(Button option_B) {
        this.option_B = option_B;
    }

    public Button getOption_C() {
        return option_C;
    }

    public void setOption_C(Button option_C) {
        this.option_C = option_C;
    }

    public Button getOption_D() {
        return option_D;
    }

    public void setOption_D(Button option_D) {
        this.option_D = option_D;
    }
}

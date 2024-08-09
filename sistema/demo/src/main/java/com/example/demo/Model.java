package com.example.demo;

import java.util.List;

public class Model {

    private String name;
    private String phone;
    private List<Integer> selectedNumbers;

    public Model() {

    }

    public Model(String name, String phone, List<Integer> selectedNumbers) {
        this.name = name;
        this.phone = phone;
        this.selectedNumbers = selectedNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Integer> getSelectedNumbers() {
        return selectedNumbers;
    }

    public void setSelectedNumbers(List<Integer> selectedNumbers) {
        this.selectedNumbers = selectedNumbers;
    }
}

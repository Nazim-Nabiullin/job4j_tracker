package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String lastNameAndNameAndPatronymic;
    private String group;
    private Date receipts;

    public String getLastNameAndNameAndPatronymic() {
        return lastNameAndNameAndPatronymic;
    }

    public void setLastNameAndNameAndPatronymic(String lastNameAndNameAndPatronymic) {
        this.lastNameAndNameAndPatronymic = lastNameAndNameAndPatronymic;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getReceipts() {
        return receipts;
    }

    public void setReceipts(Date receipts) {
        this.receipts = receipts;
    }
}

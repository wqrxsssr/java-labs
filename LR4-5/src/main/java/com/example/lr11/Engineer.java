package com.example.lr11;

public class Engineer extends Professional {
    private String field;

    public Engineer(String name, int experience, double salary, String field) {
        super(name, experience, salary);
        this.field = field;
    }

    public String getField() { return field; }
    public void setField(String field) { this.field = field; }

    public String getResponsibility() {
        return "Проектирование";
    }

    public void work(String project, int days) {
        System.out.println("Работаю над проектом " + project + " уже " + days + " дней");
    }
}
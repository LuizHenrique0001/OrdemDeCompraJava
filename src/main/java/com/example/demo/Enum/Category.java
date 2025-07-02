package com.example.demo.Enum;

public enum Category {

    ESCRITORIO(1),
    LIMPEZA(2),
    FERRAMENTA(3),
    HARDWARE(4);

    private int code;

    private Category(Integer code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Category velueOf(int code) {
        for (Category category : Category.values()) {
            if (category.code == code) {
                return category;
            }

        }
        throw new IllegalArgumentException("Invalid Category code");
    }
}

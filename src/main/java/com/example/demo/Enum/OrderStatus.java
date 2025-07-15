package com.example.demo.Enum;

public enum OrderStatus {

    AGUARDANDO_AUTORIZACAO_A1(1),
    AGUARDANDO_AUTORIZACAO_A2(2),
    AGUARDANDO_AUTORIZACAO_A3(3),
    AUTORIZADO_AGUARDANDO_COMPRA(4),
    COMPRADO_AGUARDANDO_RETIRADA(5),
    ORDEM_FINALIZADA(6);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderStatus valueOf(int code) {
        for (OrderStatus orderStatus : OrderStatus.values()) {
            if (orderStatus.code == code) {
                return orderStatus;
            }

        }
        throw new IllegalArgumentException("Invalid Status code");
    }

}

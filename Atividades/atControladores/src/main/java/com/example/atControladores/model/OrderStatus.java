package com.example.atControladores.model;

public enum OrderStatus {
    
    PLACED("Pedido Realizado"),
    APPROVED("Pedido Aprovado"),
    DELIVERED("Pedido Entregue");

    private final String descricao;

    OrderStatus(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static OrderStatus fromDescricao(String descricao) {

        for (OrderStatus status : OrderStatus.values()) {
            if (status.getDescricao().equals(descricao)) {
                return status;
            }
        }
        
        throw new IllegalArgumentException("Status de pedido inválido: " + descricao);
    }


}

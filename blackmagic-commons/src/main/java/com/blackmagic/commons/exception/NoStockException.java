package com.blackmagic.commons.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * Create by Fuwen on 2021/1/14
 */
public class NoStockException extends RuntimeException{
    @Getter
    @Setter
    private Long skuId;

    public NoStockException(Long skuId) {
        super("商品id："+ skuId + "库存不足！");
    }

    public NoStockException(String msg) {
        super(msg);
    }
}

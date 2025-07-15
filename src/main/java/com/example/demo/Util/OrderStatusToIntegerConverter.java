package com.example.demo.Util;

import com.example.demo.Enum.OrderStatus;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

@WritingConverter
public class OrderStatusToIntegerConverter implements Converter<OrderStatus, Integer> {
    @Override
    public Integer convert(OrderStatus source) {
        return source.getCode();
    }
}

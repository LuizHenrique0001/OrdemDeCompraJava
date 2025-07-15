package com.example.demo.Util;

import com.example.demo.Enum.OrderStatus;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

@ReadingConverter
public class IntegerToOrderStatusConverter implements Converter<Integer, OrderStatus> {
    @Override
    public OrderStatus convert(Integer source) {
        return OrderStatus.valueOf(source);
    }
}

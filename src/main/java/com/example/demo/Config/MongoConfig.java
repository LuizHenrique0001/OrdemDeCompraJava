package com.example.demo.Config;

import com.example.demo.Util.IntegerToOrderStatusConverter;
import com.example.demo.Util.OrderStatusToIntegerConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;
import org.springframework.data.mongodb.core.convert.MongoCustomConversions;

import java.util.List;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {

    @Override
    protected String getDatabaseName() {
        return "OrdemJavaSpring"; // ajuste conforme seu projeto
    }

    @Override
    public MongoCustomConversions customConversions() {
        return new MongoCustomConversions(List.of(
                new IntegerToOrderStatusConverter(),
                new OrderStatusToIntegerConverter()
        ));
    }
}

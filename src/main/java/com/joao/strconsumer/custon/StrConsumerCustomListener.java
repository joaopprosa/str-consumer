package com.joao.strconsumer.custon;

import org.springframework.core.annotation.AliasFor;
import org.springframework.kafka.annotation.KafkaListener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@KafkaListener
public @interface StrConsumerCustomListener {

    @AliasFor(annotation = KafkaListener.class, attribute = "topics")
    String[] topics() default "str-topics";

    @AliasFor(annotation = KafkaListener.class, attribute = "strContainerFactory")
    String[] containerFactory() default "strContainerFactory";

    @AliasFor(annotation = KafkaListener.class, attribute = "groupId")
    String[] groupId() default "";

}

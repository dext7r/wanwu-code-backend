package com.cong.wanwu.usercenter.model.enums.chat;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Description: 消息状态
 * Author: <a href="https://github.com/zongzibinbin">abin</a>
 * Date: 2023-03-19
 */
@AllArgsConstructor
@Getter
public enum MessageTypeEnum {
    GROUP(1, "群聊"),
    PRIVATE(2, "私聊"),
    NORMAL(3, "正常"),
    LIKE(4, "爆赞"),
    DISLIKE(5, "危险发言"),
    ;

    private final Integer type;
    private final String desc;

    private static Map<Integer, MessageTypeEnum> cache;

    static {
        cache = Arrays.stream(MessageTypeEnum.values()).collect(Collectors.toMap(MessageTypeEnum::getType, Function.identity()));
    }

    public static MessageTypeEnum of(Integer type) {
        return cache.get(type);
    }
}

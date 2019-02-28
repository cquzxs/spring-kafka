package com.zxs.ssh.template.service.kafka.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Project Name:log-analysis-platform
 * File Name:KafkaProducerServer
 * Package Name:com.yk.parking.log.analysis.platform.service.kafka.producer
 * Date:2018/7/18
 * Author:zhangju
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */

@Service("kafkaProducerServer")
public class KafkaProducerServer {
    @Resource(name = "kafkaTemplate")
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     * @param topic        主题
     * @param value        messageValue
     * @param partition    是否使用分区
     * @param partitionNum 分区数 如果是否使用分区为0,分区数必须大于0
     * @return 返回结果
     * @throws JsonProcessingException 异常信息
     */
    public Map<String, Object> sndMsgForTemplate(String topic
            , Object value
            , boolean partition
            , Integer partitionNum) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String valueString = mapper.writeValueAsString(value);
        ListenableFuture<SendResult<String, String>> result = this.kafkaTemplate.send(topic, valueString);
        return new HashMap<>();
    }
}

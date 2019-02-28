package com.zxs.ssh.template.service.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.listener.MessageListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

/**
 * Project Name:log-analysis-platform
 * File Name:KafkaConsumerServer
 * Package Name:com.yk.parking.log.analysis.platform.service.kafka.consumer
 * Date:2018/7/18
 * Author:zhangju
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */

@Service("kafkaConsumerServer")
@EnableScheduling
public class KafkaConsumerServer implements MessageListener<String, String> {
    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerServer.class);

    @Override
    public void onMessage(ConsumerRecord<String, String> consumerRecord) {
        String value = consumerRecord.value();
        try {
            logger.info(value);
        } catch (Exception e) {
            logger.error("日志对象构建异常", e);
        }
    }
}

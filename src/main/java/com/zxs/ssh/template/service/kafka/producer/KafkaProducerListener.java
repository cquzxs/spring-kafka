package com.zxs.ssh.template.service.kafka.producer;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Service;

/**
 * Project Name:log-analysis-platform
 * File Name:KafkaProducerListener
 * Package Name:com.yk.parking.log.analysis.platform.service.kafka.producer
 * Date:2018/7/18
 * Author:zhangju
 * Description:
 * Copyright (c) 2018, 重庆云凯科技有限公司 All Rights Reserved.
 */

@Service("kafkaProducerListener")
public class KafkaProducerListener implements ProducerListener {
    @Override
    public void onSuccess(ProducerRecord producerRecord, RecordMetadata recordMetadata) {

    }

    @Override
    public void onError(ProducerRecord producerRecord, Exception exception) {

    }
}

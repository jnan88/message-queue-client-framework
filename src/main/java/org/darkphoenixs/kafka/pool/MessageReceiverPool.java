/*
 * Copyright 2015-2016 Dark Phoenixs (Open-Source Organization).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.darkphoenixs.kafka.pool;

import org.darkphoenixs.kafka.core.KafkaMessageReceiver;

/**
 * <p>MessageReceiverPool</p>
 * <p>消息接收器池接口</p>
 *
 * @author Victor.Zxy
 * @version 1.3.0
 * @since 2016年7月21日
 */
public interface MessageReceiverPool<K, V> {

    /**
     * <p>init</p>
     * <p>初始化池</p>
     */
    public void init();

    /**
     * <p>destroy</p>
     * <p>销毁池</p>
     */
    public void destroy();

    /**
     * <p>isRunning</p>
     * <p>是否运行</p>
     *
     * @return 是否运行
     * @since 1.4.6
     */
    public boolean isRunning();

    /**
     * <p>getReceiver</p>
     * <p>获得接收器</p>
     *
     * @return 接收器
     */
    public KafkaMessageReceiver<K, V> getReceiver();

    /**
     * <p>returnReceiver</p>
     * <p>释放接收器</p>
     *
     * @param receiver 接收器
     */
    public void returnReceiver(KafkaMessageReceiver<K, V> receiver);

}

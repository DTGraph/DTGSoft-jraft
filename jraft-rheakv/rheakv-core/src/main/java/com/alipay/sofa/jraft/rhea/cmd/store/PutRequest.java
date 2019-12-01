/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.jraft.rhea.cmd.store;

import com.alipay.sofa.jraft.util.BytesUtil;

/**
 *
 * @author jiachun.fjc
 */
public class PutRequest extends BaseRequest {

    private static final long serialVersionUID = 5937066725083445707L;

    private byte[]            key;                                    //property name
    private byte[]            value;                                  //property value
    private byte[]            isnode;                                 //node or relation
    private byte[]            isTemporalProperty;                     //TemporalProperty or normal property
    private byte[]            time;                                   //temporal property time, if other is not -1, it is end time.
    private byte[]            other;                                  //end time
    private byte[]            id;                                     //node or relation id

    public byte[] getKey() {
        return key;
    }

    public void setKey(byte[] key) {
        this.key = key;
    }

    public byte[] getValue() {
        return value;
    }

    public void setValue(byte[] value) {
        this.value = value;
    }

    public byte[] getId() {
        return id;
    }

    public void setId(byte[] id) {
        this.id = id;
    }

    public byte[] getTime() {
        return time;
    }

    public void setTime(byte[] time) {
        this.time = time;
    }

    public byte[] getOther() {
        return other;
    }

    public void setOther(byte[] other) {
        this.other = other;
    }

    public byte[] getType() {
        return isnode;
    }

    public void setType(byte[] type) {
        this.isnode = type;
    }

    public byte[] getIsTemporalProperty() {
        return isTemporalProperty;
    }

    public void setIsTemporalProperty(byte[] isTemporalProperty) {
        this.isTemporalProperty = isTemporalProperty;
    }

    @Override
    public byte magic() {
        return PUT;
    }

    @Override
    public String toString() {
        return "PutRequest{" + "key=" + BytesUtil.toHex(key) + ", value=" + BytesUtil.toHex(value) + "} "
               + super.toString();
    }
}

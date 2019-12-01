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
package com.alipay.sofa.jraft.rhea.options;

import com.alipay.sofa.jraft.option.NodeOptions;
import com.alipay.sofa.jraft.util.BytesUtil;
import com.alipay.sofa.jraft.util.Copiable;
import com.alipay.sofa.jraft.util.Endpoint;

import java.util.List;
import java.util.zip.CheckedOutputStream;

/**
 *
 * @author jiachun.fjc
 * @modifid by: jinkai
 */
public class RegionEngineOptions implements Copiable<RegionEngineOptions> {

    private Long         regionId;
    private String       startKey;
    private byte[]       startKeyBytes;
    private String       endKey;
    private byte[]       endKeyBytes;
    //    private String      nodeStartId;
    //    private byte[]      nodeStartIdBytes;
    //    private String      nodeEndId;
    //    private byte[]      nodeEndIdBytes;
    //    private String      relationStartId;
    //    private byte[]      relationStartIdBytes;
    //    private String      relationEndId;
    //    private byte[]      relationEndIdBytes;
    //    private String      temporalPropertyStartId;
    //    private byte[]      temporalPropertyStartIdBytes;
    //    private String      temporalPropertyEndId;
    //    private byte[]      temporalPropertyEndIdBytes;

    private long         initNodeId;
    private long         initRelationId;

    private List<long[]> NodeIdRangeList;
    private List<long[]> RelationIdRangeList;
    private List<long[]> TemporalPropertyTimeRangeList;

    private NodeOptions  nodeOptions;
    // Should extends from StoreEngineOptions
    private String       raftGroupId;
    // Should extends from StoreEngineOptions
    private String       raftDataPath;
    // Should extends from StoreEngineOptions
    private Endpoint     serverAddress;
    // Should extends from StoreEngineOptions
    private String       initialServerList;
    // Can extends from StoreEngineOptions
    private long         metricsReportPeriod;

    private String       dbPath;

    public String getDbPath() {
        return dbPath;
    }

    public void setDbPath(String dbPath) {
        this.dbPath = dbPath;
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getStartKey() {
        return startKey;
    }

    public void setStartKey(String startKey) {
        this.startKey = startKey;
        this.startKeyBytes = BytesUtil.writeUtf8(startKey);
    }

    public void setInitNodeId(long initNodeId) {
        this.initNodeId = initNodeId;
    }

    public long getInitNodeId() {
        return initNodeId;
    }

    public void setInitRelationId(long initRelationId) {
        this.initRelationId = initRelationId;
    }

    public long getInitRelationId() {
        return initRelationId;
    }

    public byte[] getStartKeyBytes() {
        return startKeyBytes;
    }

    public void setStartKeyBytes(byte[] startKeyBytes) {
        this.startKeyBytes = startKeyBytes;
    }

    public String getEndKey() {
        return endKey;
    }

    public void setEndKey(String endKey) {
        this.endKey = endKey;
        this.endKeyBytes = BytesUtil.writeUtf8(endKey);
    }

    public byte[] getEndKeyBytes() {
        return endKeyBytes;
    }

    public void setEndKeyBytes(byte[] endKeyBytes) {
        this.endKeyBytes = endKeyBytes;
    }

    //
    //    public String getNodeStartId() {
    //        return nodeStartId;
    //    }
    //
    //    public void setNodeStartId(String nodeStartId) {
    //        this.nodeStartId = nodeStartId;
    //        this.nodeStartIdBytes = BytesUtil.writeUtf8(nodeStartId);
    //    }
    //
    //    public byte[] getNodeStartIdBytes() {
    //        return nodeStartIdBytes;
    //    }
    //
    //    public void setNodeStartIdBytes(byte[] nodeStartIdBytes) {
    //        this.nodeStartIdBytes = nodeStartIdBytes;
    //    }
    //
    //    public String getNodeEndId() {
    //        return nodeEndId;
    //    }
    //
    //    public void setNodeEndId(String nodeEndId) {
    //        this.nodeEndId = nodeEndId;
    //        this.nodeEndIdBytes = BytesUtil.writeUtf8(nodeEndId);
    //    }
    //
    //    public byte[] getNodeEndIdBytes() {
    //        return nodeEndIdBytes;
    //    }
    //
    //    public void setNodeEndIdBytes(byte[] nodeEndIdBytes) {
    //        this.nodeEndIdBytes = nodeEndIdBytes;
    //    }
    //
    //    public String getRelationStartId() {
    //        return relationStartId;
    //    }
    //
    //    public void setRelationStartId(String relationStartId) {
    //        this.relationStartId = relationStartId;
    //        this.relationStartIdBytes = BytesUtil.writeUtf8(relationStartId);
    //    }
    //
    //    public byte[] getRelationStartIdBytes() {
    //        return relationStartIdBytes;
    //    }
    //
    //    public void setRelationStartIdBytes(byte[] relationStartIdBytes) {
    //        this.relationStartIdBytes = relationStartIdBytes;
    //    }
    //
    //    public String getrelationEndId() {
    //        return relationEndId;
    //    }
    //
    //    public void setRelationEndId(String relationEndId) {
    //        this.relationEndId = relationEndId;
    //        this.relationEndIdBytes = BytesUtil.writeUtf8(relationEndId);
    //    }
    //
    //    public byte[] getRelationEndIdBytes() {
    //        return relationEndIdBytes;
    //    }
    //
    //    public void setRelationEndIdBytes(byte[] relationEndIdBytes) {
    //        this.relationEndIdBytes = relationEndIdBytes;
    //    }
    //
    //    public String getTemporalPropertyStartId() {
    //        return temporalPropertyStartId;
    //    }
    //
    //    public void setTemporalPropertyStartId(String temporalPropertyStartId) {
    //        this.temporalPropertyStartId = temporalPropertyStartId;
    //        this.temporalPropertyStartIdBytes = BytesUtil.writeUtf8(temporalPropertyStartId);
    //    }
    //
    //    public byte[] getTemporalPropertyStartIdBytes() {
    //        return temporalPropertyStartIdBytes;
    //    }
    //
    //    public void setTemporalPropertyStartIdBytes(byte[] temporalPropertyStartIdBytes) {
    //        this.temporalPropertyStartIdBytes = temporalPropertyStartIdBytes;
    //    }
    //
    //    public String getTemporalPropertyEndId() {
    //        return temporalPropertyEndId;
    //    }
    //
    //    public void setTemporalPropertyEndId(String temporalPropertyEndId) {
    //        this.temporalPropertyEndId = temporalPropertyEndId;
    //        this.temporalPropertyEndIdBytes = BytesUtil.writeUtf8(temporalPropertyEndId);
    //    }
    //
    //    public byte[] getTemporalPropertyEndIdBytes() {
    //        return temporalPropertyEndIdBytes;
    //    }
    //
    //    public void setTemporalPropertyEndId(byte[] temporalPropertyEndIdBytes) {
    //        this.temporalPropertyEndIdBytes = temporalPropertyEndIdBytes;
    //    }

    public List<long[]> getNodeIdRangeList() {
        return NodeIdRangeList;
    }

    public void setNodeIdRangeList(List<long[]> nodeIdRangeList) {
        NodeIdRangeList = nodeIdRangeList;
    }

    public List<long[]> getRelationIdRangeList() {
        return RelationIdRangeList;
    }

    public void setRelationIdRangeList(List<long[]> relationIdRangeList) {
        RelationIdRangeList = relationIdRangeList;
    }

    public List<long[]> getTemporalPropertyTimeRangeList() {
        return TemporalPropertyTimeRangeList;
    }

    public void setTemporalPropertyTimeRangeList(List<long[]> temporalPropertyTimeRangeList) {
        TemporalPropertyTimeRangeList = temporalPropertyTimeRangeList;
    }

    public NodeOptions getNodeOptions() {
        return nodeOptions;
    }

    public void setNodeOptions(NodeOptions nodeOptions) {
        this.nodeOptions = nodeOptions;
    }

    public String getRaftGroupId() {
        return raftGroupId;
    }

    public void setRaftGroupId(String raftGroupId) {
        this.raftGroupId = raftGroupId;
    }

    public String getRaftDataPath() {
        return raftDataPath;
    }

    public void setRaftDataPath(String raftDataPath) {
        this.raftDataPath = raftDataPath;
    }

    public Endpoint getServerAddress() {
        return serverAddress;
    }

    public void setServerAddress(Endpoint serverAddress) {
        this.serverAddress = serverAddress;
    }

    public String getInitialServerList() {
        return initialServerList;
    }

    public void setInitialServerList(String initialServerList) {
        this.initialServerList = initialServerList;
    }

    public long getMetricsReportPeriod() {
        return metricsReportPeriod;
    }

    public void setMetricsReportPeriod(long metricsReportPeriod) {
        this.metricsReportPeriod = metricsReportPeriod;
    }

    @Override
    public RegionEngineOptions copy() {
        final RegionEngineOptions copy = new RegionEngineOptions();
        copy.setRegionId(this.regionId);
        copy.setStartKey(this.startKey);
        copy.setStartKeyBytes(this.startKeyBytes);
        copy.setEndKey(this.endKey);
        copy.setEndKeyBytes(this.endKeyBytes);
        copy.setInitNodeId(this.initNodeId);
        copy.setInitRelationId(this.initRelationId);
        copy.setNodeIdRangeList(this.NodeIdRangeList);
        copy.setRelationIdRangeList(this.RelationIdRangeList);
        copy.setTemporalPropertyTimeRangeList(this.TemporalPropertyTimeRangeList);
        copy.setNodeOptions(this.nodeOptions == null ? new NodeOptions() : this.nodeOptions.copy());
        copy.setRaftGroupId(this.raftGroupId);
        copy.setRaftDataPath(this.raftDataPath);
        copy.setServerAddress(this.serverAddress);
        copy.setInitialServerList(this.initialServerList);
        copy.setMetricsReportPeriod(this.metricsReportPeriod);
        copy.setDbPath(this.dbPath);
        return copy;
    }

    public RegionEngineOptions copyNull(){
        final RegionEngineOptions copy = new RegionEngineOptions();
        copy.setNodeOptions(this.nodeOptions == null ? new NodeOptions() : this.nodeOptions.copy());
        copy.setRaftGroupId(this.raftGroupId);
        copy.setRaftDataPath(this.raftDataPath);
        copy.setServerAddress(this.serverAddress);
        copy.setInitialServerList(this.initialServerList);
        copy.setMetricsReportPeriod(this.metricsReportPeriod);
        copy.setDbPath(this.dbPath);
        return copy;
    }

    @Override
    public String toString() {
        return "RegionEngineOptions{" + "regionId=" + regionId + ", raftGroupId='" + raftGroupId + '\''
               + ", raftDataPath='" + raftDataPath + '\'' + ", nodeOptions=" + nodeOptions + ", serverAddress="
               + serverAddress + ", initialServerList='" + initialServerList + '\'' + ", metricsReportPeriod="
               + metricsReportPeriod + '}';
    }
}

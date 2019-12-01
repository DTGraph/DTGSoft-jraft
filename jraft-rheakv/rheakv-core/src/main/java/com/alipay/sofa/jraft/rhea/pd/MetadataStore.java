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
package com.alipay.sofa.jraft.rhea.pd;

import com.alipay.sofa.jraft.rhea.metadata.*;
import com.alipay.sofa.jraft.rhea.util.Pair;
import com.alipay.sofa.jraft.util.Endpoint;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

/**
 *
 * @author jiachun.fjc
 */
public interface MetadataStore {

    /**
     * Returns the specified cluster information.
     */
    Cluster getClusterInfo(final long clusterId);

    /**
     * The pd server stores the storeIds of all nodes.
     * This method provides a lookup for the storeId according
     * to the endpoint.  If there is no value, then a globally
     * unique storeId is created.
     */
    Long getOrCreateStoreId(final long clusterId, final Endpoint endpoint);

    /**
     * Query the store information by the storeId.  If the result
     * is a empty instance, the caller needs to use its own local
     * configuration.
     */
    Store getStoreInfo(final long clusterId, final long storeId);

    /**
     * Query the store information by the endpoint.  If the result
     * is a empty instance, the caller needs to use its own local
     * configuration.
     */
    Store getStoreInfo(final long clusterId, final Endpoint endpoint);

    /**
     * Update the store information by the storeId, and return the
     * previous value.
     */
    CompletableFuture<Store> updateStoreInfo(final long clusterId, final Store store);

    /**
     * Create a globally unique regionId.
     */
    Long createRegionId(final long clusterId);

    /**
     * Returns the stats information of the specified store.
     */
    StoreStats getStoreStats(final long clusterId, final long storeId);

    /**
     * Update the stats information of the specified store.
     */
    CompletableFuture<Boolean> updateStoreStats(final long clusterId, final StoreStats storeStats);

    /**
     * Returns the stats information of the specified region.
     */
    Pair<Region, RegionStats> getRegionStats(final long clusterId, final Region region);

    /**
     * Update the stats information of the specified region.
     */
    CompletableFuture<Boolean> updateRegionStats(final long clusterId, final Region region,
                                                 final RegionStats regionStats);

    /**
     * Batch update the stats information of regions.
     */
    CompletableFuture<Boolean> batchUpdateRegionStats(final long clusterId,
                                                      final List<Pair<Region, RegionStats>> regionStatsList);

    Set<Long /* storeId */> unsafeGetStoreIds(final long clusterId);

    Map<Long /* storeId */, Endpoint> unsafeGetStoreIdsByEndpoints(final long clusterId, final List<Endpoint> endpoints);

    /**
     * Clear the cache.
     */
    void invalidCache();
}

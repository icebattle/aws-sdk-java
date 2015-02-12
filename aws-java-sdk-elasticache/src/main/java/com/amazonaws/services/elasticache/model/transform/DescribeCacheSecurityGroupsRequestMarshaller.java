/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Cache Security Groups Request Marshaller
 */
public class DescribeCacheSecurityGroupsRequestMarshaller implements Marshaller<Request<DescribeCacheSecurityGroupsRequest>, DescribeCacheSecurityGroupsRequest> {

    public Request<DescribeCacheSecurityGroupsRequest> marshall(DescribeCacheSecurityGroupsRequest describeCacheSecurityGroupsRequest) {

        if (describeCacheSecurityGroupsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeCacheSecurityGroupsRequest> request = new DefaultRequest<DescribeCacheSecurityGroupsRequest>(describeCacheSecurityGroupsRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeCacheSecurityGroups");
        request.addParameter("Version", "2015-02-02");

        if (describeCacheSecurityGroupsRequest.getCacheSecurityGroupName() != null) {
            request.addParameter("CacheSecurityGroupName", StringUtils.fromString(describeCacheSecurityGroupsRequest.getCacheSecurityGroupName()));
        }
        if (describeCacheSecurityGroupsRequest.getMaxRecords() != null) {
            request.addParameter("MaxRecords", StringUtils.fromInteger(describeCacheSecurityGroupsRequest.getMaxRecords()));
        }
        if (describeCacheSecurityGroupsRequest.getMarker() != null) {
            request.addParameter("Marker", StringUtils.fromString(describeCacheSecurityGroupsRequest.getMarker()));
        }

        return request;
    }
}

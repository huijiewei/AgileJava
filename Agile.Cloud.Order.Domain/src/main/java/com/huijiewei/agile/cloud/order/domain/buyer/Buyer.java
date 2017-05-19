package com.huijiewei.agile.cloud.order.domain.buyer;

import com.huijiewei.agile.base.domain.Entity;
import com.huijiewei.agile.base.domain.AggregateRoot;
import com.huijiewei.agile.base.util.StringUtils;

public class Buyer extends Entity implements AggregateRoot {
    public String getIdentityGuid() {
        return identityGuid;
    }

    private void setIdentityGuid(String identityGuid) {
        this.identityGuid = identityGuid;
    }

    private String identityGuid;

    public Buyer(String identityGuid) {
        if(StringUtils.isEmpty(identityGuid)){
            throw new NullPointerException();
        }

        this.identityGuid = identityGuid;
    }
}

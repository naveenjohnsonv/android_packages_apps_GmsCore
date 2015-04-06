/*
 * Copyright 2013-2015 µg Project Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;

import com.google.android.gms.common.api.Scope;

import org.microg.gms.common.Constants;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParceled;

public class GetServiceRequest extends AutoSafeParcelable {
    @SafeParceled(1)
    private final int versionCode = 2;

    @SafeParceled(2)
    public final int serviceId;

    @SafeParceled(3)
    public int gmsVersion = Constants.MAX_REFERENCE_VERSION;

    @SafeParceled(4)
    public String packageName;

    @SafeParceled(5)
    public IBinder accountAccessor;

    @SafeParceled(6)
    public Scope[] scopes;

    @SafeParceled(7)
    public Bundle extras;

    @SafeParceled(8)
    public Account account;

    private GetServiceRequest() {
        serviceId = -1;
    }

    public GetServiceRequest(int serviceId) {
        this.serviceId = serviceId;
    }

    public static Creator<GetServiceRequest> CREATOR = new AutoCreator<>(GetServiceRequest.class);
}

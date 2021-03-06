/*
 * Copyright (C) 2017 The Android Open Source Project
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

package com.android.documentsui.testing;

import com.android.documentsui.base.Lookup;

import java.util.HashMap;
import java.util.Map;

public class TestFileTypeLookup implements Lookup<String, String> {

    public static final String DEFAULT_TYPE = "default_type";
    public final Map<String, String> fileTypes = new HashMap<>();

    @Override
    public String lookup(String mimeType) {
       final String type = fileTypes.get(mimeType);

       return type == null ? DEFAULT_TYPE : type;
    }
}

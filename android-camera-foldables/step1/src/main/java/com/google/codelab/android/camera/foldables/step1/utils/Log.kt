/*
 * Copyright (C) 2023 The Android Open Source Project
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

package com.google.codelab.android.camera.foldables.step1.utils

object Log {

    private const val TAG = "ANDROID-CAMERA-FOLDABLE"

    fun d(message: String) {
        android.util.Log.d(TAG, message)
    }

    fun w(message: String) {
        android.util.Log.w(TAG, message)
    }

    fun e(message: String) {
        android.util.Log.e(TAG, message)
    }

    fun e(message: String?, e: Throwable) {
        android.util.Log.e(TAG, message, e)
    }
}
/*
 * Copyright 2022 Google LLC
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

package com.google.codelabs.cronet

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.google.codelabs.cronet.CronetCodelabConstants.URLS
import kotlin.random.Random

class ImagesViewModel : ViewModel() {
    val images = mutableStateListOf<DownloadedImage>()

    fun addImage(): Int {
//        images.add(DownloadedImage(URLS[Random.nextInt(URLS.size)]))
        images.add(DownloadedImage(URLS[5]))

        return images.size - 1
    }

    fun setDownloaded(index: Int, downloaderResult: ImageDownloaderResult) =
        images[index].let {
            it.downloaderResult = downloaderResult
        }
}

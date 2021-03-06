/*
 * Copyright 2018, The Android Open Source Project
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

package com.example.android.guesstheword.screens.score

import android.transition.ChangeScroll
import android.widget.ScrollView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

// TODO (02) Copy over ScoreViewModelFactory - have it also take in a constructor parameter called
// finalScore
class ScoreViewModelFactory(private val finalScroll: Int) : ViewModelProvider.Factory {
    // TODO (03) In the overridden create method, construct an instance of ScoreViewModel,
// passing in finalScore
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ScoreViewModel :: class.java)){
            return ScoreViewModel(finalScroll) as T
        }
        throw IllegalAccessException("Unknown ViewModel class")
    }
}

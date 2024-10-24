// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.android.application") version "9.0.0" apply false
    id("com.android.library") version "9.0.0" apply false
}
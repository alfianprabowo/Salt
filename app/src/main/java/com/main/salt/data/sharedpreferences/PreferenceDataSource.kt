package com.main.salt.data.sharedpreferences

interface PreferenceDataSource {
    fun <T> savePreference(preferenceKey: String, value: T)

    fun getBooleanPreference(preferenceKey: String, defaultValue: Boolean): Boolean
}
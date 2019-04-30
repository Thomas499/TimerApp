package com.anelemhlanga.timerapp.fragments


import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.anelemhlanga.timerapp.R

class SettingsActivityFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(p0: Bundle?, p1: String?) {
        addPreferencesFromResource(R.xml.preferences)
    }

}
package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.example.functiontest.getAndroidSdkVersion
import com.example.myapplication.getAndroidVersion
import com.example.myapplication.getInstalledAppsAndPermissions
import com.example.myapplication.getKernelVersion
import com.example.myapplication.isDeviceRooted

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Fetch and print Android version
        val androidVersion = getAndroidVersion()
        Log.d("MainActivity", "Android Version: $androidVersion")

        // Fetch and print Android SDK version
        val androidSdkVersion = getAndroidSdkVersion()
        Log.d("MainActivity", "Android SDK Version: $androidSdkVersion")

        // Fetch and print kernel version
        val kernelVersion = getKernelVersion()
        Log.d("MainActivity", "Kernel Version: $kernelVersion")

        // Check and print if device is rooted
        val isRooted = isDeviceRooted()
        Log.d("MainActivity", "Device Rooted: $isRooted")

        // Fetch and print number of installed apps and their permissions
        val pm = packageManager
        val appInfoList = getInstalledAppsAndPermissions(pm)
        val numApps = appInfoList.size
        Log.d("MainActivity", "Number of Apps: $numApps")

        for (appInfo in appInfoList) {
            Log.d("MainActivity", "App: ${appInfo.packageName}, Permissions: ${appInfo.permissions}")
        }
    }
}

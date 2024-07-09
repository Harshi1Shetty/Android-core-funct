package com.example.myapplication





import java.io.File

fun isDeviceRooted(): Boolean {
    val paths = arrayOf(
        "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su",
        "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"
    )
    for (path in paths) {
        if (File(path).exists()) return true
    }
    return false
}

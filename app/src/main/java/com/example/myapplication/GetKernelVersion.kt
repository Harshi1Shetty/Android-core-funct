package com.example.myapplication




import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException

fun getKernelVersion(): String {
    var version = ""
    try {
        val reader = BufferedReader(FileReader("/proc/version"))
        version = reader.readLine()
        reader.close()
    } catch (e: IOException) {
        e.printStackTrace()
    }
    return version
}

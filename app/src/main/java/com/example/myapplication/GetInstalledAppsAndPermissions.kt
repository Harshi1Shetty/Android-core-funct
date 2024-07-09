package com.example.myapplication





import android.content.pm.PackageManager

data class AppInfo(val packageName: String, val permissions: List<String>)

fun getInstalledAppsAndPermissions(pm: PackageManager): List<AppInfo> {
    val packages = pm.getInstalledPackages(PackageManager.GET_PERMISSIONS)
    val appInfoList = mutableListOf<AppInfo>()

    for (packageInfo in packages) {
        val permissions = packageInfo.requestedPermissions?.toList() ?: emptyList()
        appInfoList.add(AppInfo(packageInfo.packageName, permissions))
    }
    return appInfoList
}

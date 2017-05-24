@file:JvmName("SystemUtils")

package com.importre.system

internal val osName: String by lazy {
    System.getProperty("os.name", "").toLowerCase()
}

/**
 * `true` if system is Windows
 */
val isWindows: Boolean
    get() = osName.startsWith("windows")

/**
 * `true` if system is macOS
 */
val isMacOS: Boolean
    get() = osName.startsWith("mac")

/**
 * `true` if system is Linux
 */
val isLinux: Boolean
    get() = osName.startsWith("linux")


/**
 * `true` if system is not (Windows | macOS | Linux)
 */
val isOther: Boolean
    get() = !(isWindows || isMacOS || isLinux)

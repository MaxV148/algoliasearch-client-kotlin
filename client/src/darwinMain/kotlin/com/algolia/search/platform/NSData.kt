package com.algolia.search.platform

import kotlinx.cinterop.UnsafeNumber
import platform.Foundation.NSData
import platform.Foundation.NSString
import platform.Foundation.NSUTF8StringEncoding
import platform.Foundation.create

/**
 * Converts [NSData] to [String] using UTF-8 encoding.
 */
@OptIn(UnsafeNumber::class)
internal fun NSData.string(): String? {
    return NSString.create(this, NSUTF8StringEncoding) as String?
}

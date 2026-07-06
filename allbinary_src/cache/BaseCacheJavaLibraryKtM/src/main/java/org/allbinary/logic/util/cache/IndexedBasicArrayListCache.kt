/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2011 AllBinary
 *
 *  By agreeing to this license you and any business entity you represent are
 *  legally bound to the AllBinary Open License Version 1 legal agreement.
 *
 *  You may obtain the AllBinary Open License Version 1 legal agreement from
 *  AllBinary or the root directory of AllBinary's AllBinary Platform repository.
 *
 *  Created By: Travis Berthelot
 */

/* Generated Code Do Not Modify */
package org.allbinary.logic.util.cache

import java.lang.Object
import kotlin.Array
import org.allbinary.string.CommonStrings

open public class IndexedBasicArrayListCache : BaseBasicArrayListCache, CacheInterface {

    companion object {

        @Throws(Exception::class)
        open fun createCache(
            size: Int
        )
            // nullable = true from not(false or (false and false)) = true
            : IndexedBasicArrayListCache {
            var size = size

            var indexedBasicArrayListCache: IndexedBasicArrayListCache =
                IndexedBasicArrayListCache()

            indexedBasicArrayListCache!!.init(size)

            // if statement needs to be on the same line and ternary does not work the same way.
            return indexedBasicArrayListCache
        }
    }

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var size: Int = 0

    var index: Int = 0

    public constructor() {}

    @Throws(Exception::class)
    open fun init(size: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        var size = size

        if (this.size < size) {

            this.list.ensureCapacity(size)

            for (index in size - 1 downTo this.size) {

                this.addDefault()
            }

            this.size = size
        }
    }

    open fun getAt(
        index: Int
    )
        // nullable = true from not(false or (false and false)) = true
        : Any {
        var index = index

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.list.objectArray[index]!!
    }

    @Throws(Exception::class)
    open fun addDefault()
        // nullable = true from not(false or (false and true)) = true
    {}

    @Throws(Exception::class)
    open fun addObject(anyType: Object)
        // nullable = true from not(false or (false and false)) = true
    {
        var anyType = anyType
        this.list.add(anyType)
    }

    @Throws(Exception::class)
    override fun add(cacheableInterface: CacheableInterface)
        // nullable = true from not(false or (false and false)) = true
    {
        var cacheableInterface = cacheableInterface
        this.list.add(cacheableInterface)
    }

    @Throws(Exception::class)
    override fun addArray(cacheableInterfaces: Array<CacheableInterface?>)
        // nullable = true from not(false or (false and false)) = true
    {
        var cacheableInterfaces = cacheableInterfaces

        throw Exception("No Imple")
    }

    override fun clear()
        // nullable = true from not(false or (false and true)) = true
    {
        this.index = 0
    }
}

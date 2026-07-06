/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2025 AllBinary
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
package org.allbinary.android

import android.os.Parcel
import android.os.Parcelable
import java.lang.Object

open public class NullParcelable : Object, Parcelable {

    companion object {

        val NULL_PARCELABLE: NullParcelable = NullParcelable()
    }

    // Auto Generated
    public constructor() : super() {}

    override fun describeContents()
    // nullable = true from not(false or (false and true)) = true
    : Int {

        throw RuntimeException()
    }

    override fun writeToParcel(dest: Parcel, flags: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        var dest = dest
        var flags = flags
    }
}

/* Generated Code Do Not Modify */
package org.allbinary.game.input

import org.allbinary.logic.NullUtil

open public class AndroidAPI1KeyFactory : AndroidKeyFactory {

    companion object {

        private var instance: Any = NullUtil.getInstance()!!.NULL_OBJECT

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : AndroidAPI1KeyFactory {

            if (AndroidAPI1KeyFactory.instance == NullUtil.getInstance()!!.NULL_OBJECT) {

                AndroidAPI1KeyFactory.instance = AndroidAPI1KeyFactory()
            }

            // if statement needs to be on the same line and ternary does not work the same way.
            return AndroidAPI1KeyFactory.instance as AndroidAPI1KeyFactory
        }
    }

    protected constructor() {}
}

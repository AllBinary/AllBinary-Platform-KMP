/* Generated Code Do Not Modify */
package org.allbinary.android

import android.content.Context
import android.view.View
import android.widget.Toast
import java.lang.Object
import java.lang.Runnable
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings

open public class ToastUtil : Object {

    companion object {

        private val instance: ToastUtil = ToastUtil()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : ToastUtil {

            // if statement needs to be on the same line and ternary does not work the same way.
            return ToastUtil.instance
        }

        // A member class instead of a local class using the method parameters since most of the
        // converted languages do not have local classes.
        open public class MakeToast : Object, Runnable {

            /*Static stuff is not allowed for Kotlin inner classescompanion object {
             */
            /*
            }
                */

            private val context: Context

            private val string: String

            private val time: Int

            public constructor(context: Context, string: String, time: Int) : super() {
                // var context = context
                // var string = string
                // var time = time
                this.context = context
                this.string = string
                this.time = time
            }

            override fun run()
                // nullable = true from not(false or (false and true)) = true
            {

                var logUtil: LogUtil = LogUtil.getInstance()!!

                try {
                    Toast.makeText(this.context, this.string, this.time)!!.show()
                } catch (e: Exception) {

                    var commonStrings: CommonStrings = CommonStrings.getInstance()!!

                    logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.RUN, e)
                }
            }
        }
    }

    // Auto Generated
    public constructor() : super() {}

    val logUtil: LogUtil = LogUtil.getInstance()!!

    open fun makeToast(view: View, context: Context, message: String, time: Int)
        // nullable = true from not(false or (false and false)) = true
    {
        // var view = view
        // var context = context
        var message = message
        // var time = time
        view.post(MakeToast(context, message, time))
    }
}

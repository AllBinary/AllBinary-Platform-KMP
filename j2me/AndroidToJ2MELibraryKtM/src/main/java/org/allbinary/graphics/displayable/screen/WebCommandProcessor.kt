/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2022 AllBinary
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
package org.allbinary.graphics.displayable.screen

import android.content.Context
import android.content.Intent
import java.lang.ClassNotFoundException
import java.lang.Object
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import org.allbinary.TsUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class WebCommandProcessor : Object {

    companion object {

        private val instance: WebCommandProcessor = WebCommandProcessor()

        open fun getInstance()
        // nullable =  from not(true or (false and true)) =
        : WebCommandProcessor {

            // if statement needs to be on the same line and ternary does not work the same way.
            return WebCommandProcessor.instance
        }
    }

    // Auto Generated
    public constructor() : super() {}

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val aboutCommandProcessor: AboutCommandProcessor = AboutCommandProcessor.getInstance()!!

    private val WEB_VIEW_ACTIVITY: String = "org.allbinary.android.activity.WebViewActivity"

    val list: BasicArrayList = BasicArrayListD()

    open fun process(midletCommandListener: CommandListener, command: Command, canvas: Canvas)
        // nullable = true from not(false or (false and false)) = true
    {
        // var midletCommandListener = midletCommandListener
        // var command = command
        // var canvas = canvas

        try {

            var context: Context = this.aboutCommandProcessor!!.getContext() as Context

            var intent: Intent =
                Intent(
                    context,
                    TsUtil.getInstance()!!.getClassClassLoader(this)!!.loadClass(
                        this.WEB_VIEW_ACTIVITY
                    ),
                )

            intent.putExtra(this.aboutCommandProcessor!!.URL, this.list.removeAt(0) as String)
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)
        } catch (e: ClassNotFoundException) {

            var commonStrings: CommonStrings = CommonStrings.getInstance()!!

            this.logUtil!!.put(commonStrings!!.EXCEPTION, this, "process", e)
        }
    }
}

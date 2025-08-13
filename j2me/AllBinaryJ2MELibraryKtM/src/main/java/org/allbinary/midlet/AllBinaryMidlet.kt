
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
        package org.allbinary.midlet



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.CommandListener
import javax.microedition.lcdui.Display
import javax.microedition.lcdui.Displayable
import javax.microedition.midlet.MIDlet
import javax.microedition.midlet.MIDletStateChangeException
import org.allbinary.logic.NullUtil
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.event.EventStrings
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonStrings
import org.allbinary.system.Memory

open public class AllBinaryMidlet : MIDlet
                , CommandListener {
        

        companion object {
            
    val NULL_ALLBINARY_MIDLET: AllBinaryMidlet = AllBinaryMidlet()

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val SET_DISPLAY: String = "setDisplay"

    private val SETTING_: String = "Setting: "

    private val _DISPLAY_: String = " Display: "

    private val SETTING_NO_TITLE: String = "Setting: No Title, Display: "

    private var hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

    private var destroyed: Boolean= false
public constructor        (){logUtil!!.put(commonStrings!!.CONSTRUCTOR, this, 
                            "AllBinaryMidlet::AllBinaryMidlet")
}


open fun setDisplay(newDisplay: Displayable)
        //nullable = true from not(false or (false and false)) = true
{

                    var newDisplay = newDisplay

    var title: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(newDisplay != 
                                    null
                                )
                        
                                    {
                                    title= newDisplay!!.getTitle()

    
                        if(title != 
                                    null
                                )
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append(SETTING_)!!.append(title)!!.append(_DISPLAY_)!!.append(StringUtil.getInstance()!!.toString(newDisplay))!!.toString(), this, SET_DISPLAY)

                                    }
                                
                        else {
                            logUtil!!.put(StringMaker().
                            append(SETTING_NO_TITLE)!!.append(StringUtil.getInstance()!!.toString(newDisplay))!!.toString(), this, SET_DISPLAY)

                        }
                            

                                    }
                                

    var display: Display = getDisplay()!!
            

display.setCurrent(newDisplay)
}


open fun getDisplay()
        //nullable = true from not(false or (false and true)) = true
: Display{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Display.getDisplay(this)
}


open fun getCurrentDisplayable()
        //nullable = true from not(false or (false and true)) = true
: Displayable{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Display.getDisplay(this)!!.getCurrent()
}


open fun setDestroyed(destroyed: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var destroyed = destroyed
this.destroyed= destroyed
}


open fun isDestroyed()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return destroyed
}


                @Throws(MIDletStateChangeException::class)
            override fun startApp()
        //nullable = true from not(false or (false and true)) = true
{ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}

override fun pauseApp()
        //nullable = true from not(false or (false and true)) = true
{ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


open fun destroyApp(unconditional: Boolean, isProgress: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var unconditional = unconditional


                    var isProgress = isProgress
}

override fun destroyApp(unconditional: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var unconditional = unconditional

    var METHOD_NAME: String = "AllBinaryMidlet::destroyApp"


        try {
            logUtil!!.put(commonStrings!!.START, this, METHOD_NAME)
PreLogUtil.put(Memory.getInfo(), this, METHOD_NAME)
this.setDestroyed(true)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, METHOD_NAME, e)
}

}


                @Throws(Exception::class)
            
open fun setStartStateHashtable(hashtable: Hashtable<Any, Any>)
        //nullable = true from not(false or (false and false)) = true
{

                    var hashtable = hashtable
logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.START_LABEL)!!.append(StringUtil.getInstance()!!.toString(hashtable))!!.toString(), this, 
                            "setStartStateHashtable")
this.hashtable= hashtable
}


                @Throws(Exception::class)
            
open fun getStartStateHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{logUtil!!.put(StringMaker().
                            append(CommonLabels.getInstance()!!.START_LABEL)!!.append(StringUtil.getInstance()!!.toString(hashtable))!!.toString(), this, 
                            "getStartStateHashtable")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hashtable
}


                @Throws(Exception::class)
            
open fun getCurrentStateHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{logUtil!!.put(commonStrings!!.START, this, 
                            "getStateHashtable")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_TABLE
}

override fun commandAction(command: Command, displayable: Displayable)
        //nullable = true from not(false or (false and false)) = true
{

                    var command = command


                    var displayable = displayable
}


}
                
            


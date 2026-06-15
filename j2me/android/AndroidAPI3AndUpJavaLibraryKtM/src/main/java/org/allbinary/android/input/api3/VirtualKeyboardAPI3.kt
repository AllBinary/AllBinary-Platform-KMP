
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
        package org.allbinary.android.input.api3




        import java.lang.Object        
        
        import java.lang.Integer
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.app.Activity
import org.allbinary.android.input.VirtualKeyboard
import org.allbinary.input.event.VirtualKeyboardEvent
import org.allbinary.input.event.VirtualKeyboardEventHandler
import org.allbinary.input.event.VirtualKeyboardEventListenerInterface
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.logic.util.event.EventStrings

open public class VirtualKeyboardAPI3 : VirtualKeyboard
                , VirtualKeyboardEventListenerInterface {
        
companion object {
            
    var MAX_API: Int = Integer.MAX_VALUE

    var MIN_API: Int = 3

        }
            
    private var virtualKeyboard: Boolean= false

    private var activity: Activity

    private val showVirtualKeyboardRunnable: Runnable

    private val hideVirtualKeyboardRunnable: Runnable
public constructor (activity: Activity)                        

                            : super(){
    //var activity = activity


                            //For kotlin this is before the body of the constructor.
                    
this.activity= activity
this.showVirtualKeyboardRunnable= ShowVirtualKeyboardRunnable(this.activity)
this.hideVirtualKeyboardRunnable= HideVirtualKeyboardRunnable(this.activity)

    var virtualKeyboardEventHandler: VirtualKeyboardEventHandler = VirtualKeyboardEventHandler.getInstance()!!

virtualKeyboardEventHandler!!.removeAllListeners()
virtualKeyboardEventHandler!!.addListenerInterface(this)
}


    override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
    //var eventObject = eventObject
ForcedLogUtil.log(EventStrings.getInstance()!!.PERFORMANCE_MESSAGE, this)
}


    override fun onVirtualKeyboardEvent(virtualKeyboardEvent: VirtualKeyboardEvent)
        //nullable = true from not(false or (false and false)) = true
{
    //var virtualKeyboardEvent = virtualKeyboardEvent

    var isShow: Boolean = virtualKeyboardEvent!!.getSource() as Boolean


    
                        if(isShow)
                        
                                    {
                                    this.showVirtualKeyboard()

                                    }
                                
                        else {
                            this.hideVirtualKeyboard()

                        }
                            
}


    override fun forceHide()
        //nullable = true from not(false or (false and true)) = true
{
this.hideVirtualKeyboard()
}


    override fun hide()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.virtualKeyboard)
                        
                                    {
                                    this.forceHide()

                                    }
                                
}


    open fun showVirtualKeyboard()
        //nullable = true from not(false or (false and true)) = true
{
this.activity.runOnUiThread(this.showVirtualKeyboardRunnable)
this.virtualKeyboard= true
}


    open fun hideVirtualKeyboard()
        //nullable = true from not(false or (false and true)) = true
{
this.activity.runOnUiThread(this.hideVirtualKeyboardRunnable)
this.virtualKeyboard= false
}


}
                
            


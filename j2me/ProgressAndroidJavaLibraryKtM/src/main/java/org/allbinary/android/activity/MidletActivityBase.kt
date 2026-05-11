
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
        package org.allbinary.android.activity




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import android.app.Activity
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import org.allbinary.android.GenericMotionEventVerifyInterface
import org.allbinary.game.configuration.event.GameFeatureEvent
import org.allbinary.game.configuration.event.GameFeatureListenerInterface
import org.allbinary.game.configuration.event.GameInitializedEvent
import org.allbinary.game.configuration.event.GameInitializedListenerInterface
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class MidletActivityBase : Activity
                , GameFeatureListenerInterface
                , GameInitializedListenerInterface
                , SimpleProgressActivityInterface
                , KeyInputViewCompositeInterface
                , GenericMotionEventVerifyInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    override fun onGameFeatureChange(gameFeatureEvent: GameFeatureEvent)
        //nullable = true from not(false or (false and false)) = true
{
var gameFeatureEvent = gameFeatureEvent
}


    override fun onEvent(eventObject: AllBinaryEventObject)
        //nullable = true from not(false or (false and false)) = true
{
var eventObject = eventObject
}


    override fun onGameInitialized(gameInitializedEvent: GameInitializedEvent)
        //nullable = true from not(false or (false and false)) = true
{
var gameInitializedEvent = gameInitializedEvent
}


                @Throws(Exception::class)
            
    override fun onSetProgress(value: Int, text: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
var text = text
}


                @Throws(Exception::class)
            
    override fun onDismissProgress(animationSequence: IntArray)
        //nullable = true from not(false or (false and false)) = true
{
var animationSequence = animationSequence
}


                @Throws(Exception::class)
            
    override fun onShowProgress(indeterminate: Boolean, animationSequence: IntArray)
        //nullable = true from not(false or (false and false)) = true
{
var indeterminate = indeterminate
var animationSequence = animationSequence
}


    override fun getRootView()
        //nullable = true from not(false or (false and true)) = true
: View{



                            throw RuntimeException()
}


    override fun getView()
        //nullable = true from not(false or (false and true)) = true
: View{



                            throw RuntimeException()
}


    override fun getWindowManager()
        //nullable = true from not(false or (false and true)) = true
: WindowManager{



                            throw RuntimeException()
}


    override fun setKeyInputView(keyInputView: View)
        //nullable = true from not(false or (false and false)) = true
{
var keyInputView = keyInputView
}


    override fun onGenericMotionEvent(event: MotionEvent)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var event = event



                            throw RuntimeException()
}


}
                
            


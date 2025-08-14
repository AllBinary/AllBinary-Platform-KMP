
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
        package org.allbinary.graphics




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ScreenListenerHandler
            : Object
         {
        

        companion object {
            
    private val instance: ScreenListenerHandler = ScreenListenerHandler()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ScreenListenerHandler{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private var screenListenerInterface: ScreenListenerInterface = ScreenEmptyListener()

open fun setListener(screenListenerInterface: ScreenListenerInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var screenListenerInterface = screenListenerInterface
this.screenListenerInterface= screenListenerInterface
}


open fun fire(isFullScreen: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var isFullScreen = isFullScreen
this.screenListenerInterface!!.onFullScreen(isFullScreen)
}


open fun fire()
        //nullable = true from not(false or (false and true)) = true
{this.screenListenerInterface!!.onFullScreenDisplay()
}


}
                
            



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
        package org.allbinary.animation.transition




        import java.lang.Object        
        
        import java.lang.Runnable
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class RunAtEndAnimationListener
            : Object
        
                , AnimationListenerInterface {
        

    var runnable: Runnable
protected constructor        (runnable: Runnable)
            : super()
        {

                    var runnable = runnable
this.runnable= runnable
}

override fun onAnimationStart()
        //nullable = true from not(false or (false and true)) = true
{}

override fun onAnimationEnd()
        //nullable = true from not(false or (false and true)) = true
{}

override fun onAnimationRepeat()
        //nullable = true from not(false or (false and true)) = true
{}


}
                
            


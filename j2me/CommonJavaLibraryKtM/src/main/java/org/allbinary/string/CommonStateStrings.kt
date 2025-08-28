
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
        package org.allbinary.string




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class CommonStateStrings
            : Object
         {
        

        companion object {
            
    private val instance: CommonStateStrings = CommonStateStrings()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CommonStateStrings

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val CONTEXT: String = "Context: "

    val FINISH: String = "finish"

    val CREATE: String = "onCreate"

    val START: String = "onStart"

    val RESTART: String = "onRestart"

    val RESUME: String = "onResume"

    val PAUSE: String = "onPause"

    val STOP: String = "onStop"

    val DESTROY: String = "onDestroy"

    val BIND: String = "onBind"

    val ON_SAVE_INSTANCE_STATE: String = "onSaveInstanceState"

    val ON_START_COMMAND: String = "onStartCommand"

}
                
            


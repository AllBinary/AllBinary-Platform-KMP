
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2009 AllBinary
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
        package org.allbinary.android.input.motion




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.android.AndroidInfoFactory
import org.allbinary.android.input.motion.api1.GameInputMotionInfoAPI1
import org.allbinary.android.input.motion.api5.GameInputMotionInfoAPI5

open public class GameInputMotionInfoFactory
            : Object
         {
        
companion object {
            
    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameInputMotionInfo{

    var SDK_VERSION: Int = AndroidInfoFactory.getInstance()!!.getVersion()!!


    
                        if(SDK_VERSION <= 4)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GameInputMotionInfoAPI1.getInstance()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return GameInputMotionInfoAPI5.getInstance()

                        }
                            
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            


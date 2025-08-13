
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2002 AllBinary 
                *   
                *  By agreeing to this license you and any business entity you represent are 
                *  legally bound to the AllBinary Open License Version 1 legal agreement. 
                *   
                *  You may obtain the AllBinary Open License Version 1 legal agreement from 
                *  AllBinary or the root directory of AllBinary's AllBinary Platform repository. 
                *    Created By: Travis Berthelot  
        */
        
        /* Generated Code Do Not Modify */
        package org.allbinary.media.audio



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class WorkSound : CompositeSound {
        

        companion object {
            
    private var soundInterface: Sound = WorkSound()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: Sound{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return soundInterface
}


        }
            private constructor        ()                        

                            : super(
                            "resource:/wav/work.wav"){

                            //For kotlin this is before the body of the constructor.
                    
}


}
                
            


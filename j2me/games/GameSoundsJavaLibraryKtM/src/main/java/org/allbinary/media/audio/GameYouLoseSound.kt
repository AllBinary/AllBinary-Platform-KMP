
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
        package org.allbinary.media.audio




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class GameYouLoseSound : CompositeSound {
        

        companion object {
            
    private var soundInterface: Sound = GameYouLoseSound()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: Sound{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return soundInterface
}


        }
            private constructor        ()                        

                            : super("resource:/wav/youlose.wav"){

                            //For kotlin this is before the body of the constructor.
                    
}


}
                
            


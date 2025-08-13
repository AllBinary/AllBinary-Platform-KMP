
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
        package org.allbinary.ai



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.layer.AllBinaryLayerManager

open public class ArtificialIntelligence
            : Object
        
                , ArtificialIntelligenceInterface {
        

        companion object {
            
    private val instance: ArtificialIntelligence = ArtificialIntelligence()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ArtificialIntelligence{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            public constructor        ()
            : super()
        {}


                @Throws(Exception::class)
            override fun processAI(layerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var layerManager = layerManager
}

override fun getId()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 1
}


}
                
            


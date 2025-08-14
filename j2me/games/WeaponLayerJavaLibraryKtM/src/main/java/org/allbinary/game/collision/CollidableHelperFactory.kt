
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
        package org.allbinary.game.collision




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFactory
import org.allbinary.layer.AllBinaryLayer

open public class CollidableHelperFactory
            : Object
         {
        

        companion object {
            
open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: CollisionHelper{
    
                        if(Features.getInstance()!!.isFeature(GameFeatureFactory.getInstance()!!.COLLISIONS_WITH_SOURCE))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CollisionHelper(AllBinaryLayer.NULL_ALLBINARY_LAYER)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SourceCollisionHelper(AllBinaryLayer.NULL_ALLBINARY_LAYER)

                        }
                            
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            


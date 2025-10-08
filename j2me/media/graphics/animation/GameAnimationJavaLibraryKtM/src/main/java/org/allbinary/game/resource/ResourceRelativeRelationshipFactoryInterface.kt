
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
        package org.allbinary.game.resource




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.configuration.feature.GameFeatureControlledInterface
import org.allbinary.graphics.RelativeRelationship
import org.allbinary.util.BasicArrayList

interface ResourceRelativeRelationshipFactoryInterface : GameFeatureControlledInterface {
        

                @Throws(Exception::class)
            
    open fun getResourceRelativeRelationshipList(resource: String)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList

                @Throws(Exception::class)
            
    open fun addResourceRelativeRelationship(resource: String, relativeRelationship: RelativeRelationship)
        //nullable = true from not(false or (false and false)) = true


}
                
            


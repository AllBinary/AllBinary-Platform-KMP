
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
        package org.allbinary.game.configuration.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.resource.ResourceLoadingLevel
import org.allbinary.game.resource.ResourceLoadingLevelFactory
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class GameInitializedEvent : AllBinaryEventObject {
        

    private var resourceLoadingLevel: ResourceLoadingLevel = ResourceLoadingLevelFactory.getInstance()!!.LEVEL

    private var level: Int= 0
public constructor        (anyType: Any)                        

                            : super(anyType)

        Updates for KMP build        
        {
var anyType = anyType


                            //For kotlin this is before the body of the constructor.
                    
}


open fun setLevel(level: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var level = level
this.level= level
this.resourceLoadingLevel= ResourceLoadingLevelFactory.getInstance()!!.LEVEL
}


open fun getLevel()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return level
}


open fun setResourceLoadingLevel(resourceLoadingLevel: ResourceLoadingLevel)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var resourceLoadingLevel = resourceLoadingLevel
this.resourceLoadingLevel= resourceLoadingLevel
level= this.resourceLoadingLevel!!.getLevel()
}


open fun getResourceLoadingLevel()
        //nullable = true from not(false or (false and true)) = true
: ResourceLoadingLevel

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return resourceLoadingLevel
}


}
                
            



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
        package org.allbinary.game.configuration.feature




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.util.BasicArrayList

open public class GameFeatureChoiceGroups
            : Object
         {
        

        companion object {
            
    private var gameFeatureChoiceGroupsExclusive: GameFeatureChoiceGroups = GameFeatureChoiceGroups()

    private var gameFeatureChoiceGroupsMultiple: GameFeatureChoiceGroups = GameFeatureChoiceGroups()

open fun getExclusiveInstance()
        //nullable = true from not(false or (false and true)) = true
: GameFeatureChoiceGroups{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameFeatureChoiceGroupsExclusive
}


open fun getMultipleInstance()
        //nullable = true from not(false or (false and true)) = true
: GameFeatureChoiceGroups{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameFeatureChoiceGroupsMultiple
}


        }
            
    private var hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()
private constructor        ()
            : super()
        {
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


open fun add(name: String, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
var name = name
var list = list
hashtable.put(name, list)
}


}
                
            



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
        package org.allbinary.view



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.displayable.DisplayInfoSingleton

open public class CenterStaticViewPositionFactory
            : Object
         {
        
public constructor        ()
            : super()
        {}


open fun getInstance(z: Int)
        //nullable =  from not(true or (false and false)) = 
: ViewPosition{

                    var z = z

    var displayInfoSingleton: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StaticViewPosition((displayInfoSingleton!!.getLastWidth() shr 1), (displayInfoSingleton!!.getLastHeight() shr 1), z)
}


}
                
            


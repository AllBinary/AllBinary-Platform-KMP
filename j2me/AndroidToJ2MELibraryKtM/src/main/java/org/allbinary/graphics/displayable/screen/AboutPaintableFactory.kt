
        /*
                * 
                *  AllBinary Open License Version 1
                *  Copyright (c) 2022 AllBinary
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
        package org.allbinary.graphics.displayable.screen




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable

open public class AboutPaintableFactory
            : Object
         {
        
companion object {
            
    private val instance: AboutPaintableFactory = AboutPaintableFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AboutPaintableFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AboutPaintableFactory.instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var paintableArray: Array<Paintable?> = arrayOf(NullPaintable.getInstance())

}
                
            


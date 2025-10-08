
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
        package org.allbinary.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.Rectangle
import org.allbinary.view.ViewPosition

open public class AllBinaryLayerFactory
            : Object
        
                , AllBinaryLayerFactoryInterface {
        

    private val rectangle: Rectangle
public constructor (rectangle: Rectangle)
            : super()
        {
var rectangle = rectangle
this.rectangle= rectangle
}


    override fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AllBinaryLayer{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return AllBinaryLayer(rectangle, ViewPosition())
}


}
                
            


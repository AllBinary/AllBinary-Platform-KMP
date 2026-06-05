
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint

open public class ViewPositionBase : GPoint {
        
companion object {
            
    val NULL_VIEW_POSITION: ViewPositionBase = ViewPositionBase(0, 0, 0)

        }
            protected constructor (x: Int, y: Int, z: Int)                        

                            : super(x, y, z){
var x = x
var y = y
var z = z


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun getX2()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getX()
}


    open fun getY2()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getY()
}


    open fun getZ2()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getZ()
}


    open fun setAllbinaryLayer(allbinaryLayer: Any)
        //nullable = true from not(false or (false and false)) = true
{
var allbinaryLayer = allbinaryLayer
}


}
                
            


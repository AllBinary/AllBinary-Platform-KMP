
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
        package org.allbinary.layer.event



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class ScrollMapEvent : AllBinaryEventObject {
        

    private var dx: Int= 0

    private var dy: Int= 0
public constructor        (anyType: Any)                        

                            : super(anyType){

                    var anyType = anyType


                            //For kotlin this is before the body of the constructor.
                    
}


open fun setDx(dx: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var dx = dx
this.dx= dx
}


open fun getDx()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dx
}


open fun setDy(dy: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var dy = dy
this.dy= dy
}


open fun getDy()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dy
}


open fun setDxDy(dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var dx = dx


                    var dy = dy
this.dx= dx
this.dy= dy
}


}
                
            


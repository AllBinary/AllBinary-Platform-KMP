
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
        package org.allbinary.logic.control.contraints.size




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.w3c.dom.Node

open public class TwoDimensionalConstraint
            : Object
        
                , TwoDimensionalConstraintInterface {
        

    private var widthSizeConstraintInterface: SizeConstraintInterface

    private var heightSizeConstraintInterface: SizeConstraintInterface
public constructor        (node: Node)
            : super()
        {

                    var node = node
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: SizeConstraintInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.heightSizeConstraintInterface
}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: SizeConstraintInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.widthSizeConstraintInterface
}


open fun setHeight(heightSizeConstraintInterface: SizeConstraintInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var heightSizeConstraintInterface = heightSizeConstraintInterface
this.heightSizeConstraintInterface= heightSizeConstraintInterface
}


open fun setWidth(widthSizeConstraintInterface: SizeConstraintInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var widthSizeConstraintInterface = widthSizeConstraintInterface
this.widthSizeConstraintInterface= widthSizeConstraintInterface
}


}
                
            


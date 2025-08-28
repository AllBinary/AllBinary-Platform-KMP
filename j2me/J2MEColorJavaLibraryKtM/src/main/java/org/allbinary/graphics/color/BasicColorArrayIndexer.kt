
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
        package org.allbinary.graphics.color




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.CircularIndexUtil

open public class BasicColorArrayIndexer
            : Object
         {
        

    private var basicColorArray: Array<BasicColor?>

    private var circularIndexUtil: CircularIndexUtil
public constructor        (basicColorArray: Array<BasicColor?>)
            : super()
        {
var basicColorArray = basicColorArray
this.basicColorArray= basicColorArray
this.circularIndexUtil= CircularIndexUtil.getInstance(this.basicColorArray!!.size)
}


open fun next()
        //nullable = true from not(false or (false and true)) = true
{
this.circularIndexUtil!!.next()
}


open fun get()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.basicColorArray[this.circularIndexUtil!!.getIndex()]!!
}


open fun getBasicColorArray()
        //nullable = true from not(false or (false and true)) = true
: Array<BasicColor?>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicColorArray
}


}
                
            


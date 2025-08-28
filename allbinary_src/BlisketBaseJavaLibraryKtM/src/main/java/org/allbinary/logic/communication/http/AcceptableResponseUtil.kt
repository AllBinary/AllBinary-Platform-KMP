
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
        package org.allbinary.logic.communication.http




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector

open public class AcceptableResponseUtil
            : Object
         {
        

        companion object {
            
    private val instance: AcceptableResponseUtil = AcceptableResponseUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AcceptableResponseUtil{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


                init{
AcceptableResponseFactory.getInstance()!!.HTML.hashCode()
}

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val candidateVector: Vector = Vector()

    val tagNameVector: Vector = Vector()

open fun get(index: Int)
        //nullable = true from not(false or (false and false)) = true
: String{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return candidateVector!!.get(index) as String
}


open fun getTagName(index: Int)
        //nullable = true from not(false or (false and false)) = true
: String{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return tagNameVector!!.get(index) as String
}


open fun size()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return candidateVector!!.size
}


}
                
            


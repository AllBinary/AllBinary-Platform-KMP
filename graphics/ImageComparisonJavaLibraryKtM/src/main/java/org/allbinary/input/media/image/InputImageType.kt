
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
        package org.allbinary.input.media.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector

open public class InputImageType
            : Object
         {
        

        companion object {
            
    private var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

    private val TYPE_VECTOR: Vector = Vector()

    var CAPTURE: InputImageType = InputImageType("Capture", 0)

    var COMPARISON: InputImageType = InputImageType("Comparison", 1)

    var MOTION: InputImageType = InputImageType("Motion", 2)

open fun getInstance(imageTypeString: String)
        //nullable =  from not(true or (false and false)) = 
: InputImageType

        Updates for KMP build        
        {
var imageTypeString = imageTypeString



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap!!.get(imageTypeString as Object) as InputImageType
}


open fun getAllAsVector()
        //nullable = true from not(false or (false and true)) = true
: Vector

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TYPE_VECTOR
}


        }
            
    private val name: String

    private val index: Int
private constructor        (name: String, index: Int)
            : super()
        

        Updates for KMP build        
        {
var name = name
var index = index
this.name= name
this.index= index
TYPE_VECTOR.add(this)
this.hashMap!!.put(this.getName(), this)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "ImageType: " +getName()
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
}


open fun getIndex()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index
}


}
                
            



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
        package org.allbinary.media.graphics.geography.map.platform



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.util.BasicArrayList

open public class BasicPlatormGeographicMapCellType
            : Object
         {
        

    private val types: IntArray
public constructor        (type: Int)
            : super()
        {

                    var type = type

                        //Otherwise - ExpressionStmt - expression - ObjectCreationExpr

this.types= IntArray(1)
this.types[0]= type
}

public constructor        (types: IntArray)
            : super()
        {

                    var types = types

    var size: Int = types!!.size
                





                        for (index in 0 until size)


        {
                        //Otherwise - ExpressionStmt - expression - ObjectCreationExpr

}

this.types= types
}

public constructor        (types: BasicArrayList)
            : super()
        {

                    var types = types

    var size: Int = types!!.size()!!
            


    var typeArray: IntArray = IntArray(size)


    var type: Int= 0





                        for (index in 0 until size)


        {type= get = types!!.get(index)get as Integer
get.
                                toInt()

                        //Otherwise - ExpressionStmt - expression - ObjectCreationExpr

typeArray[index]= type
}

this.types= typeArray
}


open fun isType(type: GeographicMapCellType)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var type = type



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.isType(type!!.getType())
}


open fun isType(type: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var type = type

    var size: Int = types!!.size
                





                        for (index in 0 until size)


        {
    
                        if(types[index] == type)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            


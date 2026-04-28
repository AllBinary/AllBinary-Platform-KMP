
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




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.media.graphics.geography.map.GeographicMapCellType
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListS

open public class BasicPlatormGeographicMapCellType
            : Object
         {
        
companion object {
            
    open fun createType(type: Int)
        //nullable = true from not(false or (false and false)) = true
: BasicPlatormGeographicMapCellType{
    //var type = type

    var types: BasicArrayList = BasicArrayListS(1)

types.add(type.toString())

    var basicPlatormGeographicMapCellType: BasicPlatormGeographicMapCellType = BasicPlatormGeographicMapCellType(types)

GeographicMapCellType(type, 0)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basicPlatormGeographicMapCellType
}


        }
            
    private val types: IntArray
public constructor (types: BasicArrayList)
            : super()
        {
    //var types = types

    var size: Int = types.size()!!


    var typeArray: IntArray = IntArray(size)


    var typeAsInteger: Integer


    var type: Int= 0





                        for (index in 0 until size)

        {
typeAsInteger= (types.get(index) as Integer)
type= typeAsInteger!!.toInt()
GeographicMapCellType(type, 0)
typeArray[index]= type
}

this.types= typeArray
}


    open fun isType(type: GeographicMapCellType)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var type = type



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hasType(type.getType())
}


    open fun hasType(type: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var type = type

    var size: Int = types.size
                





                        for (index in 0 until size)

        {

    
                        if(this.types[index] == type)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            


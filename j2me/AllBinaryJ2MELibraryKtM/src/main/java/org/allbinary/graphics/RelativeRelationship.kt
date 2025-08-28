
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
        package org.allbinary.graphics




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListUtil

open public class RelativeRelationship
            : Object
         {
        

        companion object {
            
    val NULL_RELATIVE_RELATIONSHIP: RelativeRelationship = RelativeRelationship(PointFactory.getInstance()!!.ZERO_ZERO, BasicArrayListUtil.getInstance()!!.getImmutableInstance())

        }
            
    private var typesAllowedList: BasicArrayList

    private var x: Int

    private var y: Int

    private var z: Int
public constructor        (point: GPoint, typesAllowedList: BasicArrayList)
            : super()
        {
var point = point
var typesAllowedList = typesAllowedList
this.x= point.getX()
this.y= point.getY()
this.z= point.getZ()
this.typesAllowedList= typesAllowedList
}


open fun getX()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.x
}


open fun getY()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.y
}


open fun getZ()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.z
}


open fun getTypesAllowedList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return typesAllowedList
}


open fun setTypesAllowedList(typesAllowedList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
var typesAllowedList = typesAllowedList
this.typesAllowedList= typesAllowedList
}


}
                
            


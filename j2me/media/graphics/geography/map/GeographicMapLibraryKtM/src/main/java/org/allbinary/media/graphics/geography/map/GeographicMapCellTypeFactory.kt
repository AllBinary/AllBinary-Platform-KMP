
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
        package org.allbinary.media.graphics.geography.map



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil

open public class GeographicMapCellTypeFactory
            : Object
         {
        

        companion object {


    private val instance: GeographicMapCellTypeFactory = GeographicMapCellTypeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GeographicMapCellTypeFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val geographicMapCellTypeArray: Array<GeographicMapCellType?> = arrayOfNulls(512)

open fun getInstance(type: Int)
        //nullable =  from not(true or (false and false)) = 
: GeographicMapCellType{

                    var type = type



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellTypeArray[type]!!
}


open fun getGeographicMapCellTypeArray()
        //nullable = true from not(false or (false and true)) = true
: Array<GeographicMapCellType?>{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellTypeArray
}


open fun getStartType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                            throw RuntimeException()
}


open fun getEndType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                            throw RuntimeException()
}


open fun getEmptyType()
        //nullable = true from not(false or (false and true)) = true
: Int{


                            throw RuntimeException()
}


open fun isPath(cellType: GeographicMapCellType)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var cellType = cellType



                            throw RuntimeException()
}


}
                
            



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




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.math.SmallIntegerSingletonFactory
import org.allbinary.string.CommonStrings

open public class GeographicMapCellType
            : Object
         {
        
companion object {
            
    val NULL_GEOGRAPHIC_MAP_CELL_TYPE_ARRAY: Array<GeographicMapCellType?> = arrayOfNulls(0)

    val NULL_GEOGRAPHIC_MAP_CELL_TYPE: GeographicMapCellType = GeographicMapCellType(Integer.MIN_VALUE)

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val type: Int
public constructor (type: Int)
            : super()
        {
    //var type = type
this.type= type

    
                        if(type != Integer.MIN_VALUE)
                        
                                    {
                                    
    var geographicMapCellTypeFactory: GeographicMapCellTypeFactory = GeographicMapCellTypeFactory.getInstance()!!


    var geographicMapCellTypeArray: Array<GeographicMapCellType?> = geographicMapCellTypeFactory!!.getGeographicMapCellTypeArray()!!


    
                        if(geographicMapCellTypeArray[type] == 
                                    null
                                )
                        
                                    {
                                    geographicMapCellTypeArray[type]= this

                                    }
                                
                        else {
                            


                            throw RuntimeException()

                        }
                            

                                    }
                                
}


    open fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.type
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return SmallIntegerSingletonFactory.getInstance()!!.getInstance(this.type)!!.toString()
}


}
                
            


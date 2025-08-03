
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
        package org.allbinary.media.graphics.geography.map.event



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.event.AllBinaryEventObject
import org.allbinary.media.graphics.geography.map.GeographicMapCellPosition

open public class GeographicMapCellPositionEvent : AllBinaryEventObject {
        

    private var geographicMapCellPosition: GeographicMapCellPosition
public constructor        (anyType: Any, geographicMapCellPosition: GeographicMapCellPosition)                        

                            : super(anyType){

                    var anyType = anyType


                    var geographicMapCellPosition = geographicMapCellPosition


                            //For kotlin this is before the body of the constructor.
                    
this.setGeographicMapCellPosition(geographicMapCellPosition)
}

public constructor        (anyType: Any, key: Int)                        

                            : super(anyType){

                    var anyType = anyType


                    var key = key


                            //For kotlin this is before the body of the constructor.
                    
}


open fun init(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
{

                    var anyType = anyType
this.setSource(anyType)
}


open fun setGeographicMapCellPosition(geographicMapCellPosition: GeographicMapCellPosition)
        //nullable = true from not(false or (false and false)) = true
{

                    var geographicMapCellPosition = geographicMapCellPosition
this.geographicMapCellPosition= geographicMapCellPosition
}


open fun getGeographicMapCellPosition()
        //nullable = true from not(false or (false and true)) = true
: GeographicMapCellPosition{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return geographicMapCellPosition
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "CellPositionEvent: ")
stringBuffer!!.append(
                            "\nGeographicMapCellPosition: ")
stringBuffer!!.append(StringUtil.getInstance()!!.toString(this.getGeographicMapCellPosition()))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            


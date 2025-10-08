
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
        package org.allbinary.logic.visual.dhtml.html.table




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.string.CommonStrings

open public class HtmlTableData
            : Object
         {
        
companion object {
            
    private val instance: HtmlTableData = HtmlTableData()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: HtmlTableData{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val LEFT: String = CommonStrings.getInstance()!!.LEFT

    val RIGHT: String = CommonStrings.getInstance()!!.RIGHT

    val NONE: String = "none"

    val TOP: String = "top"

    val BOTTOM: String = "bottom"

    val TOPBOT: String = "topbot"

    val SIDES: String = "sides"

    val ALL: String = "all"

    val BORDERED: String = "border"

    val BASIC: String = "basic"

    val ROWS: String = "rows"

    val FRAMES: Array<String?> = arrayOf(NONE,TOP,BOTTOM,TOPBOT,SIDES,ALL,BORDERED)

}
                
            


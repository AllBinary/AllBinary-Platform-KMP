
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.string.CommonSeps
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.math.PositionStrings

open public class LayerUtil
            : Object
         {
        
companion object {
            
    private val HASHTABLE: String = "Hashtable: "

    open fun toString(hashtable: Hashtable<Any, Any>, x: Int, y: Int, z: Int)
        //nullable = true from not(false or (true and false)) = true
: String{
var hashtable = hashtable
var x = x
var y = y
var z = z

    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var positionStrings: PositionStrings = PositionStrings.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(HASHTABLE)
stringBuffer!!.append(StringUtil.getInstance()!!.toString(hashtable))
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.X_LABEL)
stringBuffer!!.append(x)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.Y_LABEL)
stringBuffer!!.append(y)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(positionStrings!!.Z_LABEL)
stringBuffer!!.append(z)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            



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
        package org.allbinary.media.image.cache




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels

open public class BufferedImageInfo
            : Object
         {
        

    private var width: Int

    private var height: Int

    private var type: Int
public constructor        (width: Int, height: Int, type: Int)
            : super()
        

        Updates for KMP build        
        {
var width = width
var height = height
var type = type
this.width= width
this.height= height
this.type= type
}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return width
}


open fun setWidth(width: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var width = width
this.width= width
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return height
}


open fun setHeight(height: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var height = height
this.height= height
}


open fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return type
}


open fun setType(type: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var type = type
this.type= type
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var commonLabels: CommonLabels = CommonLabels.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("BufferedImageInfo -")
stringBuffer!!.append(commonLabels!!.WIDTH_LABEL)
stringBuffer!!.append(this.getWidth())
stringBuffer!!.append(commonLabels!!.HEIGHT_LABEL)
stringBuffer!!.append(this.getHeight())
stringBuffer!!.append(" Type: ")
stringBuffer!!.append(this.getType())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            


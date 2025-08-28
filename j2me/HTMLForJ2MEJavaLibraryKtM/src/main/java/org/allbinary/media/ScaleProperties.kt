
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2022 AllBinary 
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
        package org.allbinary.media




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels

open public class ScaleProperties
            : Object
         {
        

        companion object {
            
    val instance: ScaleProperties = ScaleProperties()

        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var scaleX: Float= 0.0f

    var scaleY: Float= 0.0f

    var scaleWidth: Int= 0

    var scaleHeight: Int= 0

    var shouldScale: Boolean= false
override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(CommonLabels.getInstance()!!.COLON_SEP)!!.append(this.shouldScale)!!.append("scaleX: ")!!.append(this.scaleX)!!.append("scaleY: ")!!.append(this.scaleY)!!.append("scaleWidth: ")!!.append(this.scaleWidth)!!.append("scaleHeight: ")!!.append(this.scaleHeight)!!.toString()
}


}
                
            


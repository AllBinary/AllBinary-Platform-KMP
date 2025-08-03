
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
        package org.allbinary.animation.image



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps

open public class AnimationFactoryInitializationVisitor
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var width: Int= 0

    var height: Int= 0

    var dx: Int= 0

    var dy: Int= 0

open fun visit()
        //nullable = true from not(false or (false and true)) = true
{}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var commonSeps: CommonSeps = CommonSeps.getInstance()!!
            


    var commonLabels: CommonLabels = CommonLabels.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(commonLabels!!.WIDTH_LABEL)
stringBuffer!!.append(width)
stringBuffer!!.append(commonSeps!!.SPACE)
stringBuffer!!.append(commonLabels!!.HEIGHT_LABEL)
stringBuffer!!.append(height)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            


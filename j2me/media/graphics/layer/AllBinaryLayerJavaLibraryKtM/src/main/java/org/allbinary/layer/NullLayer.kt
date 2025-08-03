
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
        package org.allbinary.layer



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics

open public class NullLayer : Layer {
        

        companion object {


    private val instance: NullLayer = NullLayer()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: NullLayer{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}



        }
            private constructor        ()                        

                            : super(0, 0){

                            //For kotlin this is before the body of the constructor.
                    
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
}


}
                
            


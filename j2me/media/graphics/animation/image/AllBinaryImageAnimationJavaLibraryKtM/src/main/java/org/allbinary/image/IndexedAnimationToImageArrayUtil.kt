
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
        package org.allbinary.image



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import org.allbinary.animation.IndexedAnimation

open public class IndexedAnimationToImageArrayUtil
            : Object
         {
        

        companion object {


                @Throws(Exception::class)
            
open fun getInstance(width: Int, height: Int, sequentialAnimationInterface: IndexedAnimation)
        //nullable =  from not(true or (false and false)) = 
: Array<Image?>{

                    var width = width


                    var height = height


                    var sequentialAnimationInterface = sequentialAnimationInterface

    var size: Int = sequentialAnimationInterface!!.getAnimationSize()!!
            


    var imageArray: Array<Image?> = arrayOfNulls(size)





                        for (index in 0 until size)


        {sequentialAnimationInterface!!.setFrame(index)
imageArray[index]= AnimationFrameToImageUtil.getInstance()!!.getInstance(width, height, sequentialAnimationInterface)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return imageArray
}



        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            


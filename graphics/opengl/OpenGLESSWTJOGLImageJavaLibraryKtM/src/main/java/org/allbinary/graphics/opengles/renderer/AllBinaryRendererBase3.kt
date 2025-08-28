
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
        package org.allbinary.graphics.opengles.renderer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.khronos.opengles.GL10
import javax.microedition.lcdui.Image
import org.allbinary.image.opengles.OpenGLESImage
import org.allbinary.util.BasicArrayList

open public class AllBinaryRendererBase3
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val list: BasicArrayList = BasicArrayList()

                @Throws(Exception::class)
            
open fun update(gl: GL10)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var gl = gl

        while(list.size() > 0)
        

        Updates for KMP build        
        {

    var openGLESImage: OpenGLESImage = list.remove(0) as OpenGLESImage


    
                        if(openGLESImage != 
                                    null
                                )
                        
                                    {
                                    openGLESImage!!.set(gl)

                                    }
                                
}

}


open fun add(image: Image)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var image = image
this.list.add(image)
}


}
                
            


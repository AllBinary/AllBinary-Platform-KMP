
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.InputStream
import javax.microedition.lcdui.Image

open public class ImageFactory
            : Object
         {
        
companion object {
            
    private val instance: ImageFactory = ImageFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
    open fun createImageUrl(url: String)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var url = url



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Image.createImage(url)
}


                @Throws(Exception::class)
            
    open fun createImage(caller: String, width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var caller = caller
    //var width = width
    //var height = height



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Image.createImageWH(width, height)
}


                @Throws(Exception::class)
            
    open fun createImageFromInputStream(key: Any, inputStream: InputStream)
        //nullable = true from not(false or (false and false)) = true
: Image{
    //var key = key
    //var inputStream = inputStream

    var image: Image = Image.createImageFromInputStream(inputStream)!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


}
                
            


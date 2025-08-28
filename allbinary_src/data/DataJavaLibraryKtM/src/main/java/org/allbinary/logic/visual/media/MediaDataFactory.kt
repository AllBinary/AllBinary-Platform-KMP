
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
        package org.allbinary.logic.visual.media




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class MediaDataFactory
            : Object
         {
        

        companion object {
            
    private val instance: MediaDataFactory = MediaDataFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: MediaDataFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val AVI: MediaData = MediaData("avi")

    val BMP: MediaData = MediaData("bmp")

    val CEL: MediaData = MediaData("cel")

    val FITS: MediaData = MediaData("fits")

    val FLI: MediaData = MediaData("fli")

    val GBR: MediaData = MediaData("gbr")

    val GIF: MediaData = MediaData("gif")

    val GIH: MediaData = MediaData("gih")

    val JPG: MediaData = MediaData("jpg")

    val PIX: MediaData = MediaData("pix")

    val PNG: MediaData = MediaData("png")

    val PNM: MediaData = MediaData("pnm")

    val PSD: MediaData = MediaData("psd")

    val PSP: MediaData = MediaData("psp")

    val PS: MediaData = MediaData("ps")

    val SGI: MediaData = MediaData("SGI")

    val SWF: MediaData = MediaData("swf")

    val TGA: MediaData = MediaData("tga")

    val TIFF: MediaData = MediaData("tiff")

    val WMF: MediaData = MediaData("wmf")

}
                
            


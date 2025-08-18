
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
        package org.allbinary.media.image




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Image
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.time.TimeDelayHelper
import org.microemu.device.playn.PlaynImage

open public class ImageCompleteUtil
            : Object
         {
        

        companion object {
            
    private val instance: ImageCompleteUtil = ImageCompleteUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ImageCompleteUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val ISREADY: String = "isReady"

                @Throws(Exception::class)
            
open fun waitFor(image: Image, name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var image = image


                    var name = name
}


    private val COMPLETE: String = "Image loading complete for: "

                @Throws(Exception::class)
            
open fun isReady(image: Image, name: String, timeDelayHelper: TimeDelayHelper)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var image = image


                    var name = name


                    var timeDelayHelper = timeDelayHelper

    var playnImage: PlaynImage = image as PlaynImage


    var playnCoreImage: playn.core.Image = playnImage!!.getImage() as playn.core.Image


    
                        if(!playnCoreImage!!.isReady() || playnCoreImage!!.width() +playnCoreImage!!.height() <= 0)
                        
                                    {
                                    this.handleTimeout(name)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                

    
                        if(!image.isReady())
                        
                                    {
                                    image.init(image.getImage())

    
                        if(!image.isReady())
                        
                                    {
                                    PreLogUtil.put("Waiting for Not Ready Image: " +image.getName(), this, ISREADY)

                                    }
                                

                                    }
                                

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

PreLogUtil.put(COMPLETE +image.getName(), this, commonStrings!!.SUCCESS)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            
open fun handleTimeout(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
}


                @Throws(Exception::class)
            
open fun waitForAll()
        //nullable = true from not(false or (false and true)) = true
{}


}
                
            


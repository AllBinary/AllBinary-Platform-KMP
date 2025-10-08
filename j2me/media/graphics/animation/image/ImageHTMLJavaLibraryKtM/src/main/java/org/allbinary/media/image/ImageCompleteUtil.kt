
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
        
import java.util.Hashtable
import javax.microedition.lcdui.Image
import org.allbinary.image.GameFeatureImageCacheFactory
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.HashtableUtil
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
        
    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(18000)

    private val allTimeDelayHelper: TimeDelayHelper = TimeDelayHelper(120000)

                @Throws(Exception::class)
            
    open fun waitFor(image: Image, name: String)
        //nullable = true from not(false or (false and false)) = true
{
var image = image
var name = name
this.timeDelayHelper!!.setStartTime()
this.waitFor(image, name, this.timeDelayHelper)
}


                @Throws(Exception::class)
            
    open fun isReady(image: Image, name: String, timeDelayHelper: TimeDelayHelper)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var image = image
var name = name
var timeDelayHelper = timeDelayHelper

    var playnImage: PlaynImage = image as PlaynImage


    
                        if(!playnImage!!.getImage()!!.isReady() && playnImage!!.getImage()!!.width() +playnImage!!.getImage()!!.height() == 0)
                        
                                    {
                                    
    
                        if(timeDelayHelper!!.isTime())
                        
                                    {
                                    


                            throw Exception("isReady: Timeout Waiting or GameHtmlHasLoadedResourcesProcessor does not have this Image: " +name)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


                @Throws(Exception::class)
            
    open fun waitFor(image: Image, name: String, timeDelayHelper: TimeDelayHelper)
        //nullable = true from not(false or (false and false)) = true
{
var image = image
var name = name
var timeDelayHelper = timeDelayHelper

    var playnImage: PlaynImage = image as PlaynImage


        while(!playnImage!!.getImage()!!.isReady() && playnImage!!.getImage()!!.width() +playnImage!!.getImage()!!.height() == 0)
        {

    
                        if(timeDelayHelper!!.isTime())
                        
                                    {
                                    


                            throw Exception("waitFor: Timeout Waiting or GameHtmlHasLoadedResourcesProcessor does not have this Image: " +name)

                                    }
                                
}

}


                @Throws(Exception::class)
            
    open fun waitForAll()
        //nullable = true from not(false or (false and true)) = true
{
this.allTimeDelayHelper!!.setStartTime()

    var hashtable: Hashtable<Any, Any> = GameFeatureImageCacheFactory.getInstance()!!.getHashtable()!!


    var objectArray: Array<Any?> = HashtableUtil.getInstance()!!.getKeysAsArray(hashtable)!!


    var size: Int = objectArray!!.size
                

PreLogUtil.put("Total: " +size, this, "waitForAll")




                        for (index in 0 until size)

        {
this.waitFor(hashtable.get(objectArray[index]!!) as Image, objectArray[index]!! as String, this.allTimeDelayHelper)
}

}


}
                
            


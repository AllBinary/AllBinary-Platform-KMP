
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
        package org.allbinary.media.image



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.Image
import org.allbinary.image.GameFeatureImageCacheFactory
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.string.CommonStrings
import org.allbinary.time.TimeDelayHelper
import org.allbinary.util.HashtableUtil
import org.microemu.device.playn.PlaynImage

open public class ImageWaitCompleteUtil : ImageCompleteUtil {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val METHOD_NAME: String = "waitForLoad"

    private val timeDelayHelper: TimeDelayHelper = TimeDelayHelper(18000)

    private val allTimeDelayHelper: TimeDelayHelper = TimeDelayHelper(120000)
public constructor        (){}


                @Throws(Exception::class)
            override fun waitFor(image: Image, name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var image = image


                    var name = name
this.timeDelayHelper!!.setStartTime()
this.waitFor(image, name, this.timeDelayHelper)
}


                @Throws(Exception::class)
            
open fun handleTimeout(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name

    
                        if(timeDelayHelper!!.isTime())
                        
                                    {
                                    


                            throw Exception("isReady: Timeout Waiting or GameHtmlHasLoadedResourcesProcessor does not have this Image: " +name)

                                    }
                                
}


                @Throws(Exception::class)
            
open fun waitFor(image: Image, name: String, timeDelayHelper: TimeDelayHelper)
        //nullable = true from not(false or (false and false)) = true
{

                    var image = image


                    var name = name


                    var timeDelayHelper = timeDelayHelper

    var playnImage: PlaynImage = image as PlaynImage


    var playnCoreImage: playn.core.Image = playnImage!!.getImage() as Image


        while(!playnCoreImage!!.isReady() || playnCoreImage!!.width() +playnCoreImage!!.height() <= 0)
        {
    
                        if(timeDelayHelper!!.isTime())
                        
                                    {
                                    


                            throw Exception("waitFor: Timeout Waiting or GameHtmlHasLoadedResourcesProcessor does not have this Image: " +name)

                                    }
                                
}


    
                        if(!image.isReady())
                        
                                    {
                                    image.init(image.getImage())

                                    }
                                
}


                @Throws(Exception::class)
            
open fun waitForAll()
        //nullable = true from not(false or (false and true)) = true
{this.allTimeDelayHelper!!.setStartTime()

    var hashtable: Hashtable<Any, Any> = GameFeatureImageCacheFactory.getInstance()!!.getHashtableP()!!
            


    var objectArray: Array<Any?> = HashtableUtil.getInstance()!!.getKeysAsArray(hashtable)!!
            


    var size: Int = objectArray!!.size
                

PreLogUtil.put("Image Total: " +size, this, 
                            "waitForAll")




                        for (index in 0 until size)


        {this.waitFor(hashtable.get(objectArray[index]!!) as Image, objectArray[index]!! as String, this.allTimeDelayHelper)
}

}


}
                
            


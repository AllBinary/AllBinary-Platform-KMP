
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
        package org.allbinary.business.advertisement




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.rand.MyRandomFactory
import org.allbinary.logic.system.security.licensing.LockedUtil
import org.allbinary.util.BasicArrayList

open public class Advertisements
            : Object
         {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val bannerList: BasicArrayList = BasicArrayList()

    private val pageList: BasicArrayList = BasicArrayList()

open fun addPage(advertisementProcessorInterface: AdvertisementProcessorInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var advertisementProcessorInterface = advertisementProcessorInterface

    
                        if(!this.pageList!!.contains(advertisementProcessorInterface))
                        
                                    {
                                    this.pageList!!.add(advertisementProcessorInterface)

                                    }
                                
}


open fun startRandomPage()
        //nullable = true from not(false or (false and true)) = true
{
    var size: Int = this.pageList!!.size()!!


    
                        if(size > 0)
                        
                                    {
                                    
    var random: Int = myRandomFactory!!.getAbsoluteNextInt(size)!!


    var advertisementProcessorInterface: AdvertisementProcessorInterface = this.pageList!!.objectArray[random]!! as AdvertisementProcessorInterface

advertisementProcessorInterface!!.start()

                                    }
                                
}


    private val myRandomFactory: MyRandomFactory = MyRandomFactory.getInstance()!!

open fun processRandomPage()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(LockedUtil.getInstance()!!.isLockedFeature())
                        
                                    {
                                    
    var size: Int = this.pageList!!.size()!!


    
                        if(size > 0)
                        
                                    {
                                    
    var random: Int = myRandomFactory!!.getAbsoluteNextInt(size)!!


    var advertisementProcessorInterface: AdvertisementProcessorInterface = this.pageList!!.objectArray[random]!! as AdvertisementProcessorInterface

advertisementProcessorInterface!!.process()

                                    }
                                

                                    }
                                
}


open fun stopAllPage()
        //nullable = true from not(false or (false and true)) = true
{



                        for (index in this.pageList!!.size()!! downTo 0)


        {
    var advertisementProcessorInterface: AdvertisementProcessorInterface = this.pageList!!.objectArray[index]!! as AdvertisementProcessorInterface

advertisementProcessorInterface!!.stop()
}

}


open fun addBanner(advertisementProcessorInterface: AdvertisementProcessorInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var advertisementProcessorInterface = advertisementProcessorInterface

    
                        if(!this.bannerList!!.contains(advertisementProcessorInterface))
                        
                                    {
                                    this.bannerList!!.add(advertisementProcessorInterface)

                                    }
                                
}


open fun startAll()
        //nullable = true from not(false or (false and true)) = true
{



                        for (index in this.bannerList!!.size()!! downTo 0)


        {
    var advertisementProcessorInterface: AdvertisementProcessorInterface = this.bannerList!!.objectArray[index]!! as AdvertisementProcessorInterface

advertisementProcessorInterface!!.start()
}

}


open fun stopAllBanner()
        //nullable = true from not(false or (false and true)) = true
{



                        for (index in this.bannerList!!.size()!! downTo 0)


        {
    var advertisementProcessorInterface: AdvertisementProcessorInterface = this.bannerList!!.objectArray[index]!! as AdvertisementProcessorInterface

advertisementProcessorInterface!!.stop()
}

}


open fun getBanner(index: Int)
        //nullable = true from not(false or (false and false)) = true
: AdvertisementProcessorInterface{

                    var index = index

    var advertisementProcessorInterface: AdvertisementProcessorInterface = this.bannerList!!.objectArray[index]!! as AdvertisementProcessorInterface




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return advertisementProcessorInterface
}


open fun stopAll()
        //nullable = true from not(false or (false and true)) = true
{this.stopAllBanner()
this.stopAllPage()
}


}
                
            


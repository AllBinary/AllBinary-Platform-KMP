
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
        package org.allbinary.business.advertisement.campaign




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.advertisement.AdvertisementInterface
import org.allbinary.business.advertisement.AdvertisementsInterface
import org.allbinary.business.advertisement.search.AdvertisementSearchInterface

open public class AdvertisementCampaigns
            : Object
        
                , AdvertisementCampaignsInterface {
        

    private var advertisementsVector: Vector
public constructor (vector: Vector)
            : super()
        {
var vector = vector
this.advertisementsVector= advertisementsVector
}


    open fun add(advertisementInterface: AdvertisementInterface)
        //nullable = true from not(false or (false and false)) = true
{
var advertisementInterface = advertisementInterface
this.advertisementsVector!!.add(advertisementInterface)
}


    open fun get(index: Int)
        //nullable = true from not(false or (false and false)) = true
: AdvertisementInterface{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.advertisementsVector!!.get(index) as AdvertisementInterface
}


    open fun size()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.advertisementsVector!!.size
}


    open fun isEnabled()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
}


    open fun search(advertisementSearchInterface: AdvertisementSearchInterface)
        //nullable = true from not(false or (false and false)) = true
: AdvertisementsInterface{
var advertisementSearchInterface = advertisementSearchInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            


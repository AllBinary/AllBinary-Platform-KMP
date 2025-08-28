
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
        
import java.util.HashMap
import org.allbinary.business.DynamicObjectData
import org.allbinary.business.advertisement.AdvertisementsInterface
import org.allbinary.business.advertisement.search.AdvertisementSearchInterface

open public class AdvertisementCampaign
            : Object
        
                , AdvertisementCampaignInterface {
        

    private var hashMap: HashMap<Any, Any>
public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        

        Updates for KMP build        
        {
var hashMap = hashMap
this.hashMap= hashMap
}


open fun getComponent()
        //nullable = true from not(false or (false and true)) = true
: Any

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hashMap!!.get(AdvertisementCampaignData.getInstance()!!.NAME) as String
}


open fun setComponentName(name: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var name = name
this.hashMap!!.put(DynamicObjectData.NAME, name)
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var name = name
this.hashMap!!.put(AdvertisementCampaignData.getInstance()!!.NAME, name)
}


open fun search(advertisementSearchInterface: AdvertisementSearchInterface)
        //nullable = true from not(false or (false and false)) = true
: AdvertisementsInterface

        Updates for KMP build        
        {
var advertisementSearchInterface = advertisementSearchInterface



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            


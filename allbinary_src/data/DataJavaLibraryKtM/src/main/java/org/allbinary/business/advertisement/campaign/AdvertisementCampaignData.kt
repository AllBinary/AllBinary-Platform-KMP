
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
        

open public class AdvertisementCampaignData
            : Object
         {
        
companion object {
            
    private val instance: AdvertisementCampaignData = AdvertisementCampaignData()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AdvertisementCampaignData{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            private constructor ()
            : super()
        {
}


    val NAME: String = "ADVERTISEMENTCAMPAIGN_NAME"

    val DESCRIPTION: String = "ADVERTISEMENTCAMPAIGN_DESCRIPTION"

    val CONFIG: String = "ADVERTISEMENTCAMPAIGN_CONFIG"

}
                
            


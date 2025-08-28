
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
        
import org.allbinary.business.advertisement.AdvertisementsInterface
import org.allbinary.business.advertisement.search.AdvertisementSearchInterface
interface AdvertisementCampaignInterface {
        

open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getComponent()
        //nullable = true from not(false or (false and true)) = true
: Any

        Updates for KMP build        
        

open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setComponentName(name: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun search(advertisementSearchInterface: AdvertisementSearchInterface)
        //nullable = true from not(false or (false and false)) = true
: AdvertisementsInterface

        Updates for KMP build        
        

}
                
            



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
        
interface AdvertisementsInterface {
        

open fun add(advertisementInterface: AdvertisementInterface)
        //nullable = true from not(false or (false and false)) = true


open fun get(index: Int)
        //nullable = true from not(false or (false and false)) = true
: AdvertisementInterface

open fun getCurrentPageNum()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun getErrorDescription()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getErrorNum()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getNumberOfPosters()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun getNumberOfProductsInPage()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun getStatusCode()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun getTotalNumberOfProducts()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun isSearchValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

open fun setCurrentPageNum(currentPageNum: Int)
        //nullable = true from not(false or (false and false)) = true


open fun setErrorDescription(errorDescription: String)
        //nullable = true from not(false or (false and false)) = true


open fun setErrorNum(errorNum: String)
        //nullable = true from not(false or (false and false)) = true


open fun setNumberOfProductsInPage(numberOfProductsInPage: Int)
        //nullable = true from not(false or (false and false)) = true


open fun setStatusCode(statusCode: Int)
        //nullable = true from not(false or (false and false)) = true


open fun setTotalNumberOfProducts(totalNumberOfProducts: Int)
        //nullable = true from not(false or (false and false)) = true

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

}
                
            


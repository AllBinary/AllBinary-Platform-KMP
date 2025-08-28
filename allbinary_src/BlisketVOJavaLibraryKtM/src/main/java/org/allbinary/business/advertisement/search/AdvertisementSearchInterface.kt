
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
        package org.allbinary.business.advertisement.search




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.advertisement.search.category.AdvertisementCategoryInterface
import org.allbinary.business.advertisement.search.website.AdvertisementWebsiteInterface
import org.allbinary.logic.control.contraints.price.PriceConstraintInterface
import org.allbinary.logic.control.contraints.size.TwoDimensionalConstraintInterface
interface AdvertisementSearchInterface {
        

open fun getWebSite()
        //nullable = true from not(false or (false and true)) = true
: AdvertisementWebsiteInterface

        Updates for KMP build        
        

open fun getCategory()
        //nullable = true from not(false or (false and true)) = true
: AdvertisementCategoryInterface

        Updates for KMP build        
        

open fun getSizeConstraints()
        //nullable = true from not(false or (false and true)) = true
: TwoDimensionalConstraintInterface

        Updates for KMP build        
        

open fun getPricingConstraints()
        //nullable = true from not(false or (false and true)) = true
: PriceConstraintInterface

        Updates for KMP build        
        

open fun getPageNumber()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        

open fun getProductsPerPage()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        

open fun getSearchParams()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        

open fun setCategory(advertisementCategoryInterface: AdvertisementCategoryInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setSizeConstraints(twoDimensionConstraintsInterface: TwoDimensionalConstraintInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setPricingConstraints(priceConstraintInterface: PriceConstraintInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setPageNumber(pageNumber: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setProductsPerPage(productsPerPage: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setSearchParams(columnAndKeywordHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

}
                
            


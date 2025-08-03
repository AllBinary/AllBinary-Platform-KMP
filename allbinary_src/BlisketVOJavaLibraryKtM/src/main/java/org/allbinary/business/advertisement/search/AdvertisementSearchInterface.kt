
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
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

open fun getCategory()
        //nullable = true from not(false or (false and true)) = true
: AdvertisementCategoryInterface

open fun getSizeConstraints()
        //nullable = true from not(false or (false and true)) = true
: TwoDimensionalConstraintInterface

open fun getPricingConstraints()
        //nullable = true from not(false or (false and true)) = true
: PriceConstraintInterface

open fun getPageNumber()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun getProductsPerPage()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun getSearchParams()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

open fun setCategory(advertisementCategoryInterface: AdvertisementCategoryInterface)
        //nullable = true from not(false or (false and false)) = true


open fun setSizeConstraints(twoDimensionConstraintsInterface: TwoDimensionalConstraintInterface)
        //nullable = true from not(false or (false and false)) = true


open fun setPricingConstraints(priceConstraintInterface: PriceConstraintInterface)
        //nullable = true from not(false or (false and false)) = true


open fun setPageNumber(pageNumber: Int)
        //nullable = true from not(false or (false and false)) = true


open fun setProductsPerPage(productsPerPage: Int)
        //nullable = true from not(false or (false and false)) = true


open fun setSearchParams(columnAndKeywordHashMap: HashMap<Any, Any>)
        //nullable = true from not(false or (false and false)) = true


}
                
            


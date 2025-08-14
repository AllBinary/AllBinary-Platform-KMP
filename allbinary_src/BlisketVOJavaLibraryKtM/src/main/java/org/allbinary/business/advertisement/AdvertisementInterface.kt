
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
        
import org.allbinary.business.advertisement.image.AdvertisementImageInterface
import org.allbinary.business.advertisement.product.AdvertisementProductInterface
import org.allbinary.business.advertisement.thumbnail.AdvertisementThumbnailInterface
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.logic.control.contraints.display.browser.DisplayInBrowserContraintsInterface
interface AdvertisementInterface {
        

open fun getArtist()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getArtistLink()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getTitle()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getDateAdded()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getDirectory()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getFramedLink()
        //nullable = true from not(false or (false and true)) = true
: String

open fun getListPrice()
        //nullable = true from not(false or (false and true)) = true
: Money

open fun getOurPrice()
        //nullable = true from not(false or (false and true)) = true
: Money

open fun getRank()
        //nullable = true from not(false or (false and true)) = true
: Int

open fun getImage()
        //nullable = true from not(false or (false and true)) = true
: AdvertisementImageInterface

open fun getProduct()
        //nullable = true from not(false or (false and true)) = true
: AdvertisementProductInterface

open fun getThumbnail()
        //nullable = true from not(false or (false and true)) = true
: AdvertisementThumbnailInterface

open fun getDisplayInBrowserContraintsInterface()
        //nullable = true from not(false or (false and true)) = true
: DisplayInBrowserContraintsInterface

open fun setArtist(artist: String)
        //nullable = true from not(false or (false and false)) = true


open fun setArtistLink(artistLink: String)
        //nullable = true from not(false or (false and false)) = true


open fun setTitle(title: String)
        //nullable = true from not(false or (false and false)) = true


open fun setDateAdded(dateAdded: String)
        //nullable = true from not(false or (false and false)) = true


open fun setDirectory(directory: String)
        //nullable = true from not(false or (false and false)) = true


open fun setFramedLink(framedLink: String)
        //nullable = true from not(false or (false and false)) = true


open fun setRank(rank: Int)
        //nullable = true from not(false or (false and false)) = true


open fun setImage(AdvertisementImageInterface: AdvertisementImageInterface)
        //nullable = true from not(false or (false and false)) = true


open fun setProduct(AdvertisementProductInterface: AdvertisementProductInterface)
        //nullable = true from not(false or (false and false)) = true


open fun setThumbnail(AdvertisementThumbnailInterface: AdvertisementThumbnailInterface)
        //nullable = true from not(false or (false and false)) = true


}
                
            


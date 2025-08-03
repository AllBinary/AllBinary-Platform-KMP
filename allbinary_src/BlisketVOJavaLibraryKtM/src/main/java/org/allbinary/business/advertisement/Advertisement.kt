
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.advertisement.image.AdvertisementImageInterface
import org.allbinary.business.advertisement.product.AdvertisementProductInterface
import org.allbinary.business.advertisement.thumbnail.AdvertisementThumbnailInterface
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.logic.control.contraints.display.browser.DisplayInBrowserContraintsInterface

open public class Advertisement
            : Object
        
                , AdvertisementInterface {
        

    private var artist: String

    private var artistLink: String

    private var title: String

    private var dateAdded: String

    private var directory: String

    private var framedLink: String

    private var rank: Int= 0

    private var listPrice: Money

    private var ourPrice: Money

    private var image: AdvertisementImageInterface

    private var product: AdvertisementProductInterface

    private var thumbnail: AdvertisementThumbnailInterface

    private val displayInBrowserContraintsInterface: DisplayInBrowserContraintsInterface
public constructor        ()
            : super()
        {this.displayInBrowserContraintsInterface= 
                                        null
                                    
}


open fun getArtist()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return artist
}


open fun setArtist(artist: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var artist = artist
this.artist= artist
}


open fun getArtistLink()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return artistLink
}


open fun setArtistLink(artistLink: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var artistLink = artistLink
this.artistLink= artistLink
}


open fun getTitle()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return title
}


open fun setTitle(title: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var title = title
this.title= title
}


open fun getDateAdded()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dateAdded
}


open fun setDateAdded(dateAdded: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var dateAdded = dateAdded
this.dateAdded= dateAdded
}


open fun getDirectory()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return directory
}


open fun setDirectory(directory: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var directory = directory
this.directory= directory
}


open fun getFramedLink()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return framedLink
}


open fun setFramedLink(framedLink: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var framedLink = framedLink
this.framedLink= framedLink
}


open fun getListPrice()
        //nullable = true from not(false or (false and true)) = true
: Money{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return listPrice
}


open fun setListPrice(listPrice: Money)
        //nullable = true from not(false or (false and false)) = true
{

                    var listPrice = listPrice
this.listPrice= listPrice
}


open fun getOurPrice()
        //nullable = true from not(false or (false and true)) = true
: Money{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ourPrice
}


open fun setOurPrice(ourPrice: Money)
        //nullable = true from not(false or (false and false)) = true
{

                    var ourPrice = ourPrice
this.ourPrice= ourPrice
}


open fun getRank()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return rank
}


open fun setRank(rank: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var rank = rank
this.rank= rank
}


open fun getImage()
        //nullable = true from not(false or (false and true)) = true
: AdvertisementImageInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return image
}


open fun setImage(image: AdvertisementImageInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var image = image
this.image= image
}


open fun getProduct()
        //nullable = true from not(false or (false and true)) = true
: AdvertisementProductInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return product
}


open fun setProduct(product: AdvertisementProductInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var product = product
this.product= product
}


open fun getThumbnail()
        //nullable = true from not(false or (false and true)) = true
: AdvertisementThumbnailInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return thumbnail
}


open fun setThumbnail(thumbnail: AdvertisementThumbnailInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var thumbnail = thumbnail
this.thumbnail= thumbnail
}


open fun getDisplayInBrowserContraintsInterface()
        //nullable = true from not(false or (false and true)) = true
: DisplayInBrowserContraintsInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return displayInBrowserContraintsInterface
}


}
                
            


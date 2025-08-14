
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
        package org.allbinary.business.advertisement.area




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.advertisement.campaign.AdvertisementCampaignData
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.data.tree.dom.document.DomDocumentHelper
import org.w3c.dom.Document

open public class AdvertisementArea
            : Object
        
                , AdvertisementAreaInterface {
        

    private var name: String

    private var storeName: String

    private var description: String

    private var advertisementAreaConstraintsInterface: AdvertisementAreaConstraintsInterface

    private var campaign: String
public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {

                    var hashMap = hashMap
this.name= hashMap!!.get(AdvertisementAreaData.getInstance()!!.NAME) as String
this.storeName= hashMap!!.get(StoreFrontData.getInstance()!!.NAME) as String
this.description= hashMap!!.get(AdvertisementAreaData.getInstance()!!.DESCRIPTION) as String

    var constraintsDomString: String = hashMap!!.get(AdvertisementAreaData.getInstance()!!.CONSTRAINTS) as String


    var document: Document = DomDocumentHelper.create(constraintsDomString)!!
            

this.advertisementAreaConstraintsInterface= AdvertisementAreaConstraints(document)
this.campaign= hashMap!!.get(AdvertisementCampaignData.getInstance()!!.NAME) as String
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun getStoreName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.storeName
}


open fun getDescription()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.description
}


open fun getConstraints()
        //nullable = true from not(false or (false and true)) = true
: AdvertisementAreaConstraintsInterface{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.advertisementAreaConstraintsInterface
}


open fun getCampaign()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.campaign
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var name = name
this.name= name
}


open fun setStoreName(storeName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var storeName = storeName
this.storeName= storeName
}


open fun setDescription(description: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var description = description
this.description= description
}


open fun setConstraints(advertisementConstraintsInterface: AdvertisementAreaConstraintsInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var advertisementConstraintsInterface = advertisementConstraintsInterface
this.advertisementAreaConstraintsInterface= advertisementAreaConstraintsInterface
}


open fun setCampaign(campaign: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var campaign = campaign
this.campaign= campaign
}


}
                
            


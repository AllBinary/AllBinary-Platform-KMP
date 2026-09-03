
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
        package org.allbinary.business.user.commerce.inventory.item




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.commerce.money.Money
import org.allbinary.business.user.commerce.money.MoneyException
import org.allbinary.data.generator.ProductIdGenerator
import org.allbinary.logic.StdUtil
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonStrings

open public class BasicItem
            : Object
        
                , ItemInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    val basicItemData: BasicItemData = BasicItemData.getInstance()!!

    var itemId: String

    var number: String

    var inBaskets: String

    var weight: String

    var enabled: String

    var newOrUsed: String

    var summary: String

    var distributor: String

    var idUsedByDistributor: String

    var producedBy: String

    var productionDate: String

    var startProductionDate: String

    var description: String

    var keywords: String

    var category: String

    var type: String

    var smallImage: String

    var mediumImage: String

    var largeImage: String

    var price: Money

    var comment: String

    var customs: String

    private var downloads: String

    var groups: String

    var options: String

    var permissions: String

    var specials: String

    private var downloadable: Boolean= false

    var timeEntered: String

    var lastModified: String
public constructor (itemHashMap: HashMap<Any, Any>)
            : super()
        {
var itemHashMap = itemHashMap

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PRODUCTSEARCHLOGGING))
                        
                                    {
                                    this.logUtil!!.putF(this.commonStrings!!.START, this, "Constructor(HashMap)")

                                    }
                                
this.itemId= itemHashMap!!.get(basicItemData!!.ID) as String
this.number= itemHashMap!!.get(basicItemData!!.NUMBER) as String
this.inBaskets= itemHashMap!!.get(basicItemData!!.INBASKETS) as String
this.weight= itemHashMap!!.get(basicItemData!!.WEIGHT) as String
this.enabled= itemHashMap!!.get(EntryData.getInstance()!!.ENABLE) as String
this.newOrUsed= itemHashMap!!.get(basicItemData!!.NEWORUSED) as String
this.summary= itemHashMap!!.get(basicItemData!!.SUMMARY) as String
this.distributor= itemHashMap!!.get(basicItemData!!.DISTRIBUTOR) as String
this.idUsedByDistributor= itemHashMap!!.get(basicItemData!!.IDUSEDBYDISTRIBUTOR) as String
this.producedBy= itemHashMap!!.get(basicItemData!!.PRODUCEDBY) as String
this.productionDate= itemHashMap!!.get(basicItemData!!.PRODUCTIONDATE) as String
this.startProductionDate= itemHashMap!!.get(basicItemData!!.STARTPRODUCTIONDATE) as String
this.description= itemHashMap!!.get(basicItemData!!.DESCRIPTION) as String
this.keywords= itemHashMap!!.get(basicItemData!!.KEYWORDS) as String
this.category= itemHashMap!!.get(basicItemData!!.CATEGORY) as String
this.type= itemHashMap!!.get(basicItemData!!.TYPE) as String
this.smallImage= itemHashMap!!.get(basicItemData!!.SMALLIMAGE) as String
this.mediumImage= itemHashMap!!.get(basicItemData!!.MEDIUMIMAGE) as String
this.largeImage= itemHashMap!!.get(basicItemData!!.LARGEIMAGE) as String
this.timeEntered= itemHashMap!!.get(EntryData.getInstance()!!.TIMECREATED) as String
this.lastModified= itemHashMap!!.get(EntryData.getInstance()!!.LASTMODIFIED) as String
this.price= Money(itemHashMap!!.get(basicItemData!!.PRICE) as String)
this.comment= itemHashMap!!.get(basicItemData!!.COMMENT) as String
this.customs= itemHashMap!!.get(basicItemData!!.CUSTOMS) as String
this.setDownloads(itemHashMap!!.get(basicItemData!!.DOWNLOADS) as String)
this.groups= itemHashMap!!.get(basicItemData!!.GROUPS) as String
this.options= itemHashMap!!.get(basicItemData!!.OPTIONS) as String
this.permissions= itemHashMap!!.get(basicItemData!!.PERMISSIONS) as String
this.specials= itemHashMap!!.get(basicItemData!!.SPECIALS) as String
}

public constructor ()
            : super()
        {

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PRODUCTSEARCHLOGGING))
                        
                                    {
                                    this.logUtil!!.putF(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)

                                    }
                                

    var EMPTY: String = StringUtil.getInstance()!!.EMPTY_STRING

this.itemId= ProductIdGenerator().
                            getNext()
this.number= CommonPhoneStrings.getInstance()!!.ZERO
this.inBaskets= EMPTY
this.weight= EMPTY
this.enabled= EMPTY
this.newOrUsed= EMPTY
this.summary= EMPTY
this.distributor= EMPTY
this.idUsedByDistributor= EMPTY
this.producedBy= EMPTY
this.productionDate= EMPTY
this.startProductionDate= EMPTY
this.description= EMPTY
this.keywords= EMPTY
this.category= EMPTY
this.type= EMPTY
this.smallImage= EMPTY
this.mediumImage= EMPTY
this.largeImage= EMPTY
this.timeEntered= EMPTY
this.lastModified= EMPTY
this.price= Money()
this.comment= EMPTY
this.customs= EMPTY
this.setDownloads(EMPTY)
this.groups= EMPTY
this.options= EMPTY
this.permissions= EMPTY
this.specials= EMPTY
}


    open fun setId(itemId: String)
        //nullable = true from not(false or (false and false)) = true
{
var itemId = itemId
this.itemId= itemId
}


    open fun setNumber(number: String)
        //nullable = true from not(false or (false and false)) = true
{
var number = number
this.number= number
}


    open fun setInBaskets(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.inBaskets= value
}


    open fun setWeight(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.weight= value
}


    open fun setNewOrUsed(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.newOrUsed= value
}


    open fun setSummary(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.summary= value
}


    open fun setDistributor(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.distributor= value
}


    open fun setIdUsedByDistributor(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.idUsedByDistributor= value
}


    open fun setProducedBy(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.producedBy= value
}


    open fun setProductionDate(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.productionDate= value
}


    open fun setStartProductionDate(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.startProductionDate= value
}


    open fun setDescription(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.description= value
}


    open fun setKeywords(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.keywords= value
}


    open fun setCategory(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.category= value
}


    open fun setType(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.type= value
}


    open fun setSmallImage(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.smallImage= value
}


    open fun setMediumImage(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.mediumImage= value
}


    open fun setLargeImage(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.largeImage= value
}


    open fun setTimeEntered(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.timeEntered= value
}


    open fun setLastModified(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.lastModified= value
}


    open fun setPrice(value: Money)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.price= value
}


    open fun setComment(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.comment= value
}


    open fun setCustoms(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.customs= value
}


    open fun setDownloads(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.downloads= value

    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(this.downloads))
                        
                                    {
                                    
    var downloadInteger: Integer = Integer(Integer.valueOf(this.downloads))!!


    
                        if(downloadInteger!!.toInt() != 0)
                        
                                    {
                                    this.setDownloadable(true)

                                    }
                                

                                    }
                                
}


    open fun setGroups(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.groups= value
}


    open fun setOptions(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.options= value
}


    open fun setPermissions(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.permissions= value
}


    open fun setSpecials(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.specials= value
}


    open fun setEnabled(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.enabled= value
}


    open fun getId()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.itemId
}


    open fun getNumber()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.number
}


    open fun getInBaskets()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.inBaskets
}


    open fun getWeight()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.weight
}


    open fun getNewOrUsed()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.newOrUsed
}


    open fun getSummary()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.summary
}


    open fun getDistributor()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.distributor
}


    open fun getIdUsedByDistributor()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.idUsedByDistributor
}


    open fun getProducedBy()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.producedBy
}


    open fun getProductionDate()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.productionDate
}


    open fun getStartProductionDate()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.startProductionDate
}


    open fun getDescription()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.description
}


    open fun getKeywords()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.keywords
}


    open fun getCategory()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.category
}


    open fun getType()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.type
}


    open fun getSmallImage()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.smallImage
}


    open fun getMediumImage()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.mediumImage
}


    open fun getLargeImage()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.largeImage
}


    open fun getTimeEntered()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.timeEntered
}


    open fun getLastModified()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastModified
}


    open fun getPrice()
        //nullable = true from not(false or (false and true)) = true
: Money{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.price
}


    open fun getComment()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.comment
}


    open fun getCustoms()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.customs
}


    open fun getDownloads()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.downloads
}


    open fun getGroups()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.groups
}


    open fun getOptions()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.options
}


    open fun getPermissions()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.permissions
}


    open fun getSpecials()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.specials
}


    open fun setDownloadable(downloadable: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var downloadable = downloadable
this.downloadable= downloadable
}


    open fun isDownloadable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.downloadable
}


    open fun getEnabled()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.enabled
}


    open fun getTotal()
        //nullable = true from not(false or (false and true)) = true
: Money{

    var itemTotal: Money = Money(this.price)

itemTotal!!.multiply(Integer(this.number).
                            toInt())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return itemTotal
}


    open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PRODUCTSEARCHLOGGING))
                        
                                    {
                                    this.logUtil!!.putF(this.commonStrings!!.START, this, "toHashMap")

                                    }
                                

    var hashMap: HashMap<Any, Any> = StdUtil.getInstance()!!.createHashMap()!!

hashMap!!.put(basicItemData!!.ID, this.itemId)
hashMap!!.put(basicItemData!!.NUMBER, this.number)
hashMap!!.put(basicItemData!!.INBASKETS, this.inBaskets)
hashMap!!.put(basicItemData!!.WEIGHT, this.weight)
hashMap!!.put(EntryData.getInstance()!!.ENABLE, this.enabled)
hashMap!!.put(basicItemData!!.NEWORUSED, this.newOrUsed)
hashMap!!.put(basicItemData!!.SUMMARY, this.summary)
hashMap!!.put(basicItemData!!.DISTRIBUTOR, this.distributor)
hashMap!!.put(basicItemData!!.IDUSEDBYDISTRIBUTOR, this.idUsedByDistributor)
hashMap!!.put(basicItemData!!.PRODUCEDBY, this.producedBy)
hashMap!!.put(basicItemData!!.PRODUCTIONDATE, this.productionDate)
hashMap!!.put(basicItemData!!.STARTPRODUCTIONDATE, this.startProductionDate)
hashMap!!.put(basicItemData!!.DESCRIPTION, this.description)
hashMap!!.put(basicItemData!!.KEYWORDS, this.keywords)
hashMap!!.put(basicItemData!!.CATEGORY, this.category)
hashMap!!.put(basicItemData!!.TYPE, this.type)
hashMap!!.put(basicItemData!!.SMALLIMAGE, this.smallImage)
hashMap!!.put(basicItemData!!.MEDIUMIMAGE, this.mediumImage)
hashMap!!.put(basicItemData!!.LARGEIMAGE, this.largeImage)

    var calendar: Calendar = Calendar.getInstance()!!


    var time: String = calendar.getTimeInMillis() as Long.
                            toString()!!

hashMap!!.put(EntryData.getInstance()!!.LASTMODIFIED, time)
hashMap!!.put(basicItemData!!.PRICE, this.price.toString())
hashMap!!.put(basicItemData!!.COMMENT, this.comment)
hashMap!!.put(basicItemData!!.CUSTOMS, this.customs)
hashMap!!.put(basicItemData!!.DOWNLOADS, this.getDownloads())
hashMap!!.put(basicItemData!!.GROUPS, this.groups)
hashMap!!.put(basicItemData!!.OPTIONS, this.options)
hashMap!!.put(basicItemData!!.PERMISSIONS, this.permissions)
hashMap!!.put(basicItemData!!.SPECIALS, this.specials)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


    open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.PRODUCTSEARCHLOGGING))
                        
                                    {
                                    this.logUtil!!.putF(this.commonStrings!!.START, this, "toVector")

                                    }
                                

    var values: BasicArrayList = BasicArrayListD()

values.add(this.itemId)
values.add(this.number)
values.add(this.inBaskets)
values.add(this.weight)
values.add(this.enabled)
values.add(this.newOrUsed)
values.add(this.summary)
values.add(this.distributor)
values.add(this.idUsedByDistributor)
values.add(this.producedBy)
values.add(this.productionDate)
values.add(this.startProductionDate)
values.add(this.description)
values.add(this.keywords)
values.add(this.category)
values.add(this.type)
values.add(this.getSmallImage())
values.add(this.getMediumImage())
values.add(this.getLargeImage())

    var calendar: Calendar = Calendar.getInstance()!!


    var time: String = calendar.getTimeInMillis() as Long.
                            toString()!!

values.add(time)
values.add(time)
values.add(this.price.toString())
values.add(this.comment)
values.add(this.customs)
values.add(this.getDownloads())
values.add(this.groups)
values.add(this.options)
values.add(this.permissions)
values.add(this.specials)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return values
}


                @Throws(Exception::class)
            
    open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getId() as Object
}


}
                
            


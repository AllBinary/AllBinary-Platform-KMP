
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
        package org.allbinary.data.tables.user.commerce.inventory.order




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.ListIterator
import java.util.Set
import java.util.Vector
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.business.init.db.HistoryDbInitInfo
import org.allbinary.business.user.UserData
import org.allbinary.business.user.address.ShippingAddressData
import org.allbinary.business.user.commerce.inventory.basket.BasketInterface
import org.allbinary.business.user.commerce.inventory.basket.BasketReview
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.business.user.commerce.inventory.item.Item
import org.allbinary.business.user.commerce.inventory.item.ItemInterface
import org.allbinary.business.user.commerce.inventory.order.OrderData
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryData
import org.allbinary.business.user.commerce.inventory.order.OrderInterface
import org.allbinary.business.user.commerce.shipping.ShippingMethodData
import org.allbinary.data.generator.OrderItemIdGenerator
import org.allbinary.data.tables.TableDataFactory
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntity
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbSqlBean
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil

open public class OrderItemsEntity : AbSqlBean
                , OrderItemsEntityInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val tableName: String = "orderitems"
public constructor        ()                        

                            : super(HistoryDbInitInfo()){

                            //For kotlin this is before the body of the constructor.
                    
this.setTableName(tableName)
}


open fun insert(userName: String, order: OrderInterface)
        //nullable = true from not(false or (false and false)) = true
{

                    var userName = userName


                    var order = order

    var vector: Vector = Vector()


        try {
            
    var basket: BasketInterface = order.getBasket()!!
            


    var items: Set = basket.getIds()!!
            


    var ZERO_STRING: String = TableDataFactory.getInstance()!!.ZERO_STRING


    var EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING


    var inventoryEntity: InventoryEntity = InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!
            


    var itemsArray: Array<Any?> = items.toArray()!!
            


    var itemsSize: Int = itemsArray!!.size
                





                        for (i in 0 until itemsSize)


        {
    var item: String = itemsArray[i]!! as String


    var itemInterface: ItemInterface = inventoryEntity!!.getItem(item)!!
            

vector= Vector()
vector.add(OrderItemIdGenerator().
                            getNext())
vector.add(order.getId())
vector.add(TableDataFactory.getInstance()!!.INTEGER_MAX_VALUE_STRING)
vector.add(userName)
vector.add(order.getStoreName())
vector.add(itemInterface!!.getId())
vector.add(basket.getNumberOf(item)!!.toString())
vector.add(itemInterface!!.getNewOrUsed())
vector.add(itemInterface!!.getSummary())
vector.add(itemInterface!!.getDistributor())
vector.add(itemInterface!!.getIdUsedByDistributor())
vector.add(itemInterface!!.getProducedBy())
vector.add(itemInterface!!.getProductionDate())
vector.add(itemInterface!!.getStartProductionDate())
vector.add(itemInterface!!.getDescription())
vector.add(itemInterface!!.getKeywords())
vector.add(itemInterface!!.getCategory())
vector.add(itemInterface!!.getType())
vector.add(itemInterface!!.getSmallImage())
vector.add(itemInterface!!.getMediumImage())
vector.add(itemInterface!!.getLargeImage())
vector.add(itemInterface!!.getWeight())
vector.add(itemInterface!!.getPrice()!!.toString())
vector.add(itemInterface!!.getComment())
vector.add(itemInterface!!.getCustoms())
vector.add(itemInterface!!.getDownloads())
vector.add(EMPTY_STRING)
vector.add(EMPTY_STRING)
vector.add(EMPTY_STRING)
vector.add(EMPTY_STRING)
vector.add(EMPTY_STRING)
vector.add(EMPTY_STRING)
vector.add(EMPTY_STRING)
vector.add(EMPTY_STRING)
vector.add(EMPTY_STRING)
vector.add(EMPTY_STRING)
vector.add(EMPTY_STRING)
vector.add(EMPTY_STRING)
vector.add(EMPTY_STRING)
vector.add(ZERO_STRING)
vector.add(ZERO_STRING)
vector.add(ZERO_STRING)
vector.add(ZERO_STRING)
this.insert(vector)
}


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put("Command Success Added: " +items.size, this, INSERT)

                                    }
                                
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put("Command Failed: " +vector.toString(), this, INSERT, e)

                                    }
                                
}

}


open fun setStatus(orderId: String, groupId: String, status: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var orderId = orderId


                    var groupId = groupId


                    var status = status

        try {
            
    var whereHashMap: HashMap<Any, Any> = HashMap<Any, Any>()


    var updateHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

whereHashMap!!.put(OrderData.ID, orderId)
whereHashMap!!.put(ShippingMethodData.GROUP, groupId)
updateHashMap!!.put(OrderHistoryData.STATUS, status)
super.updateWhere(whereHashMap, updateHashMap)
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "setStatus", e)

                                    }
                                
}

}


open fun isEverythingShipped(orderId: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var orderId = orderId

        try {
            
    var itemStatusVector: Vector = super.getColumnWhere(OrderHistoryData.STATUS, OrderData.ID, orderId)!!
            


    var itemStatusIter: ListIterator = itemStatusVector!!.listIterator()!!
            


        while(itemStatusIter!!.hasNext())
        {
    var status: String = itemStatusIter!!.next() as String


    
                        if(status.compareTo(OrderHistoryData.SHIPPED) != 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "isEverythingShipped", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

}


open fun getBasketReview(orderId: String)
        //nullable = true from not(false or (false and false)) = true
: BasketReview{

                    var orderId = orderId

        try {
            
    var basketReview: BasketReview = BasketReview()


    var keyValues: HashMap<Any, Any> = HashMap<Any, Any>()

keyValues!!.put(OrderData.ID, orderId)

    var items: Vector = super.getRows(keyValues)!!
            


    var entryData: EntryData = EntryData.getInstance()!!
            


    
                        if(items != 
                                    null
                                 && items.size > 0)
                        
                                    {
                                    
    var EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING


    var itemsArray: Array<Any?> = items.toArray()!!
            


    var itemsSize: Int = itemsArray!!.size
                





                        for (i in 0 until itemsSize)


        {
    var itemHashMap: HashMap<Any, Any> = itemsArray[i]!! as HashMap<Any, Any>

itemHashMap!!.put(BasicItemData.INBASKETS, EMPTY_STRING)
itemHashMap!!.put(entryData!!.ENABLE, EMPTY_STRING)
itemHashMap!!.put(entryData!!.TIMECREATED, EMPTY_STRING)
itemHashMap!!.put(entryData!!.LASTMODIFIED, EMPTY_STRING)
itemHashMap!!.put(BasicItemData.GROUPS, EMPTY_STRING)
itemHashMap!!.put(BasicItemData.OPTIONS, EMPTY_STRING)
itemHashMap!!.put(BasicItemData.PERMISSIONS, EMPTY_STRING)
itemHashMap!!.put(BasicItemData.SPECIALS, EMPTY_STRING)

    var item: Item = Item(itemHashMap)

basketReview!!.addItem(item)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return basketReview

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null

                        }
                            
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.SQLLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "getBasketReview", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun createTableStatement()
        //nullable = true from not(false or (false and true)) = true
: String{
    var entryData: EntryData = EntryData.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("CREATE TABLE ")
stringBuffer!!.append(tableName)
stringBuffer!!.append(" (")
stringBuffer!!.append(entryData!!.ID)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(OrderData.ID)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(ShippingMethodData.GROUP)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(UserData.USERNAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(StoreFrontData.getInstance()!!.NAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.ID)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.NUMBER)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.NEWORUSED)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.SUMMARY)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.DISTRIBUTOR)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.IDUSEDBYDISTRIBUTOR)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.PRODUCEDBY)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.PRODUCTIONDATE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.STARTPRODUCTIONDATE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.DESCRIPTION)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(BasicItemData.KEYWORDS)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.CATEGORY)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.TYPE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.SMALLIMAGE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.MEDIUMIMAGE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.LARGEIMAGE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.WEIGHT)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(BasicItemData.PRICE)
stringBuffer!!.append(" VARCHAR(20) NOT NULL,")
stringBuffer!!.append(BasicItemData.COMMENT)
stringBuffer!!.append(this.sqlTypeStrings!!.BLOB_NOT_NULL)
stringBuffer!!.append(BasicItemData.CUSTOMS)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(BasicItemData.DOWNLOADS)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(ShippingMethodData.COST)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(OrderHistoryData.TAX)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingAddressData.NAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingAddressData.STREET)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingAddressData.CITY)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingAddressData.STATE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingAddressData.CODE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingAddressData.COUNTRY)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(ShippingMethodData.NAME)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(entryData!!.SPECIAL)
stringBuffer!!.append(" VARCHAR(255) ,")
stringBuffer!!.append(OrderHistoryData.STATUS)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(OrderHistoryData.CANCELINFO)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(OrderHistoryData.CANCELTYPE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_CHAR_COLUMN_NOT_NULL)
stringBuffer!!.append(OrderHistoryData.SHIPPEDDATE)
stringBuffer!!.append(" BIGINT(19) UNSIGNED ,")
stringBuffer!!.append(OrderHistoryData.ORDERDATE)
stringBuffer!!.append(this.sqlTypeStrings!!.MAX_BIG_INT_UNSIGNED_NOT_NULL)
stringBuffer!!.append(OrderHistoryData.TRANSDATE)
stringBuffer!!.append(" BIGINT(19) UNSIGNED ,")
stringBuffer!!.append(OrderHistoryData.CANCELDATE)
stringBuffer!!.append(" BIGINT(19) UNSIGNED ,")
stringBuffer!!.append("PRIMARY KEY(")
stringBuffer!!.append(entryData!!.ID)
stringBuffer!!.append(") )")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun createTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.createTable(this.createTableStatement())
}


open fun dropTable()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.dropTable()
}


}
                
            


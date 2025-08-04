
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
        package org.allbinary.business.user.commerce.inventory.item.download



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Set
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class DownloadableItemView
            : Object
        
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var downloadableItem: DownloadableItem
public constructor        (downloadableItem: DownloadableItem)
            : super()
        {

                    var downloadableItem = downloadableItem
this.downloadableItem= downloadableItem
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    
                        if(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypes.LOGGING.contains(org!!.allbinary!!.logic!!.communication!!.log!!.config!!.type!!.LogConfigTypeFactory.getInstance()!!.PRODUCTSEARCHLOGGING))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.START, this, 
                            "toXmlNode")

                                    }
                                

    var hashMap: HashMap<Any, Any> = downloadableItem!!.toHashMap()!!
            


    var totalTime: Long = downloadableItem!!.getValidTime()!!.longValue()!!
            


    var calendar: Calendar = Calendar.getInstance()!!
            


    var year: Int = calendar!!.get(Calendar.YEAR)!!
            


    var month: Int = calendar!!.get(Calendar.MONTH)!!
            


    var day: Int = calendar!!.get(Calendar.DAY_OF_MONTH)!!
            


    var hour: Int = calendar!!.get(Calendar.HOUR)!!
            


    var minute: Int = calendar!!.get(Calendar.MINUTE)!!
            


    var second: Int = calendar!!.get(Calendar.SECOND)!!
            

calendar!!.setTimeInMillis(calendar!!.getTimeInMillis() +totalTime)

    var yearDelta: Int = calendar!!.get(Calendar.YEAR)!!
            


    var monthDelta: Int = calendar!!.get(Calendar.MONTH)!!
            


    var dayDelta: Int = calendar!!.get(Calendar.DAY_OF_MONTH)!!
            


    var hourDelta: Int = calendar!!.get(Calendar.HOUR)!!
            


    var minuteDelta: Int = calendar!!.get(Calendar.MINUTE)!!
            


    var secondDelta: Int = calendar!!.get(Calendar.SECOND)!!
            

hashMap!!.put(DownloadItemData.VALID_TIME_YEARS, .concatToString()

                                )
hashMap!!.put(DownloadItemData.VALID_TIME_MONTHS, .concatToString()

                                )
hashMap!!.put(DownloadItemData.VALID_TIME_DAYS, .concatToString()

                                )
hashMap!!.put(DownloadItemData.VALID_TIME_HOURS, .concatToString()

                                )
hashMap!!.put(DownloadItemData.VALID_TIME_MINUTES, .concatToString()

                                )
hashMap!!.put(DownloadItemData.VALID_TIME_SECONDS, .concatToString()

                                )

    var keySet: Set = hashMap!!.keySet()!!
            


    var node: Node = document!!.createElement(DownloadItemData.NAME)!!
            


    var stringUtil: StringUtil = StringUtil.getInstance()!!
            


    var nameArray: Array<Any?> = keySet!!.toArray()!!
            


    var size: Int = nameArray!!.size
                





                        for (index in 0 until size)


        {
    var name: String = nameArray[index]!! as String


    var value: String = hashMap!!.get(name as Object?) as String

value= stringUtil!!.getInstance(value)
node!!.appendChild(ModDomHelper.createNameValueNodes(document, name, value))
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


open fun toXmlDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


}
                
            


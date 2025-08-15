
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
        package views.admin.orderhistory




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.Vector
import javax.servlet.http.HttpServletRequest
import org.allbinary.business.user.commerce.inventory.order.OrderData
import org.allbinary.business.user.commerce.inventory.order.OrderHistory
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryData
import org.allbinary.data.tables.user.commerce.inventory.order.OrderHistoryEntityFactory
import org.allbinary.data.tree.dom.DomNodeInterface
import org.allbinary.data.tree.dom.ModDomHelper
import org.allbinary.globals.GLOBALS2
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.control.validate.ValidationComponentInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.logic.visual.transform.info.TransformInfoInterface
import org.allbinary.time.TimeUtil
import org.w3c.dom.Document
import org.w3c.dom.Node
import views.business.context.modules.storefront.HttpStoreComponentView

open public class DateRangeOrderHistoryView : HttpStoreComponentView
                , ValidationComponentInterface
                , DomNodeInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val VIEWALLORDERS: String = "View All"

    private val VIEWORDERSINLASTHOUR: String = "Last Hour"

    private val VIEWORDERSINLASTDAY: String = "Last Day"

    private val VIEWORDERSINLASTWEEK: String = "Last Week"

    private val VIEWORDERSINLAST30DAYS: String = "30 Days"

    private var request: HttpServletRequest

    private var shipped: String

    private var partiallyShipped: String

    private var processing: String

    private var preprocessing: String

    private var cancelled: String

    private var dateType: String

    private var toDate: String

    private var fromDate: String

    private var fromYear: String

    private var fromMonth: String

    private var fromDay: String

    private var fromHour: String

    private var toYear: String

    private var toMonth: String

    private var toDay: String

    private var toHour: String

    private var command: String

    private val ON: String = "on"

    private var MAXLEN: Int = 15
public constructor        (transformInfoInterface: TransformInfoInterface)                        

                            : super(transformInfoInterface){

                    var transformInfoInterface = transformInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
this.request= this.getPageContext()!!.getRequest() as HttpServletRequest
this.getFormData()
}


open fun getFormData()
        //nullable = true from not(false or (false and true)) = true
{this.dateType= request.getParameter(OrderHistoryData.DATETYPE)
this.preprocessing= request.getParameter(OrderHistoryData.PREPROCESSINGNAME)
this.shipped= request.getParameter(OrderHistoryData.SHIPPEDNAME)
this.partiallyShipped= request.getParameter(OrderHistoryData.PARTIALLYSHIPPEDNAME)
this.processing= request.getParameter(OrderHistoryData.PROCESSINGNAME)
this.cancelled= request.getParameter(OrderHistoryData.CANCELLEDNAME)
this.fromYear= request.getParameter(OrderHistoryData.FROMYEAR)
this.fromMonth= request.getParameter(OrderHistoryData.FROMMONTH)
this.fromDay= request.getParameter(OrderHistoryData.FROMDAY)
this.fromHour= request.getParameter(OrderHistoryData.FROMHOUR)
this.toYear= request.getParameter(OrderHistoryData.TOYEAR)
this.toMonth= request.getParameter(OrderHistoryData.TOMONTH)
this.toDay= request.getParameter(OrderHistoryData.TODAY)
this.toHour= request.getParameter(OrderHistoryData.TOHOUR)
this.command= request.getParameter(GLOBALS2.ADMINCOMMAND)
}


open fun addDomNodeInterfaces()
        //nullable = true from not(false or (false and true)) = true
{this.addDomNodeInterface(this as DomNodeInterface)
}


                @Throws(Exception::class)
            
open fun view()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            this.addDomNodeInterfaces()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.view()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.TAGHELPERERROR))
                        
                                    {
                                    logUtil!!.put(commonStrings!!.EXCEPTION, this, "view()", e)

                                    }
                                



                            throw e
}

}


open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

        try {
            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Attempt to View orders in (fromDate=")
stringBuffer!!.append(this.fromDate)
stringBuffer!!.append(",toDate=")
stringBuffer!!.append(this.toDate)
stringBuffer!!.append(") and status")
logUtil!!.put(stringBuffer!!.toString(), this, "view")

                                    }
                                

    var node: Node = document.createElement(OrderData.ORDERS)!!
            


    
                        if(preprocessing != 
                                    null
                                 && preprocessing.compareTo(ON) == 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Adding Preprocessing Orders", this, "toXmlNode")

                                    }
                                

    var orderHistoryVector: Vector = OrderHistoryEntityFactory.getInstance()!!.getOrders(OrderHistoryData.PREPROCESSING, fromDate, toDate)!!
            


    var size: Int = orderHistoryVector!!.size!!
            





                        for (index in 0 until size)


        {
    var orderHistory: OrderHistory = orderHistoryVector!!.get(index) as OrderHistory

node.appendChild(orderHistory!!.toXmlNode(document))
}


                                    }
                                

    
                        if(shipped != 
                                    null
                                 && shipped.compareTo(ON) == 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Adding Shipped Orders", this, "toXmlNode")

                                    }
                                

    var orderHistoryVector: Vector = OrderHistoryEntityFactory.getInstance()!!.getOrders(OrderHistoryData.SHIPPED, fromDate, toDate)!!
            


    var size: Int = orderHistoryVector!!.size!!
            





                        for (index in 0 until size)


        {
    var orderHistory: OrderHistory = orderHistoryVector!!.get(index) as OrderHistory

node.appendChild(orderHistory!!.toXmlNode(document))
}


                                    }
                                

    
                        if(partiallyShipped != 
                                    null
                                 && partiallyShipped!!.compareTo(ON) == 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Adding Partially Shipped Orders", this, "toDomNode")

                                    }
                                

    var orderHistoryVector: Vector = OrderHistoryEntityFactory.getInstance()!!.getOrders(OrderHistoryData.PARTIALLYSHIPPED, fromDate, toDate)!!
            


    var size: Int = orderHistoryVector!!.size!!
            





                        for (index in 0 until size)


        {
    var orderHistory: OrderHistory = orderHistoryVector!!.get(index) as OrderHistory

node.appendChild(orderHistory!!.toXmlNode(document))
}


                                    }
                                

    
                        if(processing != 
                                    null
                                 && processing.compareTo(ON) == 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Adding Processing Orders", this, "toXmlNode")

                                    }
                                

    var orderHistoryVector: Vector = OrderHistoryEntityFactory.getInstance()!!.getOrders(OrderHistoryData.PROCESSING, fromDate, toDate)!!
            


    var size: Int = orderHistoryVector!!.size!!
            





                        for (index in 0 until size)


        {
    var orderHistory: OrderHistory = orderHistoryVector!!.get(index) as OrderHistory

node.appendChild(orderHistory!!.toXmlNode(document))
}


                                    }
                                

    
                        if(cancelled != 
                                    null
                                 && cancelled.compareTo(ON) == 0)
                        
                                    {
                                    
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Adding Cancelled Orders", this, "view")

                                    }
                                

    var orderHistoryVector: Vector = OrderHistoryEntityFactory.getInstance()!!.getOrders(OrderHistoryData.CANCELLED, fromDate, toDate)!!
            


    var size: Int = orderHistoryVector!!.size!!
            





                        for (index in 0 until size)


        {
    var orderHistory: OrderHistory = orderHistoryVector!!.get(index) as OrderHistory

node.appendChild(orderHistory!!.toXmlNode(document))
}


                                    }
                                
node.appendChild(ModDomHelper.createNameValueNodes(document, OrderHistoryData.PREPROCESSINGNAME, OrderHistoryData.PREPROCESSING))
node.appendChild(ModDomHelper.createNameValueNodes(document, OrderHistoryData.PROCESSINGNAME, OrderHistoryData.PROCESSING))
node.appendChild(ModDomHelper.createNameValueNodes(document, OrderHistoryData.CANCELLEDNAME, OrderHistoryData.CANCELLED))
node.appendChild(ModDomHelper.createNameValueNodes(document, OrderHistoryData.PARTIALLYSHIPPEDNAME, OrderHistoryData.PARTIALLYSHIPPED))
node.appendChild(ModDomHelper.createNameValueNodes(document, OrderHistoryData.SHIPPEDNAME, OrderHistoryData.SHIPPED))
node.appendChild(ModDomHelper.createNameValueNodes(document, GLOBALS2.VIEWNAME, GLOBALS2.VIEW))



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.XSLLOGGINGERROR))
                        
                                    {
                                    logUtil!!.put(this.commonStrings!!.FAILURE, this, "toXmlNode", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
        try {
            
    var isValid: Boolean = Boolean.TRUE


    
                        if(dateType == 
                                    null
                                 || (dateType!!.compareTo(OrderHistoryData.TYPELONG) != 0 && dateType!!.compareTo(OrderHistoryData.TYPECAESAR) != 0))
                        
                                    {
                                    isValid= Boolean.FALSE

                                    }
                                

    
                        if(dateType != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(dateType!!.compareTo(OrderHistoryData.TYPELONG) == 0)
                        
                                    {
                                    
    var calendar: Calendar = Calendar.getInstance()!!
            


    var currentTime: Long = calendar.getTimeInMillis()!!
            


    var rangeDate: String = StringUtil.getInstance()!!.EMPTY_STRING


    
                        if(command.compareTo(VIEWORDERSINLASTHOUR) == 0)
                        
                                    {
                                    
    var oneHour: Long = 60.toLong() *60 *1000

rangeDate= oneHour as Long.
                            toString()

                                    }
                                
                             else 
    
                        if(command.compareTo(VIEWORDERSINLASTDAY) == 0)
                        
                                    {
                                    
    var oneDay: Long = 24.toLong() *60 *60 *1000

rangeDate= oneDay as Long.
                            toString()

                                    }
                                
                             else 
    
                        if(command.compareTo(VIEWORDERSINLASTWEEK) == 0)
                        
                                    {
                                    
    var oneWeek: Long = 7.toLong() *24 *60 *60 *1000

rangeDate= oneWeek as Long.
                            toString()

                                    }
                                
                             else 
    
                        if(command.compareTo(VIEWORDERSINLAST30DAYS) == 0)
                        
                                    {
                                    
    var thirtyDays: Long = 30.toLong() *24 *60 *60 *1000

rangeDate= thirtyDays as Long.
                            toString()

                                    }
                                
                             else 
    
                        if(command.compareTo(VIEWALLORDERS) == 0)
                        
                                    {
                                    rangeDate= currentTime as Long.
                            toString()

                                    }
                                

    var rangeDateLong: Long = rangeDate as Long.
                            longValue()!!
            

this.fromDate= currentTime -rangeDateLong as Long.
                            toString()

    var time: String = currentTime as Long.
                            toString().toCharArray().concatToString()
                                

this.toDate= time

                                    }
                                
                             else 
    
                        if(dateType!!.compareTo(OrderHistoryData.TYPECAESAR) == 0)
                        
                                    {
                                    
    var calendar: Calendar = Calendar.getInstance()!!
            

TimeUtil.getInstance()!!.setCalendar(calendar, fromYear, fromMonth, fromDay, fromHour)
this.fromDate= calendar.getTimeInMillis() as Long.
                            toString()
TimeUtil.getInstance()!!.setCalendar(calendar, toYear, toMonth, toDay, toHour)
this.toDate= calendar.getTimeInMillis() as Long.
                            toString()

                                    }
                                

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(toDate) || toDate!!.length > MAXLEN)
                        
                                    {
                                    isValid= Boolean.FALSE

                                    }
                                

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(fromDate) || fromDate!!.length > MAXLEN)
                        
                                    {
                                    isValid= Boolean.FALSE

                                    }
                                

                                    }
                                

    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("Attempt to View orders in (fromDate=")
stringBuffer!!.append(this.fromDate)
stringBuffer!!.append(",toDate=")
stringBuffer!!.append(this.toDate)
stringBuffer!!.append(")")
logUtil!!.put(stringBuffer!!.toString(), this, commonStrings!!.IS_VALID)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return isValid
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEW))
                        
                                    {
                                    logUtil!!.put("Exception in validation", this, commonStrings!!.IS_VALID, e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


open fun toValidationInfoDoc()
        //nullable = true from not(false or (false and true)) = true
: Document{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


open fun toValidationInfoNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(Exception::class)
            
open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String{
        try {
            
    var result: StringMaker = StringMaker()


    
                        if(dateType == 
                                    null
                                 || (dateType!!.compareTo(OrderHistoryData.TYPELONG) != 0 && dateType!!.compareTo(OrderHistoryData.TYPECAESAR) != 0))
                        
                                    {
                                    result.append("DATETYPE not recognized")

                                    }
                                

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(toDate) || toDate!!.length > MAXLEN)
                        
                                    {
                                    result.append("Invalid To Date")

                                    }
                                

    
                        if(StringValidationUtil.getInstance()!!.isEmpty(fromDate) || fromDate!!.length > MAXLEN)
                        
                                    {
                                    result.append("Invalid From Date")

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result.toString()
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.VIEWERROR))
                        
                                    {
                                    logUtil!!.put("Failed to generate validation error info", this, "validationInfo()", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Error Getting Validation Info"
}

}


}
                
            


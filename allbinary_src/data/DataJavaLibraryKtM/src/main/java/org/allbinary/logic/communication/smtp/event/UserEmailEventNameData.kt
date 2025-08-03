
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
        package org.allbinary.logic.communication.smtp.event



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.user.commerce.inventory.order.OrderHistoryData

open public class UserEmailEventNameData
            : Object
         {
        

        companion object {


    private var userNameEvenNameHashMap: HashMap<Any, Any> = HashMap<Any, Any>()

    private var nextId: Int = 0

    val INSTALLER: UserEmailEventNameData = UserEmailEventNameData(
                            "Installer")

    val EXCEPTION: UserEmailEventNameData = UserEmailEventNameData(
                            "Exception")

    val LOGGEDEXCEPTION: UserEmailEventNameData = UserEmailEventNameData(
                            "Logged Exception")

    val ERROR: UserEmailEventNameData = UserEmailEventNameData(
                            "Error")

    val OUTOFMEMORY: UserEmailEventNameData = UserEmailEventNameData(
                            "Out Of Memory Error")

    val ADMINGENERATINGSTATICPAGES: UserEmailEventNameData = UserEmailEventNameData(
                            "Admin Generating Static Pages")

    val STOREERROROCCURRED: UserEmailEventNameData = UserEmailEventNameData(
                            "Store Error Occurred")

    val STOREOUTOFMEMORY: UserEmailEventNameData = UserEmailEventNameData(
                            "Store Out Of Memory Error")

    val STORECREATED: UserEmailEventNameData = UserEmailEventNameData(
                            "Store Created")

    val STOREOPENED: UserEmailEventNameData = UserEmailEventNameData(
                            "Store Opened")

    val STORECLOSED: UserEmailEventNameData = UserEmailEventNameData(
                            "Store Closed")

    val STOREGENERATINGSTATICPAGES: UserEmailEventNameData = UserEmailEventNameData(
                            "Store Generating Static Pages")

    val PRODUCTISOUT: UserEmailEventNameData = UserEmailEventNameData(
                            "Product Is Out")

    val PRODUCTISAVAILABLE: UserEmailEventNameData = UserEmailEventNameData(
                            "Product Is Available")

    val PRODUCTISOLD: UserEmailEventNameData = UserEmailEventNameData(
                            "Product Is Old")

    val PRODUCTISONSALE: UserEmailEventNameData = UserEmailEventNameData(
                            "Product Is On Sale")

    val PRODUCTSALEISOVER: UserEmailEventNameData = UserEmailEventNameData(
                            "Product Sale Is Over")

    val ORDERPREPROCESSING: UserEmailEventNameData = UserEmailEventNameData(OrderHistoryData.PREPROCESSING)

    val ORDERPROCESSING: UserEmailEventNameData = UserEmailEventNameData(OrderHistoryData.PROCESSING)

    val ORDERCANCELLED: UserEmailEventNameData = UserEmailEventNameData(OrderHistoryData.CANCELLED)

    val ORDERPARTIALLYSHIPPED: UserEmailEventNameData = UserEmailEventNameData(OrderHistoryData.PARTIALLYSHIPPED)

    val ORDERSHIPPED: UserEmailEventNameData = UserEmailEventNameData(OrderHistoryData.SHIPPED)

    val QUOTEREQUEST: UserEmailEventNameData = UserEmailEventNameData(
                            "Quote Request")

    val NEWPASSWORD: UserEmailEventNameData = UserEmailEventNameData(
                            "New Password")

                @Throws(Exception::class)
            
open fun getInstance(userEmailEventNameString: String)
        //nullable =  from not(true or (false and false)) = 
: UserEmailEventNameData{

                    var userEmailEventNameString = userEmailEventNameString

    var userEmailEventNameData: UserEmailEventNameData = UserEmailEventNameData.userNameEvenNameHashMap!!.get(userEmailEventNameString as Object?) as UserEmailEventNameData


    
                        if(userEmailEventNameData == 
                                    null
                                )
                        
                                    {
                                    


                            throw Exception()

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return userEmailEventNameData

                        }
                            
}



        }
            
    private var eventNameId: Int= 0

    private var eventHandlerName: String
public constructor        (eventHandlerName: String)
            : super()
        {

                    var eventHandlerName = eventHandlerName
this.eventHandlerName= eventHandlerName
this.initNextId()
this.userNameEvenNameHashMap!!.put(this.eventHandlerName, this)
}


open fun initNextId()
        //nullable = true from not(false or (false and true)) = true
{this.eventNameId= UserEmailEventNameData.nextId
UserEmailEventNameData.nextId++
}


open fun isEvent(userEmailEventNameString: String)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var userEmailEventNameString = userEmailEventNameString



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userNameEvenNameHashMap!!.containsKey(userEmailEventNameString)
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.eventHandlerName
}


}
                
            


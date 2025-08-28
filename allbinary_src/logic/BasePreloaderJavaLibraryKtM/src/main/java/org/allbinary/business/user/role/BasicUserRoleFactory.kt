
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
        package org.allbinary.business.user.role




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class BasicUserRoleFactory
            : Object
         {
        

        companion object {
            
    private val instance: BasicUserRoleFactory = BasicUserRoleFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BasicUserRoleFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val INACTIVITYTIMEOUT: Long = 360000000

    private val CUSTOMERTIMEOUT: Long = 360000000

    private val CUSTOMERMAXSESSIONTIME: Long = 360000000

    private val MAXSESSIONTIME: Long = 360000000

    val INSTALLER: BasicUserRole = BasicUserRole("Installer", 16, MAXSESSIONTIME, INACTIVITYTIMEOUT)

    val ADMINISTRATOR: BasicUserRole = BasicUserRole("Administrator", 0, MAXSESSIONTIME, INACTIVITYTIMEOUT)

    val CUSTOMER: BasicUserRole = BasicUserRole("CustomerUser", "Customer User", 1, CUSTOMERTIMEOUT, CUSTOMERMAXSESSIONTIME)

    val SUBSCRIBERCUSTOMER: BasicUserRole = BasicUserRole("SubscriberUser", "Subscriber User", 2, CUSTOMERTIMEOUT, CUSTOMERMAXSESSIONTIME)

    val WHOLESALECUSTOMER: BasicUserRole = BasicUserRole("WholesaleUser", "Wholesale User", 3, CUSTOMERTIMEOUT, CUSTOMERMAXSESSIONTIME)

    val STOREMANAGER: BasicUserRole = BasicUserRole("StoreManager", "Store Manager", 4, MAXSESSIONTIME, INACTIVITYTIMEOUT)

    val PRODUCTMANAGER: BasicUserRole = BasicUserRole("ProductManager", "Product Manager", 5, MAXSESSIONTIME, INACTIVITYTIMEOUT)

    val CUSTOMERMANAGER: BasicUserRole = BasicUserRole("UserManager", "User Manager", 6, MAXSESSIONTIME, INACTIVITYTIMEOUT)

    val PAYMENTMANAGER: BasicUserRole = BasicUserRole("PaymentManager", "Payment Manager", 7, MAXSESSIONTIME, INACTIVITYTIMEOUT)

    val ORDERMANAGER: BasicUserRole = BasicUserRole("OrderManager", "Order Manager", 8, MAXSESSIONTIME, INACTIVITYTIMEOUT)

    val WEBMANAGER: BasicUserRole = BasicUserRole("WebManager", "Web Manager", 9, MAXSESSIONTIME, INACTIVITYTIMEOUT)

    val REVIEWER: BasicUserRole = BasicUserRole("Reviewer", 10, MAXSESSIONTIME, INACTIVITYTIMEOUT)

    val SHIPPING: BasicUserRole = BasicUserRole("Shipping", 11, MAXSESSIONTIME, INACTIVITYTIMEOUT)

    val ADJUSTER: BasicUserRole = BasicUserRole("Adjuster", 12, MAXSESSIONTIME, INACTIVITYTIMEOUT)

    val WORKFLOWEDITOR: BasicUserRole = BasicUserRole("WorkFlowEditor", "WorkFlow Editor", 13, MAXSESSIONTIME, INACTIVITYTIMEOUT)

    val WIZARD: BasicUserRole = BasicUserRole("WizardUser", "Wizard User", 14, MAXSESSIONTIME, INACTIVITYTIMEOUT)

    val VIEWEDITOR: BasicUserRole = BasicUserRole("ViewEditor", "View Editor", 15, MAXSESSIONTIME, INACTIVITYTIMEOUT)

}
                
            


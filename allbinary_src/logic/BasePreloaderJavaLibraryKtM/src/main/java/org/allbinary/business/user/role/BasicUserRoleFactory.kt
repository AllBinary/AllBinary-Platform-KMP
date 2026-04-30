
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
                        return BasicUserRoleFactory.instance
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

    val INSTALLER: BasicUserRole = BasicUserRole("Installer", 16, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

    val ADMINISTRATOR: BasicUserRole = BasicUserRole("Administrator", 0, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

    val CUSTOMER: BasicUserRole = BasicUserRole("CustomerUser", "Customer User", 1, this.CUSTOMERTIMEOUT, this.CUSTOMERMAXSESSIONTIME)

    val SUBSCRIBERCUSTOMER: BasicUserRole = BasicUserRole("SubscriberUser", "Subscriber User", 2, this.CUSTOMERTIMEOUT, this.CUSTOMERMAXSESSIONTIME)

    val WHOLESALECUSTOMER: BasicUserRole = BasicUserRole("WholesaleUser", "Wholesale User", 3, this.CUSTOMERTIMEOUT, this.CUSTOMERMAXSESSIONTIME)

    val STOREMANAGER: BasicUserRole = BasicUserRole("StoreManager", "Store Manager", 4, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

    val PRODUCTMANAGER: BasicUserRole = BasicUserRole("ProductManager", "Product Manager", 5, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

    val CUSTOMERMANAGER: BasicUserRole = BasicUserRole("UserManager", "User Manager", 6, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

    val PAYMENTMANAGER: BasicUserRole = BasicUserRole("PaymentManager", "Payment Manager", 7, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

    val ORDERMANAGER: BasicUserRole = BasicUserRole("OrderManager", "Order Manager", 8, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

    val WEBMANAGER: BasicUserRole = BasicUserRole("WebManager", "Web Manager", 9, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

    val REVIEWER: BasicUserRole = BasicUserRole("Reviewer", 10, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

    val SHIPPING: BasicUserRole = BasicUserRole("Shipping", 11, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

    val ADJUSTER: BasicUserRole = BasicUserRole("Adjuster", 12, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

    val WORKFLOWEDITOR: BasicUserRole = BasicUserRole("WorkFlowEditor", "WorkFlow Editor", 13, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

    val WIZARD: BasicUserRole = BasicUserRole("WizardUser", "Wizard User", 14, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

    val VIEWEDITOR: BasicUserRole = BasicUserRole("ViewEditor", "View Editor", 15, this.MAXSESSIONTIME, this.INACTIVITYTIMEOUT)

}
                
            


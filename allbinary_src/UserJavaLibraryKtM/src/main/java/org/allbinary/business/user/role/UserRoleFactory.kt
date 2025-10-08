
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
        
import org.allbinary.business.user.modules.UserFactory
import org.allbinary.business.user.modules.admin.AdminUserFactory
import org.allbinary.business.user.modules.admin.store.StoreAdminUserFactory
import org.allbinary.business.user.modules.admin.store.customer.CustomerStoreAdminUserFactory
import org.allbinary.business.user.modules.admin.store.order.OrderStoreAdminUserFactory
import org.allbinary.business.user.modules.admin.store.order.adjust.AdjustOrderStoreAdminUserFactory
import org.allbinary.business.user.modules.admin.store.order.review.ReviewOrderStoreAdminUserFactory
import org.allbinary.business.user.modules.admin.store.order.ship.ShipOrderStoreAdminUserFactory
import org.allbinary.business.user.modules.admin.store.payment.PaymentStoreAdminUserFactory
import org.allbinary.business.user.modules.admin.store.product.ProductStoreAdminUserFactory
import org.allbinary.business.user.modules.admin.store.web.WebStoreAdminUserFactory
import org.allbinary.business.user.modules.admin.store.web.view.editor.ViewEditorWebStoreAdminUserFactory
import org.allbinary.business.user.modules.admin.store.web.wizard.WizardWebStoreAdminUserFactory
import org.allbinary.business.user.modules.admin.store.web.workflow.editor.WorkflowEditorWebStoreAdminUserFactory
import org.allbinary.business.user.modules.customer.subscriber.SubscriberUserFactory
import org.allbinary.business.user.modules.customer.wholesale.WholesaleUserFactory

open public class UserRoleFactory
            : Object
         {
        
companion object {
            
    private val instance: UserRoleFactory = UserRoleFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: UserRoleFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val basicUserRoleFactory: BasicUserRoleFactory = BasicUserRoleFactory.getInstance()!!

    val INSTALLER: UserRole = UserRoleB(basicUserRoleFactory!!.INSTALLER, 
                            null)

    val ADMINISTRATOR: UserRole = UserRoleB(basicUserRoleFactory!!.ADMINISTRATOR, AdminUserFactory())

    val CUSTOMER: UserRole = UserRoleB(basicUserRoleFactory!!.CUSTOMER, UserFactory())

    val SUBSCRIBERCUSTOMER: UserRole = UserRoleB(basicUserRoleFactory!!.SUBSCRIBERCUSTOMER, SubscriberUserFactory())

    val WHOLESALECUSTOMER: UserRole = UserRoleB(basicUserRoleFactory!!.WHOLESALECUSTOMER, WholesaleUserFactory())

    val STOREMANAGER: UserRole = UserRoleB(basicUserRoleFactory!!.STOREMANAGER, StoreAdminUserFactory())

    val PRODUCTMANAGER: UserRole = UserRoleB(basicUserRoleFactory!!.PRODUCTMANAGER, ProductStoreAdminUserFactory())

    val CUSTOMERMANAGER: UserRole = UserRoleB(basicUserRoleFactory!!.CUSTOMERMANAGER, CustomerStoreAdminUserFactory())

    val PAYMENTMANAGER: UserRole = UserRoleB(basicUserRoleFactory!!.PAYMENTMANAGER, PaymentStoreAdminUserFactory())

    val ORDERMANAGER: UserRole = UserRoleB(basicUserRoleFactory!!.ORDERMANAGER, OrderStoreAdminUserFactory())

    val WEBMANAGER: UserRole = UserRoleB(basicUserRoleFactory!!.WEBMANAGER, WebStoreAdminUserFactory())

    val REVIEWER: UserRole = UserRoleB(basicUserRoleFactory!!.REVIEWER, ReviewOrderStoreAdminUserFactory())

    val SHIPPING: UserRole = UserRoleB(basicUserRoleFactory!!.SHIPPING, ShipOrderStoreAdminUserFactory())

    val ADJUSTER: UserRole = UserRoleB(basicUserRoleFactory!!.ADJUSTER, AdjustOrderStoreAdminUserFactory())

    val WORKFLOWEDITOR: UserRole = UserRoleB(basicUserRoleFactory!!.WORKFLOWEDITOR, WorkflowEditorWebStoreAdminUserFactory())

    val WIZARD: UserRole = UserRoleB(basicUserRoleFactory!!.WIZARD, WizardWebStoreAdminUserFactory())

    val VIEWEDITOR: UserRole = UserRoleB(basicUserRoleFactory!!.VIEWEDITOR, ViewEditorWebStoreAdminUserFactory())

}
                
            


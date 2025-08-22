
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
        package org.allbinary.business.context.modules.storefront.statistics




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.context.modules.storefront.statistics.advertisements.StoreFrontAdvertisementsStatisticsInterface
import org.allbinary.business.context.modules.storefront.statistics.advertisements.StoreFrontAdvertisementsStatisticsView
import org.allbinary.business.context.modules.storefront.statistics.inventory.StoreFrontInventoryStatisticsInterface
import org.allbinary.business.context.modules.storefront.statistics.inventory.StoreFrontInventoryStatisticsView
import org.allbinary.business.context.modules.storefront.statistics.orders.history.StoreFrontOrdersHistoryStatisticsInterface
import org.allbinary.business.context.modules.storefront.statistics.orders.history.StoreFrontOrdersHistoryStatisticsView
import org.allbinary.business.context.modules.storefront.statistics.users.StoreFrontUsersStatisticsInterface
import org.allbinary.business.context.modules.storefront.statistics.users.StoreFrontUsersStatisticsView
import org.allbinary.business.user.role.UserRole
import org.allbinary.business.user.role.UserRoleFactory
import org.allbinary.data.tree.dom.DomNodeInterface
import org.w3c.dom.Document
import org.w3c.dom.Node

open public class RealTimeStoreFrontStatisticsView
            : Object
        
                , DomNodeInterface {
        

    private val storeFrontStatisticsInterface: StoreFrontStatisticsInterface

    private val userRole: UserRole
public constructor        (storeFrontStatisticsInterface: StoreFrontStatisticsInterface, userRole: UserRole)
            : super()
        {

                    var storeFrontStatisticsInterface = storeFrontStatisticsInterface


                    var userRole = userRole
this.storeFrontStatisticsInterface= storeFrontStatisticsInterface
this.userRole= userRole
}


                @Throws(Exception::class)
            
open fun toXmlNode(document: Document)
        //nullable = true from not(false or (false and false)) = true
: Node{

                    var document = document

    var node: Node = document.createElement(StoreFrontStatisticsData.getInstance()!!.NAME)!!


    var storeFrontAdvertisementsStatisticsInterface: StoreFrontAdvertisementsStatisticsInterface = this.storeFrontStatisticsInterface!!.getAdvertisements()!!


    var storeFrontAdvertisementsStatisticsDomNodeInterface: DomNodeInterface = StoreFrontAdvertisementsStatisticsView(storeFrontAdvertisementsStatisticsInterface)

node.appendChild(storeFrontAdvertisementsStatisticsDomNodeInterface!!.toXmlNode(document))

    var storeFrontInventoryStatisticsInterface: StoreFrontInventoryStatisticsInterface = this.storeFrontStatisticsInterface!!.getInventory()!!


    var storeFrontInventoryStatisticsDomNodeInterface: DomNodeInterface = StoreFrontInventoryStatisticsView(storeFrontInventoryStatisticsInterface)

node.appendChild(storeFrontInventoryStatisticsDomNodeInterface!!.toXmlNode(document))

    var storeFrontOrdersHistoryStatisticsInterface: StoreFrontOrdersHistoryStatisticsInterface = this.storeFrontStatisticsInterface!!.getOrders()!!


    var storeFrontOrdersHistoryStatisticsDomNodeInterface: DomNodeInterface = StoreFrontOrdersHistoryStatisticsView(storeFrontOrdersHistoryStatisticsInterface)

node.appendChild(storeFrontOrdersHistoryStatisticsDomNodeInterface!!.toXmlNode(document))

    
                        if(this.userRole == UserRoleFactory.getInstance()!!.ADMINISTRATOR)
                        
                                    {
                                    
    var storeFrontUsersStatisticsInterface: StoreFrontUsersStatisticsInterface = this.storeFrontStatisticsInterface!!.getUsers()!!


    var storeFrontUsersStatisticsDomNodeInterface: DomNodeInterface = StoreFrontUsersStatisticsView(storeFrontUsersStatisticsInterface)

node.appendChild(storeFrontUsersStatisticsDomNodeInterface!!.toXmlNode(document))

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return node
}


}
                
            


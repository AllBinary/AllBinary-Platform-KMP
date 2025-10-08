
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
        package org.allbinary.business.installer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.init.InitInfoEntity
import org.allbinary.business.init.db.DatabaseConnectionInfoInterface
import org.allbinary.business.init.db.DbConnectionInfo
import org.allbinary.business.init.db.HistoryDbInitInfo
import org.allbinary.business.init.db.InventoryDbInitInfo
import org.allbinary.business.init.db.LogDbInitInfo
import org.allbinary.business.init.db.StaticPagesDbInitInfo
import org.allbinary.business.init.db.UserDbInitInfo
import org.allbinary.data.tables.context.module.storefronts.StoreFrontsEntityFactory
import org.allbinary.data.tables.log.LogTableEntityFactory
import org.allbinary.data.tables.staticpages.StaticPagesEntityFactory
import org.allbinary.data.tables.transform.info.TransformInfoEntityBuilder
import org.allbinary.data.tables.user.UserEntityFactory
import org.allbinary.data.tables.user.address.billing.BillingAddressesEntityFactory
import org.allbinary.data.tables.user.address.shipping.ShippingAddressesEntityFactory
import org.allbinary.data.tables.user.commerce.inventory.item.InventoryEntityFactory
import org.allbinary.data.tables.user.commerce.inventory.order.OrderHistoryEntityFactory
import org.allbinary.data.tables.user.commerce.inventory.order.OrderItemsEntityFactory
import org.allbinary.data.tables.user.commerce.money.payment.PaymentEntityFactory
import org.allbinary.data.tables.user.commerce.money.payment.gateway.PaymentGatewayEntityFactory
import org.allbinary.data.tables.user.commerce.money.payment.transaction.TransactionEntityFactory
import org.allbinary.data.tables.user.commerce.money.payment.transaction.TransactionResultEntityFactory
import org.allbinary.data.tables.user.quoterequest.QuoteRequestEntityFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.sql.AbDatabaseManagement
import org.allbinary.logic.io.AbDataOutputStream
import org.allbinary.logic.io.DataOutputStreamFactory
import org.allbinary.logic.io.file.AbFile
import org.allbinary.logic.io.file.FileFactory
import org.allbinary.logic.string.StringMaker

open public class InitDbCrypted : AbDatabaseManagement {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private var userDbInitInfo: UserDbInitInfo

    private var inventoryDbInitInfo: InventoryDbInitInfo

    private var historyDbInitInfo: HistoryDbInitInfo

    private var staticpagesDbInitInfo: StaticPagesDbInitInfo

    private var logDbInitInfo: LogDbInitInfo

    private val SQL_FILE: String = "initWeblisket.sql"
public constructor (databaseConnectionInfoInterface: DatabaseConnectionInfoInterface)                        

                            : super(databaseConnectionInfoInterface as DbConnectionInfo){
var databaseConnectionInfoInterface = databaseConnectionInfoInterface


                            //For kotlin this is before the body of the constructor.
                    
}


    open fun addUsers()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

        try {
            logUtil!!.put(this.commonStrings!!.START, this, this.METHOD_ADD_USERS)
userDbInitInfo= UserDbInitInfo()
inventoryDbInitInfo= InventoryDbInitInfo()
historyDbInitInfo= HistoryDbInitInfo()
staticpagesDbInitInfo= StaticPagesDbInitInfo()
logDbInitInfo= LogDbInitInfo()

    var CUSTOMERDB: String = userDbInitInfo!!.getName()!!


    var CUSTOMERDBUSER: String = userDbInitInfo!!.getUserName()!!


    var CUSTOMERDBPASSWORD: String = userDbInitInfo!!.getPassword()!!


    
                        if(!this.addDbUser(CUSTOMERDB, CUSTOMERDBUSER, CUSTOMERDBPASSWORD))
                        
                                    {
                                    logUtil!!.put(this.UNABLE_TO_CREATE_USER +CUSTOMERDBUSER, this, this.METHOD_ADD_USERS)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var INVENTORYDB: String = inventoryDbInitInfo!!.getName()!!


    var INVENTORYDBUSER: String = inventoryDbInitInfo!!.getUserName()!!


    var INVENTORYDBPASSWORD: String = inventoryDbInitInfo!!.getPassword()!!


    
                        if(!this.addDbUser(INVENTORYDB, INVENTORYDBUSER, INVENTORYDBPASSWORD))
                        
                                    {
                                    logUtil!!.put(this.UNABLE_TO_CREATE_USER +INVENTORYDBUSER, this, this.METHOD_ADD_USERS)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var HISTORYDB: String = historyDbInitInfo!!.getName()!!


    var HISTORYDBUSER: String = historyDbInitInfo!!.getUserName()!!


    var HISTORYDBPASSWORD: String = historyDbInitInfo!!.getPassword()!!


    
                        if(!this.addDbUser(HISTORYDB, HISTORYDBUSER, HISTORYDBPASSWORD))
                        
                                    {
                                    logUtil!!.put(this.UNABLE_TO_CREATE_USER +HISTORYDBUSER, this, this.METHOD_ADD_USERS)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var STATICPAGESDB: String = staticpagesDbInitInfo!!.getName()!!


    var STATICPAGESDBUSER: String = staticpagesDbInitInfo!!.getUserName()!!


    var STATICPAGESDBPASSWORD: String = staticpagesDbInitInfo!!.getPassword()!!


    
                        if(!this.addDbUser(STATICPAGESDB, STATICPAGESDBUSER, STATICPAGESDBPASSWORD))
                        
                                    {
                                    logUtil!!.put(this.UNABLE_TO_CREATE_USER +STATICPAGESDBUSER, this, this.METHOD_ADD_USERS)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var LOGDB: String = logDbInitInfo!!.getName()!!


    var LOGDBUSER: String = logDbInitInfo!!.getUserName()!!


    var LOGDBPASSWORD: String = logDbInitInfo!!.getPassword()!!


    
                        if(!this.addDbUser(LOGDB, LOGDBUSER, LOGDBPASSWORD))
                        
                                    {
                                    logUtil!!.put(this.UNABLE_TO_CREATE_USER +LOGDBUSER, this, this.METHOD_ADD_USERS)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                
logUtil!!.put(this.commonStrings!!.END, this, this.METHOD_ADD_USERS)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.METHOD_ADD_USERS, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}

}


    open fun addDatabases()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

        try {
            logUtil!!.put(this.commonStrings!!.START, this, this.METHOD_ADD_DATABASES)
userDbInitInfo= UserDbInitInfo()
inventoryDbInitInfo= InventoryDbInitInfo()
historyDbInitInfo= HistoryDbInitInfo()
staticpagesDbInitInfo= StaticPagesDbInitInfo()
logDbInitInfo= LogDbInitInfo()

    var CUSTOMERDB: String = userDbInitInfo!!.getName()!!


    
                        if(!this.addDb(CUSTOMERDB))
                        
                                    {
                                    logUtil!!.put(this.UNABLE_TO_CREATE_DATABASE +CUSTOMERDB, this, this.METHOD_ADD_DATABASES)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var INVENTORYDB: String = inventoryDbInitInfo!!.getName()!!


    
                        if(!this.addDb(INVENTORYDB))
                        
                                    {
                                    logUtil!!.put(this.UNABLE_TO_CREATE_DATABASE +INVENTORYDB, this, this.METHOD_ADD_DATABASES)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var HISTORYDB: String = historyDbInitInfo!!.getName()!!


    
                        if(!this.addDb(HISTORYDB))
                        
                                    {
                                    logUtil!!.put(this.UNABLE_TO_CREATE_DATABASE +HISTORYDB, this, this.METHOD_ADD_DATABASES)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var STATICPAGESDB: String = staticpagesDbInitInfo!!.getName()!!


    
                        if(!this.addDb(STATICPAGESDB))
                        
                                    {
                                    logUtil!!.put(this.UNABLE_TO_CREATE_DATABASE +STATICPAGESDB, this, this.METHOD_ADD_DATABASES)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var LOGDB: String = logDbInitInfo!!.getName()!!


    
                        if(!this.addDb(LOGDB))
                        
                                    {
                                    logUtil!!.put(this.UNABLE_TO_CREATE_DATABASE +LOGDB, this, this.METHOD_ADD_DATABASES)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE

                                    }
                                

    var file: AbFile = FileFactory.getInstance()!!.getInstance(SQL_FILE)!!

file.createNewFile()

    var idOutData: AbDataOutputStream = DataOutputStreamFactory.getInstance()!!.getInstance(file)!!

idOutData!!.writeBytes(this.sqlCommandLog!!.toString())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.METHOD_ADD_DATABASES, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
}

}


    open fun addTables()
        //nullable = true from not(false or (false and true)) = true
: Boolean{

        try {
            
    var stringBuffer: StringMaker = StringMaker()

logUtil!!.put(commonStrings!!.START, this, this.METHOD_ADD_TABLES)
stringBuffer!!.append(UserEntityFactory.getInstance()!!.createTable())
stringBuffer!!.append(StoreFrontsEntityFactory.getInstance()!!.getStoreFrontsEntityInstance()!!.createTable())
stringBuffer!!.append(BillingAddressesEntityFactory.getInstance()!!.getInstance(this.stringUtil!!.EMPTY_STRING)!!.createTable())
stringBuffer!!.append(ShippingAddressesEntityFactory.getInstance()!!.getInstance(this.stringUtil!!.EMPTY_STRING)!!.createTable())
stringBuffer!!.append(PaymentEntityFactory.getInstance()!!.getPaymentEntityInstance()!!.createTable())
stringBuffer!!.append(QuoteRequestEntityFactory.getInstance()!!.getQuoteRequestEntityInstance()!!.createTable())
stringBuffer!!.append(OrderHistoryEntityFactory.getInstance()!!.createTable())
stringBuffer!!.append(OrderItemsEntityFactory.getInstance()!!.createTable())
stringBuffer!!.append(TransactionEntityFactory.getInstance()!!.getTransactionEntityInstance()!!.createTable())
stringBuffer!!.append(TransactionResultEntityFactory.getInstance()!!.getTransactionResultEntityInstance()!!.createTable())
stringBuffer!!.append(PaymentGatewayEntityFactory.getInstance()!!.createTable())
stringBuffer!!.append(InventoryEntityFactory.getInstance()!!.getInventoryEntityInstance()!!.createTable())
stringBuffer!!.append(InitInfoEntity().
                            createTable())
stringBuffer!!.append(LogTableEntityFactory.getInstance()!!.getLogTableEntityInstance()!!.createTable())
stringBuffer!!.append(StaticPagesEntityFactory.getInstance()!!.getStaticPagesEntityInstance()!!.createTable())
stringBuffer!!.append(TransformInfoEntityBuilder.getInstance()!!.createTable())
logUtil!!.put(ADD_TABLES_RESULTS_LABEL +stringBuffer!!.toString(), this, this.METHOD_ADD_TABLES)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.TRUE
} catch(e: Exception)
            {
logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.METHOD_ADD_TABLES, e)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Boolean.FALSE
}

}


}
                
            


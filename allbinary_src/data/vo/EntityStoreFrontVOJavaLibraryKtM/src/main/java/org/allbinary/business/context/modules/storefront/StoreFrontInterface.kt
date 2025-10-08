
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
        package org.allbinary.business.context.modules.storefront




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.context.configuration.ContextConfigurationInterface
import org.allbinary.data.tables.TableMappingInterface
import org.allbinary.util.BasicArrayList

interface StoreFrontInterface : TableMappingInterface {
        

    open fun isNameValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun nameValidationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTestHtmlPath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getCurrentHostName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getCurrentHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getCurrentHomeHostName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getCurrentHomeHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getBasketName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getHomeHostName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getHomeHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getHostName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTestHomeHostName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTestHomeHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTestHostName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTestHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getStaticPath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getCategoryPath()
        //nullable = true from not(false or (false and true)) = true
: String

                @Throws(Exception::class)
            
    open fun getSubStores()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

    open fun getTagLocation()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getPackageLocation()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getInventoryControl()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getContextConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: ContextConfigurationInterface

    open fun setContextConfigurationInterface(contextConfigurationInterface: ContextConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true


    open fun getFtp()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getFtpPath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getFtpUserName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getFtpPassword()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTestFtp()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTestFtpPath()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTestFtpUserName()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTestFtpPassword()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getTimeCreated()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun getLastModified()
        //nullable = true from not(false or (false and true)) = true
: String

    open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setBasketName(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setHomeHostName(value: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun setHomeHostNamePath(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setHostName(value: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun setHostNamePath(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setTestHomeHostName(value: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun setTestHomeHostNamePath(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setTestHostName(value: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun setTestHostNamePath(value: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun setImagePath(value: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun setStaticPath(value: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun setCategoryPath(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setPackageLocation(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setInventoryControl(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setFtp(value: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun setFtpPath(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setFtpUserName(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setFtpPassword(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setTestFtp(value: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun setTestFtpPath(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setTestFtpUserName(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setTestFtpPassword(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setTimeCreated(value: String)
        //nullable = true from not(false or (false and false)) = true


    open fun setLastModified(value: String)
        //nullable = true from not(false or (false and false)) = true


                @Throws(Exception::class)
            
    open fun install(current: Int, total: Int)
        //nullable = true from not(false or (false and false)) = true


}
                
            


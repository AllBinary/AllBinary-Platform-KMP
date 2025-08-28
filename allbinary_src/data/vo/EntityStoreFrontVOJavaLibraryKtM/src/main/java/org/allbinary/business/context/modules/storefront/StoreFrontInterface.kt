
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

        Updates for KMP build        
        

open fun isValid()
        //nullable = true from not(false or (false and true)) = true
: Boolean

        Updates for KMP build        
        

open fun nameValidationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun validationInfo()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getTestHtmlPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getCurrentHostName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getCurrentHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getCurrentHomeHostName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getCurrentHomeHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getBasketName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getHomeHostName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getHomeHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getHostName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getTestHomeHostName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getTestHomeHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getTestHostName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getTestHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getStaticPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getCategoryPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun getSubStores()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList

        Updates for KMP build        
        

open fun getTagLocation()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getPackageLocation()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getInventoryControl()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getContextConfigurationInterface()
        //nullable = true from not(false or (false and true)) = true
: ContextConfigurationInterface

        Updates for KMP build        
        

open fun setContextConfigurationInterface(contextConfigurationInterface: ContextConfigurationInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun getFtp()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getFtpPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getFtpUserName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getFtpPassword()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getTestFtp()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getTestFtpPath()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getTestFtpUserName()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getTestFtpPassword()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getTimeCreated()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun getLastModified()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        

open fun setName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setBasketName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setHomeHostName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun setHomeHostNamePath(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setHostName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun setHostNamePath(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setTestHomeHostName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun setTestHomeHostNamePath(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setTestHostName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun setTestHostNamePath(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun setImagePath(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun setStaticPath(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun setCategoryPath(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setPackageLocation(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setInventoryControl(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setFtp(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun setFtpPath(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setFtpUserName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setFtpPassword(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setTestFtp(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun setTestFtpPath(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setTestFtpUserName(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setTestFtpPassword(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setTimeCreated(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

open fun setLastModified(value: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

                @Throws(Exception::class)
            
open fun install(current: Int, total: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        

}
                
            


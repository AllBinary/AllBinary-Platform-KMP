
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
        package org.allbinary.business.context.modules.storefronts



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import org.allbinary.business.context.modules.storefront.StoreFrontData
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.UserData
import org.allbinary.logic.string.tokens.Tokenizer
import org.allbinary.string.CommonSeps
import org.allbinary.util.BasicArrayList

open public class BasicStoreFront
            : Object
        
                , BasicStoreFrontInterface {
        

    private var name: String

    private var userName: String

    private var basketName: String

    private var homeHostName: String

    private var homeHostNamePath: String

    private var hostName: String

    private var hostNamePath: String

    private var testHomeHostName: String

    private var testHomeHostNamePath: String

    private var testHostName: String

    private var testHostNamePath: String

    private var imagePath: String

    private var staticPath: String

    private var categoryPath: String

    private var inventoryControl: String

    private var subStores: String

    private var tagLocation: String

    private var packageLocation: String

    private var ftp: String

    private var ftpPath: String

    private var ftpUserName: String

    private var ftpPassword: String

    private var testFtp: String

    private var testFtpPath: String

    private var testFtpUserName: String

    private var testFtpPassword: String

    private var timeCreated: String

    private var lastModified: String
public constructor        ()
            : super()
        {}

public constructor        (storeHashMap: HashMap<Any, Any>)
            : super()
        {

                    var storeHashMap = storeHashMap

    var storeFrontData: StoreFrontData = StoreFrontData.getInstance()!!
            

this.name= storeHashMap!!.get(storeFrontData!!.NAME) as String
this.userName= storeHashMap!!.get(UserData.USERNAME) as String
this.basketName= storeHashMap!!.get(storeFrontData!!.NAME) as String
this.homeHostName= storeHashMap!!.get(storeFrontData!!.HOMEHOSTNAME) as String
this.homeHostNamePath= storeHashMap!!.get(storeFrontData!!.HOMEHOSTNAMEPATH) as String
this.hostName= storeHashMap!!.get(storeFrontData!!.HOSTNAME) as String
this.hostNamePath= storeHashMap!!.get(storeFrontData!!.HOSTNAMEPATH) as String
this.testHomeHostName= storeHashMap!!.get(storeFrontData!!.TESTHOMEHOSTNAME) as String
this.testHomeHostNamePath= storeHashMap!!.get(storeFrontData!!.TESTHOMEHOSTNAMEPATH) as String
this.testHostName= storeHashMap!!.get(storeFrontData!!.TESTHOSTNAME) as String
this.testHostNamePath= storeHashMap!!.get(storeFrontData!!.TESTHOSTNAMEPATH) as String
this.imagePath= storeHashMap!!.get(storeFrontData!!.IMAGEPATH) as String
this.staticPath= storeHashMap!!.get(storeFrontData!!.STATICPATH) as String
this.categoryPath= storeHashMap!!.get(storeFrontData!!.CATEGORYPATH) as String
this.inventoryControl= storeHashMap!!.get(storeFrontData!!.INVENTORYCONTROL) as String
this.subStores= storeHashMap!!.get(storeFrontData!!.SUBSTORES) as String
this.tagLocation= storeHashMap!!.get(storeFrontData!!.TAGLOCATION) as String
this.packageLocation= storeHashMap!!.get(storeFrontData!!.PACKAGELOCATION) as String
this.ftp= storeHashMap!!.get(storeFrontData!!.FTP) as String
this.ftpPath= storeHashMap!!.get(storeFrontData!!.FTPPATH) as String
this.ftpUserName= storeHashMap!!.get(storeFrontData!!.FTPUSERNAME) as String
this.ftpPassword= storeHashMap!!.get(storeFrontData!!.FTPPASSWORD) as String
this.testFtp= storeHashMap!!.get(storeFrontData!!.TESTFTP) as String
this.testFtpPath= storeHashMap!!.get(storeFrontData!!.TESTFTPPATH) as String
this.testFtpUserName= storeHashMap!!.get(storeFrontData!!.TESTFTPUSERNAME) as String
this.testFtpPassword= storeHashMap!!.get(storeFrontData!!.TESTFTPPASSWORD) as String
this.timeCreated= storeHashMap!!.get(EntryData.getInstance()!!.TIMECREATED) as String
this.lastModified= storeHashMap!!.get(EntryData.getInstance()!!.LASTMODIFIED) as String
}


open fun getTestHtmlPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return org!!.allbinary!!.globals!!.URLGLOBALS.getTestHtmlPath() +this.getCurrentHostNamePath()
}


open fun getCurrentHostName()
        //nullable = true from not(false or (false and true)) = true
: String{
    var location: String = 
                null
            


    
                        if(org!!.allbinary!!.globals!!.URLGLOBALS.isTestingMode())
                        
                                    {
                                    location= this.getTestHostName()

                                    }
                                
                        else {
                            location= this.getHostName()

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return location
}


open fun getCurrentHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String{
    var location: String = 
                null
            


    
                        if(org!!.allbinary!!.globals!!.URLGLOBALS.isTestingMode())
                        
                                    {
                                    location= this.getTestHostNamePath()

                                    }
                                
                        else {
                            location= this.getHostNamePath()

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return location
}


open fun getCurrentHomeHostName()
        //nullable = true from not(false or (false and true)) = true
: String{
    var location: String = 
                null
            


    
                        if(org!!.allbinary!!.globals!!.URLGLOBALS.isTestingMode())
                        
                                    {
                                    location= this.getTestHomeHostName()

                                    }
                                
                        else {
                            location= this.getHomeHostName()

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return location
}


open fun getCurrentHomeHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String{
    var location: String = 
                null
            


    
                        if(org!!.allbinary!!.globals!!.URLGLOBALS.isTestingMode())
                        
                                    {
                                    location= this.getTestHomeHostNamePath()

                                    }
                                
                        else {
                            location= this.getHomeHostNamePath()

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return location
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun getUserName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.userName
}


open fun getBasketName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.basketName
}


open fun getHomeHostName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.homeHostName
}


open fun getHomeHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.homeHostNamePath
}


open fun getHostName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hostName
}


open fun getHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hostNamePath
}


open fun getTestHomeHostName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testHomeHostName
}


open fun getTestHomeHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testHomeHostNamePath
}


open fun getTestHostName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testHostName
}


open fun getTestHostNamePath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testHostNamePath
}


open fun getStaticPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.staticPath
}


open fun getCategoryPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.categoryPath
}


open fun getInventoryControl()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.inventoryControl
}


                @Throws(Exception::class)
            
open fun getSubStores()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{
        try {
            
    var tokenizer: Tokenizer = Tokenizer(CommonSeps.getInstance()!!.SEMICOLON)


    var subStoreVector: BasicArrayList = tokenizer!!.getTokens(this.subStores, BasicArrayList())!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return subStoreVector
} catch(e: Exception)
            {


                            throw e
}

}


open fun getTagLocation()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.tagLocation
}


open fun getPackageLocation()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.packageLocation
}


open fun getFtp()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ftp
}


open fun getFtpUserName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ftpUserName
}


open fun getFtpPassword()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ftpPassword
}


open fun getTestFtp()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testFtp
}


open fun getTestFtpUserName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testFtpUserName
}


open fun getTestFtpPassword()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testFtpPassword
}


open fun getFtpPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.ftpPath
}


open fun getTestFtpPath()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.testFtpPath
}


open fun getTimeCreated()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.timeCreated
}


open fun getLastModified()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.lastModified
}


}
                
            



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
        package org.allbinary.business.init




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.debug.DebugFactory
import org.allbinary.debug.NoDebug
import org.allbinary.logic.string.StringUtil
import org.allbinary.util.BasicArrayList

open public class LicenseInitInfo
            : Object
         {
        

    private var id: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var serverList: BasicArrayList = BasicArrayList()
 constructor        ()
            : super()
        {
}


open fun getLicenseId()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.id
}


open fun getServer(index: Int)
        //nullable = true from not(false or (false and false)) = true
: String{
var index = index



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.serverList!!.get(index) as String
}


open fun getNumberOfServers()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.serverList!!.size()
}


open fun setLicenseId(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.id= value
}


open fun clearServers()
        //nullable = true from not(false or (false and true)) = true
{
this.serverList!!.clear()
}


open fun setServer(value: String, index: Int)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
var index = index
this.serverList!!.add(index, value)
}


open fun addServer(value: String)
        //nullable = true from not(false or (false and false)) = true
{
var value = value
this.serverList!!.add(value)
}


open fun getServerList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.serverList
}


open fun setServerList(servers: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{
var servers = servers

    
                        if(DebugFactory.getInstance() == NoDebug.getInstance())
                        
                                    {
                                    this.serverList= servers

                                    }
                                
}


}
                
            


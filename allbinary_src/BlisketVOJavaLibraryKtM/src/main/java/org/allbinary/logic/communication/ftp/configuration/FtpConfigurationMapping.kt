
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
        package org.allbinary.logic.communication.ftp.configuration




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.data.tables.TableMappingInterface

open public class FtpConfigurationMapping
            : Object
        
                , TableMappingInterface {
        

    private var ftpConfigurationInterface: FtpConfigurationInterface
public constructor        (ftpConfigurationInterface: FtpConfigurationInterface)
            : super()
        

        Updates for KMP build        
        {
var ftpConfigurationInterface = ftpConfigurationInterface
this.ftpConfigurationInterface= ftpConfigurationInterface
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>

        Updates for KMP build        
        {

    var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

hashMap!!.put(FtpConfigurationData.SERVER, this.ftpConfigurationInterface!!.getServer())
hashMap!!.put(FtpConfigurationData.USERNAME, this.ftpConfigurationInterface!!.getUserName())
hashMap!!.put(FtpConfigurationData.PASSWORD, this.ftpConfigurationInterface!!.getPassword())
hashMap!!.put(FtpConfigurationData.PATH, this.ftpConfigurationInterface!!.getPath())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap
}


                @Throws(Exception::class)
            
open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Any

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return FtpConfigurationData.NAME
}


                @Throws(Exception::class)
            
open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector

        Updates for KMP build        
        {

    var vector: Vector = Vector()

vector.add(this.ftpConfigurationInterface!!.getServer())
vector.add(this.ftpConfigurationInterface!!.getUserName())
vector.add(this.ftpConfigurationInterface!!.getPassword())
vector.add(this.ftpConfigurationInterface!!.getPath())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return vector
}


}
                
            


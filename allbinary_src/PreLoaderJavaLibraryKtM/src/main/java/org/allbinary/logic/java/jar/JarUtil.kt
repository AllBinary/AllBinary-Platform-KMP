
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
        package org.allbinary.logic.java.jar




        import java.lang.Object        
        
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.IOException
import java.net.URL
import java.net.URLConnection
import java.util.jar.JarEntry
import java.util.jar.JarInputStream

open public class JarUtil
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun main(args: Array<String?>)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var args = args
JarUtil(URL("file:///G:/mnt/bc/mydev/working/j2me/MiniSpaceWars/MiniSpaceWars/dist/MiniSpaceWars.jar")).
                            show()
}


        }
            
    private var jarURL: URL
public constructor        (jarURL: URL)
            : super()
        

        Updates for KMP build        
        {
var jarURL = jarURL
this.jarURL= jarURL
}


open fun show()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var cache: ByteArray = ByteArray(1024)


        try {
            
    var conn: URLConnection = jarURL!!.openConnection()!!


    var jis: JarInputStream = JarInputStream(conn.getInputStream())


        while(true)
        

        Updates for KMP build        
        {

    var entry: JarEntry = jis.getNextJarEntry()!!


    
                        if(entry != 
                                    null
                                )
                        
                                    {
                                    
    
                        if(!entry.isDirectory())
                        
                                    {
                                    
    var offset: Int = 0


    var i: Int = 0


        while((i= jis.read(cache, offset, cache.size -offset)) !=  -1)
        

        Updates for KMP build        
        {
offset += i

    
                        if(offset >= cache.size)
                        
                                    {
                                    
    var newcache: ByteArray = ByteArray(cache.size +1024)

System.arraycopy(cache, 0, newcache, 0, cache.size)
cache= newcache

                                    }
                                
}


    var tmp: ByteArray = ByteArray(offset)

System.arraycopy(cache, 0, tmp, 0, offset)
System.out.println(entry.getName())

                                    }
                                

                                    }
                                
                        else {
                            break;

                    

                        }
                            
}

} catch(ex: IOException)
            

        Updates for KMP build        
        {
System.err.println(ex)
ex.printStackTrace()
}

}


}
                
            


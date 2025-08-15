
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
        package org.allbinary.logic.system.loader




        import java.lang.Object        
        
        import java.lang.ClassNotFoundException
        
        import java.lang.ClassLoader
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.FileInputStream
import java.io.IOException
import java.util.HashMap
import java.util.Map
import org.allbinary.logic.communication.log.LogBuffer
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.io.StreamUtil
import org.allbinary.logic.io.path.AbPathData
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.system.security.AbCryptUtil

open public class AbeClassLoader : ClassLoader {
        

        companion object {
            
    private var classes: Map = HashMap<Any, Any>()

    private var PATH: String

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val abCryptUtil: AbCryptUtil = AbCryptUtil.getInstance()!!
            

    private val ENCRYPTED_EXTENSION: String = AbPathData.getInstance()!!.EXTENSION_SEP +"abc"

    private var key: String
public constructor        (parent: ClassLoader, key: String)                        

                            : super(parent){

                    var parent = parent


                    var key = key


                            //For kotlin this is before the body of the constructor.
                    
this.key= key
this.PATH= org.allbinary.globals.URLGLOBALS.getWebappPath() +"WEB-INF/classes/"
}


open fun findLoadedClass1(name: String)
        //nullable = true from not(false or (false and false)) = true
: KClass<*>{

                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return classes.get(name) as Class
}


                @Throws(ClassNotFoundException::class)
            
open fun loadClass(name: String)
        //nullable = true from not(false or (false and false)) = true
: KClass<*>{

                    var name = name



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.loadClass(name, false)
}


                @Throws(ClassNotFoundException::class)
            
open fun loadClass(name: String, resolve: Boolean)
        //nullable = true from not(false or (false and false)) = true
: KClass<*>{

                    var name = name


                    var resolve = resolve

    var loadedWith: String = "findLoadedClass1"


    var logBuffer: LogBuffer = LogBuffer()


        try {
            
    var myClass: KClass<*> = this.findLoadedClass1(name)!!
            


    
                        if(myClass == 
                                    null
                                )
                        
                                    {
                                    
        try {
            loadedWith= "super.loadClass"

    var normalClass: KClass<*> = super.loadClass(name, resolve)!!
            


    
                        if(normalClass != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return normalClass

                                    }
                                
} catch(e: ClassNotFoundException)
            {logBuffer!!.add(LogFactory.getInstance("Failed to Load Class: " +name +"\nwith: " +loadedWith, this, "loadClass", e))
}
 catch(e: Exception)
            {logBuffer!!.add(LogFactory.getInstance("Failed to Load Class: " +name +"\nwith: " +loadedWith, this, "loadClass", e))
}
 catch(e: NoClassDefFoundError)
            {logBuffer!!.add(LogFactory.getInstance("NoClassDefFoundError Failed Loaded Class: " +name +"\nwith: " +loadedWith, this, "loadClass"))
}


    var classBytes: ByteArray = this.loadClassBytesFromFile(name)!!
            


    
                        if(classBytes == 
                                    null
                                )
                        
                                    {
                                    


                            throw ClassNotFoundException("My Bytes not loaded for: " +name +"\nwith: " +"loadClassBytes")

                                    }
                                
myClass= defineClass(name, classBytes, 0, classBytes!!.size)

    
                        if(myClass == 
                                    null
                                )
                        
                                    {
                                    


                            throw ClassNotFoundException("My Class Not Defineable for: " +name +"\nwith: " +"loadClassBytes")

                                    }
                                
classes.put(name, myClass)

                                    }
                                
                        else {
                            logBuffer!!.add(LogFactory.getInstance("Already Loaded: " +name +"\nwith: " +loadedWith, this, "loadClass"))

                        }
                            
resolveClass(myClass)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return myClass
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADERERROR))
                        
                                    {
                                    logBuffer!!.logAll()
logUtil!!.put("Failure loading: " +name +"\nwith: " +loadedWith, this, "loadClass", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


open fun loadClassBytesFromFile(name: String)
        //nullable = true from not(false or (false and false)) = true
: ByteArray{

                    var name = name

    var in: FileInputStream = 
                null
            


    var cname: String = StringUtil.getInstance()!!.EMPTY_STRING


        try {
            cname= PATH +name.replace('.', AbPathData.getInstance()!!.SEPARATORCHAR) +ENCRYPTED_EXTENSION
in= FileInputStream(cname)

    var decrypted: ByteArray = this.abCryptUtil!!.decrypt(in, this.key)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return decrypted
} catch(e: IOException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADERERROR))
                        
                                    {
                                    logUtil!!.put("(Before LogBuffer Output) Failure loading Encrypted: " +name +" File: " +cname, "AbeClassLoader", "loadClassBytes", e)

                                    }
                                
StreamUtil.getInstance()!!.close(in)
}
 catch(e: Exception)
            {
    var loadedWith: String = "loadClassBytes"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADERERROR))
                        
                                    {
                                    logUtil!!.put("(Before LogBuffer Output) Failed to Loaded Class: " +name +" File: " +cname +"\nwith: " +loadedWith, this, "loadClassBytes", e)

                                    }
                                
}
 catch(e: NoClassDefFoundError)
            {
    var loadedWith: String = "loadClassBytes"


    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADERERROR))
                        
                                    {
                                    logUtil!!.put("(Before LogBuffer Output) NoClassDefFoundError Failed Loaded Class: " +name +" File: " +cname +"\nwith: " +loadedWith, this, "loadClassBytes")

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}


                @Throws(ClassNotFoundException::class)
            
open fun oldLoadClass(name: String, resolve: Boolean)
        //nullable = true from not(false or (false and false)) = true
: KClass<*>{

                    var name = name


                    var resolve = resolve

    var loadedWith: String = "findLoadedClass1"


        try {
            
    var myClass: KClass<*> = this.findLoadedClass1(name)!!
            


    
                        if(myClass == 
                                    null
                                )
                        
                                    {
                                    
        try {
            loadedWith= "super.loadClass"

    var normalClass: KClass<*> = super.loadClass(name, resolve)!!
            


    
                        if(normalClass != 
                                    null
                                )
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return normalClass

                                    }
                                
} catch(e: ClassNotFoundException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADER))
                        
                                    {
                                    logUtil!!.put("Failed Loaded Class: " +name +" with: " +loadedWith, this, "loadClass")

                                    }
                                
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADER))
                        
                                    {
                                    logUtil!!.put("Failed Loaded Class: " +name +" with: " +loadedWith, this, "loadClass")

                                    }
                                
}
 catch(e: NoClassDefFoundError)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADER))
                        
                                    {
                                    logUtil!!.put("Failed Loaded Class: " +name +" with: " +loadedWith, this, "loadClass")

                                    }
                                
}

loadedWith= "loadClassBytes"

    var classBytes: ByteArray = this.loadClassBytesFromFile(name)!!
            


    
                        if(classBytes == 
                                    null
                                )
                        
                                    {
                                    


                            throw ClassNotFoundException("Bytes not loaded for: " +name)

                                    }
                                
myClass= defineClass(name, classBytes, 0, classBytes!!.size)

    
                        if(myClass == 
                                    null
                                )
                        
                                    {
                                    


                            throw ClassNotFoundException("Class Not Defineable for: " +name)

                                    }
                                
classes.put(name, myClass)

                                    }
                                
                        else {
                            
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADER))
                        
                                    {
                                    logUtil!!.put("Already Loaded: " +name +" with: " +loadedWith, this, "loadClass")

                                    }
                                

                        }
                            
resolveClass(myClass)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return myClass
} catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADERERROR))
                        
                                    {
                                    logUtil!!.put("Failure loading: " +name, "AbeClassLoader", "loadClass", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            


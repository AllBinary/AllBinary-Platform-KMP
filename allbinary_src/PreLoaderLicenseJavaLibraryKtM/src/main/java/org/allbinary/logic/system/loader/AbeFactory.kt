
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



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        import java.lang.ClassLoader
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Constructor
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.java.anyType.ConstructorUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.AbKeys
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.LicensingException
import org.allbinary.string.CommonSeps

open public class AbeFactory
            : Object
         {
        

        companion object {
            
    private val instance: AbeFactory = AbeFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: AbeFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var useCustomLoader: Boolean = false
private constructor        ()
            : super()
        {}


                @Throws(LicensingException::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, className: String)
        //nullable =  from not(true or (false and false)) = 
: Any{

                    var abeClientInformation = abeClientInformation


                    var className = className

        try {
            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this::class.newInstance()
} catch(e: LicensingException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADERERROR))
                        
                                    {
                                    logUtil!!.put("Failure for: " +className, this, 
                            "getInstance(classname)", e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADERERROR))
                        
                                    {
                                    logUtil!!.put("Failure for: " +className, this, 
                            "getInstance(classname)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


                @Throws(LicensingException::class)
            
open fun getInstance(abeClientInformation: AbeClientInformationInterface, className: String, classes: Array<KClass<*>?>, params: Array<Any?>)
        //nullable =  from not(true or (false and false)) = 
: Any{

                    var abeClientInformation = abeClientInformation


                    var className = className


                    var classes = classes


                    var params = params

    var constructor: Constructor = 
                null
            


        try {
            
    var parent: ClassLoader = WebappClassLoaderInfo.getLoader()!!
            


    
                        if(useCustomLoader)
                        
                                    {
                                    
    var loader: ClassLoader = AbeClassLoader(parent, AbKeys.getInstance()!!.getKey(abeClientInformation, className))


    var myClass: KClass<*> = loader.loadClass(className)!!
            

constructor= myClass!!.getConstructor(classes)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return constructor.newInstance(params)

                                    }
                                
                        else {
                            
    var myClass: KClass<*> = parent.loadClass(className)!!
            

constructor= myClass!!.getConstructor(classes)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return constructor.newInstance(params)

                        }
                            
} catch(e: LicensingException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADERERROR))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Failure for: ")
stringBuffer!!.append(className)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(ConstructorUtil.view(constructor, 
                            "\n"))
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "getInstance(className,params)", e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADERERROR))
                        
                                    {
                                    
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(
                            "Failure for: ")
stringBuffer!!.append(className)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(ConstructorUtil.view(constructor, 
                            "\n"))
logUtil!!.put(stringBuffer!!.toString(), this, 
                            "getInstance(className,params)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


                @Throws(LicensingException::class)
            
open fun ::class(abeClientInformation: AbeClientInformationInterface, className: String)
        //nullable = true from not(false or (false and false)) = true
: KClass<*>{

                    var abeClientInformation = abeClientInformation


                    var className = className

        try {
            
    var parent: ClassLoader = WebappClassLoaderInfo.getLoader()!!
            


    
                        if(useCustomLoader)
                        
                                    {
                                    
    var loader: ClassLoader = AbeClassLoader(parent, AbKeys.getInstance()!!.getKey(abeClientInformation, className))


    var c: KClass<*> = loader.loadClass(className)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return c

                                    }
                                
                        else {
                            
    var c: KClass<*> = parent.loadClass(className)!!
            




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return c

                        }
                            
} catch(e: LicensingException)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADERERROR))
                        
                                    {
                                    logUtil!!.put("Failure for: " +className, this, 
                            "getClass(className)", e)

                                    }
                                



                            throw e
}
 catch(e: Exception)
            {
    
                        if(org.allbinary.logic.communication.log.config.type.LogConfigTypes.LOGGING.contains(org.allbinary.logic.communication.log.config.type.LogConfigTypeFactory.getInstance()!!.LOADERERROR))
                        
                                    {
                                    logUtil!!.put("Failure for: " +className, this, 
                            "getClass(className)", e)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return null
}

}


}
                
            


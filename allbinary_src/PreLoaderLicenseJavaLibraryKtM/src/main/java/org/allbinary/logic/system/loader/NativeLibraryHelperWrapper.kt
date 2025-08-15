
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
        
        import java.lang.System
        
        import java.lang.ClassLoader
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.lang.reflect.Constructor
import java.lang.reflect.Method
import org.allbinary.string.CommonStrings

open public class NativeLibraryHelperWrapper
            : Object
         {
        

    private var libraryName: String

    private var loader: ClassLoader

    private var anyType: Any
public constructor        (libraryName: String)
            : super()
        {

                    var libraryName = libraryName
this.setLibraryName(libraryName)
}


                @Throws(Exception::class)
            
open fun load()
        //nullable = true from not(false or (false and true)) = true
{
    var params: Array<Any?> = arrayOfNulls(1)

params[0]= getLibraryName()

    var classes: Array<KClass<*>?> = arrayOfNulls(1)

classes[0]= getLibraryName()!!.::class
this.loader= NativeLibraryClassLoader(this::class.java.classLoader)

    var myClass: KClass<*> = loader.loadClass("dynamic.NativeLibraryHelper")!!
            


    var constructor: Constructor = myClass!!.getConstructor(classes)!!
            

this.anyType= constructor.newInstance(params)

    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            


    var method: Method = anyType!!::class.getMethod(commonStrings!!.LOAD, 
                            null)!!
            

method.invoke(anyType, 
                            null)
}


open fun unload()
        //nullable = true from not(false or (false and true)) = true
{this.anyType= 
                                        null
                                    
this.loader= 
                                        null
                                    
System.gc()
System.gc()
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return "Library: " +this.getLibraryName()
}


open fun getLibraryName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return libraryName
}


open fun setLibraryName(libraryName: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var libraryName = libraryName
this.libraryName= libraryName
}


}
                
            


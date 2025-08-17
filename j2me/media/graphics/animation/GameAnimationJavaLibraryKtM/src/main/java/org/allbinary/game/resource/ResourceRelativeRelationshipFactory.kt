
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
        package org.allbinary.game.resource




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.graphics.RelativeRelationship
import org.allbinary.util.BasicArrayList

open public class ResourceRelativeRelationshipFactory
            : Object
        
                , ResourceRelativeRelationshipFactoryInterface {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()

    private var initialized: Boolean= false

                @Throws(Exception::class)
            override fun init(level: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var level = level
this.setInitialized(true)
}


                @Throws(Exception::class)
            override fun getResourceRelativeRelationshipList(resource: String)
        //nullable = true from not(false or (false and false)) = true
: BasicArrayList{

                    var resource = resource



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hashtable.get(resource as Object) as BasicArrayList
}


                @Throws(Exception::class)
            override fun addResourceRelativeRelationship(resource: String, hardPoint: RelativeRelationship)
        //nullable = true from not(false or (false and false)) = true
{

                    var resource = resource


                    var hardPoint = hardPoint

    var list: BasicArrayList = this.getResourceRelativeRelationshipList(resource)!!
            


    
                        if(list == 
                                    null
                                )
                        
                                    {
                                    list= BasicArrayList()

                                    }
                                
list.add(hardPoint)
this.hashtable.put(resource, list)
}

override fun isLoadingLevel(level: Int)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var level = level



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}

override fun isFeature()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


open fun setInitialized(initialized: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var initialized = initialized
this.initialized= initialized
}


open fun isInitialized()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return initialized
}


}
                
            


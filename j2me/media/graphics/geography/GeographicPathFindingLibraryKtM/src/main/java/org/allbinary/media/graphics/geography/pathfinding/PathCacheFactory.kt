
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
        package org.allbinary.media.graphics.geography.pathfinding



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.util.BasicArrayList

open public class PathCacheFactory
            : Object
         {
        

        companion object {


    private var pathFactory: PathCacheFactory = PathCacheFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: PathCacheFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return pathFactory
}



        }
            
    private var hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()
private constructor        ()
            : super()
        {}


open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hashtable!!.size
}


open fun add(pathId: Integer, list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathId = pathId


                    var list = list
this.hashtable!!.put(pathId, list)
}


open fun remove(pathId: Integer)
        //nullable = true from not(false or (false and false)) = true
{

                    var pathId = pathId
this.hashtable!!.remove(pathId)
}


                @Throws(Exception::class)
            
open fun removeAll()
        //nullable = true from not(false or (false and true)) = true
{this.hashtable!!.clear()

    
                        if(this.hashtable!!.size > 0)
                        
                                    {
                                    


                            throw Exception(
                            "Did not clear")

                                    }
                                
}


                @Throws(Exception::class)
            
open fun getInstance(pathIdInteger: Integer)
        //nullable =  from not(true or (false and false)) = 
: BasicArrayList{

                    var pathIdInteger = pathIdInteger



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.hashtable!!.get(pathIdInteger as Object?) as BasicArrayList
}


}
                
            


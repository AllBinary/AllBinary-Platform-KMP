
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
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ResourceLoadingLevelFactory
            : Object
         {
        
companion object {
            
    private val instance: ResourceLoadingLevelFactory = ResourceLoadingLevelFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: ResourceLoadingLevelFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val LOAD_EARLY: ResourceLoadingLevel = ResourceLoadingLevel("Load Early", Integer.MAX_VALUE)

    val LOAD_TOUCH: ResourceLoadingLevel = ResourceLoadingLevel("Load Touch", Integer.MAX_VALUE -1)

    val LOAD_GAME: ResourceLoadingLevel = ResourceLoadingLevel("Load Game", Integer.MAX_VALUE -2)

    val LEVEL: ResourceLoadingLevel = ResourceLoadingLevel("Level", Integer.MAX_VALUE -99)

    val MAX_LEVEL: ResourceLoadingLevel = ResourceLoadingLevel("Max Level", Integer.MAX_VALUE -100)

    val LOAD_ALL: ResourceLoadingLevel = ResourceLoadingLevel("Load All",  -1)

    private val RESOURCE_LOADING_LEVEL_ARRAY: Array<ResourceLoadingLevel?> = arrayOf(this.LOAD_ALL,this.MAX_LEVEL,this.LEVEL,this.LOAD_GAME,this.LOAD_TOUCH,this.LOAD_EARLY)

    open fun getLevelString(level: Int)
        //nullable = true from not(false or (false and false)) = true
: String{
var level = level




                        for (index in 0 until RESOURCE_LOADING_LEVEL_ARRAY.size)

        {

    
                        if(level == RESOURCE_LOADING_LEVEL_ARRAY[index]!!.getLevel())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return RESOURCE_LOADING_LEVEL_ARRAY[index]!!.getName()

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return level.toString()
}


}
                
            


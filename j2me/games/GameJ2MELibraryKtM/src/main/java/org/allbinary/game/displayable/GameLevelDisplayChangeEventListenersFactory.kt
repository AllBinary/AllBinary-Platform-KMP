
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
        package org.allbinary.game.displayable




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.displayable.event.DisplayChangeEventHandler
import org.allbinary.graphics.displayable.event.DisplayChangeEventListener
import org.allbinary.logic.util.event.handler.BasicEventHandler
import org.allbinary.util.BasicArrayList

open public class GameLevelDisplayChangeEventListenersFactory
            : Object
         {
        

        companion object {
            
    private val instance: GameLevelDisplayChangeEventListenersFactory = GameLevelDisplayChangeEventListenersFactory()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: GameLevelDisplayChangeEventListenersFactory{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val list: BasicArrayList = BasicArrayList()

open fun add(displayChangeEventListener: DisplayChangeEventListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var displayChangeEventListener = displayChangeEventListener
this.list.add(displayChangeEventListener)
DisplayChangeEventHandler.getInstance()!!.addListener(displayChangeEventListener)
}


open fun clear()
        //nullable = true from not(false or (false and true)) = true
{
    var displayChangeEventHandler: BasicEventHandler = DisplayChangeEventHandler.getInstance()!!


    var displayChangeEventListener: DisplayChangeEventListener





                        for (index in this.list.size()!! downTo 0)


        {displayChangeEventListener= this.list.objectArray[index]!! as DisplayChangeEventListener
displayChangeEventHandler!!.removeListener(displayChangeEventListener)
}

this.list.clear()
}


}
                
            


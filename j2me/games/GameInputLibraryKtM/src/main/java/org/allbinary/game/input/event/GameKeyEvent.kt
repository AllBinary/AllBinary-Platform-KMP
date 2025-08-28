
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
        package org.allbinary.game.input.event




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.NullUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.util.event.AllBinaryEventObject

open public class GameKeyEvent : AllBinaryEventObject {
        

        companion object {
            
    val NONE: GameKeyEvent = GameKeyEvent(NullUtil.getInstance()!!.NULL_OBJECT,  -1,  -1,  -1,  -1, false)

        }
            
    private val sourceId: Int

    private var repeated: Boolean= false

    private var key: Int

    private var gameActionKey: Int= 0

    private var originalKey: Int= 0
public constructor        (anyType: Any, sourceId: Int, originalKey: Int, gameActionKey: Int, key: Int, repeated: Boolean)                        

                            : super(anyType){
var anyType = anyType
var sourceId = sourceId
var originalKey = originalKey
var gameActionKey = gameActionKey
var key = key
var repeated = repeated


                            //For kotlin this is before the body of the constructor.
                    
this.sourceId= sourceId
this.setOriginalKey(originalKey)
this.key= key
this.setGameActionKey(gameActionKey)
this.setRepeatEvents(repeated)
}

public constructor        (anyType: Any, sourceId: Int, key: Int)                        

                            : super(anyType){
var anyType = anyType
var sourceId = sourceId
var key = key


                            //For kotlin this is before the body of the constructor.
                    
this.sourceId= sourceId
this.key= key
this.setRepeatEvents(false)
}


open fun init(anyType: Any)
        //nullable = true from not(false or (false and false)) = true
{
var anyType = anyType
this.setSource(anyType)
}


open fun setRepeatEvents(repeated: Boolean)
        //nullable = true from not(false or (false and false)) = true
{
var repeated = repeated
this.repeated= repeated
}


open fun hasRepeatEvents()
        //nullable = true from not(false or (false and true)) = true
: Boolean{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.repeated
}


open fun getKey()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return key
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append("\nKey: ")
stringBuffer!!.append(this.getKey())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun getOriginalKey()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return originalKey
}


open fun setOriginalKey(originalKey: Int)
        //nullable = true from not(false or (false and false)) = true
{
var originalKey = originalKey
this.originalKey= originalKey
}


open fun getGameActionKey()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameActionKey
}


open fun setGameActionKey(gameActionKey: Int)
        //nullable = true from not(false or (false and false)) = true
{
var gameActionKey = gameActionKey
this.gameActionKey= gameActionKey
}


open fun getSourceId()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return sourceId
}


}
                
            



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
        package org.allbinary.game.score




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayOutputStream
import java.io.DataOutputStream
import org.allbinary.game.GameInfo
import org.allbinary.logic.string.StringMaker

open public class HighScore
            : Object
         {
        

    private val id: Int

    private var name: String

    private val gameInfo: GameInfo

    private val score: Long

    private val scoreString: String
public constructor        (id: Int, name: String, gameInfo: GameInfo, score: Long)
            : super()
        {
var id = id
var name = name
var gameInfo = gameInfo
var score = score
this.id= id
this.name= name
this.gameInfo= gameInfo
this.score= score
this.scoreString= (this.score).toString()
}


open fun getId()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.id
}


open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.name
}


open fun getScore()
        //nullable = true from not(false or (false and true)) = true
: Long{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.score
}


                @Throws(Exception::class)
            
open fun getAsBytes()
        //nullable = true from not(false or (false and true)) = true
: ByteArray{

    var byteArrayOutputStream: ByteArrayOutputStream = ByteArrayOutputStream()


    var outputStream: DataOutputStream = DataOutputStream(byteArrayOutputStream)

outputStream!!.writeUTF(this.getName())
outputStream!!.writeLong(this.getScore())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return byteArrayOutputStream!!.toByteArray()
}


open fun getGameInfo()
        //nullable = true from not(false or (false and true)) = true
: GameInfo{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameInfo
}


open fun getScoreString()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return scoreString
}


open fun setName(name: String)
        //nullable = true from not(false or (false and false)) = true
{
var name = name
this.name= name
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringMaker().
                            append(name)!!.append(':')!!.append(this.score)!!.append('/')!!.append(this.scoreString)!!.toString()
}


}
                
            


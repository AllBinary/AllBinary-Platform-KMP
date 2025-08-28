
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
        package org.allbinary.input.automation.module.game.skill




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.HashMap
import java.util.Vector
import org.allbinary.logic.string.StringMaker
import org.allbinary.string.CommonSeps

open public class GameSkill
            : Object
         {
        

        companion object {
            
    private var hashMap: HashMap<Any, Any> = HashMap<Any, Any>()

open fun getInstance(gameSkillType: GameSkillType, extra: String)
        //nullable =  from not(true or (false and false)) = 
: GameSkill

        Updates for KMP build        
        {
var gameSkillType = gameSkillType
var extra = extra



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashMap!!.get(StringBuilder().
                            append(gameSkillType!!.getName())!!.append(CommonSeps.getInstance()!!.SPACE)!!.append(extra)!!.toString()) as GameSkill
}


        }
            
    private var gameSkillType: GameSkillType

    private var extra: String

    private var time: Int= 0

    private var vector: Vector

    private val GAME_SKILL_LABEL: String = "GameSkill: "

    private val EXTRA_LABEL: String = "Extra: "

    private val TIME_LABEL: String = "Time: "
public constructor        (gameSkillType: GameSkillType, extra: String, time: Int)
            : super()
        

        Updates for KMP build        
        {
var gameSkillType = gameSkillType
var extra = extra
var time = time
this.setGameSkillType(gameSkillType)
this.setExtra(extra)
this.setTime(time)
this.vector= Vector()
hashMap!!.put(StringBuilder().
                            append(this.getGameSkillType()!!.getName())!!.append(CommonSeps.getInstance()!!.SPACE)!!.append(extra)!!.toString(), this)
}


open fun getGameSkillType()
        //nullable = true from not(false or (false and true)) = true
: GameSkillType

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return gameSkillType
}


open fun setGameSkillType(gameSkillType: GameSkillType)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var gameSkillType = gameSkillType
this.gameSkillType= gameSkillType
}


open fun getExtra()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return extra
}


open fun setExtra(extra: String)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var extra = extra
this.extra= extra
}


open fun getTime()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return time
}


open fun setTime(time: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var time = time
this.time= time
}


open fun addProperty(gameSkillPropertyInterface: GameSkillPropertyInterface)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var gameSkillPropertyInterface = gameSkillPropertyInterface
this.vector.add(gameSkillPropertyInterface)
}


open fun getProperties()
        //nullable = true from not(false or (false and true)) = true
: Vector

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.vector
}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String

        Updates for KMP build        
        {

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(GAME_SKILL_LABEL)
stringBuffer!!.append(this.getGameSkillType()!!.toString())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(EXTRA_LABEL)
stringBuffer!!.append(this.getExtra())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(TIME_LABEL)
stringBuffer!!.append(this.getTime())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            


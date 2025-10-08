
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
        

open public class GameSkillType
            : Object
         {
        
companion object {
            
    var MANA: GameSkillType = GameSkillType("Mana")

    var REPLENISH: GameSkillType = GameSkillType("Replenish")

    var TIMED: GameSkillType = GameSkillType("Timed")

    var ATTACK: GameSkillType = GameSkillType("Attack")

    var TRANSPORT: GameSkillType = GameSkillType("Transport")

        }
            
    private val SPELL_GAME_SKILL_TYPE: String = "SpellGameSkillType: "

    private var name: String
private constructor (name: String)
            : super()
        {
var name = name
this.setName(name)
}


    open fun getName()
        //nullable = true from not(false or (false and true)) = true
: String{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return name
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
                        return SPELL_GAME_SKILL_TYPE +this.getName()
}


}
                
            


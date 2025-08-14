
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
        package org.allbinary.game.combat.damage




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.game.rand.MyRandomFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorArrayIndexer
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.color.BasicColorSetUtil
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.logic.java.character.CharArrayFactory
import org.allbinary.logic.math.PrimitiveLongUtil
import org.allbinary.util.CircularIndexUtil
import org.allbinary.view.ViewPosition

open public class PtsDamageFloaters : DamageFloaters {
        

        companion object {
            
    private val basicColorArrayIndexer: BasicColorArrayIndexer = BasicColorArrayIndexer(arrayOf(BasicColorFactory.getInstance()!!.WHITE,BasicColorFactory.getInstance()!!.RED,BasicColorFactory.getInstance()!!.YELLOW,BasicColorFactory.getInstance()!!.BLUE))

        }
            
    val basicSetColorUtil: BasicColorSetUtil = BasicColorSetUtil.getInstance()!!
            

    private var layerInterface: AllBinaryLayer

    private var lastDamage: IntArray = IntArray(5)

    private var lastDamageString: Array<CharArray?> = Array(5) { CharArray(0) }

    private var lastDamageStringSizeArray: IntArray = IntArray(5)

    private var circularIndexUtil: CircularIndexUtil = CircularIndexUtil.getInstance(5)!!
            

    private val primitiveLongUtil: PrimitiveLongUtil
public constructor        (layerInterface: AllBinaryLayer){

                    var layerInterface = layerInterface
this.primitiveLongUtil= PrimitiveLongUtil(100000)
this.layerInterface= layerInterface

    var CHAR_ARRAY: CharArray = CharArrayFactory.getInstance()!!.getZeroCharArray()!!
            





                        for (index in this.lastDamageString!!.size -1 downTo 0)


        {this.lastDamageString[index]= CHAR_ARRAY
}

}

override fun add(damage: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var damage = damage

    var index: Int = this.circularIndexUtil!!.getIndex()!!
            

this.lastDamage[index]= damage
this.lastDamageString[index]= this.primitiveLongUtil!!.getCharArray(this.lastDamage[index]!!)
this.lastDamageStringSizeArray[index]= this.primitiveLongUtil!!.getCurrentTotalDigits()
this.circularIndexUtil!!.next()
}


    private val myRandomFactory: MyRandomFactory = MyRandomFactory.getInstance()!!
            
override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

    var viewPosition: ViewPosition = this.layerInterface!!.getViewPosition()!!
            


    var x: Int = viewPosition!!.getX()!!
            


    var y: Int = viewPosition!!.getY()!!
            





                        for (index in this.lastDamage!!.size -1 downTo 0)


        {
    
                        if(this.lastDamage[index] != 0)
                        
                                    {
                                    
    var delta: Int = 10 *(index +2)

this.basicSetColorUtil!!.setBasicColorP(graphics, basicColorArrayIndexer!!.get())
graphics.drawChars(this.lastDamageString[index]!!, 0, this.lastDamageStringSizeArray[index]!!, x -myRandomFactory!!.getNextInt(delta), y -delta, 0)
basicColorArrayIndexer!!.next()

                                    }
                                
this.lastDamage[index]= 0
}

}


}
                
            


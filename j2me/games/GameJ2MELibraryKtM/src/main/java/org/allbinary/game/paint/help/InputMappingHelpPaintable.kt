
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
        package org.allbinary.game.paint.help




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import org.allbinary.game.input.GameKey
import org.allbinary.game.input.GameKeyFactory
import org.allbinary.game.input.Input
import org.allbinary.game.input.PlatformInputMappingFactory
import org.allbinary.game.input.mapping.GameInputMapping
import org.allbinary.game.input.mapping.PersistentInputMapping
import org.allbinary.graphics.Anchor
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.font.MyFont
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class InputMappingHelpPaintable : HelpPaintable {
        

        companion object {
            
    private val AND: String = " and "

    private val SEP: String = ", "

    private val MORE_THAN_TWO_IN_LIST_AND: String = ", and "

        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    var stringUtil: StringUtil = StringUtil.getInstance()!!

    private var gameInputMappingArray: Array<GameInputMapping?>

    private var keyMappingArray: Array<BasicArrayList?> = arrayOfNulls(0)

    private var actionBasicColor: Array<BasicColor?> = arrayOfNulls(0)

    private var inputBasicColorArray: Array<Array<BasicColor?>?> = Array(0) { arrayOfNulls<BasicColor?>(0) }
                                                            

    private var selectedBasicColor: BasicColor

    private val NONE: GameKey = GameKeyFactory.getInstance()!!.NONE

    private val basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!
protected constructor        (gameInputMappingArray: Array<GameInputMapping?>, backgroundBasicColor: BasicColor, basicColor: BasicColor)                        

                            : super("Input Mapping", backgroundBasicColor, basicColor)

        Updates for KMP build        
        {
    //var gameInputMappingArray = gameInputMappingArray
    //var backgroundBasicColor = backgroundBasicColor
    //var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
this.gameInputMappingArray= gameInputMappingArray
this.update(NONE, NONE)

    
                        if(backgroundBasicColor == this.basicColorFactory!!.WHITE || basicColor == this.basicColorFactory!!.WHITE)
                        
                                    {
                                    this.selectedBasicColor= this.basicColorFactory!!.RED

                                    }
                                
                        else {
                            this.selectedBasicColor= this.basicColorFactory!!.WHITE

                        }
                            
}


open fun update(selectedGameKey: GameKey, selectedInput: Input)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var selectedGameKey = selectedGameKey
    //var selectedInput = selectedInput

    var stringMaker: StringMaker = StringMaker()

logUtil!!.put(stringMaker!!.append(CommonLabels.getInstance()!!.START_LABEL)!!.append("selected GameKey: ")!!.append(this.stringUtil!!.toString(selectedGameKey))!!.append(" Input: ")!!.append(this.stringUtil!!.toString(selectedInput))!!.toString(), this, commonStrings!!.UPDATE)

    var gameKeyMapping: PersistentInputMapping = PlatformInputMappingFactory.getInstance()!!.getPersistentInputMappingInstance()!!


    var size: Int = gameInputMappingArray!!.size
                


    var keyInfo: Array<String?> = arrayOfNulls(size)


    var keyMappingArray: Array<BasicArrayList?> = arrayOfNulls(size)


    var actionBasicColor: Array<BasicColor?> = arrayOfNulls(size)


    var inputBasicColorArray: Array<Array<BasicColor?>?> = arrayOfNulls<Array<BasicColor?>>(size)
                                                            


    var gameInputMapping: GameInputMapping


    var gameKey: GameKey


    var list: BasicArrayList





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
gameInputMapping= gameInputMappingArray[index]!!
gameKey= gameInputMapping!!.getGameKey()
list= gameKeyMapping!!.getInputMapping()!!.getMappedInput(gameKey)

    var size2: Int = list.size()!!

inputBasicColorArray[index]= arrayOfNulls(size2)




                        for (index2 in 0 until size2)

        

        Updates for KMP build        
        {
inputBasicColorArray[index]!![index2]= this.basicColor
}


    
                        if(gameKey == selectedGameKey)
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append("Found: selected GameKey: ")!!.append(this.stringUtil!!.toString(selectedGameKey))!!.toString(), this, commonStrings!!.UPDATE)
actionBasicColor[index]= this.selectedBasicColor

    var indexOfSelectedInput: Int = list.indexOf(selectedInput)!!


    
                        if(indexOfSelectedInput >= 0)
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
logUtil!!.put(stringMaker!!.append("Found: selected Input: ")!!.append(this.stringUtil!!.toString(selectedInput))!!.toString(), this, commonStrings!!.UPDATE)
inputBasicColorArray[index]!![indexOfSelectedInput]= this.selectedBasicColor

                                    }
                                

                                    }
                                
                        else {
                            actionBasicColor[index]= this.basicColor

                        }
                            
keyInfo[index]= gameInputMapping!!.getName()
keyMappingArray[index]= list
}

this.keyMappingArray= keyMappingArray
this.actionBasicColor= actionBasicColor
this.inputBasicColorArray= inputBasicColorArray
super.setInputInfoP(keyInfo)
}


open fun get(keyList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: String

        Updates for KMP build        
        {
var keyList = keyList

    var stringBuffer: StringMaker = StringMaker()


    var key: Input


    var size: Int = keyList!!.size()!!





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
key= keyList!!.objectArray[index]!! as Input
stringBuffer!!.append(key.getName())

    
                        if(index +1 < keyList!!.size())
                        
                                    {
                                    
    
                        if(keyList!!.size() == 2)
                        
                                    {
                                    stringBuffer!!.append(AND)

                                    }
                                
                        else {
                            
    
                        if(index +2 == keyList!!.size())
                        
                                    {
                                    stringBuffer!!.append(MORE_THAN_TWO_IN_LIST_AND)

                                    }
                                
                        else {
                            stringBuffer!!.append(SEP)

                        }
                            

                        }
                            

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}

override fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {

    var myFont: MyFont = MyFont.getInstance()!!


    var inputInfo: Array<String?> = this.inputInfo


    var size: Int = (inputInfo!!.size +4)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return myFont!!.DEFAULT_CHAR_HEIGHT *size
}


    private var anchor: Int = Anchor.TOP_LEFT
override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
    //var graphics = graphics

    var font: Font = graphics.getFont()!!


    var commonSeps: CommonSeps = CommonSeps.getInstance()!!


    var stringMaker: StringMaker = StringMaker()


    var EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING


    var myFont: MyFont = MyFont.getInstance()!!


    var charHeight: Int = myFont!!.DEFAULT_CHAR_HEIGHT


    var halfWidth: Int = DisplayInfoSingleton.getInstance()!!.getLastHalfWidth()!!


    var beginWidth: Int = (font.stringWidth(this.TITLE) shr 1)

graphics.setColor(this.basicColor!!.toInt())
graphics.drawString(this.TITLE, halfWidth -beginWidth, charHeight, anchor)

    var inputInfo: Array<String?> = this.inputInfo


    var size: Int = inputInfo!!.size
                


    var y: Int = 0


    var deltaX: Int = 0


    var size2: Int = 0


    var input: Input


    var actionString: String


    var list: BasicArrayList


    var keyMappings: String


    var sep: String





                        for (index in 0 until size)

        

        Updates for KMP build        
        {
y= (index +3) *charHeight
deltaX= 0
list= this.keyMappingArray[index]!!
size2= list.size()
keyMappings= this.get(list)
stringMaker!!.delete(0, stringMaker!!.length())
actionString= stringMaker!!.append(inputInfo[index]!!)!!.append(commonSeps!!.COLON)!!.append(commonSeps!!.SPACE)!!.append(commonSeps!!.SPACE)!!.toString()
stringMaker!!.delete(0, stringMaker!!.length())
beginWidth= (font.stringWidth(stringMaker!!.append(actionString)!!.append(keyMappings)!!.toString()) shr 1)
graphics.setColor(this.actionBasicColor[index]!!.toInt())
graphics.drawString(actionString, halfWidth -beginWidth +deltaX, y, anchor)
deltaX += font.stringWidth(actionString)




                        for (index2 in 0 until size2)

        

        Updates for KMP build        
        {
input= list.objectArray[index2]!! as Input
graphics.setColor(this.inputBasicColorArray[index]!![index2]!!.toInt())
graphics.drawString(input.getName(), halfWidth -beginWidth +deltaX, y, anchor)
deltaX += font.stringWidth(input.getName())
sep= EMPTY_STRING

    
                        if(index2 +1 < list.size())
                        
                                    {
                                    
    
                        if(list.size() == 2)
                        
                                    {
                                    sep= AND

                                    }
                                
                        else {
                            
    
                        if(index2 +2 == list.size())
                        
                                    {
                                    sep= MORE_THAN_TWO_IN_LIST_AND

                                    }
                                
                        else {
                            sep= SEP

                        }
                            

                        }
                            

                                    }
                                

    
                        if(sep != EMPTY_STRING)
                        
                                    {
                                    graphics.setColor(this.basicColor!!.toInt())
graphics.drawString(sep, halfWidth -beginWidth +deltaX, y, anchor)
deltaX += font.stringWidth(sep)

                                    }
                                
}

}

}


}
                
            


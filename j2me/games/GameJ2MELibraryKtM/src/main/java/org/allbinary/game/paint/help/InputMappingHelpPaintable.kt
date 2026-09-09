
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
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.logic.NullUtil
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

    val commonSeps: CommonSeps = CommonSeps.getInstance()!!

    val stringUtil: StringUtil = StringUtil.getInstance()!!

    private val basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!

    private val NONE: GameKey = GameKeyFactory.getInstance()!!.NONE

    private val EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING

    private var gameInputMappingArray: Array<GameInputMapping?>

    private var keyMappingArray: Array<BasicArrayList?> = arrayOfNulls(0)

    private var actionBasicColor: Array<BasicColor?> = arrayOfNulls(0)

    private var inputBasicColorArray: Array<Array<BasicColor?>?> = Array(0) { arrayOfNulls<BasicColor?>(0) }
                                                            

    private var selectedBasicColor: BasicColor

open public inner class UpdateMyFontProperties
            : Object
         {
        
/*Static stuff is not allowed for Kotlin inner classescompanion object {
            *//*
        }
            */


            //Auto Generated
            public constructor() : super()
            {
            }            
        
    var actionStringArray: Array<String?> = StringUtil.getInstance()!!.getArrayInstance()!!

    var keymappingBeginWidthArray: IntArray = NullUtil.getInstance()!!.NULL_INT_ARRAY

    var actionStringDeltaXArray: IntArray = NullUtil.getInstance()!!.NULL_INT_ARRAY

    var inputDeltaXArray: Array<IntArray?> = NullUtil.getInstance()!!.NULL_INT_ARRAY_ARRAY

    var sepArray: Array<Array<String?>?> = Array(0) { arrayOfNulls<String?>(0) }
                                                            

    var sepWidthArray: Array<IntArray?> = NullUtil.getInstance()!!.NULL_INT_ARRAY_ARRAY

    var charHeight: Int= 0

}
                
            
    private var updateMyFontProperties: UpdateMyFontProperties = UpdateMyFontProperties()
protected constructor (gameInputMappingArray: Array<GameInputMapping?>, backgroundBasicColor: BasicColor, basicColor: BasicColor)                        

                            : super("Input Mapping", backgroundBasicColor, basicColor){
    //var gameInputMappingArray = gameInputMappingArray
    //var backgroundBasicColor = backgroundBasicColor
    //var basicColor = basicColor


                            //For kotlin this is before the body of the constructor.
                    
this.gameInputMappingArray= gameInputMappingArray
this.update(this.NONE, this.NONE)

    
                        if(backgroundBasicColor == this.basicColorFactory!!.WHITE || basicColor == this.basicColorFactory!!.WHITE)
                        
                                    {
                                    this.selectedBasicColor= this.basicColorFactory!!.RED

                                    }
                                
                        else {
                            this.selectedBasicColor= this.basicColorFactory!!.WHITE

                        }
                            
}


    override fun updateMeasurement(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics

    var font: Font = graphics.getFont()!!


    var updateMyFontProperties: UpdateMyFontProperties = UpdateMyFontProperties()

updateMyFontProperties!!.charHeight= font.getHeight()

    var stringMaker: StringMaker = StringMaker()


    var inputInfo: Array<String?> = this.inputInfo


    var size: Int = inputInfo!!.size
                

updateMyFontProperties!!.actionStringArray= arrayOfNulls(size)
updateMyFontProperties!!.keymappingBeginWidthArray= IntArray(size)
updateMyFontProperties!!.actionStringDeltaXArray= IntArray(size)
updateMyFontProperties!!.inputDeltaXArray= Array(size) { IntArray(0) }
updateMyFontProperties!!.sepArray= Array(size) { arrayOfNulls<String?>(0) }
                                                            
updateMyFontProperties!!.sepWidthArray= Array(size) { IntArray(0) }

    var list: BasicArrayList


    var keyMappings: String


    var actionString: String


    var input: Input


    var size2: Int = 0





                        for (index in 0 until size)

        {
list= this.keyMappingArray[index]!!
keyMappings= this.get(list)
stringMaker!!.delete(0, stringMaker!!.length())
actionString= stringMaker!!.append(inputInfo[index]!!)!!.append(commonSeps!!.COLON)!!.append(commonSeps!!.SPACE)!!.append(commonSeps!!.SPACE)!!.toString()
updateMyFontProperties!!.actionStringArray[index]= actionString
stringMaker!!.delete(0, stringMaker!!.length())
updateMyFontProperties!!.keymappingBeginWidthArray[index]= (font.stringWidth(stringMaker!!.append(updateMyFontProperties!!.actionStringArray[index]!!)!!.append(keyMappings)!!.toString()) shr 1)
updateMyFontProperties!!.actionStringDeltaXArray[index]= font.stringWidth(actionString)
size2= list.size()
updateMyFontProperties!!.inputDeltaXArray[index]= IntArray(size2)
updateMyFontProperties!!.sepArray[index]= arrayOfNulls(size2)
updateMyFontProperties!!.sepWidthArray[index]= IntArray(size2)




                        for (index2 in 0 until size2)

        {
input= list.objectArray[index2]!! as Input
updateMyFontProperties!!.inputDeltaXArray[index]!![index2]= font.stringWidth(input.getName())
updateMyFontProperties!!.sepArray[index]!![index2]= EMPTY_STRING

    
                        if(index2 +1 < list.size())
                        
                                    {
                                    
    
                        if(list.size() == 2)
                        
                                    {
                                    updateMyFontProperties!!.sepArray[index]!![index2]= InputMappingHelpPaintable.AND

                                    }
                                
                        else {
                            
    
                        if(index2 +2 == list.size())
                        
                                    {
                                    updateMyFontProperties!!.sepArray[index]!![index2]= InputMappingHelpPaintable.MORE_THAN_TWO_IN_LIST_AND

                                    }
                                
                        else {
                            updateMyFontProperties!!.sepArray[index]!![index2]= InputMappingHelpPaintable.SEP

                        }
                            

                        }
                            

                                    }
                                

    
                        if(updateMyFontProperties!!.sepArray[index]!![index2] != EMPTY_STRING)
                        
                                    {
                                    updateMyFontProperties!!.sepWidthArray[index]!![index2]= font.stringWidth(updateMyFontProperties!!.sepArray[index]!![index2]!!)

                                    }
                                
}

}

this.updateMyFontProperties= updateMyFontProperties
super.updateMeasurement(graphics)
}


    open fun update(selectedGameKey: GameKey, selectedInput: Input)
        //nullable = true from not(false or (false and false)) = true
{
    //var selectedGameKey = selectedGameKey
    //var selectedInput = selectedInput

    var stringMaker: StringMaker = StringMaker()

this.logUtil!!.putF(stringMaker!!.append(CommonLabels.getInstance()!!.START_LABEL)!!.append("selected GameKey: ")!!.append(this.stringUtil!!.toString(selectedGameKey))!!.append(" Input: ")!!.append(this.stringUtil!!.toString(selectedInput))!!.toString(), this, this.commonStrings!!.UPDATE)

    var gameKeyMapping: PersistentInputMapping = PlatformInputMappingFactory.getInstance()!!.getPersistentInputMappingInstance()!!


    var size: Int = this.gameInputMappingArray!!.size
                


    var keyInfo: Array<String?> = arrayOfNulls(size)


    var keyMappingArray: Array<BasicArrayList?> = arrayOfNulls(size)


    var actionBasicColor: Array<BasicColor?> = arrayOfNulls(size)


    var inputBasicColorArray: Array<Array<BasicColor?>?> = arrayOfNulls<Array<BasicColor?>>(size)
                                                            


    var gameInputMapping: GameInputMapping


    var gameKey: GameKey


    var list: BasicArrayList





                        for (index in 0 until size)

        {
gameInputMapping= this.gameInputMappingArray[index]!!
gameKey= gameInputMapping!!.getGameKey()
list= gameKeyMapping!!.getInputMapping()!!.getMappedInput(gameKey)

    var size2: Int = list.size()!!

inputBasicColorArray[index]= arrayOfNulls(size2)




                        for (index2 in 0 until size2)

        {
inputBasicColorArray[index]!![index2]= this.basicColor
}


    
                        if(gameKey == selectedGameKey)
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
this.logUtil!!.putF(stringMaker!!.append("Found: selected GameKey: ")!!.append(this.stringUtil!!.toString(selectedGameKey))!!.toString(), this, this.commonStrings!!.UPDATE)
actionBasicColor[index]= this.selectedBasicColor

    var indexOfSelectedInput: Int = list.indexOf(selectedInput)!!


    
                        if(indexOfSelectedInput >= 0)
                        
                                    {
                                    stringMaker!!.delete(0, stringMaker!!.length())
this.logUtil!!.putF(stringMaker!!.append("Found: selected Input: ")!!.append(this.stringUtil!!.toString(selectedInput))!!.toString(), this, this.commonStrings!!.UPDATE)
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
this.myFontProcessor= this.updateMyFontProcessor
}


    open fun get(keyList: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
: String{
var keyList = keyList

    var stringBuffer: StringMaker = StringMaker()


    var key: Input


    var size: Int = keyList!!.size()!!





                        for (index in 0 until size)

        {
key= keyList!!.objectArray[index]!! as Input
stringBuffer!!.append(key.getName())

    
                        if(index +1 < keyList!!.size())
                        
                                    {
                                    
    
                        if(keyList!!.size() == 2)
                        
                                    {
                                    stringBuffer!!.append(InputMappingHelpPaintable.AND)

                                    }
                                
                        else {
                            
    
                        if(index +2 == keyList!!.size())
                        
                                    {
                                    stringBuffer!!.append(InputMappingHelpPaintable.MORE_THAN_TWO_IN_LIST_AND)

                                    }
                                
                        else {
                            stringBuffer!!.append(InputMappingHelpPaintable.SEP)

                        }
                            

                        }
                            

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


    override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{
    //var graphics = graphics
this.myFontProcessor!!.process(graphics)

    var halfWidth: Int = this.displayInfo!!.getLastHalfWidth()!!

graphics.setColor(this.basicColor!!.toInt())
graphics.drawString(this.title, halfWidth -this.titleBeginWidth, this.updateMyFontProperties!!.charHeight, this.anchor)

    var inputInfo: Array<String?> = this.inputInfo


    var size: Int = inputInfo!!.size
                


    var y: Int = 0


    var deltaX: Int = 0


    var size2: Int = 0


    var actionString: String


    var input: Input


    var list: BasicArrayList


    var sep: String


    var beginWidth: Int= 0





                        for (index in 0 until size)

        {
y= (index +3) *this.updateMyFontProperties!!.charHeight
deltaX= 0
list= this.keyMappingArray[index]!!
size2= list.size()
beginWidth= this.updateMyFontProperties!!.keymappingBeginWidthArray[index]!!
graphics.setColor(this.actionBasicColor[index]!!.toInt())
actionString= this.updateMyFontProperties!!.actionStringArray[index]!!
graphics.drawString(actionString, halfWidth -beginWidth +deltaX, y, this.anchor)
deltaX += this.updateMyFontProperties!!.actionStringDeltaXArray[index]!!




                        for (index2 in 0 until size2)

        {
input= list.objectArray[index2]!! as Input
graphics.setColor(this.inputBasicColorArray[index]!![index2]!!.toInt())
graphics.drawString(input.getName(), halfWidth -beginWidth +deltaX, y, this.anchor)
deltaX += this.updateMyFontProperties!!.inputDeltaXArray[index]!![index2]!!
sep= this.updateMyFontProperties!!.sepArray[index]!![index2]!!
graphics.setColor(this.basicColor!!.toInt())
graphics.drawString(sep, halfWidth -beginWidth +deltaX, y, this.anchor)
deltaX += this.updateMyFontProperties!!.sepWidthArray[index]!![index2]!!
}

}

}


}
                
            



        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.form.item



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.Graphics
import javax.microedition.lcdui.Item
import javax.microedition.lcdui.Screen
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.ForcedLogUtil
import org.allbinary.graphics.color.BasicColor

open public class CustomItemJ2MEComposite : CustomItem
                , CustomItemInterface {
        

    private val item: Item
public constructor        (item: Item, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(item.getLabel(), backgroundBasicColor, foregroundBasicColor){

                    var item = item


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    

    var formItemInterface: CustomItemInterface = item as CustomItemInterface

this.item= item
}


open fun addCommand(cmd: Command)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmd = cmd
this.item.addCommand(cmd)
}


open fun getLabel()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.item.getLabel()
}


open fun getLayout()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.item.getLayout()
}


open fun getMinimumHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.item.getMinimumHeight()
}


open fun getMinimumWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.item.getMinimumWidth()
}


open fun getPreferredHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.item.getPreferredHeight()
}


open fun getPreferredWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.item.getPreferredWidth()
}


open fun removeCommand(cmd: Command)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmd = cmd
this.item.removeCommand(cmd)
}


open fun setDefaultCommand(cmd: Command)
        //nullable = true from not(false or (false and false)) = true
{

                    var cmd = cmd
this.item.setDefaultCommand(cmd)
}


open fun setItemCommandListener(l: CustomItemCommandListener)
        //nullable = true from not(false or (false and false)) = true
{

                    var l = l
ForcedLogUtil.log(commonStrings!!.NOT_IMPLEMENTED, this)
}


open fun setLabel(label: String)
        //nullable = true from not(false or (false and false)) = true
{

                    var label = label
this.item.setLabel(label)
}


open fun setLayout(layout: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var layout = layout
this.item.setLayout(layout)
}


open fun setPreferredSize(width: Int, height: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var width = width


                    var height = height
this.item.setPreferredSize(width, height)
}


open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.item.getHeight()
}


open fun isFocusable()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.item.isFocusable()
}


open fun keyPressed(keyCode: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var keyCode = keyCode
this.item.keyPressed(keyCode)
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var graphics = graphics



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.item.paint(graphics)
}


open fun hasFocus()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.item.hasFocus()
}


open fun setFocus(state: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var state = state
this.item.setFocus(state)
}


open fun select()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.item.select()
}


open fun traverse(gameKeyCode: Int, top: Int, bottom: Int, action: Boolean)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var gameKeyCode = gameKeyCode


                    var top = top


                    var bottom = bottom


                    var action = action



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.item.traverse(gameKeyCode, top, bottom, action)
}


open fun setOwner(owner: Screen)
        //nullable = true from not(false or (false and false)) = true
{

                    var owner = owner
this.item.setOwner(owner)
}


open fun paint(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
getItem = getItem()getItem as CustomItemInterface
getItem.
                                paint(graphics, x, y)
}


open fun paintUnselected(graphics: Graphics, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var x = x


                    var y = y
getItem = getItem()getItem as CustomItemInterface
getItem.
                                paintUnselected(graphics, x, y)
}


open fun getItem()
        //nullable = true from not(false or (false and true)) = true
: Item{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return item
}


}
                
            


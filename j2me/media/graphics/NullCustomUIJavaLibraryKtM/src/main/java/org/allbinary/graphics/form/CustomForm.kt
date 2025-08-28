
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.form




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class CustomForm : CustomScreen {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
public constructor        (title: String, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)

        Updates for KMP build        
        {
var title = title
var backgroundBasicColor = backgroundBasicColor
var foregroundBasicColor = foregroundBasicColor
}

public constructor        (title: String, items: Array<CustomItem?>, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)

        Updates for KMP build        
        {
var title = title
var items = items
var backgroundBasicColor = backgroundBasicColor
var foregroundBasicColor = foregroundBasicColor
}


open fun size()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun setSelectedIndex(index: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var index = index
}


open fun getSelectedIndex()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun deleteAll()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {
}


open fun delete(itemNum: Int)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var itemNum = itemNum
}


open fun append(item: CustomItem)
        //nullable = true from not(false or (false and false)) = true
: Int

        Updates for KMP build        
        {
var item = item



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


open fun insert(itemNum: Int, item: CustomItem)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var itemNum = itemNum
var item = item
}


open fun set(itemNum: Int, item: CustomItem)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var itemNum = itemNum
var item = item
}


open fun get(itemNum: Int)
        //nullable = true from not(false or (false and false)) = true
: CustomItem

        Updates for KMP build        
        {
var itemNum = itemNum



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CustomItem.NULL_CUSTOM_ITEM
}


open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int

        Updates for KMP build        
        {



                            throw RuntimeException()
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var graphics = graphics
}


open fun getTitle()
        //nullable = true from not(false or (false and true)) = true
: String

        Updates for KMP build        
        {



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return StringUtil.getInstance()!!.EMPTY_STRING
}


}
                
            


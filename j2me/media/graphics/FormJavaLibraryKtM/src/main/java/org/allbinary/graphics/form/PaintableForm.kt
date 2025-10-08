
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.form




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.RectangleFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.CanvasStrings
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringUtil
import org.allbinary.string.CommonStrings

open public class PaintableForm : CustomForm {
        
companion object {
            
    val NULL_PAINTABLE_FORM: PaintableForm = PaintableForm(StringUtil.getInstance()!!.EMPTY_STRING, arrayOfNulls(0), RectangleFactory.SINGLETON, FormTypeFactory.getInstance()!!.NULL_FORM_TYPE, BasicColorFactory.getInstance()!!.BLACK, BasicColorFactory.getInstance()!!.WHITE)

        }
            
    val canvasStrings: CanvasStrings = CanvasStrings.getInstance()!!

    var rectangle: Rectangle = RectangleFactory.SINGLETON

    var x: Int= 0

    var y: Int= 0

    var formType: FormType = FormTypeFactory.getInstance()!!.NULL_FORM_TYPE
public constructor (title: String, items: Array<CustomItem?>, rectangle: Rectangle, formType: FormType, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(title, items, backgroundBasicColor, foregroundBasicColor){
    //var title = title
    //var items = items
    //var rectangle = rectangle
    //var formType = formType
    //var backgroundBasicColor = backgroundBasicColor
    //var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
this.setSelectedIndex(0)

        try {
            this.init(rectangle, formType)
} catch(e: Exception)
            {
logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}


                @Throws(Exception::class)
            
    open fun init(rectangle: Rectangle, formType: FormType)
        //nullable = true from not(false or (false and false)) = true
{
    //var rectangle = rectangle
    //var formType = formType
this.rectangle= rectangle

    var point: GPoint = this.rectangle.getPoint()!!

this.x= point.getX()
this.y= point.getY()
this.formType= formType
}


    override fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.rectangle.getWidth()
}


}
                
            


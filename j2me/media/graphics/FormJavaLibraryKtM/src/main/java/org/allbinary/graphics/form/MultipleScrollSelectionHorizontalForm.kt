
        /* Generated Code Do Not Modify */
        package org.allbinary.graphics.form



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Graphics
import org.allbinary.J2MEUtil
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.font.MyFont
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.graphics.form.item.CustomItemInterface
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker

open public class MultipleScrollSelectionHorizontalForm : ScrollSelectionForm {
        

    private val backgroundColor: Int = BasicColorFactory.getInstance()!!.TRANSPARENT_GREY.toInt()!!
            
public constructor        (title: String, items: Array<CustomItem?>, formPaintableFactory: ItemPaintableFactory, rectangle: Rectangle, formType: FormType, border: Int, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(title, items, formPaintableFactory, rectangle, formType, border, backgroundBasicColor, foregroundBasicColor){

                    var title = title


                    var items = items


                    var formPaintableFactory = formPaintableFactory


                    var rectangle = rectangle


                    var formType = formType


                    var border = border


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
}

public constructor        (title: String, items: Array<CustomItem?>, rectangle: Rectangle, formType: FormType, border: Int, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(title, items, rectangle, formType, border, backgroundBasicColor, foregroundBasicColor){

                    var title = title


                    var items = items


                    var rectangle = rectangle


                    var formType = formType


                    var border = border


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
}

override fun getStartIndex()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.getSelectedIndex()
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

        try {
            
    var formTypeFactory: FormTypeFactory = FormTypeFactory.getInstance()!!
            


    var start: Int = this.getStartIndex()!!
            


    var size: Int = this.size()!!
            


    var dx: Int = x


    var dy: Int = y


    
                        if(J2MEUtil.isJ2ME())
                        
                                    {
                                    
                                    }
                                
                        else {
                            graphics!!.setColor(backgroundColor)
graphics!!.fillRect(x, y, this.rectangle!!.getWidth(), this.rectangle!!.getHeight())

                        }
                            

    var myFont: MyFont = MyFont.getInstance()!!
            

graphics!!.drawString(this.getTitle(), x, y -myFont!!.DEFAULT_CHAR_HEIGHT, 0)

    var item: CustomItemInterface





                        for (index in start until size)


        {item= this.get(index) as CustomItemInterface

    
                        if(dx >= this.rectangle!!.getMaxX())
                        
                                    {
                                    PreLogUtil.put(StringMaker().
                            append(
                            "painting beyond maxx: ")!!.append(this.rectangle!!.getMaxX())!!.toString(), this, canvasStrings!!.PAINT)

                                    }
                                

    
                        if(this.formType == formTypeFactory!!.HORIZONTAL_FORM)
                        
                                    {
                                    
    var dx2: Int = this.paintItem(graphics, index, item, dx, dy) +border

this.paintable!!.paint(graphics, index, dx, dy)
dx= dx2

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.VERTICAL_CENTER_FORM)
                        
                                    {
                                    this.paintItem(graphics, index, item, dx, dy)
this.paintable!!.paint(graphics, index, dx, dy)

                                    }
                                
                        else {
                            


                            throw Exception(formTypeFactory!!.UNK)

                        }
                            
}

} catch(e: Exception)
            {PreLogUtil.put(commonStrings!!.EXCEPTION, this, canvasStrings!!.PAINT)
}

}


}
                
            



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
        package org.allbinary.graphics.j2me.workarea.tools



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        

open public class ToolJPanel : swing.JPanel {
        
public constructor        (){initComponents()
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{lineJButton= JButton()
rectJButton= JButton()
arcJButton= JButton()
stringJButton= JButton()
charJButton= JButton()
roundRectJButton= JButton()
imageJButton= JButton()
fillArcJButton= JButton()
fillRectJButton= JButton()
fillRoundRectJButton= JButton()
dottedLineJButton= JButton()
dottedRectButton= JButton()
dottedArcJButton= JButton()
dottedFillRectJButton= JButton()
dottedFillArcJButton= JButton()
dottedFillRountRectJButton= JButton()
colorJPanel= JPanel()
colorJList= JList()
setLayout(GridLayout(17, 1))
lineJButton!!.setFont(Font(
                            "Dialog", 0, 10))
lineJButton!!.setText(LinesGraphicItem.getStaticName())
lineJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mouseClicked(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
lineJButtonMouseClicked(evt)
}

                                }
                            )
add(lineJButton)
rectJButton!!.setFont(Font(
                            "Dialog", 0, 10))
rectJButton!!.setText(
                            "Rect")
rectJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mouseClicked(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
rectJButtonMouseClicked(evt)
}

                                }
                            )
add(rectJButton)
arcJButton!!.setFont(Font(
                            "Dialog", 0, 10))
arcJButton!!.setText(
                            "Arc")
arcJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
arcJButtonMousePressed(evt)
}

                                }
                            )
add(arcJButton)
stringJButton!!.setFont(Font(
                            "Dialog", 0, 10))
stringJButton!!.setText(
                            "String")
stringJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
stringJButtonMousePressed(evt)
}

                                }
                            )
add(stringJButton)
charJButton!!.setFont(Font(
                            "Dialog", 0, 10))
charJButton!!.setText(
                            "Char")
charJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
charJButtonMousePressed(evt)
}

                                }
                            )
add(charJButton)
roundRectJButton!!.setFont(Font(
                            "Dialog", 0, 10))
roundRectJButton!!.setText(
                            "Round Rect")
roundRectJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
roundRectJButtonMousePressed(evt)
}

                                }
                            )
add(roundRectJButton)
imageJButton!!.setFont(Font(
                            "Dialog", 0, 10))
imageJButton!!.setText(
                            "Image")
imageJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
imageJButtonMousePressed(evt)
}

                                }
                            )
add(imageJButton)
fillArcJButton!!.setFont(Font(
                            "Dialog", 0, 10))
fillArcJButton!!.setText(
                            "Fill Arc")
fillArcJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
fillArcJButtonMousePressed(evt)
}

                                }
                            )
add(fillArcJButton)
fillRectJButton!!.setFont(Font(
                            "Dialog", 0, 10))
fillRectJButton!!.setText(
                            "Fill Rect")
fillRectJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
fillRectJButtonMousePressed(evt)
}

                                }
                            )
add(fillRectJButton)
fillRoundRectJButton!!.setFont(Font(
                            "Dialog", 0, 10))
fillRoundRectJButton!!.setText(
                            "Fill Rnd Rect")
fillRoundRectJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
fillRoundRectJButtonMousePressed(evt)
}

                                }
                            )
add(fillRoundRectJButton)
dottedLineJButton!!.setFont(Font(
                            "Dialog", 0, 10))
dottedLineJButton!!.setText(
                            "Dot Line")
dottedLineJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
dottedLineJButtonMousePressed(evt)
}

                                }
                            )
add(dottedLineJButton)
dottedRectButton!!.setFont(Font(
                            "Dialog", 0, 10))
dottedRectButton!!.setText(
                            "Dot Rect")
dottedRectButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
dottedRectButtonMousePressed(evt)
}

                                }
                            )
add(dottedRectButton)
dottedArcJButton!!.setFont(Font(
                            "Dialog", 0, 10))
dottedArcJButton!!.setText(
                            "Dot Arc")
dottedArcJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
dottedArcJButtonMousePressed(evt)
}

                                }
                            )
add(dottedArcJButton)
dottedFillRectJButton!!.setFont(Font(
                            "Dialog", 0, 10))
dottedFillRectJButton!!.setText(
                            "Dot Fill Rect")
dottedFillRectJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
dottedFillRectJButtonMousePressed(evt)
}

                                }
                            )
add(dottedFillRectJButton)
dottedFillArcJButton!!.setFont(Font(
                            "Dialog", 0, 10))
dottedFillArcJButton!!.setText(
                            "Dot Fill Arc")
dottedFillArcJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
dottedFillArcJButtonMousePressed(evt)
}

                                }
                            )
add(dottedFillArcJButton)
dottedFillRountRectJButton!!.setFont(Font(
                            "Dialog", 0, 10))
dottedFillRountRectJButton!!.setText(
                            "Dot Fill Rnd Rect")
dottedFillRountRectJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
dottedFillRountRectJButtonMousePressed(evt)
}

                                }
                            )
add(dottedFillRountRectJButton)
colorJPanel!!.setLayout(GridLayout(1, 1))
colorJPanel!!.add(colorJList)
add(colorJPanel)
}


open fun dottedFillRountRectJButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedFillRountRectJButton!!.getText())
}


open fun dottedFillArcJButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedFillArcJButton!!.getText())
}


open fun dottedFillRectJButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedFillRectJButton!!.getText())
}


open fun dottedArcJButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedArcJButton!!.getText())
}


open fun dottedRectButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedRectButton!!.getText())
}


open fun dottedLineJButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedLineJButton!!.getText())
}


open fun fillRoundRectJButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.fillRoundRectJButton!!.getText())
}


open fun fillRectJButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.fillRectJButton!!.getText())
}


open fun fillArcJButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.fillArcJButton!!.getText())
}


open fun imageJButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.imageJButton!!.getText())
}


open fun roundRectJButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.roundRectJButton!!.getText())
}


open fun charJButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.charJButton!!.getText())
}


open fun stringJButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.stringJButton!!.getText())
}


open fun arcJButtonMousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.arcJButton!!.getText())
}


open fun rectJButtonMouseClicked(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.rectJButton!!.getText())
}


open fun lineJButtonMouseClicked(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.lineJButton!!.getText())
}


    private var arcJButton: JButton

    private var charJButton: JButton

    private var colorJList: JList

    private var colorJPanel: JPanel

    private var dottedArcJButton: JButton

    private var dottedFillArcJButton: JButton

    private var dottedFillRectJButton: JButton

    private var dottedFillRountRectJButton: JButton

    private var dottedLineJButton: JButton

    private var dottedRectButton: JButton

    private var fillArcJButton: JButton

    private var fillRectJButton: JButton

    private var fillRoundRectJButton: JButton

    private var imageJButton: JButton

    private var lineJButton: JButton

    private var rectJButton: JButton

    private var roundRectJButton: JButton

    private var stringJButton: JButton

}
                
            


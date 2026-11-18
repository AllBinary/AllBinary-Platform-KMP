
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
                    
        
import java.awt.Font
import java.awt.GridLayout
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JButton
import javax.swing.JList
import javax.swing.JPanel

open public class ToolJPanel : JPanel {
        
public constructor (){
this.initComponents()
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
lineJButton= JButton()
this.rectJButton= JButton()
this.arcJButton= JButton()
this.stringJButton= JButton()
this.charJButton= JButton()
this.roundRectJButton= JButton()
this.imageJButton= JButton()
this.fillArcJButton= JButton()
this.fillRectJButton= JButton()
this.fillRoundRectJButton= JButton()
this.dottedLineJButton= JButton()
this.dottedRectButton= JButton()
this.dottedArcJButton= JButton()
this.dottedFillRectJButton= JButton()
this.dottedFillArcJButton= JButton()
this.dottedFillRountRectJButton= JButton()
this.colorJPanel= JPanel()
this.colorJList= JList()
this.setLayout(GridLayout(17, 1))
lineJButton!!.setFont(Font("Dialog", 0, 10))
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
add(this.lineJButton)
this.rectJButton!!.setFont(Font("Dialog", 0, 10))
this.rectJButton!!.setText("Rect")
this.rectJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mouseClicked(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
rectJButtonMouseClicked(evt)
}

                                }
                            )
add(this.rectJButton)
this.arcJButton!!.setFont(Font("Dialog", 0, 10))
this.arcJButton!!.setText("Arc")
this.arcJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
arcJButtonMousePressed(evt)
}

                                }
                            )
add(this.arcJButton)
this.stringJButton!!.setFont(Font("Dialog", 0, 10))
this.stringJButton!!.setText("String")
this.stringJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
stringJButtonMousePressed(evt)
}

                                }
                            )
add(this.stringJButton)
this.charJButton!!.setFont(Font("Dialog", 0, 10))
this.charJButton!!.setText("Char")
this.charJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
charJButtonMousePressed(evt)
}

                                }
                            )
add(this.charJButton)
this.roundRectJButton!!.setFont(Font("Dialog", 0, 10))
this.roundRectJButton!!.setText("Round Rect")
this.roundRectJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
roundRectJButtonMousePressed(evt)
}

                                }
                            )
add(this.roundRectJButton)
this.imageJButton!!.setFont(Font("Dialog", 0, 10))
this.imageJButton!!.setText("Image")
this.imageJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
imageJButtonMousePressed(evt)
}

                                }
                            )
add(this.imageJButton)
this.fillArcJButton!!.setFont(Font("Dialog", 0, 10))
this.fillArcJButton!!.setText("Fill Arc")
this.fillArcJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fillArcJButtonMousePressed(evt)
}

                                }
                            )
add(this.fillArcJButton)
this.fillRectJButton!!.setFont(Font("Dialog", 0, 10))
this.fillRectJButton!!.setText("Fill Rect")
this.fillRectJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fillRectJButtonMousePressed(evt)
}

                                }
                            )
add(this.fillRectJButton)
this.fillRoundRectJButton!!.setFont(Font("Dialog", 0, 10))
this.fillRoundRectJButton!!.setText("Fill Rnd Rect")
this.fillRoundRectJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fillRoundRectJButtonMousePressed(evt)
}

                                }
                            )
add(this.fillRoundRectJButton)
this.dottedLineJButton!!.setFont(Font("Dialog", 0, 10))
this.dottedLineJButton!!.setText("Dot Line")
this.dottedLineJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedLineJButtonMousePressed(evt)
}

                                }
                            )
add(this.dottedLineJButton)
this.dottedRectButton!!.setFont(Font("Dialog", 0, 10))
this.dottedRectButton!!.setText("Dot Rect")
this.dottedRectButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedRectButtonMousePressed(evt)
}

                                }
                            )
add(this.dottedRectButton)
this.dottedArcJButton!!.setFont(Font("Dialog", 0, 10))
this.dottedArcJButton!!.setText("Dot Arc")
this.dottedArcJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedArcJButtonMousePressed(evt)
}

                                }
                            )
add(this.dottedArcJButton)
this.dottedFillRectJButton!!.setFont(Font("Dialog", 0, 10))
this.dottedFillRectJButton!!.setText("Dot Fill Rect")
this.dottedFillRectJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedFillRectJButtonMousePressed(evt)
}

                                }
                            )
add(this.dottedFillRectJButton)
this.dottedFillArcJButton!!.setFont(Font("Dialog", 0, 10))
this.dottedFillArcJButton!!.setText("Dot Fill Arc")
this.dottedFillArcJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedFillArcJButtonMousePressed(evt)
}

                                }
                            )
add(this.dottedFillArcJButton)
this.dottedFillRountRectJButton!!.setFont(Font("Dialog", 0, 10))
this.dottedFillRountRectJButton!!.setText("Dot Fill Rnd Rect")
this.dottedFillRountRectJButton!!.addMouseListener(object: MouseAdapter()
                                {
                                
                                
    open override fun mousePressed(evt: MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedFillRountRectJButtonMousePressed(evt)
}

                                }
                            )
add(this.dottedFillRountRectJButton)
this.colorJPanel!!.setLayout(GridLayout(1, 1))
this.colorJPanel!!.add(this.colorJList)
add(this.colorJPanel)
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
                
            



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
        

open public class ToolJPanel : javax.swing.JPanel {
        
public constructor (){
initComponents()
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
lineJButton= javax.swing.JButton()
rectJButton= javax.swing.JButton()
arcJButton= javax.swing.JButton()
stringJButton= javax.swing.JButton()
charJButton= javax.swing.JButton()
roundRectJButton= javax.swing.JButton()
imageJButton= javax.swing.JButton()
fillArcJButton= javax.swing.JButton()
fillRectJButton= javax.swing.JButton()
fillRoundRectJButton= javax.swing.JButton()
dottedLineJButton= javax.swing.JButton()
dottedRectButton= javax.swing.JButton()
dottedArcJButton= javax.swing.JButton()
dottedFillRectJButton= javax.swing.JButton()
dottedFillArcJButton= javax.swing.JButton()
dottedFillRountRectJButton= javax.swing.JButton()
colorJPanel= javax.swing.JPanel()
colorJList= javax.swing.JList()
setLayout(java.awt.GridLayout(17, 1))
lineJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
lineJButton!!.setText(LinesGraphicItem.getStaticName())
lineJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mouseClicked(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
lineJButtonMouseClicked(evt)
}

                                }
                            )
add(lineJButton)
rectJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
rectJButton!!.setText("Rect")
rectJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mouseClicked(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
rectJButtonMouseClicked(evt)
}

                                }
                            )
add(rectJButton)
arcJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
arcJButton!!.setText("Arc")
arcJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
arcJButtonMousePressed(evt)
}

                                }
                            )
add(arcJButton)
stringJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
stringJButton!!.setText("String")
stringJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
stringJButtonMousePressed(evt)
}

                                }
                            )
add(stringJButton)
charJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
charJButton!!.setText("Char")
charJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
charJButtonMousePressed(evt)
}

                                }
                            )
add(charJButton)
roundRectJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
roundRectJButton!!.setText("Round Rect")
roundRectJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
roundRectJButtonMousePressed(evt)
}

                                }
                            )
add(roundRectJButton)
imageJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
imageJButton!!.setText("Image")
imageJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
imageJButtonMousePressed(evt)
}

                                }
                            )
add(imageJButton)
fillArcJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
fillArcJButton!!.setText("Fill Arc")
fillArcJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fillArcJButtonMousePressed(evt)
}

                                }
                            )
add(fillArcJButton)
fillRectJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
fillRectJButton!!.setText("Fill Rect")
fillRectJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fillRectJButtonMousePressed(evt)
}

                                }
                            )
add(fillRectJButton)
fillRoundRectJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
fillRoundRectJButton!!.setText("Fill Rnd Rect")
fillRoundRectJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
fillRoundRectJButtonMousePressed(evt)
}

                                }
                            )
add(fillRoundRectJButton)
dottedLineJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
dottedLineJButton!!.setText("Dot Line")
dottedLineJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedLineJButtonMousePressed(evt)
}

                                }
                            )
add(dottedLineJButton)
dottedRectButton!!.setFont(java.awt.Font("Dialog", 0, 10))
dottedRectButton!!.setText("Dot Rect")
dottedRectButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedRectButtonMousePressed(evt)
}

                                }
                            )
add(dottedRectButton)
dottedArcJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
dottedArcJButton!!.setText("Dot Arc")
dottedArcJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedArcJButtonMousePressed(evt)
}

                                }
                            )
add(dottedArcJButton)
dottedFillRectJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
dottedFillRectJButton!!.setText("Dot Fill Rect")
dottedFillRectJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedFillRectJButtonMousePressed(evt)
}

                                }
                            )
add(dottedFillRectJButton)
dottedFillArcJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
dottedFillArcJButton!!.setText("Dot Fill Arc")
dottedFillArcJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedFillArcJButtonMousePressed(evt)
}

                                }
                            )
add(dottedFillArcJButton)
dottedFillRountRectJButton!!.setFont(java.awt.Font("Dialog", 0, 10))
dottedFillRountRectJButton!!.setText("Dot Fill Rnd Rect")
dottedFillRountRectJButton!!.addMouseListener(object: java.awt.event.MouseAdapter()
                                {
                                
    open override fun mousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
dottedFillRountRectJButtonMousePressed(evt)
}

                                }
                            )
add(dottedFillRountRectJButton)
colorJPanel!!.setLayout(java.awt.GridLayout(1, 1))
colorJPanel!!.add(colorJList)
add(colorJPanel)
}


    open fun dottedFillRountRectJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedFillRountRectJButton!!.getText())
}


    open fun dottedFillArcJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedFillArcJButton!!.getText())
}


    open fun dottedFillRectJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedFillRectJButton!!.getText())
}


    open fun dottedArcJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedArcJButton!!.getText())
}


    open fun dottedRectButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedRectButton!!.getText())
}


    open fun dottedLineJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.dottedLineJButton!!.getText())
}


    open fun fillRoundRectJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.fillRoundRectJButton!!.getText())
}


    open fun fillRectJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.fillRectJButton!!.getText())
}


    open fun fillArcJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.fillArcJButton!!.getText())
}


    open fun imageJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.imageJButton!!.getText())
}


    open fun roundRectJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.roundRectJButton!!.getText())
}


    open fun charJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.charJButton!!.getText())
}


    open fun stringJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.stringJButton!!.getText())
}


    open fun arcJButtonMousePressed(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.arcJButton!!.getText())
}


    open fun rectJButtonMouseClicked(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.rectJButton!!.getText())
}


    open fun lineJButtonMouseClicked(evt: java.awt.event.MouseEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
ToolFactory.getInstance()!!.setSelectedTool(this.lineJButton!!.getText())
}


    private var arcJButton: javax.swing.JButton

    private var charJButton: javax.swing.JButton

    private var colorJList: javax.swing.JList

    private var colorJPanel: javax.swing.JPanel

    private var dottedArcJButton: javax.swing.JButton

    private var dottedFillArcJButton: javax.swing.JButton

    private var dottedFillRectJButton: javax.swing.JButton

    private var dottedFillRountRectJButton: javax.swing.JButton

    private var dottedLineJButton: javax.swing.JButton

    private var dottedRectButton: javax.swing.JButton

    private var fillArcJButton: javax.swing.JButton

    private var fillRectJButton: javax.swing.JButton

    private var fillRoundRectJButton: javax.swing.JButton

    private var imageJButton: javax.swing.JButton

    private var lineJButton: javax.swing.JButton

    private var rectJButton: javax.swing.JButton

    private var roundRectJButton: javax.swing.JButton

    private var stringJButton: javax.swing.JButton

}
                
            



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
        package org.allbinary.input.automation.actions.script.condition




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.media.image.analysis.ColorRangeInterface
import org.allbinary.string.CommonStrings

open public class ColorAtActionScriptConditionJPanel : javax.swing.JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var colorAtActionScriptConditionInterface: ColorAtActionScriptConditionInterface
public constructor        (colorAtActionScriptConditionInterface: ColorAtActionScriptConditionInterface){

                    var colorAtActionScriptConditionInterface = colorAtActionScriptConditionInterface
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.CONSTRUCTOR)
initComponents()
this.colorAtActionScriptConditionInterface= colorAtActionScriptConditionInterface
this.set()
}


open fun set()
        //nullable = true from not(false or (false and true)) = true
{
    var colorRangeInterface: ColorRangeInterface = this.colorAtActionScriptConditionInterface!!.getColorRangeInterface()!!
            

this.getMinRedJTextField()!!.setText(getMinRed.toString())
this.getMaxRedJTextField()!!.setText(getMaxRed.toString())
this.getMinGreenJTextField()!!.setText(getMinGreen.toString())
this.getMaxGreenJTextField()!!.setText(getMaxGreen.toString())
this.getMinBlueJTextField()!!.setText(getMinBlue.toString())
this.getMaxBlueJTextField()!!.setText(getMaxBlue.toString())
this.getColorAtXJTextField()!!.setText(x.toString())
this.getColorAtYJTextField()!!.setText(y.toString())
this.colorAtActionScriptConditionInterface!!.log()
}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{
    var colorRangeInterface: ColorRangeInterface = this.colorAtActionScriptConditionInterface!!.getColorRangeInterface()!!
            

colorRangeInterface!!.setMinRed(Integer.valueOf(this.getMinRedJTextField()!!.getText())!!.toInt())
colorRangeInterface!!.setMaxRed(Integer.valueOf(this.getMaxRedJTextField()!!.getText())!!.toInt())
colorRangeInterface!!.setMinGreen(Integer.valueOf(this.getMinGreenJTextField()!!.getText())!!.toInt())
colorRangeInterface!!.setMaxGreen(Integer.valueOf(this.getMaxGreenJTextField()!!.getText())!!.toInt())
colorRangeInterface!!.setMinBlue(Integer.valueOf(this.getMinBlueJTextField()!!.getText())!!.toInt())
colorRangeInterface!!.setMaxBlue(Integer.valueOf(this.getMaxBlueJTextField()!!.getText())!!.toInt())

    var xString: String = this.getColorAtXJTextField()!!.getText()!!
            


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(xString) && StringValidationUtil.getInstance()!!.isNumber(xString))
                        
                                    {
                                    this.colorAtActionScriptConditionInterface!!.getPoint()!!.x= Integer.parseInt(xString)

                                    }
                                

    var yString: String = this.getColorAtYJTextField()!!.getText()!!
            


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(yString) && StringValidationUtil.getInstance()!!.isNumber(yString))
                        
                                    {
                                    this.colorAtActionScriptConditionInterface!!.getPoint()!!.y= Integer.parseInt(xString)

                                    }
                                
this.colorAtActionScriptConditionInterface!!.log()
}


open fun getColorAtXJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return colorAtXJTextField
}


open fun setColorAtXJTextField(colorAtXJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var colorAtXJTextField = colorAtXJTextField
this.colorAtXJTextField= colorAtXJTextField
}


open fun getColorAtYJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return colorAtYJTextField
}


open fun setColorAtYJTextField(colorAtYJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var colorAtYJTextField = colorAtYJTextField
this.colorAtYJTextField= colorAtYJTextField
}


open fun getMaxBlueJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxBlueJTextField
}


open fun setMaxBlueJTextField(maxBlueJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxBlueJTextField = maxBlueJTextField
this.maxBlueJTextField= maxBlueJTextField
}


open fun getMaxGreenJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxGreenJTextField
}


open fun setMaxGreenJTextField(maxGreenJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxGreenJTextField = maxGreenJTextField
this.maxGreenJTextField= maxGreenJTextField
}


open fun getMaxRedJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return maxRedJTextField
}


open fun setMaxRedJTextField(maxRedJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var maxRedJTextField = maxRedJTextField
this.maxRedJTextField= maxRedJTextField
}


open fun getMinBlueJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minBlueJTextField
}


open fun setMinBlueJTextField(minBlueJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var minBlueJTextField = minBlueJTextField
this.minBlueJTextField= minBlueJTextField
}


open fun getMinGreenJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minGreenJTextField
}


open fun setMinGreenJTextField(minGreenJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var minGreenJTextField = minGreenJTextField
this.minGreenJTextField= minGreenJTextField
}


open fun getMinRedJTextField()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JTextField{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return minRedJTextField
}


open fun setMinRedJTextField(minRedJTextField: javax.swing.JTextField)
        //nullable = true from not(false or (false and false)) = true
{

                    var minRedJTextField = minRedJTextField
this.minRedJTextField= minRedJTextField
}


open fun getYJLabel()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JLabel{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return yJLabel
}


open fun setYJLabel(yJLabel: javax.swing.JLabel)
        //nullable = true from not(false or (false and false)) = true
{

                    var yJLabel = yJLabel
this.yJLabel= yJLabel
}


open fun getColorAtActionJDialog()
        //nullable = true from not(false or (false and true)) = true
: javax.swing.JDialog{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return colorAtActionJDialog
}


open fun setColorAtActionJDialog(colorAtActionJDialog: javax.swing.JDialog)
        //nullable = true from not(false or (false and false)) = true
{

                    var colorAtActionJDialog = colorAtActionJDialog
this.colorAtActionJDialog= colorAtActionJDialog
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{colorAtActionJDialog= javax.swing.JDialog()
titleJLabel= javax.swing.JLabel()
locationJLabel= javax.swing.JLabel()
colorAtXJTextField= javax.swing.JTextField()
xJLabel= javax.swing.JLabel()
yJLabel= javax.swing.JLabel()
colorAtYJTextField= javax.swing.JTextField()
colorRangeJLabel= javax.swing.JLabel()
redJLabel= javax.swing.JLabel()
minJLabel= javax.swing.JLabel()
maxJLabel= javax.swing.JLabel()
greenJLabel= javax.swing.JLabel()
blueJLabel= javax.swing.JLabel()
minRedJTextField= javax.swing.JTextField()
maxRedJTextField= javax.swing.JTextField()
maxGreenJTextField= javax.swing.JTextField()
minBlueJTextField= javax.swing.JTextField()
maxBlueJTextField= javax.swing.JTextField()
okJButton= javax.swing.JButton()
minGreenJTextField= javax.swing.JTextField()
colorAtActionJButton= javax.swing.JButton()
jLabel1= javax.swing.JLabel()
colorAtActionJDialog!!.setMinimumSize(java.awt.Dimension(350, 250))
titleJLabel!!.setText(
                            "              Color At Action Options            ")
locationJLabel!!.setText(
                            "Location:")
xJLabel!!.setText(
                            "X:")
yJLabel!!.setText(
                            "Y:")
colorRangeJLabel!!.setText(
                            "Color Range")
redJLabel!!.setText(
                            "Red:")
minJLabel!!.setText(
                            "Minimum")
maxJLabel!!.setText(
                            "Maximum")
greenJLabel!!.setText(
                            "Green:")
blueJLabel!!.setText(
                            "Blue:")
okJButton!!.setText(
                            "OK")
okJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
okJButtonActionPerformed(evt)
}

                                }
                            )

    var colorAtActionJDialogLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(colorAtActionJDialog!!.getContentPane())

colorAtActionJDialog!!.getContentPane()!!.setLayout(colorAtActionJDialogLayout)
colorAtActionJDialogLayout!!.setHorizontalGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)!!.addComponent(okJButton)!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(blueJLabel)!!.addComponent(greenJLabel)!!.addComponent(redJLabel)!!.addComponent(colorRangeJLabel))!!.addGap(29, 29, 29))!!.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorAtActionJDialogLayout!!.createSequentialGroup()!!.addComponent(locationJLabel)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(xJLabel)!!.addGap(18, 18, 18)))!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(minBlueJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)!!.addComponent(minGreenJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)!!.addComponent(minJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(minRedJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)!!.addComponent(colorAtXJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))!!.addGap(16, 16, 16)))!!.addGap(6, 6, 6)!!.addComponent(yJLabel)!!.addGap(24, 24, 24)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)!!.addComponent(maxJLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addGroup(javax.swing.GroupLayout.Alignment.LEADING, colorAtActionJDialogLayout!!.createSequentialGroup()!!.addGap(1, 1, 1)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)!!.addComponent(maxBlueJTextField, javax.swing.GroupLayout.Alignment.TRAILING)!!.addComponent(maxRedJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)!!.addComponent(maxGreenJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))!!.addComponent(colorAtYJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))!!.addGap(22, 22, 22))!!.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, colorAtActionJDialogLayout!!.createSequentialGroup()!!.addComponent(titleJLabel)!!.addGap(33, 33, 33)))))
colorAtActionJDialogLayout!!.setVerticalGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addComponent(titleJLabel)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addGap(15, 15, 15)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(xJLabel)!!.addComponent(locationJLabel)!!.addComponent(colorAtXJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(yJLabel))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(minJLabel)!!.addComponent(colorRangeJLabel))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(minRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(redJLabel))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(greenJLabel)!!.addComponent(minGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(colorAtActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(blueJLabel)!!.addComponent(minBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)!!.addComponent(okJButton))!!.addGroup(colorAtActionJDialogLayout!!.createSequentialGroup()!!.addGap(14, 14, 14)!!.addComponent(colorAtYJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(maxJLabel)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(maxRedJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(maxGreenJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(maxBlueJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))!!.addContainerGap()))
setPreferredSize(java.awt.Dimension(100, 0))
colorAtActionJButton!!.setText(
                            "Edit")
colorAtActionJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
colorAtActionJButtonActionPerformed(evt)
}

                                }
                            )
jLabel1!!.setText(
                            "Color At:")

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)!!.addComponent(colorAtActionJButton)))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(colorAtActionJButton)))
}


open fun okJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.update()
this.getColorAtActionJDialog()!!.setVisible(false)
}


open fun colorAtActionJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.getColorAtActionJDialog()!!.setVisible(true)
}


    private var blueJLabel: javax.swing.JLabel

    private var colorAtActionJButton: javax.swing.JButton

    private var colorAtActionJDialog: javax.swing.JDialog

    private var colorAtXJTextField: javax.swing.JTextField

    private var colorAtYJTextField: javax.swing.JTextField

    private var colorRangeJLabel: javax.swing.JLabel

    private var greenJLabel: javax.swing.JLabel

    private var jLabel1: javax.swing.JLabel

    private var locationJLabel: javax.swing.JLabel

    private var maxBlueJTextField: javax.swing.JTextField

    private var maxGreenJTextField: javax.swing.JTextField

    private var maxJLabel: javax.swing.JLabel

    private var maxRedJTextField: javax.swing.JTextField

    private var minBlueJTextField: javax.swing.JTextField

    private var minGreenJTextField: javax.swing.JTextField

    private var minJLabel: javax.swing.JLabel

    private var minRedJTextField: javax.swing.JTextField

    private var okJButton: javax.swing.JButton

    private var redJLabel: javax.swing.JLabel

    private var titleJLabel: javax.swing.JLabel

    private var xJLabel: javax.swing.JLabel

    private var yJLabel: javax.swing.JLabel

}
                
            


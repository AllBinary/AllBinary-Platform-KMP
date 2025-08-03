
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
        package org.allbinary.image.gui



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.media.image.analysis.ImageAnalysisResults
import org.allbinary.media.image.analysis.ImageColorRangeResults
import org.allbinary.media.image.analysis.ImageColorResults
import org.allbinary.string.CommonPhoneStrings

open public class ImageAnalysisResultsJPanel : swing.JPanel {
        
public constructor        (imageAnalysisResultsArray: Array<ImageAnalysisResults?>){

                    var imageAnalysisResultsArray = imageAnalysisResultsArray
initComponents()

    var imageAnalysisResults: ImageAnalysisResults = imageAnalysisResultsArray[0]!!

this.updateImageColorRangeResults(imageAnalysisResults)
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{jLabel1= JLabel()
jLabel2= JLabel()
jLabel3= JLabel()
percentMatchingJTextField= JTextField()
totalPixelsJTextField= JTextField()
matchingPixelsJTextField= JTextField()
jComboBox1= JComboBox()
jLabel4= JLabel()
jLabel5= JLabel()
jLabel6= JLabel()
jLabel7= JLabel()
avgRedJTextField= JTextField()
avgGreenJTextField= JTextField()
avgBlueJTextField= JTextField()
minGreenJTextField= JTextField()
jLabel8= JLabel()
jLabel9= JLabel()
jLabel10= JLabel()
minRedJTextField= JTextField()
minBlueJTextField= JTextField()
jLabel11= JLabel()
jLabel12= JLabel()
jLabel13= JLabel()
maxRedJTextField= JTextField()
maxGreenJTextField= JTextField()
maxBlueJTextField= JTextField()
jLabel1!!.setText(
                            "Matching Pixels:")
jLabel2!!.setText(
                            "Total Pixels:")
jLabel3!!.setText(
                            "Percent Matching:")
percentMatchingJTextField!!.setEditable(false)
totalPixelsJTextField!!.setEditable(false)
matchingPixelsJTextField!!.setEditable(false)
jComboBox1!!.setModel(DefaultComboBoxModel(arrayOf(CommonPhoneStrings.getInstance()!!.ONE)))
jComboBox1!!.setEnabled(false)
jLabel4!!.setText(
                            "Image:")
jLabel5!!.setText(
                            "Average Red:")
jLabel6!!.setText(
                            "Average Green:")
jLabel7!!.setText(
                            "Average Blue:")
avgRedJTextField!!.setEditable(false)
avgGreenJTextField!!.setEditable(false)
avgBlueJTextField!!.setEditable(false)
minGreenJTextField!!.setEditable(false)
jLabel8!!.setText(
                            "Min Red:")
jLabel9!!.setText(
                            "Min Green:")
jLabel10!!.setText(
                            "Min Blue:")
minRedJTextField!!.setEditable(false)
minBlueJTextField!!.setEditable(false)
jLabel11!!.setText(
                            "Max Red:")
jLabel12!!.setText(
                            "Max Green:")
jLabel13!!.setText(
                            "Max Blue:")
maxRedJTextField!!.setEditable(false)
maxGreenJTextField!!.setEditable(false)
maxBlueJTextField!!.setEditable(false)

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout!!.setHorizontalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel3)!!.addComponent(jLabel2)!!.addComponent(jLabel1)!!.addComponent(jLabel5)!!.addComponent(jLabel6)!!.addComponent(jLabel7)!!.addComponent(jLabel4))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(jComboBox1, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 81, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(avgBlueJTextField, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(avgGreenJTextField, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(avgRedJTextField, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(totalPixelsJTextField, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(percentMatchingJTextField, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)!!.addComponent(matchingPixelsJTextField, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel12)!!.addComponent(jLabel13)!!.addComponent(jLabel8)!!.addComponent(jLabel9)!!.addComponent(jLabel10)!!.addComponent(jLabel11))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(minRedJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 82, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(maxGreenJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 82, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(minGreenJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 82, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(minBlueJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 82, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(maxRedJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 82, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(maxBlueJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 82, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addContainerGap(18, Short.MAX_VALUE)))
layout!!.setVerticalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createSequentialGroup()!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel4)!!.addComponent(jComboBox1, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(matchingPixelsJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel8)!!.addComponent(minRedJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel2)!!.addComponent(totalPixelsJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel9)!!.addComponent(minGreenJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel3)!!.addComponent(percentMatchingJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel10)!!.addComponent(minBlueJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel5)!!.addComponent(avgRedJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel11)!!.addComponent(maxRedJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel6)!!.addComponent(avgGreenJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(maxGreenJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel12))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel7)!!.addComponent(avgBlueJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(jLabel13)!!.addComponent(maxBlueJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))))
}


open fun updateImageColorRangeResults(imageAnalysisResults: ImageAnalysisResults)
        //nullable = true from not(false or (false and false)) = true
{

                    var imageAnalysisResults = imageAnalysisResults

    var imageColorRangeResults: ImageColorRangeResults = imageAnalysisResults!!.getImageColorRangeResults()!!
            

this.matchingPixelsJTextField!!.setText(Long(imageColorRangeResults!!.getMatchingPixelsChecked()).
                            toString())
this.totalPixelsJTextField!!.setText(Long(imageColorRangeResults!!.getTotalPixelsChecked()).
                            toString())
this.percentMatchingJTextField!!.setText(Float(imageColorRangeResults!!.getPercent()).
                            toString())

    var imageColorResults: ImageColorResults = imageAnalysisResults!!.getImageColorResults()!!
            

this.avgRedJTextField!!.setText(Float(imageColorResults!!.getColorAverage()!!.getAvgRed()).
                            toString())
this.avgGreenJTextField!!.setText(Float(imageColorResults!!.getColorAverage()!!.getAvgGreen()).
                            toString())
this.avgBlueJTextField!!.setText(Float(imageColorResults!!.getColorAverage()!!.getAvgBlue()).
                            toString())
this.minRedJTextField!!.setText(Long(imageColorResults!!.getColorRange()!!.getMinRed()).
                            toString())
this.minGreenJTextField!!.setText(Long(imageColorResults!!.getColorRange()!!.getMinGreen()).
                            toString())
this.minBlueJTextField!!.setText(Long(imageColorResults!!.getColorRange()!!.getMinBlue()).
                            toString())
this.maxRedJTextField!!.setText(Long(imageColorResults!!.getColorRange()!!.getMaxRed()).
                            toString())
this.maxGreenJTextField!!.setText(Long(imageColorResults!!.getColorRange()!!.getMaxGreen()).
                            toString())
this.maxBlueJTextField!!.setText(Long(imageColorResults!!.getColorRange()!!.getMaxBlue()).
                            toString())
}


    private var avgBlueJTextField: JTextField

    private var avgGreenJTextField: JTextField

    private var avgRedJTextField: JTextField

    private var jComboBox1: JComboBox

    private var jLabel1: JLabel

    private var jLabel10: JLabel

    private var jLabel11: JLabel

    private var jLabel12: JLabel

    private var jLabel13: JLabel

    private var jLabel2: JLabel

    private var jLabel3: JLabel

    private var jLabel4: JLabel

    private var jLabel5: JLabel

    private var jLabel6: JLabel

    private var jLabel7: JLabel

    private var jLabel8: JLabel

    private var jLabel9: JLabel

    private var matchingPixelsJTextField: JTextField

    private var maxBlueJTextField: JTextField

    private var maxGreenJTextField: JTextField

    private var maxRedJTextField: JTextField

    private var minBlueJTextField: JTextField

    private var minGreenJTextField: JTextField

    private var minRedJTextField: JTextField

    private var percentMatchingJTextField: JTextField

    private var totalPixelsJTextField: JTextField

}
                
            


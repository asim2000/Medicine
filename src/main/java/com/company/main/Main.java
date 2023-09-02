package com.company.main;

import com.company.config.AppConfig;
import com.company.dao.IllnessRepository;
import com.company.dao.SymptomRepository;
import com.company.entity.Illness;
import com.company.entity.Symptom;
import com.company.gui.MainFrame;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


@Component
public class Main {
    @Autowired
    private IllnessRepository illnessRepository;
    @Autowired
    private SymptomRepository symptomRepository;
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        try {
            for(javax.swing.UIManager.LookAndFeelInfo info:javax.swing.UIManager.getInstalledLookAndFeels()) {
                if("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }catch(Exception e){}
        context.getBean(Main.class).showMainFrame();
        
        
    }
    private void showMainFrame(){
        MainFrame mainFrame = new MainFrame(illnessRepository,symptomRepository);
        mainFrame.setVisible(true);
    }
}
/**
 * Copyright 2023 (C) VinBrain
 */

package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Huynh Quoc Dung
 */
@SpringBootApplication
public class DesktopApp {
    public static void main(String[] args) {
        String appName = CommonUtility.getAppName();
        System.out.println("Welcome to " + appName + " from Desktop app");
        SpringApplication.run(DesktopApp.class, args);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

import common.Validate;
import common.Library;
import model.Person;

import java.util.ArrayList;

/**
 * File Processing Data Access Object.
 * Manages operations related to file processing.
 */
public class FileProcessingDao {
    private static FileProcessingDao instance = null;

    public static FileProcessingDao Instance() {
        if (instance == null) {
            synchronized (FileProcessingDao.class) {
                if (instance == null) {
                    instance = new FileProcessingDao();
                }
            }
        }
        return instance;
    }

    /**
     * Allow the user to find person information.
     */
    public void findPersonInfo() {
        System.out.println("--------- Person Info ---------");
        ArrayList<Person> lp;
        System.out.print("Enter file path: ");
        String pathFile = Validate.checkInputPathFile();
        lp = Library.getListPerson(pathFile);

        if (lp == null) {
            return;
        }
        double money = Validate.checkInputMoney();
        Library.getPerson(lp, money);
    }

    /**
     * Allow the user to copy text to a new file.
     */
    public void copyNewFile() {
        System.out.println("------------- Copy Text --------------");
        System.out.print("Enter Source: ");
        String pathFileInput = Validate.checkInputPathFile();
        System.out.print("Enter new file name: ");
        String pathFileOutput = Validate.checkInputPathFile();

        try {
            if (Library.copyWordOneTimes(pathFileInput, pathFileOutput)) {
                System.out.println("Copy done...");
            } else {
                System.err.println("Copy failed.");
            }
        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        }
    }
}



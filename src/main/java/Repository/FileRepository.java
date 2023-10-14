/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DataAccess.FileProcessingDao;

/**
 *
 * @author DAO
 */
public class FileRepository implements IFileRepository{

    @Override
    public void getPerson() {
      FileProcessingDao.Instance().findPersonInfo();
    }

    @Override
    public void copyWordOneTimes() {
        FileProcessingDao.Instance().copyNewFile();
    }
    
}

package tools.tools.gendatapic;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wb-liangqb
 * @date 2020/1/26 0026
 * @Decription : Learn POI to create Excel
 */

public class GenExcelToolDemo {

    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook(); //2007版本的Excel
        Sheet sheet = workbook.createSheet("测试"); // 创建表单
        //3. 创建行对象 参数：索引（从0开始）
        Row row = sheet.createRow(2);
        //创建单元格 锁定这一行的第某个单元格，参数：索引（从0开始）
        Cell cell = row.createCell(2);
        //在单元格写入内容
        cell.setCellValue("2NaCl");
        //样式处理,创建样式对象
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setBorderTop(BorderStyle.DASH_DOT);//设置上边框，参数：对边框的某种设置
        cellStyle.setBorderLeft(BorderStyle.DASH_DOT_DOT);//设置左
        cellStyle.setBorderBottom(BorderStyle.DASH_DOT_DOT);//设置下
        cellStyle.setBorderRight(BorderStyle.DASH_DOT_DOT);//设置右
        cellStyle.setAlignment(HorizontalAlignment.CENTER);//水平居中
        cellStyle.setVerticalAlignment(VerticalAlignment.CENTER);//垂直居中
        //创建字体对象
        Font font = workbook.createFont();
        font.setFontName("华文行楷");//字体
        font.setFontHeightInPoints((short) 28);//字号
        cellStyle.setFont(font);
        cell.setCellStyle(cellStyle);

        FileOutputStream fileOutputStream = null;
        File file;
        try {
            file = new File("D:\\test\\data.xlsx");
            if(file.exists()){
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
            workbook.write(fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileOutputStream!=null){
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

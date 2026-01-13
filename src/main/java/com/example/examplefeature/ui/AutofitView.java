package com.example.examplefeature.ui;

import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.spreadsheet.Spreadsheet;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

@Route("")
@PageTitle("Autofit")
@Menu(order = 0, icon = "vaadin:clipboard-check", title = "Autofit")
public class AutofitView extends Main {

    AutofitView() {
        setSizeFull();


        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Employees");

        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("ID");
        header.createCell(1).setCellValue("Name");
        header.createCell(2).setCellValue("Age");
        header.createCell(3).setCellValue("Email");
        header.createCell(4).setCellValue("Salary");
        header.createCell(5).setCellValue("Comment");

        for (int i = 1; i <= 8; i++) {
            Row row = sheet.createRow(i);
            row.createCell(0).setCellValue(i);
            row.createCell(1).setCellValue("User " + i);
            row.createCell(2).setCellValue(20 + i);
            row.createCell(3).setCellValue("user" + i + "@example.com");
            row.createCell(4).setCellValue(4200 + i * 1500);
            row.createCell(5).setCellValue("This is a sample comment for user testsssssssssssssssssssssssssssssssssssssssssssssss " + i);
        }

        Spreadsheet spreadsheet = new Spreadsheet(workbook);
        spreadsheet.setSizeFull();
        add(spreadsheet);

        for (int i = 0; i < spreadsheet.getColumns(); i++) {
            spreadsheet.autofitColumn(i);
        }

        spreadsheet.refreshAllCellValues();
    }

}

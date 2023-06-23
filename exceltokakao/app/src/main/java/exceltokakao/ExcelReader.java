// package exceltokakao;

// import org.apache.poi.ss.usermodel.*;
// // import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// import java.io.FileInputStream;
// import java.io.IOException;

// public class ExcelReader {
// public static void main(String[] args) {
// String filePath = "파일명.xlsx";
// String fieldName = "특정 필드명";

// try (FileInputStream fis = new FileInputStream(filePath);
// // Workbook workbook = new XSSFWorkbook(fis)) {

// Sheet sheet = workbook.getSheetAt(0); // 첫 번째 시트 선택
// int columnIndex = -1;

// Row headerRow = sheet.getRow(0);
// for (Cell cell : headerRow) {
// if (cell.getStringCellValue().equals(fieldName)) {
// columnIndex = cell.getColumnIndex();
// break;
// }
// }

// if (columnIndex != -1) {
// for (int i = 1; i <= sheet.getLastRowNum(); i++) {
// Row dataRow = sheet.getRow(i);
// Cell cell = dataRow.getCell(columnIndex);

// if (cell != null) {
// String fieldValue = cell.getStringCellValue();
// // 추출한 데이터를 활용하여 원하는 작업 수행
// sendKakaoMessage(fieldValue);
// }
// }
// }

// } catch (IOException e) {
// e.printStackTrace();
// }
// }

// private static void sendKakaoMessage(String fieldValue) {
// // 카카오톡 메시지를 보내는 코드 작성
// }
// }

public class ExceptionDemo {
    public static void main(String[] args) {
    try {
        // Tạo một đối tượng CustomObject, có thể ném ngoại lệ SomeException
        CustomObject obj = new CustomObject();
    } catch (SomeException e) {
        // Bắt ngoại lệ SomeException và xử lý
        System.out.println("Đã xảy ra ngoại lệ: " + e.getMessage());
    }
}
}

public class ExcaptionDemo2 {
    public static void someMethod2() throws Exception {
        // Phương thức someMethod2() ném một ngoại lệ Exception
        throw new Exception("Ngoại lệ từ someMethod2()");
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            // Bắt ngoại lệ từ someMethod2() và ném tiếp
            throw new Exception("Ngoại lệ đã được ném tiếp từ someMethod()");
        }
    }

    public static void main(String[] args) {
        try {
            // Gọi someMethod() từ main và bắt ngoại lệ vừa được ném tiếp
            someMethod();
        } catch (Exception e) {
            // In thông tin lần vết (stack trace) của ngoại lệ
            e.printStackTrace();
        }
    }
}

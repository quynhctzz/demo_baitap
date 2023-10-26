public class SomeException extends  Exception {
    public SomeException(String message) {
        super(message);
    }
}

class CustomObject {
    public CustomObject() throws SomeException {
        //*Trong hàm khởi tạo, ném một ngoại lệ SomeException

        throw new SomeException("Sự cố xảy ra trong hàm khởi tạo");
    }
}


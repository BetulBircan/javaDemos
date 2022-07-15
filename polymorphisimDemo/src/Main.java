public class Main {

    public static void main(String[] args) {
	// write your code here
        /*EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log("Log Mesajı");*/

       /* BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
        for(BaseLogger logger:loggers) {
            logger.Log("Loglama Başarılı Bir Şekilde Gerçekleşti");
        }*/

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}

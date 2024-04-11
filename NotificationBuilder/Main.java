class Main{

    public static void main(String[] args){

        System.out.println("Main Initialized");


        Director director = new Director();


        Notification new_sms_notification = director.createSms();

        Notification new_email_notification = director.createEmail();

        new_email_notification.notificationDetails();
        new_sms_notification.notificationDetails();
        new_email_notification.notificationDetails();


    }
}
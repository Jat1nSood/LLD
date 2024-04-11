class Director{

    NotificationBuilder notification_builder = new NotificationBuilder();


    public Notification createEmail(){

        notification_builder.setId("1");
        notification_builder.setSenderName("Jatin");
        notification_builder.setReceiverName("Souvik");
        notification_builder.setReceiverAddress("souvik@exapmle.com");
        notification_builder.setSenderAddress("jatin@example.com");
        notification_builder.setNotificationMode("Email");
        notification_builder.setNotificationType("Instant");
        notification_builder.setMessage("Hello Souvik, Working on given task");

        Notification  new_notification = notification_builder.build(notification_builder);
        return new_notification;
    }



    public Notification createSms(){

        notification_builder.setId("2");
        notification_builder.setSenderName("Jatin");
        notification_builder.setReceiverName("Souvik");
        notification_builder.setReceiverAddress("99999-xxxxx");
        notification_builder.setSenderAddress("99999-xxxxx");
        notification_builder.setNotificationMode("SMS");
        notification_builder.setNotificationType("Instant");
        notification_builder.setMessage("Hello Souvik, Working on given task");

        Notification  new_notification = notification_builder.build(notification_builder);
        return new_notification;
    }
}
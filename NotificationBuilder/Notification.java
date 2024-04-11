class Notification{

    private String id;
    private String senderName;
    private String receiverName;
    private String senderAddress; // Email Address or Phone Number
    private String receiverAddress; // Email Address or Phone Number
    private String notificationMode; // SMS or Email
    private String notificationType; // Scheduled or immediate
    private String message; // Message


    public Notification(NotificationBuilder notification_builder){

        this.id = notification_builder.id;
        this.senderName = notification_builder.senderName;
        this.receiverName = notification_builder.receiverName;
        this.senderAddress = notification_builder.senderAddress;
        this.receiverAddress = notification_builder.receiverAddress;
        this.notificationMode = notification_builder.notificationMode;
        this.notificationType = notification_builder.notificationType;
        this.message = notification_builder.message;
    }

    public void notificationDetails(){

        System.out.println("{\n");

        System.out.println("id : " + this.id + ",\n");
        System.out.println("senderName : " + this.senderName + ",\n");
        System.out.println("receiverName : " + this.receiverName + ",\n");
        System.out.println("senderAddress : " + this.senderAddress + ",\n");
        System.out.println("receiverAddress : " + this.receiverAddress + ",\n");
        System.out.println("notificationMode : " + this.notificationMode + ",\n");
        System.out.println("notificationType : " + this.notificationType + ",\n");
        System.out.println("message : " + this.message + ",\n");

        System.out.println("}\n");
    }

}


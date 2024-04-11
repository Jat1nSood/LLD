class NotificationBuilder {
    public String id;
    public String senderName;
    public String receiverName;
    public String senderAddress; // Email Address or Phone Number
    public String receiverAddress; // Email Address or Phone Number
    public String notificationMode; // SMS or Email
    public String notificationType; // Scheduled or immediate
    public String message; // Message

    // Constructor
    public NotificationBuilder() {
        this.id = null;
        this.senderName = null;
        this.receiverName = null;
        this.senderAddress = null;
        this.receiverAddress = null;
        this.notificationMode = null;
        this.notificationType = null;
        this.message = null;
    }



    // Setter methods
    public void setId(String id) {
        this.id = id;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public void setNotificationMode(String notificationMode) {
        this.notificationMode = notificationMode;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Notification build(NotificationBuilder notification_builder){

        Notification new_notification = new Notification(notification_builder);
        return new_notification;

    }
}

//Example 2 -> DOUBT
const sendNewsletter = (book) => {
    let content = ""; // Declare once outside the switch
  
    switch (book.category) {
      case "fiction":
        content = `'${book.title}' is the best fiction book of the year. You can read it just before going to bed.`;
        break;
      case "cooking":
        content = `'${book.title}' can be a great gift for your friends who have just moved to a new apartment. It is so cheap, just ${book.price}.`;
        break;
      default:
        content = `'${book.title}' is now available. Check it out!`;
    }
  
    const customers = CustomerRepository.getAll();
    const emailReceivers = customers
      .filter((customer) => customer.hasEmailSubscription())
      .map((customer) => customer.getEmail());
    const notificationReceivers = customers
      .filter((customer) => customer.hasNotificationSubscription())
      .map((customer) => customer.getEmail());
  
    const emailContent = `<h1>Our weekly newsletter</h1><p>${content}</p>`;
    const pushNotificationContent = `Hey! ${content}`;
  
    mailClient.send(emailReceivers, emailContent);
    pushNotification.send(notificationReceivers, pushNotificationContent);
  };
  
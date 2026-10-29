class ChatFilter {

    int matches = 0;

    String filterMessages(String[] logs, String keyword) {

        StringBuilder sb = new StringBuilder();
        matches = 0;

        for (String line : logs) {

            String[] parts = line.split(" ", 3);

            
            if (parts.length < 3) {
                continue;
            }

            String time = parts[0];
            String user = parts[1];
            String message = parts[2];

            if (message.toLowerCase().contains(keyword.toLowerCase())) {
                matches++;
                sb.append(time)
                  .append(" ")
                  .append(user)
                  .append(": ")
                  .append(message)
                  .append("\n");
            }
        }

        return sb.toString();
    }

    int getMatches() {
        return matches;
    }
}

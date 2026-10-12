public class SecureAuthenticationStressTesting {

    static boolean authenticate(String username, String password) {
        return username.equals("admin")
                && password.equals("admin123");
    }

    public static void main(String[] args) {
        int total = 1000;
        int success = 0;
        int failed = 0;

        for (int i = 0; i < total; i++) {
            boolean result;

            if (i % 2 == 0) {
                result = authenticate("admin", "admin123");
            } else {
                result = authenticate("admin", "wrongpass");
            }

            if (result) {
                success++;
            } else {
                failed++;
            }
        }

        System.out.println("Total Attempts: " + total);
        System.out.println("Successful Logins: " + success);
        System.out.println("Failed Logins: " + failed);
        System.out.println("Authentication Testing Completed");
    }
}

Input:

Total Attempts: 1000
Valid credentials: admin / admin123
Invalid password: wrongpass

Output:

Total Attempts: 1000
Successful Logins: 500
Failed Logins: 500
Authentication Testing Completed
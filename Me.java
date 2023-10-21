public class Me{
<<<<<<< HEAD
    private String name;
    private String[] expertises;
    private String bio;

    // Constructor to initialize name, expertises, and bio
    public Me(String name, String[] expertises, String bio) {
        this.name = name;
        this.expertises = expertises;
        this.bio = bio;
    }

    // Method to print name, list of expertises, and bio
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Expertises:");
        for (String expertise : expertises) {
            System.out.println("- " + expertise);
        }
        System.out.println("Bio: " + bio);
    }

    public static void main(String[] args) {
        String myName = "Akhila";  
        String[] myExpertises = {
            "Java Programming",
            "Web Development",
            "Android Application Development",
        };
        
        String myBio = "I am a passionate Java developer with a strong background in web development and data analysis. " +
            "I love creating robust and efficient software solutions that solve real-world problems. " +
            "In my free time, I enjoy exploring new technologies and working on personal coding projects.";

        Me developerBio = new Me(myName, myExpertises, myBio);
        developerBio.printInfo();
=======
    public static void main(String[] args){
        System.out.println("Akhila Here!...Good Evening!");
>>>>>>> 8ae6a269adf56fcc0d901235f3b0ac47112d1e56
    }
}

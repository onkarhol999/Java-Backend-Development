import java.util.*;

public class QuestionService {

    Question questions[] = new Question[20];

    public QuestionService() {
        questions[0] = new Question("Can you explain the concept of Object-Oriented Programming (OOP)?",
                "Object-Oriented Programming is a paradigm that revolves around the concept of objects. These objects represent real-world entities, and they have attributes (data) and behaviors (methods). The main principles of OOP are encapsulation, inheritance, polymorphism, and abstraction. For instance, consider a 'Car' object: it has attributes like color and speed and behaviors like accelerate and brake. OOP makes it easier to model real-world problems and write reusable and maintainable code.");

        questions[1] = new Question("What is your understanding of the Java programming language?",
                "Java is a versatile and powerful programming language known for its 'write once, run anywhere' principle. It’s platform-independent because of its use of the Java Virtual Machine (JVM). I like working with Java because it’s robust, secure, and has a large community for support. Additionally, its extensive libraries and frameworks make development faster and more efficient.");

        questions[2] = new Question("What is the difference between ArrayList and LinkedList in Java?",
                "ArrayList and LinkedList are both implementations of the List interface in Java, but they have different use cases. ArrayList uses a dynamic array internally, so accessing elements by index is faster. However, inserting or deleting elements in the middle of an ArrayList is slower because it requires shifting elements. LinkedList, on the other hand, uses a doubly-linked list, making insertions and deletions faster but accessing elements by index slower. I choose between them depending on the specific requirements of a task.");

        questions[3] = new Question(
                "Can you describe a challenging project you worked on and how you overcame the difficulties?",
                "One of the most challenging projects I worked on was creating a food donation platform during college. It required integrating a complex backend with multiple APIs for real-time updates. Initially, we faced issues with data synchronization and user authentication. To overcome this, I dived deep into debugging, collaborated with my team to re-design the database schema, and optimized the API calls. The end result was a platform that ran smoothly and received positive feedback from users.");

        questions[4] = new Question("How do you approach debugging a piece of code?",
                "Debugging is like solving a puzzle for me. I start by understanding the problem thoroughly, reproducing the issue if possible. Then, I use tools like a debugger or strategically placed print statements to narrow down where the issue lies. Once I’ve identified the root cause, I implement a fix and test it thoroughly to ensure it works and doesn’t introduce new bugs.");

        questions[5] = new Question("What is multithreading, and how have you used it in a project?",
                "Multithreading is a way of executing multiple threads or smaller tasks concurrently within a program. I used multithreading in a project where I had to process large datasets and perform computations simultaneously. By dividing the workload into threads, I was able to significantly reduce processing time and improve efficiency. Java makes this straightforward with classes like Thread and Runnable.");

        questions[6] = new Question("How do you stay updated with the latest trends in technology?",
                "I stay updated by following tech blogs, watching tutorials, and participating in online forums. Platforms like GitHub, Stack Overflow, and LinkedIn are great for learning and engaging with the community. I also enjoy taking short online courses to expand my skill set and experimenting with personal projects to stay hands-on.");

        questions[7] = new Question("What is your favorite data structure and why?",
                "My favorite data structure is the HashMap because of its efficiency in storing and retrieving data using key-value pairs. I find it incredibly useful for scenarios where fast lookups are required, like caching or counting occurrences of elements. Its ability to handle large datasets efficiently makes it a go-to choice for me in many projects.");

        questions[8] = new Question("Can you explain the concept of recursion?",
                "Recursion is a process where a method calls itself to solve a smaller instance of a problem. It’s particularly useful for problems like tree traversal or factorial calculation. For example, in a binary tree, recursion helps visit each node by simply defining the base case and recursive step. While using recursion, I make sure to consider the base case to avoid infinite loops and stack overflow.");

        questions[9] = new Question("How do you handle tight deadlines in a project?",
                "Tight deadlines can be challenging, but I approach them with a structured plan. I prioritize tasks, break them into smaller milestones, and focus on delivering the most critical functionalities first. Communication with the team is essential to ensure everyone is aligned and working efficiently. I also keep some buffer time for unexpected challenges.");

        questions[10] = new Question("What is polymorphism in Java?",
                "Polymorphism in Java means 'many forms.' It allows a method or object to behave differently based on the context. There are two types: compile-time (method overloading) and runtime (method overriding). For example, I can create a `draw()` method in a base class `Shape`, and specific subclasses like `Circle` or `Rectangle` override it to provide their own implementation. This makes the code more flexible and scalable.");

        questions[11] = new Question(
                "How would you explain the difference between checked and unchecked exceptions in Java?",
                "Checked exceptions are exceptions that the compiler forces you to handle, either with a try-catch block or by declaring them in the method signature using `throws`. Examples include `IOException` and `SQLException`. Unchecked exceptions, like `NullPointerException` or `ArithmeticException`, are not checked at compile time and usually indicate programming errors. I ensure that my code gracefully handles exceptions to prevent unexpected crashes.");

        questions[12] = new Question("What are your strengths as a developer?",
                "My biggest strength is my problem-solving ability. I enjoy breaking down complex problems into smaller, manageable tasks. I’m also a fast learner, which helps me adapt to new technologies quickly. Additionally, I believe my communication skills and collaborative mindset enable me to work effectively within a team.");

        questions[13] = new Question("What is garbage collection in Java?",
                "Garbage collection in Java is an automated process of managing memory by reclaiming unused objects. The JVM tracks objects and automatically removes those that are no longer referenced, freeing up memory. This makes Java memory-efficient and prevents issues like memory leaks, which are common in languages without garbage collection.");

        questions[14] = new Question("Can you explain method overloading with an example?",
                "Method overloading occurs when multiple methods in the same class have the same name but different parameters. For example, in a `Calculator` class, I might have two `add()` methods: one that takes two integers and another that takes three integers. This improves code readability and usability.");

        questions[15] = new Question("How do you ensure your code is clean and maintainable?",
                "I follow best practices like writing meaningful variable and method names, keeping methods short and focused, and adding comments where necessary. I also write unit tests to ensure code reliability and regularly refactor my code to improve its structure without changing its behavior.");

        questions[16] = new Question("How do you handle failure in a project?",
                "Failure is part of learning. When I face setbacks, I focus on analyzing what went wrong and how to prevent similar issues in the future. I also seek feedback from peers and mentors to gain different perspectives. For me, every failure is an opportunity to grow and improve.");

        questions[17] = new Question("What is your experience with version control systems like Git?",
                "I use Git for version control in almost all my projects. It helps me track changes, collaborate with teammates, and manage code efficiently. Branching and merging are features I use frequently to isolate features and ensure smooth integration.");

        questions[18] = new Question("How do you prioritize tasks when working on multiple projects?",
                "I prioritize tasks based on their deadlines, complexity, and impact. I use tools like Trello or Jira to track progress and ensure nothing is overlooked. Clear communication with stakeholders is essential to align priorities and expectations.");

        questions[19] = new Question("Why do you want to work for this company?",
                "I’m excited about the opportunity to contribute to a company that values innovation and collaboration. I admire your projects and the impact you’re making in the industry. I believe my skills and enthusiasm align well with your vision, and I’m eager to grow with the company.");
    }

    private int currentIndex = 0; // To track the current question

    public void scheduleDailyQuestion() {
        Timer timer = new Timer();
        // Set the time to 9:00 AM
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 5);
        calendar.set(Calendar.MINUTE, 38);
        calendar.set(Calendar.SECOND, 0);

        Date scheduledTime = calendar.getTime();

        // If the time has already passed for today, schedule for tomorrow
        if (scheduledTime.before(new Date())) {
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            scheduledTime = calendar.getTime();
        }

        // Schedule the task to run daily at 9:00 AM
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (currentIndex < questions.length && questions[currentIndex] != null) {
                    System.out.println("Question of the day:");
                    System.out.println(questions[currentIndex].getQuestion());
                    System.out.println("Answer: " + questions[currentIndex].getAnswer());
                    System.out.println();

                    currentIndex++; // Move to the next question
                } else {
                    System.out.println("All questions have been sent.");
                    timer.cancel(); // Stop the timer once all questions are sent
                }
            }
        }, scheduledTime, 24 * 60 * 60 * 1000); // Repeat every 24 hours
    }
}

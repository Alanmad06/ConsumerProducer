| This project implements the classic Producer-Consumer Problem using Java's multithreading capabilities. It serves as an educational example to demonstrate thread synchronization, inter-thread communication, and the handling of shared resources in concurrent programming.​

📚 Overview
The Producer-Consumer Problem is a fundamental example in concurrent programming. It involves two types of threads:​

Producers: Generate data and place it into a shared buffer.

Consumers: Retrieve data from the shared buffer for processing.​

Proper synchronization is crucial to prevent issues such as:​

Race Conditions: Multiple threads accessing and modifying shared data simultaneously, leading to unpredictable results.

Deadlocks: Two or more threads waiting indefinitely for resources held by each other.

Starvation: A thread waiting indefinitely to acquire a resource because other threads are continuously acquiring it.​

This implementation uses Java's synchronized methods along with wait() and notify() to manage thread communication and ensure safe access to the shared buffer.​

🛠 Technologies Used
Language: Java

Concurrency: Java Threads, synchronized, wait(), notify()

IDE Support: NetBeans (includes nbproject/ configuration)​ |
![image](https://github.com/Alanmad06/ConsumerProducer/assets/130498439/ea60a17f-8902-4b9c-bcba-e9e377400b40)




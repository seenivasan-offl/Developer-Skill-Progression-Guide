package com.example.developerroadmap.service;

import com.example.developerroadmap.model.Role;
import com.example.developerroadmap.model.Topic;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RoadmapService {

    public List<Role> getAllRoles() {
        return Arrays.asList(
                new Role("frontend", "Frontend Developer", getFrontendTopics()),
                new Role("backend", "Backend Developer", getBackendTopics()),
                new Role("fullstack", "Fullstack Developer", getFullstackTopics()),
                new Role("devops", "DevOps Engineer", getDevOpsTopics()),
                new Role("mobile", "Mobile Developer", getMobileTopics()),
                new Role("datascience", "Data Scientist", getDataScienceTopics())
        );
    }

    private List<Topic> getFrontendTopics() {
        return Arrays.asList(
                new Topic("html_css", "HTML & CSS",
                        Arrays.asList(
                                "HTML Basics - freeCodeCamp",
                                "CSS Grid Tutorial - MDN",
                                "Responsive Design - CSS Tricks",
                                "Flexbox Deep Dive - Wes Bos",
                                "Accessibility (a11y) Basics"
                        ),
                        null),
                new Topic("js", "JavaScript",
                        Arrays.asList(
                                "JavaScript Basics - Mozilla",
                                "ES6+ Features - YouTube",
                                "Asynchronous JavaScript - Promises & Async/Await",
                                "JavaScript Design Patterns",
                                "DOM Manipulation & Event Handling"
                        ),
                        null),
                new Topic("react", "React",
                        Arrays.asList(
                                "React Official Tutorial",
                                "React Hooks Deep Dive",
                                "State Management (Redux, Context API)",
                                "React Router - Navigation",
                                "Testing React Components (Jest, React Testing Library)"
                        ),
                        null),
                new Topic("frontend_tools", "Frontend Tools & Build Systems",
                        Arrays.asList(
                                "Webpack Basics",
                                "Babel Transpilation",
                                "NPM & Yarn Package Management",
                                "ESLint & Prettier for Code Quality"
                        ),
                        null),
                new Topic("frontend_perf", "Performance Optimization",
                        Arrays.asList(
                                "Lazy Loading & Code Splitting",
                                "Optimizing Images & Assets",
                                "Browser Rendering Optimization"
                        ),
                        null)
        );
    }

    private List<Topic> getBackendTopics() {
        return Arrays.asList(
                new Topic("java", "Java Basics",
                        Arrays.asList(
                                "Java Programming - Oracle Docs",
                                "Java OOP - Tutorial",
                                "Collections Framework",
                                "Java Streams & Lambdas"
                        ),
                        null),
                new Topic("springboot", "Spring Boot",
                        Arrays.asList(
                                "Spring Boot Guide",
                                "Building REST APIs with Spring",
                                "Spring Security - Authentication & Authorization",
                                "Spring Data JPA & Hibernate",
                                "Testing Spring Boot Applications"
                        ),
                        null),
                new Topic("database", "Databases",
                        Arrays.asList(
                                "SQL Basics",
                                "NoSQL Intro (MongoDB, Redis)",
                                "Database Design & Normalization",
                                "Transactions & ACID Properties",
                                "Indexing & Query Optimization"
                        ),
                        null),
                new Topic("microservices", "Microservices Architecture",
                        Arrays.asList(
                                "Microservices Fundamentals",
                                "API Gateway & Service Discovery",
                                "Resilience Patterns (Circuit Breaker)",
                                "Messaging & Event-driven Architecture"
                        ),
                        null),
                new Topic("backend_perf", "Backend Performance & Scalability",
                        Arrays.asList(
                                "Caching Strategies (Redis, Memcached)",
                                "Load Balancing Basics",
                                "Database Sharding & Replication"
                        ),
                        null)
        );
    }

    private List<Topic> getFullstackTopics() {
        return Arrays.asList(
                new Topic("frontend", "Frontend Basics", null, getFrontendTopics()),
                new Topic("backend", "Backend Basics", null, getBackendTopics()),
                new Topic("devops", "DevOps Basics",
                        Arrays.asList(
                                "Docker Tutorial",
                                "CI/CD Pipelines Overview",
                                "Infrastructure as Code (Terraform, Ansible)",
                                "Cloud Providers (AWS, Azure, GCP)"
                        ),
                        null),
                new Topic("testing", "Testing & QA",
                        Arrays.asList(
                                "Unit Testing",
                                "Integration Testing",
                                "End-to-End Testing"
                        ),
                        null),
                new Topic("security", "Application Security",
                        Arrays.asList(
                                "OWASP Top 10",
                                "Authentication & Authorization",
                                "Data Encryption Basics"
                        ),
                        null)
        );
    }

    private List<Topic> getDevOpsTopics() {
        return Arrays.asList(
                new Topic("containers", "Containers & Orchestration",
                        Arrays.asList(
                                "Docker Basics",
                                "Kubernetes Fundamentals",
                                "Helm Charts"
                        ),
                        null),
                new Topic("ci_cd", "Continuous Integration / Continuous Deployment",
                        Arrays.asList(
                                "Jenkins Pipelines",
                                "GitHub Actions",
                                "CircleCI / Travis CI"
                        ),
                        null),
                new Topic("monitoring", "Monitoring & Logging",
                        Arrays.asList(
                                "Prometheus & Grafana",
                                "ELK Stack (Elasticsearch, Logstash, Kibana)",
                                "Alerting & Incident Management"
                        ),
                        null),
                new Topic("cloud", "Cloud Infrastructure",
                        Arrays.asList(
                                "AWS Core Services",
                                "Azure Fundamentals",
                                "Google Cloud Platform Basics"
                        ),
                        null)
        );
    }

    private List<Topic> getMobileTopics() {
        return Arrays.asList(
                new Topic("android", "Android Development",
                        Arrays.asList(
                                "Java & Kotlin Basics",
                                "Android Studio & SDK",
                                "Material Design Principles",
                                "Jetpack Compose",
                                "Publishing Apps on Google Play Store"
                        ),
                        null),
                new Topic("ios", "iOS Development",
                        Arrays.asList(
                                "Swift Programming Language",
                                "Xcode & Interface Builder",
                                "UIKit & SwiftUI",
                                "App Store Submission Process"
                        ),
                        null),
                new Topic("cross_platform", "Cross-Platform Frameworks",
                        Arrays.asList(
                                "React Native Basics",
                                "Flutter Overview",
                                "Xamarin"
                        ),
                        null)
        );
    }

    private List<Topic> getDataScienceTopics() {
        return Arrays.asList(
                new Topic("python", "Python for Data Science",
                        Arrays.asList(
                                "Python Basics",
                                "NumPy & Pandas",
                                "Data Visualization with Matplotlib & Seaborn"
                        ),
                        null),
                new Topic("ml", "Machine Learning",
                        Arrays.asList(
                                "Supervised vs Unsupervised Learning",
                                "Regression, Classification Algorithms",
                                "Scikit-learn Basics"
                        ),
                        null),
                new Topic("deep_learning", "Deep Learning",
                        Arrays.asList(
                                "Neural Networks Basics",
                                "TensorFlow & Keras",
                                "CNNs & RNNs"
                        ),
                        null),
                new Topic("data_engineering", "Data Engineering",
                        Arrays.asList(
                                "ETL Pipelines",
                                "Big Data Technologies (Hadoop, Spark)",
                                "Data Warehousing Concepts"
                        ),
                        null)
        );
    }
}

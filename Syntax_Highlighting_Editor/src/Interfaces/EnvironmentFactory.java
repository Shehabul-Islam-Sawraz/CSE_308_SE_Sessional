package Interfaces;

import Environment.CodeEnvironment;

public interface EnvironmentFactory {
    CodeEnvironment getEnvironment();
    String getDescription();
}

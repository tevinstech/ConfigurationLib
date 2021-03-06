package me.frostythedev.configlib.exampleplugin.types;


import me.frostythedev.configlib.exampleplugin.ExampleConfig;
import me.frostythedev.configlib.exampleplugin.ExamplePlugin;

public class UpdateVariablesExample {

  public UpdateVariablesExample(ExamplePlugin plugin) {

    ExampleConfig config = plugin.getExampleConfig();

    System.out.println("The value of the config version is: " + config.getConfigVersion());
    System.out.println("Attempting to offer variable update...");

    if (plugin.getConfigManager().offerVariable(ExampleConfig.class, "config-version",
        (config.getConfigVersion() + 1))) {

      System.out.println("Variable updated successfully!");

    } else {
      System.out.println("Variable update failed!");

    }
    System.out.println("The value of the config version is: " + config.getConfigVersion());
  }
}

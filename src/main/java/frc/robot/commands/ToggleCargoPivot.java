package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class ToggleCargoPivot extends Command {
  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.cargoIntake.togglePivot();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return true;
  }

}

package Mankevich.homework07.task1.robot;


public interface IRobot  {

    void action();

    /**
     * Get the cost of a robot
     * @return int
     */
    int getPrice();

    void setHead();

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming.assignment.pkg3;

import java.util.Calendar;

/**
 *
 * @author ahnaf
 */
public class FrontEndDev extends BackEndDev {
    public String working_since;
    private String project_name;
    private int team_members;
    public String team_leader;
    private String front_end_framework;
    public boolean scrum_master=true;
    
    FrontEndDev(){
        
    }
    public FrontEndDev(String name, int id, double salary, String working_since, boolean scrum_master, String team_leader){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.working_since=working_since;
        this.scrum_master=scrum_master;
        this.team_leader=team_leader;
     
    }
    
     public void printEmploymentYears(String working_since){
        int i= Integer.parseInt(working_since);
        //finding integer value of current year
        int currentyear= Calendar.getInstance().get(Calendar.YEAR);
        int years=currentyear-i;
        System.out.println("Employed for: " + years + " years.");
        
    }
    
    void assignProject(String project_name, int team_members, String front_end_framework){
        this.project_name=project_name;
        this.team_members=team_members;
        this.front_end_framework=front_end_framework; 
    }
    
    void printAssignedProject(){
        System.out.println("Project name: " + project_name+ " No. of team members: " + team_members + " Server side framework: " + front_end_framework);
        
    }
}
